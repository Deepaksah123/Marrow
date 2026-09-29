package kotlin;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import com.marrow.data.models.ResponseError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin._byteOverflow;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class _parseInteger {

    public interface write {
    }

    public static final class AudioAttributesCompatParcelizer implements write {
        private final StdKeyDeserializersExternalSyntheticLambda0 AudioAttributesCompatParcelizer;
        private final int IconCompatParcelizer;
        private final int RemoteActionCompatParcelizer;
        private final String read;
        private final StdKeyDeserializersExternalSyntheticLambda0 write;

        public AudioAttributesCompatParcelizer(StdKeyDeserializersExternalSyntheticLambda0 stdKeyDeserializersExternalSyntheticLambda0, StdKeyDeserializersExternalSyntheticLambda0 stdKeyDeserializersExternalSyntheticLambda02, int i, int i2, String str) {
            this.write = stdKeyDeserializersExternalSyntheticLambda0;
            this.AudioAttributesCompatParcelizer = stdKeyDeserializersExternalSyntheticLambda02;
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = i2;
            this.read = str;
        }

        public final StdKeyDeserializersExternalSyntheticLambda0 RemoteActionCompatParcelizer() {
            return this.write;
        }

        public final StdKeyDeserializersExternalSyntheticLambda0 read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final int write() {
            return this.IconCompatParcelizer;
        }

        public final String IconCompatParcelizer() {
            return this.read;
        }
    }

    public static final class read {
        private final String AudioAttributesCompatParcelizer;
        private final int AudioAttributesImplBaseParcelizer;
        private final String IconCompatParcelizer;
        private final int RemoteActionCompatParcelizer;
        private final int read;
        private final boolean write;

        public read(String str, int i, boolean z, String str2, int i2, int i3) {
            this.AudioAttributesCompatParcelizer = str;
            this.AudioAttributesImplBaseParcelizer = i;
            this.write = z;
            this.IconCompatParcelizer = str2;
            this.read = i2;
            this.RemoteActionCompatParcelizer = i3;
        }

        public final String write() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final int IconCompatParcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public final boolean AudioAttributesImplApi26Parcelizer() {
            return this.write;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final int read() {
            return this.read;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public static final class RemoteActionCompatParcelizer implements write {
        private final read[] AudioAttributesCompatParcelizer;

        public RemoteActionCompatParcelizer(read[] readVarArr) {
            this.AudioAttributesCompatParcelizer = readVarArr;
        }

        public final read[] AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public static write write(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return AudioAttributesCompatParcelizer(xmlPullParser, resources);
    }

    private static write AudioAttributesCompatParcelizer(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return read(xmlPullParser, resources);
        }
        write(xmlPullParser);
        return null;
    }

    private static write read(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), _byteOverflow.MediaBrowserCompatItemReceiver.FontFamily);
        String string = typedArrayObtainAttributes.getString(_byteOverflow.MediaBrowserCompatItemReceiver.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(_byteOverflow.MediaBrowserCompatItemReceiver.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(_byteOverflow.MediaBrowserCompatItemReceiver.FontFamily_fontProviderQuery);
        String string4 = typedArrayObtainAttributes.getString(_byteOverflow.MediaBrowserCompatItemReceiver.FontFamily_fontProviderFallbackQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(_byteOverflow.MediaBrowserCompatItemReceiver.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(_byteOverflow.MediaBrowserCompatItemReceiver.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(_byteOverflow.MediaBrowserCompatItemReceiver.FontFamily_fontProviderFetchTimeout, 500);
        String string5 = typedArrayObtainAttributes.getString(_byteOverflow.MediaBrowserCompatItemReceiver.FontFamily_fontProviderSystemFontFamily);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                write(xmlPullParser);
            }
            List<List<byte[]>> listWrite = write(resources, resourceId);
            return new AudioAttributesCompatParcelizer(new StdKeyDeserializersExternalSyntheticLambda0(string, string2, string3, listWrite), string4 != null ? new StdKeyDeserializersExternalSyntheticLambda0(string, string2, string4, listWrite) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(RemoteActionCompatParcelizer(xmlPullParser, resources));
                } else {
                    write(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new RemoteActionCompatParcelizer((read[]) arrayList.toArray(new read[0]));
    }

    private static int RemoteActionCompatParcelizer(TypedArray typedArray, int i) {
        return IconCompatParcelizer.RemoteActionCompatParcelizer(typedArray, i);
    }

    public static List<List<byte[]>> write(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (RemoteActionCompatParcelizer(typedArrayObtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(RemoteActionCompatParcelizer(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(RemoteActionCompatParcelizer(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static List<byte[]> RemoteActionCompatParcelizer(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    private static read RemoteActionCompatParcelizer(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), _byteOverflow.MediaBrowserCompatItemReceiver.FontFamilyFont);
        if (typedArrayObtainAttributes.hasValue(_byteOverflow.MediaBrowserCompatItemReceiver.FontFamilyFont_fontWeight)) {
            i = _byteOverflow.MediaBrowserCompatItemReceiver.FontFamilyFont_fontWeight;
        } else {
            i = _byteOverflow.MediaBrowserCompatItemReceiver.FontFamilyFont_android_fontWeight;
        }
        int i6 = typedArrayObtainAttributes.getInt(i, ResponseError.NO_INTERNET_ERROR);
        if (typedArrayObtainAttributes.hasValue(_byteOverflow.MediaBrowserCompatItemReceiver.FontFamilyFont_fontStyle)) {
            i2 = _byteOverflow.MediaBrowserCompatItemReceiver.FontFamilyFont_fontStyle;
        } else {
            i2 = _byteOverflow.MediaBrowserCompatItemReceiver.FontFamilyFont_android_fontStyle;
        }
        boolean z = 1 == typedArrayObtainAttributes.getInt(i2, 0);
        if (typedArrayObtainAttributes.hasValue(_byteOverflow.MediaBrowserCompatItemReceiver.FontFamilyFont_ttcIndex)) {
            i3 = _byteOverflow.MediaBrowserCompatItemReceiver.FontFamilyFont_ttcIndex;
        } else {
            i3 = _byteOverflow.MediaBrowserCompatItemReceiver.FontFamilyFont_android_ttcIndex;
        }
        if (typedArrayObtainAttributes.hasValue(_byteOverflow.MediaBrowserCompatItemReceiver.FontFamilyFont_fontVariationSettings)) {
            i4 = _byteOverflow.MediaBrowserCompatItemReceiver.FontFamilyFont_fontVariationSettings;
        } else {
            i4 = _byteOverflow.MediaBrowserCompatItemReceiver.FontFamilyFont_android_fontVariationSettings;
        }
        String string = typedArrayObtainAttributes.getString(i4);
        int i7 = typedArrayObtainAttributes.getInt(i3, 0);
        if (typedArrayObtainAttributes.hasValue(_byteOverflow.MediaBrowserCompatItemReceiver.FontFamilyFont_font)) {
            i5 = _byteOverflow.MediaBrowserCompatItemReceiver.FontFamilyFont_font;
        } else {
            i5 = _byteOverflow.MediaBrowserCompatItemReceiver.FontFamilyFont_android_font;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i5, 0);
        String string2 = typedArrayObtainAttributes.getString(i5);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            write(xmlPullParser);
        }
        return new read(string2, i6, z, string, i7, resourceId);
    }

    private static void write(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    static class IconCompatParcelizer {
        static int RemoteActionCompatParcelizer(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }
}
