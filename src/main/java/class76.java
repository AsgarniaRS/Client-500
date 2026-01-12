import java.awt.Component;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class76 extends class228 {

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "Ljava/awt/Component;")
    private Component component;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    public final void method243(int arg0, int arg1, boolean arg2, Component component) {
        this.height = arg0;
        this.data = new int[arg0 * arg1 + 1];
        this.width = arg1;
        if (!arg2) {
            return;
        }
        DataBufferInt var5 = new DataBufferInt(this.data, this.data.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.width, this.height), var5, null);
        this.image = new BufferedImage(var6, var7, false, new Hashtable());
        this.component = component;
        this.bind();
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BIIIILjava/awt/Graphics;)V")
    public final void method242(byte arg0, int arg1, int arg2, int arg3, int arg4, Graphics g) {
        Shape shape = g.getClip();
        g.clipRect(arg4, arg3, arg2, arg1);
        g.drawImage(this.image, 0, 0, this.component);
        g.setClip(shape);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void draw(int y, int x, Graphics g) {
        g.drawImage(this.image, x, y, this.component);
    }
}
