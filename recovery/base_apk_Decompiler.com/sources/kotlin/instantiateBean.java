package kotlin;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.Metadata;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0018\u00010\fR\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\t\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u001a¢\u0006\u0004\b\t\u0010\u001bJ%\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u001cJ%\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u001dJ\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u001eJ%\u0010\u0015\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u001cJ;\u0010\u0018\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0018\u00010\fR\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010!J5\u0010\u0015\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0003\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0018\u00010\fR\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010#J\u001a\u0010$\u001a\u00020\u001a2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0012\u001a\u00020\u00048\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b\t\u0010'R\u0014\u0010\u0015\u001a\u00020.8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010/"}, d2 = {"Lo/instantiateBean;", "", "Lorg/xmlpull/v1/XmlPullParser;", "p0", "", "p1", "<init>", "(Lorg/xmlpull/v1/XmlPullParser;I)V", "", "write", "(I)V", "Landroid/content/res/Resources;", "Landroid/content/res/Resources$Theme;", "Landroid/util/AttributeSet;", "p2", "", "p3", "Landroid/content/res/TypedArray;", "AudioAttributesCompatParcelizer", "(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;", "", "read", "(Landroid/content/res/TypedArray;Ljava/lang/String;II)I", "", "IconCompatParcelizer", "(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F", "", "(Landroid/content/res/TypedArray;Ljava/lang/String;IZ)Z", "(Landroid/content/res/TypedArray;IF)F", "(Landroid/content/res/TypedArray;II)I", "(Landroid/content/res/TypedArray;I)Ljava/lang/String;", "p4", "Lo/_parseLong;", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources$Theme;Ljava/lang/String;II)Lo/_parseLong;", "Landroid/content/res/ColorStateList;", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Landroid/content/res/ColorStateList;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lorg/xmlpull/v1/XmlPullParser;", "RemoteActionCompatParcelizer", "()Lorg/xmlpull/v1/XmlPullParser;", "I", "Lo/findJsonKeyAccessor;", "Lo/findJsonKeyAccessor;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class instantiateBean {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public final findJsonKeyAccessor read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final XmlPullParser IconCompatParcelizer;

    public instantiateBean(XmlPullParser xmlPullParser, int i) {
        this.IconCompatParcelizer = xmlPullParser;
        this.AudioAttributesCompatParcelizer = i;
        this.read = new findJsonKeyAccessor();
    }

    public /* synthetic */ instantiateBean(XmlPullParser xmlPullParser, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(xmlPullParser, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final XmlPullParser getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    private final void write(int p0) {
        this.AudioAttributesCompatParcelizer = p0 | this.AudioAttributesCompatParcelizer;
    }

    public final TypedArray AudioAttributesCompatParcelizer(Resources p0, Resources.Theme p1, AttributeSet p2, int[] p3) {
        TypedArray typedArrayWrite = _parseLongPrimitive.write(p0, p1, p2, p3);
        write(typedArrayWrite.getChangingConfigurations());
        return typedArrayWrite;
    }

    public final int read(TypedArray p0, String p1, int p2, int p3) {
        int i = _parseLongPrimitive.read(p0, this.IconCompatParcelizer, p1, p2, p3);
        write(p0.getChangingConfigurations());
        return i;
    }

    public final float IconCompatParcelizer(TypedArray p0, String p1, int p2, float p3) {
        float f = _parseLongPrimitive.read(p0, this.IconCompatParcelizer, p1, p2, p3);
        write(p0.getChangingConfigurations());
        return f;
    }

    public final boolean write(TypedArray p0, String p1, int p2, boolean p3) {
        boolean z = _parseLongPrimitive.read(p0, this.IconCompatParcelizer, p1, p2, p3);
        write(p0.getChangingConfigurations());
        return z;
    }

    public final float IconCompatParcelizer(TypedArray p0, int p1, float p2) {
        float f = p0.getFloat(p1, p2);
        write(p0.getChangingConfigurations());
        return f;
    }

    public final int read(TypedArray p0, int p1, int p2) {
        int i = p0.getInt(p1, p2);
        write(p0.getChangingConfigurations());
        return i;
    }

    public final String AudioAttributesCompatParcelizer(TypedArray p0, int p1) {
        String string = p0.getString(p1);
        write(p0.getChangingConfigurations());
        return string;
    }

    public final float read(TypedArray p0, int p1, float p2) {
        float dimension = p0.getDimension(p1, p2);
        write(p0.getChangingConfigurations());
        return dimension;
    }

    public final _parseLong IconCompatParcelizer(TypedArray p0, Resources.Theme p1, String p2, int p3, int p4) {
        _parseLong _parselongRemoteActionCompatParcelizer = _parseLongPrimitive.RemoteActionCompatParcelizer(p0, this.IconCompatParcelizer, p1, p2, p3, p4);
        write(p0.getChangingConfigurations());
        return _parselongRemoteActionCompatParcelizer;
    }

    public final ColorStateList read(TypedArray p0, Resources.Theme p1, String p2, int p3) {
        ColorStateList colorStateList = _parseLongPrimitive.read(p0, this.IconCompatParcelizer, p1, p2, p3);
        write(p0.getChangingConfigurations());
        return colorStateList;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof instantiateBean)) {
            return false;
        }
        instantiateBean instantiatebean = (instantiateBean) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, instantiatebean.IconCompatParcelizer) && this.AudioAttributesCompatParcelizer == instantiatebean.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (this.IconCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("instantiateBean(IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
