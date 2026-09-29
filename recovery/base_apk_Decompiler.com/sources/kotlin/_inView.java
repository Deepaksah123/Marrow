package kotlin;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import androidx.media3.common.DrmInitData;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.C0170format;
import kotlin._serializeDynamicContents;
import kotlin.constructGeneralizedType;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class _inView extends DefaultHandler implements constructGeneralizedType.IconCompatParcelizer<FilteredBeanPropertyWriterMultiView> {
    private final XmlPullParserFactory read;
    private static final Pattern write = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private static final Pattern IconCompatParcelizer = Pattern.compile("CC([1-4])=.*");
    private static final Pattern RemoteActionCompatParcelizer = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    private static final int[] AudioAttributesCompatParcelizer = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    private static long AudioAttributesCompatParcelizer(long j, long j2) {
        if (j2 != C.TIME_UNSET) {
            j = j2;
        }
        return j == Long.MAX_VALUE ? C.TIME_UNSET : j;
    }

    public _inView() {
        try {
            this.read = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.constructGeneralizedType.IconCompatParcelizer
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public FilteredBeanPropertyWriterMultiView RemoteActionCompatParcelizer(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.read.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() != 2 || !"MPD".equals(xmlPullParserNewPullParser.getName())) {
                throw SchemaAware.AudioAttributesCompatParcelizer("inputStream does not contain a valid media presentation description", null);
            }
            return AudioAttributesCompatParcelizer(xmlPullParserNewPullParser, uri);
        } catch (XmlPullParserException e) {
            throw SchemaAware.AudioAttributesCompatParcelizer(null, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01d2 A[LOOP:0: B:24:0x009e->B:80:0x01d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private kotlin.FilteredBeanPropertyWriterMultiView AudioAttributesCompatParcelizer(org.xmlpull.v1.XmlPullParser r48, android.net.Uri r49) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._inView.AudioAttributesCompatParcelizer(org.xmlpull.v1.XmlPullParser, android.net.Uri):o.FilteredBeanPropertyWriterMultiView");
    }

    private static FilteredBeanPropertyWriterMultiView AudioAttributesCompatParcelizer(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, serializeContentsUsing serializecontentsusing, MapEntrySerializer mapEntrySerializer, IteratorSerializer iteratorSerializer, Uri uri, List<serializeContents> list) {
        return new FilteredBeanPropertyWriterMultiView(j, j2, j3, z, j4, j5, j6, j7, serializecontentsusing, mapEntrySerializer, iteratorSerializer, uri, list);
    }

    private static MapEntrySerializer onCustomAction(XmlPullParser xmlPullParser) {
        return IconCompatParcelizer(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.VALUE));
    }

    private static MapEntrySerializer IconCompatParcelizer(String str, String str2) {
        return new MapEntrySerializer(str, str2);
    }

    private static IteratorSerializer RatingCompat(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        float f = -3.4028235E38f;
        long jWrite = -9223372036854775807L;
        long jWrite2 = -9223372036854775807L;
        long jWrite3 = -9223372036854775807L;
        float f2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser, "Latency")) {
                jWrite = write(xmlPullParser, CourseConfigKeyConstantsKt.KEY_VIDEO_SUBJECT_ITEM_CHILD_TARGET, C.TIME_UNSET);
                jWrite2 = write(xmlPullParser, "min", C.TIME_UNSET);
                jWrite3 = write(xmlPullParser, "max", C.TIME_UNSET);
            } else if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser, "PlaybackRate")) {
                f = read(xmlPullParser, "min");
                f2 = read(xmlPullParser, "max");
            }
            float f3 = f;
            float f4 = f2;
            long j = jWrite;
            long j2 = jWrite2;
            long j3 = jWrite3;
            if (StdTypeResolverBuilder.write(xmlPullParser, "ServiceDescription")) {
                return new IteratorSerializer(j, j2, j3, f3, f4);
            }
            jWrite = j;
            jWrite2 = j2;
            jWrite3 = j3;
            f = f3;
            f2 = f4;
        }
    }

    private Pair<serializeContents, Long> IconCompatParcelizer(XmlPullParser xmlPullParser, List<constructViewBased> list, long j, long j2, long j3, long j4, boolean z) throws XmlPullParserException, IOException {
        long j5;
        ArrayList arrayList;
        ArrayList arrayList2;
        XmlPullParser xmlPullParser2;
        Object obj;
        ArrayList arrayList3;
        long j6;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser3.getAttributeValue(null, "id");
        long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(xmlPullParser3, TtmlNode.START, j);
        long j7 = C.TIME_UNSET;
        long j8 = j3 != C.TIME_UNSET ? j3 + jAudioAttributesCompatParcelizer : -9223372036854775807L;
        long jAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(xmlPullParser3, "duration", C.TIME_UNSET);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long jWrite = j2;
        boolean z2 = false;
        long jWrite2 = -9223372036854775807L;
        _serializeDynamicContents _serializedynamiccontentsRemoteActionCompatParcelizer = null;
        IndexedListSerializer indexedListSerializerAudioAttributesCompatParcelizer = null;
        while (true) {
            xmlPullParser.next();
            if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser3, "BaseURL")) {
                if (!z2) {
                    jWrite = write(xmlPullParser3, jWrite);
                    z2 = true;
                }
                arrayList6.addAll(IconCompatParcelizer(xmlPullParser3, list, z));
                arrayList = arrayList6;
                arrayList3 = arrayList5;
                j6 = j7;
                obj = obj2;
                xmlPullParser2 = xmlPullParser3;
                arrayList2 = arrayList4;
            } else {
                if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser3, "AdaptationSet")) {
                    j5 = jWrite;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    arrayList2.add(IconCompatParcelizer(xmlPullParser, !arrayList6.isEmpty() ? arrayList6 : list, _serializedynamiccontentsRemoteActionCompatParcelizer, jAudioAttributesCompatParcelizer2, jWrite, jWrite2, j8, j4, z));
                    xmlPullParser2 = xmlPullParser;
                    arrayList3 = arrayList5;
                } else {
                    j5 = jWrite;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    ArrayList arrayList7 = arrayList5;
                    xmlPullParser2 = xmlPullParser;
                    if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser2, "EventStream")) {
                        arrayList7.add(MediaBrowserCompatCustomActionResultReceiver(xmlPullParser));
                        arrayList3 = arrayList7;
                    } else {
                        if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser2, "SegmentBase")) {
                            _serializedynamiccontentsRemoteActionCompatParcelizer = read(xmlPullParser2, (_serializeDynamicContents.AudioAttributesCompatParcelizer) null);
                            obj = null;
                        } else if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser2, "SegmentList")) {
                            jWrite2 = write(xmlPullParser2, C.TIME_UNSET);
                            obj = null;
                            _serializedynamiccontentsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(xmlPullParser, null, j8, jAudioAttributesCompatParcelizer2, j5, jWrite2, j4);
                        } else {
                            obj = null;
                            if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser2, "SegmentTemplate")) {
                                jWrite2 = write(xmlPullParser2, C.TIME_UNSET);
                                j6 = -9223372036854775807L;
                                arrayList3 = arrayList7;
                                _serializedynamiccontentsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(xmlPullParser, null, initExtraTracks.AudioAttributesImplApi26Parcelizer(), j8, jAudioAttributesCompatParcelizer2, j5, jWrite2, j4);
                            } else {
                                arrayList3 = arrayList7;
                                j6 = C.TIME_UNSET;
                                if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser2, "AssetIdentifier")) {
                                    indexedListSerializerAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    IconCompatParcelizer(xmlPullParser);
                                }
                            }
                            jWrite = j5;
                        }
                        arrayList3 = arrayList7;
                        jWrite = j5;
                        j6 = C.TIME_UNSET;
                    }
                }
                obj = null;
                j6 = C.TIME_UNSET;
                jWrite = j5;
            }
            if (StdTypeResolverBuilder.write(xmlPullParser2, "Period")) {
                return Pair.create(AudioAttributesCompatParcelizer(attributeValue, jAudioAttributesCompatParcelizer, arrayList2, arrayList3, indexedListSerializerAudioAttributesCompatParcelizer), Long.valueOf(jAudioAttributesCompatParcelizer2));
            }
            arrayList4 = arrayList2;
            arrayList6 = arrayList;
            j7 = j6;
            arrayList5 = arrayList3;
            xmlPullParser3 = xmlPullParser2;
            obj2 = obj;
        }
    }

    private static serializeContents AudioAttributesCompatParcelizer(String str, long j, List<FilteredBeanPropertyWriterSingleView> list, List<serializeTypedContents> list2, IndexedListSerializer indexedListSerializer) {
        return new serializeContents(str, j, list, list2, indexedListSerializer);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x030f A[LOOP:0: B:3:0x007f->B:73:0x030f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02d1 A[EDGE_INSN: B:74:0x02d1->B:67:0x02d1 BREAK  A[LOOP:0: B:3:0x007f->B:73:0x030f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private kotlin.FilteredBeanPropertyWriterSingleView IconCompatParcelizer(org.xmlpull.v1.XmlPullParser r57, java.util.List<kotlin.constructViewBased> r58, kotlin._serializeDynamicContents r59, long r60, long r62, long r64, long r66, long r68, boolean r70) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._inView.IconCompatParcelizer(org.xmlpull.v1.XmlPullParser, java.util.List, o._serializeDynamicContents, long, long, long, long, long, boolean):o.FilteredBeanPropertyWriterSingleView");
    }

    private static FilteredBeanPropertyWriterSingleView AudioAttributesCompatParcelizer(long j, int i, List<IndexedStringListSerializer> list, List<IndexedListSerializer> list2, List<IndexedListSerializer> list3, List<IndexedListSerializer> list4) {
        return new FilteredBeanPropertyWriterSingleView(j, i, list, list2, list3, list4);
    }

    private static int AudioAttributesImplApi21Parcelizer(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair<java.lang.String, androidx.media3.common.DrmInitData.SchemeData> MediaBrowserCompatItemReceiver(org.xmlpull.v1.XmlPullParser r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._inView.MediaBrowserCompatItemReceiver(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    private static void AudioAttributesImplApi26Parcelizer(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        IconCompatParcelizer(xmlPullParser);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01ef A[LOOP:0: B:3:0x0068->B:54:0x01ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019b A[EDGE_INSN: B:55:0x019b->B:46:0x019b BREAK  A[LOOP:0: B:3:0x0068->B:54:0x01ef], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private o._inView.RemoteActionCompatParcelizer RemoteActionCompatParcelizer(org.xmlpull.v1.XmlPullParser r34, java.util.List<kotlin.constructViewBased> r35, java.lang.String r36, java.lang.String r37, int r38, int r39, float r40, int r41, int r42, java.lang.String r43, java.util.List<kotlin.IndexedListSerializer> r44, java.util.List<kotlin.IndexedListSerializer> r45, java.util.List<kotlin.IndexedListSerializer> r46, java.util.List<kotlin.IndexedListSerializer> r47, kotlin._serializeDynamicContents r48, long r49, long r51, long r53, long r55, long r57, boolean r59) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._inView.RemoteActionCompatParcelizer(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, o._serializeDynamicContents, long, long, long, long, long, boolean):o._inView$RemoteActionCompatParcelizer");
    }

    private C0170format IconCompatParcelizer(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, List<IndexedListSerializer> list, List<IndexedListSerializer> list2, String str4, List<IndexedListSerializer> list3, List<IndexedListSerializer> list4) {
        String str5 = str4;
        String strWrite = write(str2, str5);
        if (MimeTypes.AUDIO_E_AC3.equals(strWrite)) {
            strWrite = read(list4);
            if (MimeTypes.AUDIO_E_AC3_JOC.equals(strWrite)) {
                str5 = MimeTypes.CODEC_E_AC3_JOC;
            }
        }
        int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(list);
        int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(list);
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(list2);
        int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(list3);
        int iAudioAttributesImplApi26Parcelizer2 = AudioAttributesImplApi26Parcelizer(list4);
        Pair<Integer, Integer> pairAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(list3);
        C0170format.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(str).IconCompatParcelizer(str2).AudioAttributesImplApi26Parcelizer(strWrite).RemoteActionCompatParcelizer(str5).MediaDescriptionCompat(i5).handleMediaPlayPauseIfPendingOnHandler(iMediaBrowserCompatItemReceiver).MediaBrowserCompatSearchResultReceiver(iMediaBrowserCompatCustomActionResultReceiver | iAudioAttributesCompatParcelizer | iAudioAttributesImplApi26Parcelizer | iAudioAttributesImplApi26Parcelizer2).read(str3);
        int iWrite = -1;
        C0170format.RemoteActionCompatParcelizer remoteActionCompatParcelizerOnCommand = remoteActionCompatParcelizer.onAddQueueItem(pairAudioAttributesImplBaseParcelizer != null ? ((Integer) pairAudioAttributesImplBaseParcelizer.first).intValue() : -1).onCommand(pairAudioAttributesImplBaseParcelizer != null ? ((Integer) pairAudioAttributesImplBaseParcelizer.second).intValue() : -1);
        if (DefaultBaseTypeLimitingValidator.MediaBrowserCompatItemReceiver(strWrite)) {
            remoteActionCompatParcelizerOnCommand.onFastForward(i).MediaBrowserCompatItemReceiver(i2).RemoteActionCompatParcelizer(f);
        } else if (DefaultBaseTypeLimitingValidator.AudioAttributesImplApi21Parcelizer(strWrite)) {
            remoteActionCompatParcelizerOnCommand.read(i3).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(i4);
        } else if (DefaultBaseTypeLimitingValidator.AudioAttributesImplApi26Parcelizer(strWrite)) {
            if (MimeTypes.APPLICATION_CEA608.equals(strWrite)) {
                iWrite = RemoteActionCompatParcelizer(list2);
            } else if (MimeTypes.APPLICATION_CEA708.equals(strWrite)) {
                iWrite = write(list2);
            }
            remoteActionCompatParcelizerOnCommand.AudioAttributesCompatParcelizer(iWrite);
        } else if (DefaultBaseTypeLimitingValidator.AudioAttributesImplBaseParcelizer(strWrite)) {
            remoteActionCompatParcelizerOnCommand.onFastForward(i).MediaBrowserCompatItemReceiver(i2);
        }
        return remoteActionCompatParcelizerOnCommand.IconCompatParcelizer();
    }

    private static IndexedStringListSerializer IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, String str, List<JsonValueFormatVisitor> list, String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<IndexedListSerializer> arrayList2) {
        C0170format.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = remoteActionCompatParcelizer.read.write();
        if (str != null && list.isEmpty()) {
            remoteActionCompatParcelizerWrite.write(str);
        } else {
            remoteActionCompatParcelizerWrite.IconCompatParcelizer(list);
        }
        String str3 = remoteActionCompatParcelizer.write;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            RemoteActionCompatParcelizer(arrayList3);
            read(arrayList3);
            remoteActionCompatParcelizerWrite.AudioAttributesCompatParcelizer(new DrmInitData(str2, arrayList3));
        }
        ArrayList<IndexedListSerializer> arrayList4 = remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
        arrayList4.addAll(arrayList2);
        return IndexedStringListSerializer.RemoteActionCompatParcelizer(remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer, remoteActionCompatParcelizerWrite.IconCompatParcelizer(), remoteActionCompatParcelizer.IconCompatParcelizer, remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer, arrayList4, remoteActionCompatParcelizer.RemoteActionCompatParcelizer, remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer);
    }

    private _serializeDynamicContents.AudioAttributesCompatParcelizer read(XmlPullParser xmlPullParser, _serializeDynamicContents.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) throws XmlPullParserException, IOException {
        long j;
        long j2;
        long jWrite = write(xmlPullParser, "timescale", audioAttributesCompatParcelizer != null ? audioAttributesCompatParcelizer.RemoteActionCompatParcelizer : 1L);
        long jWrite2 = write(xmlPullParser, "presentationTimeOffset", audioAttributesCompatParcelizer != null ? audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer : 0L);
        long j3 = audioAttributesCompatParcelizer != null ? audioAttributesCompatParcelizer.IconCompatParcelizer : 0L;
        long j4 = audioAttributesCompatParcelizer != null ? audioAttributesCompatParcelizer.write : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            j2 = Long.parseLong(strArrSplit[0]);
            j = (Long.parseLong(strArrSplit[1]) - j2) + 1;
        } else {
            j = j4;
            j2 = j3;
        }
        _withResolved _withresolvedMediaBrowserCompatSearchResultReceiver = audioAttributesCompatParcelizer != null ? audioAttributesCompatParcelizer.read : null;
        do {
            xmlPullParser.next();
            if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser, "Initialization")) {
                _withresolvedMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver(xmlPullParser);
            } else {
                IconCompatParcelizer(xmlPullParser);
            }
        } while (!StdTypeResolverBuilder.write(xmlPullParser, "SegmentBase"));
        return RemoteActionCompatParcelizer(_withresolvedMediaBrowserCompatSearchResultReceiver, jWrite, jWrite2, j2, j);
    }

    private static _serializeDynamicContents.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(_withResolved _withresolved, long j, long j2, long j3, long j4) {
        return new _serializeDynamicContents.AudioAttributesCompatParcelizer(_withresolved, j, j2, j3, j4);
    }

    private _serializeDynamicContents.read RemoteActionCompatParcelizer(XmlPullParser xmlPullParser, _serializeDynamicContents.read readVar, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long jWrite = write(xmlPullParser, "timescale", readVar != null ? readVar.RemoteActionCompatParcelizer : 1L);
        long jWrite2 = write(xmlPullParser, "presentationTimeOffset", readVar != null ? readVar.AudioAttributesCompatParcelizer : 0L);
        long jWrite3 = write(xmlPullParser, "duration", readVar != null ? readVar.IconCompatParcelizer : C.TIME_UNSET);
        long jWrite4 = write(xmlPullParser, "startNumber", readVar != null ? readVar.AudioAttributesImplBaseParcelizer : 1L);
        long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(j3, j4);
        List<_serializeDynamicContents.RemoteActionCompatParcelizer> listWrite = null;
        List<_withResolved> arrayList = null;
        _withResolved _withresolvedMediaBrowserCompatSearchResultReceiver = null;
        do {
            xmlPullParser.next();
            if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser, "Initialization")) {
                _withresolvedMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver(xmlPullParser);
            } else if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser, "SegmentTimeline")) {
                listWrite = write(xmlPullParser, jWrite, j2);
            } else if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                List<_withResolved> list = arrayList;
                list.add(MediaBrowserCompatMediaItem(xmlPullParser));
                arrayList = list;
            } else {
                IconCompatParcelizer(xmlPullParser);
            }
        } while (!StdTypeResolverBuilder.write(xmlPullParser, "SegmentList"));
        if (readVar != null) {
            if (_withresolvedMediaBrowserCompatSearchResultReceiver == null) {
                _withresolvedMediaBrowserCompatSearchResultReceiver = readVar.read;
            }
            if (listWrite == null) {
                listWrite = readVar.AudioAttributesImplApi26Parcelizer;
            }
            if (arrayList == null) {
                arrayList = readVar.MediaBrowserCompatItemReceiver;
            }
        }
        return write(_withresolvedMediaBrowserCompatSearchResultReceiver, jWrite, jWrite2, jWrite4, jWrite3, listWrite, jAudioAttributesCompatParcelizer, arrayList, j5, j);
    }

    private static _serializeDynamicContents.read write(_withResolved _withresolved, long j, long j2, long j3, long j4, List<_serializeDynamicContents.RemoteActionCompatParcelizer> list, long j5, List<_withResolved> list2, long j6, long j7) {
        return new _serializeDynamicContents.read(_withresolved, j, j2, j3, j4, list, j5, list2, LaissezFaireSubTypeValidator.IconCompatParcelizer(j6), LaissezFaireSubTypeValidator.IconCompatParcelizer(j7));
    }

    private _serializeDynamicContents.write RemoteActionCompatParcelizer(XmlPullParser xmlPullParser, _serializeDynamicContents.write writeVar, List<IndexedListSerializer> list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long jWrite = write(xmlPullParser, "timescale", writeVar != null ? writeVar.RemoteActionCompatParcelizer : 1L);
        long jWrite2 = write(xmlPullParser, "presentationTimeOffset", writeVar != null ? writeVar.AudioAttributesCompatParcelizer : 0L);
        long jWrite3 = write(xmlPullParser, "duration", writeVar != null ? writeVar.IconCompatParcelizer : C.TIME_UNSET);
        long jWrite4 = write(xmlPullParser, "startNumber", writeVar != null ? writeVar.AudioAttributesImplBaseParcelizer : 1L);
        long jIconCompatParcelizer = IconCompatParcelizer(list);
        long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(j3, j4);
        List<_serializeDynamicContents.RemoteActionCompatParcelizer> listWrite = null;
        acceptContentVisitor acceptcontentvisitorAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(xmlPullParser, "media", writeVar != null ? writeVar.MediaBrowserCompatCustomActionResultReceiver : null);
        acceptContentVisitor acceptcontentvisitorAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(xmlPullParser, "initialization", writeVar != null ? writeVar.MediaBrowserCompatItemReceiver : null);
        _withResolved _withresolvedMediaBrowserCompatSearchResultReceiver = null;
        do {
            xmlPullParser.next();
            if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser, "Initialization")) {
                _withresolvedMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver(xmlPullParser);
            } else if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser, "SegmentTimeline")) {
                listWrite = write(xmlPullParser, jWrite, j2);
            } else {
                IconCompatParcelizer(xmlPullParser);
            }
        } while (!StdTypeResolverBuilder.write(xmlPullParser, "SegmentTemplate"));
        if (writeVar != null) {
            if (_withresolvedMediaBrowserCompatSearchResultReceiver == null) {
                _withresolvedMediaBrowserCompatSearchResultReceiver = writeVar.read;
            }
            if (listWrite == null) {
                listWrite = writeVar.AudioAttributesImplApi26Parcelizer;
            }
        }
        return IconCompatParcelizer(_withresolvedMediaBrowserCompatSearchResultReceiver, jWrite, jWrite2, jWrite4, jIconCompatParcelizer, jWrite3, listWrite, jAudioAttributesCompatParcelizer, acceptcontentvisitorAudioAttributesCompatParcelizer2, acceptcontentvisitorAudioAttributesCompatParcelizer, j5, j);
    }

    private static _serializeDynamicContents.write IconCompatParcelizer(_withResolved _withresolved, long j, long j2, long j3, long j4, long j5, List<_serializeDynamicContents.RemoteActionCompatParcelizer> list, long j6, acceptContentVisitor acceptcontentvisitor, acceptContentVisitor acceptcontentvisitor2, long j7, long j8) {
        return new _serializeDynamicContents.write(_withresolved, j, j2, j3, j4, j5, list, j6, acceptcontentvisitor, acceptcontentvisitor2, LaissezFaireSubTypeValidator.IconCompatParcelizer(j7), LaissezFaireSubTypeValidator.IconCompatParcelizer(j8));
    }

    private serializeTypedContents MediaBrowserCompatCustomActionResultReceiver(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        String strIconCompatParcelizer = IconCompatParcelizer(xmlPullParser, "schemeIdUri", "");
        String strIconCompatParcelizer2 = IconCompatParcelizer(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, "");
        long jWrite = write(xmlPullParser, "timescale", 1L);
        long jWrite2 = write(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser, "Event")) {
                byteArrayOutputStream = byteArrayOutputStream2;
                arrayList.add(write(xmlPullParser, strIconCompatParcelizer, strIconCompatParcelizer2, jWrite, jWrite2, byteArrayOutputStream2));
            } else {
                byteArrayOutputStream = byteArrayOutputStream2;
                IconCompatParcelizer(xmlPullParser);
            }
            if (StdTypeResolverBuilder.write(xmlPullParser, "EventStream")) {
                break;
            }
            byteArrayOutputStream2 = byteArrayOutputStream;
        }
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            eventMessageArr[i] = (EventMessage) pair.second;
        }
        return write(strIconCompatParcelizer, strIconCompatParcelizer2, jWrite, jArr, eventMessageArr);
    }

    private static serializeTypedContents write(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        return new serializeTypedContents(str, str2, j, jArr, eventMessageArr);
    }

    private static Pair<Long, EventMessage> write(XmlPullParser xmlPullParser, String str, String str2, long j, long j2, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        long jWrite = write(xmlPullParser, "id", 0L);
        long jWrite2 = write(xmlPullParser, "duration", C.TIME_UNSET);
        long jWrite3 = write(xmlPullParser, "presentationTime", 0L);
        long jAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(jWrite2, 1000L, j);
        long jAudioAttributesCompatParcelizer2 = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(jWrite3 - j2, 1000000L, j);
        String strIconCompatParcelizer = IconCompatParcelizer(xmlPullParser, "messageData", (String) null);
        byte[] bArrWrite = write(xmlPullParser, byteArrayOutputStream);
        if (strIconCompatParcelizer != null) {
            bArrWrite = LaissezFaireSubTypeValidator.IconCompatParcelizer(strIconCompatParcelizer);
        }
        return Pair.create(Long.valueOf(jAudioAttributesCompatParcelizer2), write(str, str2, jWrite, jAudioAttributesCompatParcelizer, bArrWrite));
    }

    private static byte[] write(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer.name());
        xmlPullParser.nextToken();
        while (!StdTypeResolverBuilder.write(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        xmlSerializerNewSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    private static EventMessage write(String str, String str2, long j, long j2, byte[] bArr) {
        return new EventMessage(str, str2, j2, j, bArr);
    }

    private List<_serializeDynamicContents.RemoteActionCompatParcelizer> write(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jRemoteActionCompatParcelizer = 0;
        long j3 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser, "S")) {
                long jWrite = write(xmlPullParser, "t", C.TIME_UNSET);
                if (z) {
                    jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(arrayList, jRemoteActionCompatParcelizer, j3, i, jWrite);
                }
                if (jWrite == C.TIME_UNSET) {
                    jWrite = jRemoteActionCompatParcelizer;
                }
                long jWrite2 = write(xmlPullParser, "d", C.TIME_UNSET);
                i = read(xmlPullParser, "r", 0);
                z = true;
                j3 = jWrite2;
                jRemoteActionCompatParcelizer = jWrite;
            } else {
                IconCompatParcelizer(xmlPullParser);
            }
        } while (!StdTypeResolverBuilder.write(xmlPullParser, "SegmentTimeline"));
        if (z) {
            RemoteActionCompatParcelizer(arrayList, jRemoteActionCompatParcelizer, j3, i, LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j2, j, 1000L));
        }
        return arrayList;
    }

    private static long RemoteActionCompatParcelizer(List<_serializeDynamicContents.RemoteActionCompatParcelizer> list, long j, long j2, int i, long j3) {
        int i2 = i >= 0 ? i + 1 : (int) LaissezFaireSubTypeValidator.read(j3 - j, j2);
        for (int i3 = 0; i3 < i2; i3++) {
            list.add(RemoteActionCompatParcelizer(j, j2));
            j += j2;
        }
        return j;
    }

    private static _serializeDynamicContents.RemoteActionCompatParcelizer RemoteActionCompatParcelizer(long j, long j2) {
        return new _serializeDynamicContents.RemoteActionCompatParcelizer(j, j2);
    }

    private static acceptContentVisitor AudioAttributesCompatParcelizer(XmlPullParser xmlPullParser, String str, acceptContentVisitor acceptcontentvisitor) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? acceptContentVisitor.IconCompatParcelizer(attributeValue) : acceptcontentvisitor;
    }

    private _withResolved MediaBrowserCompatSearchResultReceiver(XmlPullParser xmlPullParser) {
        return RemoteActionCompatParcelizer(xmlPullParser, "sourceURL", SessionDescription.ATTR_RANGE);
    }

    private _withResolved MediaBrowserCompatMediaItem(XmlPullParser xmlPullParser) {
        return RemoteActionCompatParcelizer(xmlPullParser, "media", "mediaRange");
    }

    private static _withResolved RemoteActionCompatParcelizer(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j2 = -1;
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
        } else {
            j = 0;
        }
        return RemoteActionCompatParcelizer(attributeValue, j, j2);
    }

    private static _withResolved RemoteActionCompatParcelizer(String str, long j, long j2) {
        return new _withResolved(str, j, j2);
    }

    private static serializeContentsUsing MediaMetadataCompat(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String strIconCompatParcelizer = IconCompatParcelizer(xmlPullParser, "moreInformationURL", (String) null);
        String strIconCompatParcelizer2 = IconCompatParcelizer(xmlPullParser, "lang", (String) null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser, "Copyright")) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                IconCompatParcelizer(xmlPullParser);
            }
            String str = strNextText3;
            if (StdTypeResolverBuilder.write(xmlPullParser, "ProgramInformation")) {
                return new serializeContentsUsing(strNextText, strNextText2, str, strIconCompatParcelizer, strIconCompatParcelizer2);
            }
            strNextText3 = str;
        }
    }

    private static JsonValueFormatVisitor MediaDescriptionCompat(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return new JsonValueFormatVisitor(xmlPullParser.getAttributeValue(null, "lang"), RemoteActionCompatParcelizer(xmlPullParser, "Label"));
    }

    private static List<constructViewBased> IconCompatParcelizer(XmlPullParser xmlPullParser, List<constructViewBased> list, boolean z) throws XmlPullParserException, IOException {
        int i;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else {
            i = z ? 1 : Integer.MIN_VALUE;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(xmlPullParser, "BaseURL");
        if (_idFrom.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer)) {
            if (attributeValue3 == null) {
                attributeValue3 = strRemoteActionCompatParcelizer;
            }
            return parseMehd.read(new constructViewBased(strRemoteActionCompatParcelizer, attributeValue3, i, i2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            constructViewBased constructviewbased = list.get(i3);
            String strRemoteActionCompatParcelizer2 = _idFrom.RemoteActionCompatParcelizer(constructviewbased.IconCompatParcelizer, strRemoteActionCompatParcelizer);
            String str = attributeValue3 == null ? strRemoteActionCompatParcelizer2 : attributeValue3;
            if (z) {
                i = constructviewbased.AudioAttributesCompatParcelizer;
                i2 = constructviewbased.read;
                str = constructviewbased.RemoteActionCompatParcelizer;
            }
            arrayList.add(new constructViewBased(strRemoteActionCompatParcelizer2, str, i, i2));
        }
        return arrayList;
    }

    private static long write(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    private static int AudioAttributesImplBaseParcelizer(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        byte b;
        String strIconCompatParcelizer = IconCompatParcelizer(xmlPullParser, "schemeIdUri", (String) null);
        strIconCompatParcelizer.hashCode();
        int iAudioAttributesCompatParcelizer = -1;
        switch (strIconCompatParcelizer.hashCode()) {
            case -2128649360:
                b = !strIconCompatParcelizer.equals("urn:dts:dash:audio_channel_configuration:2012") ? (byte) -1 : (byte) 0;
                break;
            case -1352850286:
                b = !strIconCompatParcelizer.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011") ? (byte) -1 : (byte) 1;
                break;
            case -1138141449:
                b = !strIconCompatParcelizer.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011") ? (byte) -1 : (byte) 2;
                break;
            case -986633423:
                b = !strIconCompatParcelizer.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration") ? (byte) -1 : (byte) 3;
                break;
            case -79006963:
                b = !strIconCompatParcelizer.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012") ? (byte) -1 : (byte) 4;
                break;
            case 312179081:
                b = !strIconCompatParcelizer.equals("tag:dts.com,2018:uhd:audio_channel_configuration") ? (byte) -1 : (byte) 5;
                break;
            case 2036691300:
                b = !strIconCompatParcelizer.equals("urn:dolby:dash:audio_channel_configuration:2011") ? (byte) -1 : (byte) 6;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 4:
                iAudioAttributesCompatParcelizer = read(xmlPullParser);
                break;
            case 1:
                iAudioAttributesCompatParcelizer = read(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, -1);
                break;
            case 2:
            case 6:
                iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(xmlPullParser);
                break;
            case 3:
                iAudioAttributesCompatParcelizer = RemoteActionCompatParcelizer(xmlPullParser);
                break;
            case 5:
                iAudioAttributesCompatParcelizer = write(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!StdTypeResolverBuilder.write(xmlPullParser, "AudioChannelConfiguration"));
        return iAudioAttributesCompatParcelizer;
    }

    private static int MediaBrowserCompatItemReceiver(List<IndexedListSerializer> list) {
        int iRemoteActionCompatParcelizer = 0;
        for (int i = 0; i < list.size(); i++) {
            IndexedListSerializer indexedListSerializer = list.get(i);
            if (parseMdhd.write("urn:mpeg:dash:role:2011", indexedListSerializer.write)) {
                iRemoteActionCompatParcelizer |= RemoteActionCompatParcelizer(indexedListSerializer.RemoteActionCompatParcelizer);
            }
        }
        return iRemoteActionCompatParcelizer;
    }

    private static int RemoteActionCompatParcelizer(String str) {
        if (str == null) {
            return 0;
        }
        str.hashCode();
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    private static int MediaBrowserCompatCustomActionResultReceiver(List<IndexedListSerializer> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            IndexedListSerializer indexedListSerializer = list.get(i2);
            if (parseMdhd.write("urn:mpeg:dash:role:2011", indexedListSerializer.write)) {
                i |= read(indexedListSerializer.RemoteActionCompatParcelizer);
            }
        }
        return i;
    }

    private static int AudioAttributesCompatParcelizer(List<IndexedListSerializer> list) {
        int iAudioAttributesCompatParcelizer;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            IndexedListSerializer indexedListSerializer = list.get(i2);
            if (parseMdhd.write("urn:mpeg:dash:role:2011", indexedListSerializer.write)) {
                iAudioAttributesCompatParcelizer = read(indexedListSerializer.RemoteActionCompatParcelizer);
            } else if (parseMdhd.write("urn:tva:metadata:cs:AudioPurposeCS:2007", indexedListSerializer.write)) {
                iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(indexedListSerializer.RemoteActionCompatParcelizer);
            }
            i |= iAudioAttributesCompatParcelizer;
        }
        return i;
    }

    private static int AudioAttributesImplApi26Parcelizer(List<IndexedListSerializer> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (parseMdhd.write("http://dashif.org/guidelines/trickmode", list.get(i2).write)) {
                i = 16384;
            }
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int read(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._inView.read(java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int AudioAttributesCompatParcelizer(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            r6.hashCode()
            int r1 = r6.hashCode()
            r2 = 3
            r3 = 2
            r4 = 4
            r5 = 1
            switch(r1) {
                case 49: goto L3b;
                case 50: goto L31;
                case 51: goto L27;
                case 52: goto L1d;
                case 53: goto L12;
                case 54: goto L13;
                default: goto L12;
            }
        L12:
            goto L45
        L13:
            java.lang.String r1 = "6"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L45
            r6 = r4
            goto L46
        L1d:
            java.lang.String r1 = "4"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L45
            r6 = r2
            goto L46
        L27:
            java.lang.String r1 = "3"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L45
            r6 = r3
            goto L46
        L31:
            java.lang.String r1 = "2"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L45
            r6 = r5
            goto L46
        L3b:
            java.lang.String r1 = "1"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L45
            r6 = r0
            goto L46
        L45:
            r6 = -1
        L46:
            if (r6 == 0) goto L59
            if (r6 == r5) goto L56
            if (r6 == r3) goto L55
            if (r6 == r2) goto L52
            if (r6 == r4) goto L51
            return r0
        L51:
            return r5
        L52:
            r6 = 8
            return r6
        L55:
            return r4
        L56:
            r6 = 2048(0x800, float:2.87E-42)
            return r6
        L59:
            r6 = 512(0x200, float:7.17E-43)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._inView.AudioAttributesCompatParcelizer(java.lang.String):int");
    }

    private static String[] read(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    private static Pair<Integer, Integer> AudioAttributesImplBaseParcelizer(List<IndexedListSerializer> list) {
        for (int i = 0; i < list.size(); i++) {
            IndexedListSerializer indexedListSerializer = list.get(i);
            if ((parseMdhd.write("http://dashif.org/thumbnail_tile", indexedListSerializer.write) || parseMdhd.write("http://dashif.org/guidelines/thumbnail_tile", indexedListSerializer.write)) && indexedListSerializer.RemoteActionCompatParcelizer != null) {
                String[] strArrAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(indexedListSerializer.RemoteActionCompatParcelizer, "x");
                if (strArrAudioAttributesCompatParcelizer.length == 2) {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(strArrAudioAttributesCompatParcelizer[0])), Integer.valueOf(Integer.parseInt(strArrAudioAttributesCompatParcelizer[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private static void IconCompatParcelizer(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (StdTypeResolverBuilder.AudioAttributesCompatParcelizer(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (StdTypeResolverBuilder.AudioAttributesCompatParcelizer(xmlPullParser)) {
                    i++;
                } else if (StdTypeResolverBuilder.RemoteActionCompatParcelizer(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    private static void read(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (!schemeData.RemoteActionCompatParcelizer()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    }
                    if (arrayList.get(i).RemoteActionCompatParcelizer(schemeData)) {
                        arrayList.remove(size);
                        break;
                    }
                    i++;
                }
            }
        }
    }

    private static void RemoteActionCompatParcelizer(ArrayList<DrmInitData.SchemeData> arrayList) {
        String str;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                str = null;
                break;
            }
            DrmInitData.SchemeData schemeData = arrayList.get(i);
            if (JsonMapFormatVisitor.AudioAttributesCompatParcelizer.equals(schemeData.AudioAttributesCompatParcelizer) && schemeData.write != null) {
                str = schemeData.write;
                arrayList.remove(i);
                break;
            }
            i++;
        }
        if (str != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                DrmInitData.SchemeData schemeData2 = arrayList.get(i2);
                if (JsonMapFormatVisitor.write.equals(schemeData2.AudioAttributesCompatParcelizer) && schemeData2.write == null) {
                    arrayList.set(i2, new DrmInitData.SchemeData(JsonMapFormatVisitor.AudioAttributesCompatParcelizer, str, schemeData2.IconCompatParcelizer, schemeData2.read));
                }
            }
        }
    }

    private static String write(String str, String str2) {
        if (DefaultBaseTypeLimitingValidator.AudioAttributesImplApi21Parcelizer(str)) {
            return DefaultBaseTypeLimitingValidator.RemoteActionCompatParcelizer(str2);
        }
        if (DefaultBaseTypeLimitingValidator.MediaBrowserCompatItemReceiver(str)) {
            return DefaultBaseTypeLimitingValidator.read(str2);
        }
        if (DefaultBaseTypeLimitingValidator.AudioAttributesImplApi26Parcelizer(str) || DefaultBaseTypeLimitingValidator.AudioAttributesImplBaseParcelizer(str)) {
            return str;
        }
        if (!MimeTypes.APPLICATION_MP4.equals(str)) {
            return null;
        }
        String strWrite = DefaultBaseTypeLimitingValidator.write(str2);
        return MimeTypes.TEXT_VTT.equals(strWrite) ? MimeTypes.APPLICATION_MP4VTT : strWrite;
    }

    private static String AudioAttributesCompatParcelizer(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        buildTypeSerializer.write(str.equals(str2));
        return str;
    }

    private static int RemoteActionCompatParcelizer(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        buildTypeSerializer.write(i == i2);
        return i;
    }

    private static IndexedListSerializer AudioAttributesCompatParcelizer(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strIconCompatParcelizer = IconCompatParcelizer(xmlPullParser, "schemeIdUri", "");
        String strIconCompatParcelizer2 = IconCompatParcelizer(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) null);
        String strIconCompatParcelizer3 = IconCompatParcelizer(xmlPullParser, "id", (String) null);
        do {
            xmlPullParser.next();
        } while (!StdTypeResolverBuilder.write(xmlPullParser, str));
        return new IndexedListSerializer(strIconCompatParcelizer, strIconCompatParcelizer2, strIconCompatParcelizer3);
    }

    private static int RemoteActionCompatParcelizer(List<IndexedListSerializer> list) {
        for (int i = 0; i < list.size(); i++) {
            IndexedListSerializer indexedListSerializer = list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(indexedListSerializer.write) && indexedListSerializer.RemoteActionCompatParcelizer != null) {
                Matcher matcher = IconCompatParcelizer.matcher(indexedListSerializer.RemoteActionCompatParcelizer);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                StringBuilder sb = new StringBuilder("Unable to parse CEA-608 channel number from: ");
                sb.append(indexedListSerializer.RemoteActionCompatParcelizer);
                prune.RemoteActionCompatParcelizer("MpdParser", sb.toString());
            }
        }
        return -1;
    }

    private static int write(List<IndexedListSerializer> list) {
        for (int i = 0; i < list.size(); i++) {
            IndexedListSerializer indexedListSerializer = list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(indexedListSerializer.write) && indexedListSerializer.RemoteActionCompatParcelizer != null) {
                Matcher matcher = RemoteActionCompatParcelizer.matcher(indexedListSerializer.RemoteActionCompatParcelizer);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                StringBuilder sb = new StringBuilder("Unable to parse CEA-708 service block number from: ");
                sb.append(indexedListSerializer.RemoteActionCompatParcelizer);
                prune.RemoteActionCompatParcelizer("MpdParser", sb.toString());
            }
        }
        return -1;
    }

    private static String read(List<IndexedListSerializer> list) {
        for (int i = 0; i < list.size(); i++) {
            IndexedListSerializer indexedListSerializer = list.get(i);
            String str = indexedListSerializer.write;
            if (!"tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) || !"JOC".equals(indexedListSerializer.RemoteActionCompatParcelizer)) {
                if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && MimeTypes.CODEC_E_AC3_JOC.equals(indexedListSerializer.RemoteActionCompatParcelizer)) {
                    return MimeTypes.AUDIO_E_AC3_JOC;
                }
            } else {
                return MimeTypes.AUDIO_E_AC3_JOC;
            }
        }
        return MimeTypes.AUDIO_E_AC3;
    }

    private static float IconCompatParcelizer(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = write.matcher(attributeValue);
            if (matcher.matches()) {
                int i = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? i / Integer.parseInt(r2) : i;
            }
        }
        return f;
    }

    private static long AudioAttributesCompatParcelizer(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : LaissezFaireSubTypeValidator.AudioAttributesImplBaseParcelizer(attributeValue);
    }

    private static long IconCompatParcelizer(XmlPullParser xmlPullParser, String str) throws SchemaAware {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? C.TIME_UNSET : LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(attributeValue);
    }

    private static String RemoteActionCompatParcelizer(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                IconCompatParcelizer(xmlPullParser);
            }
        } while (!StdTypeResolverBuilder.write(xmlPullParser, str));
        return text;
    }

    private static int read(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    private static long write(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    private static float read(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -3.4028235E38f;
        }
        return Float.parseFloat(attributeValue);
    }

    private static String IconCompatParcelizer(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    private static int RemoteActionCompatParcelizer(XmlPullParser xmlPullParser) {
        int i = read(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, -1);
        if (i >= 0) {
            int[] iArr = AudioAttributesCompatParcelizer;
            if (i < iArr.length) {
                return iArr[i];
            }
        }
        return -1;
    }

    private static int read(XmlPullParser xmlPullParser) {
        int i = read(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, -1);
        if (i <= 0 || i >= 33) {
            return -1;
        }
        return i;
    }

    private static int write(XmlPullParser xmlPullParser) {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (attributeValue == null || (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return iBitCount;
    }

    private static int AudioAttributesCompatParcelizer(XmlPullParser xmlPullParser) {
        byte b;
        String attributeValue = xmlPullParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (attributeValue == null) {
            return -1;
        }
        String str = parseMdhd.read(attributeValue);
        str.hashCode();
        switch (str.hashCode()) {
            case 1596796:
                b = !str.equals("4000") ? (byte) -1 : (byte) 0;
                break;
            case 2937391:
                b = !str.equals("a000") ? (byte) -1 : (byte) 1;
                break;
            case 3094034:
                b = !str.equals("f800") ? (byte) -1 : (byte) 2;
                break;
            case 3094035:
                b = !str.equals("f801") ? (byte) -1 : (byte) 3;
                break;
            case 3133436:
                b = !str.equals("fa01") ? (byte) -1 : (byte) 4;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return 2;
        }
        if (b == 2) {
            return 5;
        }
        if (b != 3) {
            return b != 4 ? -1 : 8;
        }
        return 6;
    }

    private static long IconCompatParcelizer(List<IndexedListSerializer> list) {
        for (int i = 0; i < list.size(); i++) {
            IndexedListSerializer indexedListSerializer = list.get(i);
            if (parseMdhd.write("http://dashif.org/guidelines/last-segment-number", indexedListSerializer.write)) {
                return Long.parseLong(indexedListSerializer.RemoteActionCompatParcelizer);
            }
        }
        return -1L;
    }

    private static boolean IconCompatParcelizer(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    protected static final class RemoteActionCompatParcelizer {
        public final ArrayList<DrmInitData.SchemeData> AudioAttributesCompatParcelizer;
        public final _serializeDynamicContents AudioAttributesImplApi21Parcelizer;
        public final List<IndexedListSerializer> AudioAttributesImplApi26Parcelizer;
        public final long AudioAttributesImplBaseParcelizer = -1;
        public final initExtraTracks<constructViewBased> IconCompatParcelizer;
        public final ArrayList<IndexedListSerializer> MediaBrowserCompatCustomActionResultReceiver;
        public final List<IndexedListSerializer> RemoteActionCompatParcelizer;
        public final C0170format read;
        public final String write;

        public RemoteActionCompatParcelizer(C0170format c0170format, List<constructViewBased> list, _serializeDynamicContents _serializedynamiccontents, String str, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<IndexedListSerializer> arrayList2, List<IndexedListSerializer> list2, List<IndexedListSerializer> list3) {
            this.read = c0170format;
            this.IconCompatParcelizer = initExtraTracks.write(list);
            this.AudioAttributesImplApi21Parcelizer = _serializedynamiccontents;
            this.write = str;
            this.AudioAttributesCompatParcelizer = arrayList;
            this.MediaBrowserCompatCustomActionResultReceiver = arrayList2;
            this.RemoteActionCompatParcelizer = list2;
            this.AudioAttributesImplApi26Parcelizer = list3;
        }
    }
}
