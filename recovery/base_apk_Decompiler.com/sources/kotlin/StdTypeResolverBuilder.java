package kotlin;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class StdTypeResolverBuilder {
    public static boolean write(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return RemoteActionCompatParcelizer(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean RemoteActionCompatParcelizer(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean RemoteActionCompatParcelizer(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return AudioAttributesCompatParcelizer(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean AudioAttributesCompatParcelizer(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean AudioAttributesCompatParcelizer(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return AudioAttributesCompatParcelizer(xmlPullParser) && IconCompatParcelizer(xmlPullParser.getName()).equals(str);
    }

    public static String read(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static String IconCompatParcelizer(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (IconCompatParcelizer(xmlPullParser.getAttributeName(i)).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    private static String IconCompatParcelizer(String str) {
        int iIndexOf = str.indexOf(58);
        return iIndexOf == -1 ? str : str.substring(iIndexOf + 1);
    }
}
