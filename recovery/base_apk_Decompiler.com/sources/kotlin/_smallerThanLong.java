package kotlin;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.withTimeZone;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class _smallerThanLong implements withTimeZone {
    private final XmlPullParserFactory AudioAttributesImplBaseParcelizer;
    private static final Pattern read = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern IconCompatParcelizer = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern AudioAttributesCompatParcelizer = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    private static Pattern MediaBrowserCompatCustomActionResultReceiver = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    private static Pattern AudioAttributesImplApi26Parcelizer = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern AudioAttributesImplApi21Parcelizer = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern RemoteActionCompatParcelizer = Pattern.compile("^(\\d+) (\\d+)$");
    private static final AudioAttributesCompatParcelizer write = new AudioAttributesCompatParcelizer(30.0f, 1, 1);

    @Override // kotlin.withTimeZone
    public final int IconCompatParcelizer() {
        return 1;
    }

    public _smallerThanLong() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.AudioAttributesImplBaseParcelizer = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    @Override // kotlin.withTimeZone
    public final void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2, withTimeZone.RemoteActionCompatParcelizer remoteActionCompatParcelizer, TypeSerializer<pad3> typeSerializer) {
        _formatBCEYear.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(bArr, i, i2), remoteActionCompatParcelizer, typeSerializer);
    }

    @Override // kotlin.withTimeZone
    public final isLenient AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.AudioAttributesImplBaseParcelizer.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new _checkIsNumber(""));
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i, i2);
            _convertNumberToLong _convertnumbertolong = null;
            xmlPullParserNewPullParser.setInput(byteArrayInputStream, null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            int iAudioAttributesCompatParcelizer = 15;
            int i3 = 0;
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite = write;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = null;
            for (int eventType2 = eventType; eventType2 != 1; eventType2 = xmlPullParserNewPullParser.getEventType()) {
                _convertNumberToInt _convertnumbertoint = (_convertNumberToInt) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType2 == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            audioAttributesCompatParcelizerWrite = write(xmlPullParserNewPullParser);
                            iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(xmlPullParserNewPullParser);
                            remoteActionCompatParcelizer = read(xmlPullParserNewPullParser);
                        }
                        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = audioAttributesCompatParcelizerWrite;
                        int i4 = iAudioAttributesCompatParcelizer;
                        if (!AudioAttributesCompatParcelizer(name)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Ignoring unsupported tag: ");
                            sb.append(xmlPullParserNewPullParser.getName());
                            prune.write("TtmlParser", sb.toString());
                        } else {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                read(xmlPullParserNewPullParser, map, i4, remoteActionCompatParcelizer, map2, map3);
                            } else {
                                try {
                                    _convertNumberToInt _convertnumbertoint2 = read(xmlPullParserNewPullParser, _convertnumbertoint, map2, audioAttributesCompatParcelizer);
                                    arrayDeque.push(_convertnumbertoint2);
                                    if (_convertnumbertoint != null) {
                                        _convertnumbertoint.IconCompatParcelizer(_convertnumbertoint2);
                                    }
                                } catch (parseAsRFC1123 e) {
                                    prune.write("TtmlParser", "Suppressing parser error", e);
                                    i3++;
                                }
                            }
                            audioAttributesCompatParcelizerWrite = audioAttributesCompatParcelizer;
                            iAudioAttributesCompatParcelizer = i4;
                        }
                        i3++;
                        audioAttributesCompatParcelizerWrite = audioAttributesCompatParcelizer;
                        iAudioAttributesCompatParcelizer = i4;
                    } else if (eventType2 == 4) {
                        ((_convertNumberToInt) buildTypeSerializer.IconCompatParcelizer(_convertnumbertoint)).IconCompatParcelizer(_convertNumberToInt.read(xmlPullParserNewPullParser.getText()));
                    } else if (eventType2 == 3) {
                        if (xmlPullParserNewPullParser.getName().equals(TtmlNode.TAG_TT)) {
                            _convertnumbertolong = new _convertNumberToLong((_convertNumberToInt) buildTypeSerializer.IconCompatParcelizer((_convertNumberToInt) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType2 == 2) {
                    i3++;
                } else if (eventType2 == 3) {
                    i3--;
                }
                xmlPullParserNewPullParser.next();
            }
            return (isLenient) buildTypeSerializer.IconCompatParcelizer(_convertnumbertolong);
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        }
    }

    private static AudioAttributesCompatParcelizer write(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            buildTypeSerializer.write(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(attributeValue2, " ").length == 2, "frameRateMultiplier doesn't have 2 parts");
            f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f = 1.0f;
        }
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = write;
        int i2 = audioAttributesCompatParcelizer.write;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new AudioAttributesCompatParcelizer(i * f, i2, i3);
    }

    private static int AudioAttributesCompatParcelizer(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = RemoteActionCompatParcelizer.matcher(attributeValue);
        if (!matcher.matches()) {
            prune.RemoteActionCompatParcelizer("TtmlParser", "Ignoring malformed cell resolution: ".concat(String.valueOf(attributeValue)));
            return 15;
        }
        try {
            int i = Integer.parseInt((String) buildTypeSerializer.IconCompatParcelizer(matcher.group(1)));
            int i2 = Integer.parseInt((String) buildTypeSerializer.IconCompatParcelizer(matcher.group(2)));
            boolean z = (i == 0 || i2 == 0) ? false : true;
            StringBuilder sb = new StringBuilder("Invalid cell resolution ");
            sb.append(i);
            sb.append(" ");
            sb.append(i2);
            buildTypeSerializer.write(z, sb.toString());
            return i2;
        } catch (NumberFormatException unused) {
            prune.RemoteActionCompatParcelizer("TtmlParser", "Ignoring malformed cell resolution: ".concat(String.valueOf(attributeValue)));
            return 15;
        }
    }

    private static RemoteActionCompatParcelizer read(XmlPullParser xmlPullParser) {
        String str = StdTypeResolverBuilder.read(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (str == null) {
            return null;
        }
        Matcher matcher = AudioAttributesImplApi21Parcelizer.matcher(str);
        if (!matcher.matches()) {
            prune.RemoteActionCompatParcelizer("TtmlParser", "Ignoring non-pixel tts extent: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            return new RemoteActionCompatParcelizer(Integer.parseInt((String) buildTypeSerializer.IconCompatParcelizer(matcher.group(1))), Integer.parseInt((String) buildTypeSerializer.IconCompatParcelizer(matcher.group(2))));
        } catch (NumberFormatException unused) {
            prune.RemoteActionCompatParcelizer("TtmlParser", "Ignoring malformed tts extent: ".concat(String.valueOf(str)));
            return null;
        }
    }

    private static Map<String, _currentObject> read(XmlPullParser xmlPullParser, Map<String, _currentObject> map, int i, RemoteActionCompatParcelizer remoteActionCompatParcelizer, Map<String, _checkIsNumber> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser, TtmlNode.TAG_STYLE)) {
                String str = StdTypeResolverBuilder.read(xmlPullParser, TtmlNode.TAG_STYLE);
                _currentObject _currentobjectRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(xmlPullParser, new _currentObject());
                if (str != null) {
                    for (String str2 : write(str)) {
                        _currentobjectRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(map.get(str2));
                    }
                }
                String strAudioAttributesImplBaseParcelizer = _currentobjectRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
                if (strAudioAttributesImplBaseParcelizer != null) {
                    map.put(strAudioAttributesImplBaseParcelizer, _currentobjectRemoteActionCompatParcelizer);
                }
            } else if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser, TtmlNode.TAG_REGION)) {
                _checkIsNumber _checkisnumberRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(xmlPullParser, i, remoteActionCompatParcelizer);
                if (_checkisnumberRemoteActionCompatParcelizer != null) {
                    map2.put(_checkisnumberRemoteActionCompatParcelizer.write, _checkisnumberRemoteActionCompatParcelizer);
                }
            } else if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser, TtmlNode.TAG_METADATA)) {
                AudioAttributesCompatParcelizer(xmlPullParser, map3);
            }
        } while (!StdTypeResolverBuilder.write(xmlPullParser, TtmlNode.TAG_HEAD));
        return map;
    }

    private static void AudioAttributesCompatParcelizer(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String str;
        do {
            xmlPullParser.next();
            if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser, "image") && (str = StdTypeResolverBuilder.read(xmlPullParser, "id")) != null) {
                map.put(str, xmlPullParser.nextText());
            }
        } while (!StdTypeResolverBuilder.write(xmlPullParser, TtmlNode.TAG_METADATA));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0193 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static kotlin._checkIsNumber RemoteActionCompatParcelizer(org.xmlpull.v1.XmlPullParser r17, int r18, o._smallerThanLong.RemoteActionCompatParcelizer r19) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._smallerThanLong.RemoteActionCompatParcelizer(org.xmlpull.v1.XmlPullParser, int, o._smallerThanLong$RemoteActionCompatParcelizer):o._checkIsNumber");
    }

    private static String[] write(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(strTrim, "\\s+");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static kotlin._currentObject RemoteActionCompatParcelizer(org.xmlpull.v1.XmlPullParser r12, kotlin._currentObject r13) {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._smallerThanLong.RemoteActionCompatParcelizer(org.xmlpull.v1.XmlPullParser, o._currentObject):o._currentObject");
    }

    private static _currentObject read(_currentObject _currentobject) {
        return _currentobject == null ? new _currentObject() : _currentobject;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.text.Layout.Alignment RemoteActionCompatParcelizer(java.lang.String r5) {
        /*
            java.lang.String r5 = kotlin.parseMdhd.read(r5)
            r5.hashCode()
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L3b;
                case 100571: goto L31;
                case 3317767: goto L27;
                case 108511772: goto L1d;
                case 109757538: goto L13;
                default: goto L12;
            }
        L12:
            goto L45
        L13:
            java.lang.String r0 = "start"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L45
            r5 = r1
            goto L46
        L1d:
            java.lang.String r0 = "right"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L45
            r5 = r2
            goto L46
        L27:
            java.lang.String r0 = "left"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L45
            r5 = r3
            goto L46
        L31:
            java.lang.String r0 = "end"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L45
            r5 = r4
            goto L46
        L3b:
            java.lang.String r0 = "center"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L45
            r5 = 0
            goto L46
        L45:
            r5 = -1
        L46:
            if (r5 == 0) goto L58
            if (r5 == r4) goto L55
            if (r5 == r3) goto L52
            if (r5 == r2) goto L55
            if (r5 == r1) goto L52
            r5 = 0
            return r5
        L52:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r5
        L55:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r5
        L58:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._smallerThanLong.RemoteActionCompatParcelizer(java.lang.String):android.text.Layout$Alignment");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static kotlin._convertNumberToInt read(org.xmlpull.v1.XmlPullParser r20, kotlin._convertNumberToInt r21, java.util.Map<java.lang.String, kotlin._checkIsNumber> r22, o._smallerThanLong.AudioAttributesCompatParcelizer r23) throws kotlin.parseAsRFC1123 {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._smallerThanLong.read(org.xmlpull.v1.XmlPullParser, o._convertNumberToInt, java.util.Map, o._smallerThanLong$AudioAttributesCompatParcelizer):o._convertNumberToInt");
    }

    private static boolean AudioAttributesCompatParcelizer(String str) {
        return str.equals(TtmlNode.TAG_TT) || str.equals(TtmlNode.TAG_HEAD) || str.equals("body") || str.equals(TtmlNode.TAG_DIV) || str.equals(TtmlNode.TAG_P) || str.equals(TtmlNode.TAG_SPAN) || str.equals("br") || str.equals(TtmlNode.TAG_STYLE) || str.equals(TtmlNode.TAG_STYLING) || str.equals(TtmlNode.TAG_LAYOUT) || str.equals(TtmlNode.TAG_REGION) || str.equals(TtmlNode.TAG_METADATA) || str.equals("image") || str.equals("data") || str.equals(TtmlNode.TAG_INFORMATION);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void read(java.lang.String r7, kotlin._currentObject r8) throws kotlin.parseAsRFC1123 {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._smallerThanLong.read(java.lang.String, o._currentObject):void");
    }

    private static float read(String str) {
        Matcher matcher = MediaBrowserCompatCustomActionResultReceiver.matcher(str);
        if (!matcher.matches()) {
            prune.RemoteActionCompatParcelizer("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(str)));
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) buildTypeSerializer.IconCompatParcelizer(matcher.group(1)))));
        } catch (NumberFormatException e) {
            prune.write("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(str)), e);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long write(java.lang.String r18, o._smallerThanLong.AudioAttributesCompatParcelizer r19) throws kotlin.parseAsRFC1123 {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._smallerThanLong.write(java.lang.String, o._smallerThanLong$AudioAttributesCompatParcelizer):long");
    }

    static final class AudioAttributesCompatParcelizer {
        final int AudioAttributesCompatParcelizer;
        final float read;
        final int write;

        AudioAttributesCompatParcelizer(float f, int i, int i2) {
            this.read = f;
            this.write = i;
            this.AudioAttributesCompatParcelizer = i2;
        }
    }

    static final class RemoteActionCompatParcelizer {
        final int IconCompatParcelizer;
        final int RemoteActionCompatParcelizer;

        RemoteActionCompatParcelizer(int i, int i2) {
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = i2;
        }
    }
}
