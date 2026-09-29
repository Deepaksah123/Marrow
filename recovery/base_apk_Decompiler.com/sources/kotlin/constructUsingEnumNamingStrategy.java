package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.io.StringReader;
import kotlin._constructUsingIndex;
import kotlin.initExtraTracks;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
final class constructUsingEnumNamingStrategy {
    private static final String[] read = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] write = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] AudioAttributesCompatParcelizer = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static _constructUsingIndex RemoteActionCompatParcelizer(String str) throws IOException {
        try {
            return AudioAttributesCompatParcelizer(str);
        } catch (NumberFormatException | SchemaAware | XmlPullParserException unused) {
            prune.RemoteActionCompatParcelizer("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static _constructUsingIndex AudioAttributesCompatParcelizer(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw SchemaAware.RemoteActionCompatParcelizer("Couldn't find xmp metadata", null);
        }
        initExtraTracks<_constructUsingIndex.write> initextratracksAudioAttributesImplApi26Parcelizer = initExtraTracks.AudioAttributesImplApi26Parcelizer();
        long jWrite = C.TIME_UNSET;
        do {
            xmlPullParserNewPullParser.next();
            if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!AudioAttributesCompatParcelizer(xmlPullParserNewPullParser)) {
                    return null;
                }
                jWrite = write(xmlPullParserNewPullParser);
                initextratracksAudioAttributesImplApi26Parcelizer = RemoteActionCompatParcelizer(xmlPullParserNewPullParser);
            } else if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParserNewPullParser, "Container:Directory")) {
                initextratracksAudioAttributesImplApi26Parcelizer = write(xmlPullParserNewPullParser, "Container", "Item");
            } else if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParserNewPullParser, "GContainer:Directory")) {
                initextratracksAudioAttributesImplApi26Parcelizer = write(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!StdTypeResolverBuilder.write(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (initextratracksAudioAttributesImplApi26Parcelizer.isEmpty()) {
            return null;
        }
        return new _constructUsingIndex(jWrite, initextratracksAudioAttributesImplApi26Parcelizer);
    }

    private static boolean AudioAttributesCompatParcelizer(XmlPullParser xmlPullParser) {
        for (String str : read) {
            String str2 = StdTypeResolverBuilder.read(xmlPullParser, str);
            if (str2 != null) {
                return Integer.parseInt(str2) == 1;
            }
        }
        return false;
    }

    private static long write(XmlPullParser xmlPullParser) {
        for (String str : write) {
            String str2 = StdTypeResolverBuilder.read(xmlPullParser, str);
            if (str2 != null) {
                long j = Long.parseLong(str2);
                return j == -1 ? C.TIME_UNSET : j;
            }
        }
        return C.TIME_UNSET;
    }

    private static initExtraTracks<_constructUsingIndex.write> RemoteActionCompatParcelizer(XmlPullParser xmlPullParser) {
        for (String str : AudioAttributesCompatParcelizer) {
            String str2 = StdTypeResolverBuilder.read(xmlPullParser, str);
            if (str2 != null) {
                return initExtraTracks.AudioAttributesCompatParcelizer(new _constructUsingIndex.write(MimeTypes.IMAGE_JPEG, "Primary", 0L, 0L), new _constructUsingIndex.write(MimeTypes.VIDEO_MP4, "MotionPhoto", Long.parseLong(str2), 0L));
            }
        }
        return initExtraTracks.AudioAttributesImplApi26Parcelizer();
    }

    private static initExtraTracks<_constructUsingIndex.write> write(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":Item");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(":Directory");
        String string2 = sb2.toString();
        do {
            xmlPullParser.next();
            if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser, string)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(":Mime");
                String string3 = sb3.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str2);
                sb4.append(":Semantic");
                String string4 = sb4.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str2);
                sb5.append(":Length");
                String string5 = sb5.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str2);
                sb6.append(":Padding");
                String string6 = sb6.toString();
                String str3 = StdTypeResolverBuilder.read(xmlPullParser, string3);
                String str4 = StdTypeResolverBuilder.read(xmlPullParser, string4);
                String str5 = StdTypeResolverBuilder.read(xmlPullParser, string5);
                String str6 = StdTypeResolverBuilder.read(xmlPullParser, string6);
                if (str3 == null || str4 == null) {
                    return initExtraTracks.AudioAttributesImplApi26Parcelizer();
                }
                iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(new _constructUsingIndex.write(str3, str4, str5 != null ? Long.parseLong(str5) : 0L, str6 != null ? Long.parseLong(str6) : 0L));
            }
        } while (!StdTypeResolverBuilder.write(xmlPullParser, string2));
        return iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
    }
}
