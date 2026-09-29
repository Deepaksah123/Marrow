package kotlin;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import kotlin.Metadata;
import kotlin.findExpectedFormat;
import kotlin.shouldIntrospectorImplicitConstructors;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\t\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0018\u00010\u0000R\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "p0", "p1", "Landroid/content/res/XmlResourceParser;", "p2", "", "p3", "Lo/shouldIntrospectorImplicitConstructors$read;", "RemoteActionCompatParcelizer", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;I)Lo/shouldIntrospectorImplicitConstructors$read;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConstructorDetectorSingleArgConstructor {
    public static final shouldIntrospectorImplicitConstructors.read RemoteActionCompatParcelizer(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i) throws XmlPullParserException {
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser2);
        instantiateBean instantiatebean = new instantiateBean(xmlResourceParser2, 0, 2, null);
        findExpectedFormat.IconCompatParcelizer iconCompatParcelizer = isRecordType.read(instantiatebean, resources, theme, attributeSetAsAttributeSet);
        int iWrite = 0;
        while (!isRecordType.RemoteActionCompatParcelizer(xmlResourceParser2)) {
            iWrite = isRecordType.write(instantiatebean, resources, attributeSetAsAttributeSet, theme, iconCompatParcelizer, iWrite);
            xmlResourceParser.next();
        }
        return new shouldIntrospectorImplicitConstructors.read(iconCompatParcelizer.RemoteActionCompatParcelizer(), instantiatebean.getAudioAttributesCompatParcelizer() | i);
    }
}
