package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.source.dash.manifest.SegmentBase;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.initExtraTracks;
import kotlin.parseMdhd;
import kotlin.parseMdtaFromMeta;
import kotlin.parseMehd;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class DashManifestParser extends DefaultHandler implements ParsingLoadable.Parser<DashManifest> {
    private static final String TAG = "MpdParser";
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern FRAME_RATE_PATTERN = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private static final Pattern CEA_608_ACCESSIBILITY_PATTERN = Pattern.compile("CC([1-4])=.*");
    private static final Pattern CEA_708_ACCESSIBILITY_PATTERN = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    private static final int[] MPEG_CHANNEL_CONFIGURATION_MAPPING = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    private static long getFinalAvailabilityTimeOffset(long j, long j2) {
        if (j2 != C.TIME_UNSET) {
            j = j2;
        }
        return j == Long.MAX_VALUE ? C.TIME_UNSET : j;
    }

    public DashManifestParser() {
        try {
            this.xmlParserFactory = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    public DashManifest parse(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.xmlParserFactory.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() != 2 || !"MPD".equals(xmlPullParserNewPullParser.getName())) {
                throw ParserException.createForMalformedManifest("inputStream does not contain a valid media presentation description", null);
            }
            return parseMediaPresentationDescription(xmlPullParserNewPullParser, uri);
        } catch (XmlPullParserException e) {
            throw ParserException.createForMalformedManifest(null, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01e0 A[LOOP:0: B:24:0x00a0->B:81:0x01e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.google.android.exoplayer2.source.dash.manifest.DashManifest parseMediaPresentationDescription(org.xmlpull.v1.XmlPullParser r47, android.net.Uri r48) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseMediaPresentationDescription(org.xmlpull.v1.XmlPullParser, android.net.Uri):com.google.android.exoplayer2.source.dash.manifest.DashManifest");
    }

    protected DashManifest buildMediaPresentationDescription(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, ProgramInformation programInformation, UtcTimingElement utcTimingElement, ServiceDescriptionElement serviceDescriptionElement, Uri uri, List<Period> list) {
        return new DashManifest(j, j2, j3, z, j4, j5, j6, j7, programInformation, utcTimingElement, serviceDescriptionElement, uri, list);
    }

    protected UtcTimingElement parseUtcTiming(XmlPullParser xmlPullParser) {
        return buildUtcTimingElement(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.VALUE));
    }

    protected UtcTimingElement buildUtcTimingElement(String str, String str2) {
        return new UtcTimingElement(str, str2);
    }

    protected ServiceDescriptionElement parseServiceDescription(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        float f = -3.4028235E38f;
        float f2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Latency")) {
                j = parseLong(xmlPullParser, CourseConfigKeyConstantsKt.KEY_VIDEO_SUBJECT_ITEM_CHILD_TARGET, C.TIME_UNSET);
                j2 = parseLong(xmlPullParser, "min", C.TIME_UNSET);
                j3 = parseLong(xmlPullParser, "max", C.TIME_UNSET);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "PlaybackRate")) {
                f = parseFloat(xmlPullParser, "min", -3.4028235E38f);
                f2 = parseFloat(xmlPullParser, "max", -3.4028235E38f);
            }
            long j4 = j;
            long j5 = j2;
            long j6 = j3;
            float f3 = f;
            float f4 = f2;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "ServiceDescription")) {
                return new ServiceDescriptionElement(j4, j5, j6, f3, f4);
            }
            j = j4;
            j2 = j5;
            j3 = j6;
            f = f3;
            f2 = f4;
        }
    }

    protected Pair<Period, Long> parsePeriod(XmlPullParser xmlPullParser, List<BaseUrl> list, long j, long j2, long j3, long j4, boolean z) throws XmlPullParserException, IOException {
        long j5;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        long j6;
        DashManifestParser dashManifestParser = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        long duration = parseDuration(xmlPullParser2, TtmlNode.START, j);
        long j7 = C.TIME_UNSET;
        long j8 = j3 != C.TIME_UNSET ? j3 + duration : -9223372036854775807L;
        long duration2 = parseDuration(xmlPullParser2, "duration", C.TIME_UNSET);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long availabilityTimeOffsetUs = j2;
        boolean z2 = false;
        long availabilityTimeOffsetUs2 = -9223372036854775807L;
        SegmentBase segmentTemplate = null;
        Descriptor descriptor = null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "BaseURL")) {
                if (!z2) {
                    availabilityTimeOffsetUs = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser2, availabilityTimeOffsetUs);
                    z2 = true;
                }
                arrayList6.addAll(dashManifestParser.parseBaseUrl(xmlPullParser2, list, z));
                arrayList3 = arrayList5;
                arrayList = arrayList6;
                j6 = j7;
                obj = obj2;
                arrayList2 = arrayList4;
            } else {
                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "AdaptationSet")) {
                    j5 = availabilityTimeOffsetUs;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    arrayList2.add(parseAdaptationSet(xmlPullParser, !arrayList6.isEmpty() ? arrayList6 : list, segmentTemplate, duration2, availabilityTimeOffsetUs, availabilityTimeOffsetUs2, j8, j4, z));
                    xmlPullParser2 = xmlPullParser;
                    arrayList3 = arrayList5;
                } else {
                    j5 = availabilityTimeOffsetUs;
                    ArrayList arrayList7 = arrayList5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    xmlPullParser2 = xmlPullParser;
                    if (XmlPullParserUtil.isStartTag(xmlPullParser2, "EventStream")) {
                        arrayList7.add(parseEventStream(xmlPullParser));
                        arrayList3 = arrayList7;
                    } else {
                        if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentBase")) {
                            arrayList3 = arrayList7;
                            segmentTemplate = parseSegmentBase(xmlPullParser2, null);
                            obj = null;
                        } else {
                            arrayList3 = arrayList7;
                            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentList")) {
                                availabilityTimeOffsetUs2 = parseAvailabilityTimeOffsetUs(xmlPullParser2, C.TIME_UNSET);
                                obj = null;
                                segmentTemplate = parseSegmentList(xmlPullParser, null, j8, duration2, j5, availabilityTimeOffsetUs2, j4);
                            } else {
                                obj = null;
                                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentTemplate")) {
                                    availabilityTimeOffsetUs2 = parseAvailabilityTimeOffsetUs(xmlPullParser2, C.TIME_UNSET);
                                    j6 = -9223372036854775807L;
                                    segmentTemplate = parseSegmentTemplate(xmlPullParser, null, initExtraTracks.AudioAttributesImplApi26Parcelizer(), j8, duration2, j5, availabilityTimeOffsetUs2, j4);
                                } else {
                                    j6 = C.TIME_UNSET;
                                    if (XmlPullParserUtil.isStartTag(xmlPullParser2, "AssetIdentifier")) {
                                        descriptor = parseDescriptor(xmlPullParser2, "AssetIdentifier");
                                    } else {
                                        maybeSkipTag(xmlPullParser);
                                    }
                                }
                                availabilityTimeOffsetUs = j5;
                            }
                        }
                        availabilityTimeOffsetUs = j5;
                        j6 = C.TIME_UNSET;
                    }
                }
                obj = null;
                j6 = C.TIME_UNSET;
                availabilityTimeOffsetUs = j5;
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser2, "Period")) {
                return Pair.create(buildPeriod(attributeValue, duration, arrayList2, arrayList3, descriptor), Long.valueOf(duration2));
            }
            arrayList4 = arrayList2;
            arrayList6 = arrayList;
            obj2 = obj;
            arrayList5 = arrayList3;
            j7 = j6;
            dashManifestParser = this;
        }
    }

    protected Period buildPeriod(String str, long j, List<AdaptationSet> list, List<EventStream> list2, Descriptor descriptor) {
        return new Period(str, j, list, list2, descriptor);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x02f8 A[LOOP:0: B:3:0x007e->B:71:0x02f8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ba A[EDGE_INSN: B:72:0x02ba->B:65:0x02ba BREAK  A[LOOP:0: B:3:0x007e->B:71:0x02f8], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.google.android.exoplayer2.source.dash.manifest.AdaptationSet parseAdaptationSet(org.xmlpull.v1.XmlPullParser r56, java.util.List<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r57, com.google.android.exoplayer2.source.dash.manifest.SegmentBase r58, long r59, long r61, long r63, long r65, long r67, boolean r69) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseAdaptationSet(org.xmlpull.v1.XmlPullParser, java.util.List, com.google.android.exoplayer2.source.dash.manifest.SegmentBase, long, long, long, long, long, boolean):com.google.android.exoplayer2.source.dash.manifest.AdaptationSet");
    }

    protected AdaptationSet buildAdaptationSet(long j, int i, List<Representation> list, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4) {
        return new AdaptationSet(j, i, list, list2, list3, list4);
    }

    protected int parseContentType(XmlPullParser xmlPullParser) {
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
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected android.util.Pair<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData.SchemeData> parseContentProtection(org.xmlpull.v1.XmlPullParser r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseContentProtection(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    protected void parseAdaptationSetChild(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        maybeSkipTag(xmlPullParser);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01ed A[LOOP:0: B:3:0x006a->B:54:0x01ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0197 A[EDGE_INSN: B:55:0x0197->B:46:0x0197 BREAK  A[LOOP:0: B:3:0x006a->B:54:0x01ed], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.RepresentationInfo parseRepresentation(org.xmlpull.v1.XmlPullParser r36, java.util.List<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r37, java.lang.String r38, java.lang.String r39, int r40, int r41, float r42, int r43, int r44, java.lang.String r45, java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r46, java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r47, java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r48, java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r49, com.google.android.exoplayer2.source.dash.manifest.SegmentBase r50, long r51, long r53, long r55, long r57, long r59, boolean r61) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseRepresentation(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, com.google.android.exoplayer2.source.dash.manifest.SegmentBase, long, long, long, long, long, boolean):com.google.android.exoplayer2.source.dash.manifest.DashManifestParser$RepresentationInfo");
    }

    protected Format buildFormat(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, List<Descriptor> list, List<Descriptor> list2, String str4, List<Descriptor> list3, List<Descriptor> list4) {
        String str5 = str4;
        String sampleMimeType = getSampleMimeType(str2, str5);
        if (MimeTypes.AUDIO_E_AC3.equals(sampleMimeType)) {
            sampleMimeType = parseEac3SupplementalProperties(list4);
            if (MimeTypes.AUDIO_E_AC3_JOC.equals(sampleMimeType)) {
                str5 = MimeTypes.CODEC_E_AC3_JOC;
            }
        }
        int selectionFlagsFromRoleDescriptors = parseSelectionFlagsFromRoleDescriptors(list);
        int roleFlagsFromRoleDescriptors = parseRoleFlagsFromRoleDescriptors(list);
        int roleFlagsFromAccessibilityDescriptors = parseRoleFlagsFromAccessibilityDescriptors(list2);
        int roleFlagsFromProperties = parseRoleFlagsFromProperties(list3);
        int roleFlagsFromProperties2 = parseRoleFlagsFromProperties(list4);
        Pair<Integer, Integer> tileCountFromProperties = parseTileCountFromProperties(list3);
        Format.Builder language = new Format.Builder().setId(str).setContainerMimeType(str2).setSampleMimeType(sampleMimeType).setCodecs(str5).setPeakBitrate(i5).setSelectionFlags(selectionFlagsFromRoleDescriptors).setRoleFlags(roleFlagsFromRoleDescriptors | roleFlagsFromAccessibilityDescriptors | roleFlagsFromProperties | roleFlagsFromProperties2).setLanguage(str3);
        int cea708AccessibilityChannel = -1;
        Format.Builder tileCountVertical = language.setTileCountHorizontal(tileCountFromProperties != null ? ((Integer) tileCountFromProperties.first).intValue() : -1).setTileCountVertical(tileCountFromProperties != null ? ((Integer) tileCountFromProperties.second).intValue() : -1);
        if (MimeTypes.isVideo(sampleMimeType)) {
            tileCountVertical.setWidth(i).setHeight(i2).setFrameRate(f);
        } else if (MimeTypes.isAudio(sampleMimeType)) {
            tileCountVertical.setChannelCount(i3).setSampleRate(i4);
        } else if (MimeTypes.isText(sampleMimeType)) {
            if (MimeTypes.APPLICATION_CEA608.equals(sampleMimeType)) {
                cea708AccessibilityChannel = parseCea608AccessibilityChannel(list2);
            } else if (MimeTypes.APPLICATION_CEA708.equals(sampleMimeType)) {
                cea708AccessibilityChannel = parseCea708AccessibilityChannel(list2);
            }
            tileCountVertical.setAccessibilityChannel(cea708AccessibilityChannel);
        } else if (MimeTypes.isImage(sampleMimeType)) {
            tileCountVertical.setWidth(i).setHeight(i2);
        }
        return tileCountVertical.build();
    }

    protected Representation buildRepresentation(RepresentationInfo representationInfo, String str, String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<Descriptor> arrayList2) {
        Format.Builder builderBuildUpon = representationInfo.format.buildUpon();
        if (str != null) {
            builderBuildUpon.setLabel(str);
        }
        String str3 = representationInfo.drmSchemeType;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = representationInfo.drmSchemeDatas;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            fillInClearKeyInformation(arrayList3);
            filterRedundantIncompleteSchemeDatas(arrayList3);
            builderBuildUpon.setDrmInitData(new DrmInitData(str2, arrayList3));
        }
        ArrayList<Descriptor> arrayList4 = representationInfo.inbandEventStreams;
        arrayList4.addAll(arrayList2);
        return Representation.newInstance(representationInfo.revisionId, builderBuildUpon.build(), representationInfo.baseUrls, representationInfo.segmentBase, arrayList4, representationInfo.essentialProperties, representationInfo.supplementalProperties, null);
    }

    protected SegmentBase.SingleSegmentBase parseSegmentBase(XmlPullParser xmlPullParser, SegmentBase.SingleSegmentBase singleSegmentBase) throws XmlPullParserException, IOException {
        long j;
        long j2;
        long j3 = parseLong(xmlPullParser, "timescale", singleSegmentBase != null ? singleSegmentBase.timescale : 1L);
        long j4 = parseLong(xmlPullParser, "presentationTimeOffset", singleSegmentBase != null ? singleSegmentBase.presentationTimeOffset : 0L);
        long j5 = singleSegmentBase != null ? singleSegmentBase.indexStart : 0L;
        long j6 = singleSegmentBase != null ? singleSegmentBase.indexLength : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            j2 = Long.parseLong(strArrSplit[0]);
            j = (Long.parseLong(strArrSplit[1]) - j2) + 1;
        } else {
            j = j6;
            j2 = j5;
        }
        RangedUri initialization = singleSegmentBase != null ? singleSegmentBase.initialization : null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentBase"));
        return buildSingleSegmentBase(initialization, j3, j4, j2, j);
    }

    protected SegmentBase.SingleSegmentBase buildSingleSegmentBase(RangedUri rangedUri, long j, long j2, long j3, long j4) {
        return new SegmentBase.SingleSegmentBase(rangedUri, j, j2, j3, j4);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009b A[PHI: r0 r19
      0x009b: PHI (r0v7 java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement>) = 
      (r0v6 java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement>)
      (r0v10 java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement>)
     binds: [B:32:0x0089, B:37:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r19v3 com.google.android.exoplayer2.source.dash.manifest.RangedUri) = 
      (r19v2 com.google.android.exoplayer2.source.dash.manifest.RangedUri)
      (r19v6 com.google.android.exoplayer2.source.dash.manifest.RangedUri)
     binds: [B:32:0x0089, B:37:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentList parseSegmentList(org.xmlpull.v1.XmlPullParser r24, com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentList r25, long r26, long r28, long r30, long r32, long r34) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r23 = this;
            r6 = r24
            r7 = r25
            r0 = 1
            if (r7 == 0) goto Lb
            long r2 = r7.timescale
            goto Lc
        Lb:
            r2 = r0
        Lc:
            java.lang.String r4 = "timescale"
            long r8 = parseLong(r6, r4, r2)
            if (r7 == 0) goto L17
            long r2 = r7.presentationTimeOffset
            goto L19
        L17:
            r2 = 0
        L19:
            java.lang.String r4 = "presentationTimeOffset"
            long r10 = parseLong(r6, r4, r2)
            if (r7 == 0) goto L24
            long r2 = r7.duration
            goto L29
        L24:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L29:
            java.lang.String r4 = "duration"
            long r13 = parseLong(r6, r4, r2)
            if (r7 == 0) goto L33
            long r0 = r7.startNumber
        L33:
            java.lang.String r2 = "startNumber"
            long r15 = parseLong(r6, r2, r0)
            long r17 = getFinalAvailabilityTimeOffset(r30, r32)
            r0 = 0
            r12 = r0
            r19 = r12
        L41:
            r24.next()
            java.lang.String r1 = "Initialization"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r6, r1)
            if (r1 == 0) goto L53
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r1 = r23.parseInitialization(r24)
            r19 = r1
            goto L81
        L53:
            java.lang.String r1 = "SegmentTimeline"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r6, r1)
            if (r1 == 0) goto L67
            r0 = r23
            r1 = r24
            r2 = r8
            r4 = r28
            java.util.List r0 = r0.parseSegmentTimeline(r1, r2, r4)
            goto L81
        L67:
            java.lang.String r1 = "SegmentURL"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r6, r1)
            if (r1 == 0) goto L7e
            if (r12 != 0) goto L76
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L76:
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r1 = r23.parseSegmentUrl(r24)
            r12.add(r1)
            goto L81
        L7e:
            maybeSkipTag(r24)
        L81:
            java.lang.String r1 = "SegmentList"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r6, r1)
            if (r1 == 0) goto L41
            if (r7 == 0) goto L9b
            if (r19 != 0) goto L91
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r1 = r7.initialization
            r19 = r1
        L91:
            if (r0 != 0) goto L95
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement> r0 = r7.segmentTimeline
        L95:
            if (r12 == 0) goto L98
            goto L9b
        L98:
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.RangedUri> r1 = r7.mediaSegments
            goto L9c
        L9b:
            r1 = r12
        L9c:
            r6 = r19
            r5 = r23
            r7 = r8
            r9 = r10
            r11 = r15
            r15 = r0
            r16 = r17
            r18 = r1
            r19 = r34
            r21 = r26
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentList r0 = r5.buildSegmentList(r6, r7, r9, r11, r13, r15, r16, r18, r19, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseSegmentList(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentList, long, long, long, long, long):com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentList");
    }

    protected SegmentBase.SegmentList buildSegmentList(RangedUri rangedUri, long j, long j2, long j3, long j4, List<SegmentBase.SegmentTimelineElement> list, long j5, List<RangedUri> list2, long j6, long j7) {
        return new SegmentBase.SegmentList(rangedUri, j, j2, j3, j4, list, j5, list2, Util.msToUs(j6), Util.msToUs(j7));
    }

    protected SegmentBase.SegmentTemplate parseSegmentTemplate(XmlPullParser xmlPullParser, SegmentBase.SegmentTemplate segmentTemplate, List<Descriptor> list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6 = parseLong(xmlPullParser, "timescale", segmentTemplate != null ? segmentTemplate.timescale : 1L);
        long j7 = parseLong(xmlPullParser, "presentationTimeOffset", segmentTemplate != null ? segmentTemplate.presentationTimeOffset : 0L);
        long j8 = parseLong(xmlPullParser, "duration", segmentTemplate != null ? segmentTemplate.duration : C.TIME_UNSET);
        long j9 = parseLong(xmlPullParser, "startNumber", segmentTemplate != null ? segmentTemplate.startNumber : 1L);
        long lastSegmentNumberSupplementalProperty = parseLastSegmentNumberSupplementalProperty(list);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j3, j4);
        List<SegmentBase.SegmentTimelineElement> segmentTimeline = null;
        UrlTemplate urlTemplate = parseUrlTemplate(xmlPullParser, "media", segmentTemplate != null ? segmentTemplate.mediaTemplate : null);
        UrlTemplate urlTemplate2 = parseUrlTemplate(xmlPullParser, "initialization", segmentTemplate != null ? segmentTemplate.initializationTemplate : null);
        RangedUri initialization = null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTimeline")) {
                segmentTimeline = parseSegmentTimeline(xmlPullParser, j6, j2);
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTemplate"));
        if (segmentTemplate != null) {
            if (initialization == null) {
                initialization = segmentTemplate.initialization;
            }
            if (segmentTimeline == null) {
                segmentTimeline = segmentTemplate.segmentTimeline;
            }
        }
        return buildSegmentTemplate(initialization, j6, j7, j9, lastSegmentNumberSupplementalProperty, j8, segmentTimeline, finalAvailabilityTimeOffset, urlTemplate2, urlTemplate, j5, j);
    }

    protected SegmentBase.SegmentTemplate buildSegmentTemplate(RangedUri rangedUri, long j, long j2, long j3, long j4, long j5, List<SegmentBase.SegmentTimelineElement> list, long j6, UrlTemplate urlTemplate, UrlTemplate urlTemplate2, long j7, long j8) {
        return new SegmentBase.SegmentTemplate(rangedUri, j, j2, j3, j4, j5, list, j6, urlTemplate, urlTemplate2, Util.msToUs(j7), Util.msToUs(j8));
    }

    protected EventStream parseEventStream(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        long j;
        ArrayList arrayList;
        String string = parseString(xmlPullParser, "schemeIdUri", "");
        String string2 = parseString(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, "");
        long j2 = parseLong(xmlPullParser, "timescale", 1L);
        long j3 = parseLong(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList2 = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Event")) {
                byteArrayOutputStream = byteArrayOutputStream2;
                long j4 = j3;
                j = j3;
                arrayList = arrayList2;
                arrayList.add(parseEvent(xmlPullParser, string, string2, j2, j4, byteArrayOutputStream));
            } else {
                byteArrayOutputStream = byteArrayOutputStream2;
                j = j3;
                arrayList = arrayList2;
                maybeSkipTag(xmlPullParser);
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "EventStream")) {
                break;
            }
            arrayList2 = arrayList;
            byteArrayOutputStream2 = byteArrayOutputStream;
            j3 = j;
        }
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            eventMessageArr[i] = (EventMessage) pair.second;
        }
        return buildEventStream(string, string2, j2, jArr, eventMessageArr);
    }

    protected EventStream buildEventStream(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        return new EventStream(str, str2, j, jArr, eventMessageArr);
    }

    protected Pair<Long, EventMessage> parseEvent(XmlPullParser xmlPullParser, String str, String str2, long j, long j2, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        long j3 = parseLong(xmlPullParser, "id", 0L);
        long j4 = parseLong(xmlPullParser, "duration", C.TIME_UNSET);
        long j5 = parseLong(xmlPullParser, "presentationTime", 0L);
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(j4, 1000L, j);
        long jScaleLargeTimestamp2 = Util.scaleLargeTimestamp(j5 - j2, 1000000L, j);
        String string = parseString(xmlPullParser, "messageData", null);
        byte[] eventObject = parseEventObject(xmlPullParser, byteArrayOutputStream);
        if (string != null) {
            eventObject = Util.getUtf8Bytes(string);
        }
        return Pair.create(Long.valueOf(jScaleLargeTimestamp2), buildEvent(str, str2, j3, jScaleLargeTimestamp, eventObject));
    }

    protected byte[] parseEventObject(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer.name());
        xmlPullParser.nextToken();
        while (!XmlPullParserUtil.isEndTag(xmlPullParser, "Event")) {
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

    protected EventMessage buildEvent(String str, String str2, long j, long j2, byte[] bArr) {
        return new EventMessage(str, str2, j2, j, bArr);
    }

    protected List<SegmentBase.SegmentTimelineElement> parseSegmentTimeline(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jAddSegmentTimelineElementsToList = 0;
        long j3 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "S")) {
                long j4 = parseLong(xmlPullParser, "t", C.TIME_UNSET);
                if (z) {
                    jAddSegmentTimelineElementsToList = addSegmentTimelineElementsToList(arrayList, jAddSegmentTimelineElementsToList, j3, i, j4);
                }
                if (j4 == C.TIME_UNSET) {
                    j4 = jAddSegmentTimelineElementsToList;
                }
                j3 = parseLong(xmlPullParser, "d", C.TIME_UNSET);
                i = parseInt(xmlPullParser, "r", 0);
                z = true;
                jAddSegmentTimelineElementsToList = j4;
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTimeline"));
        if (z) {
            addSegmentTimelineElementsToList(arrayList, jAddSegmentTimelineElementsToList, j3, i, Util.scaleLargeTimestamp(j2, j, 1000L));
        }
        return arrayList;
    }

    private long addSegmentTimelineElementsToList(List<SegmentBase.SegmentTimelineElement> list, long j, long j2, int i, long j3) {
        int iCeilDivide = i >= 0 ? i + 1 : (int) Util.ceilDivide(j3 - j, j2);
        for (int i2 = 0; i2 < iCeilDivide; i2++) {
            list.add(buildSegmentTimelineElement(j, j2));
            j += j2;
        }
        return j;
    }

    protected SegmentBase.SegmentTimelineElement buildSegmentTimelineElement(long j, long j2) {
        return new SegmentBase.SegmentTimelineElement(j, j2);
    }

    protected UrlTemplate parseUrlTemplate(XmlPullParser xmlPullParser, String str, UrlTemplate urlTemplate) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? UrlTemplate.compile(attributeValue) : urlTemplate;
    }

    protected RangedUri parseInitialization(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "sourceURL", SessionDescription.ATTR_RANGE);
    }

    protected RangedUri parseSegmentUrl(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "media", "mediaRange");
    }

    protected RangedUri parseRangedUrl(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
            return buildRangedUri(attributeValue, j, j2);
        }
        j = 0;
        j2 = -1;
        return buildRangedUri(attributeValue, j, j2);
    }

    protected RangedUri buildRangedUri(String str, long j, long j2) {
        return new RangedUri(str, j, j2);
    }

    protected ProgramInformation parseProgramInformation(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String string = parseString(xmlPullParser, "moreInformationURL", null);
        String string2 = parseString(xmlPullParser, "lang", null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "Copyright")) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
            String str = strNextText3;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "ProgramInformation")) {
                return new ProgramInformation(strNextText, strNextText2, str, string, string2);
            }
            strNextText3 = str;
        }
    }

    protected String parseLabel(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return parseText(xmlPullParser, "Label");
    }

    protected List<BaseUrl> parseBaseUrl(XmlPullParser xmlPullParser, List<BaseUrl> list, boolean z) throws XmlPullParserException, IOException {
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
        String text = parseText(xmlPullParser, "BaseURL");
        if (UriUtil.isAbsolute(text)) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return parseMehd.read(new BaseUrl(text, attributeValue3, i, i2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            BaseUrl baseUrl = list.get(i3);
            String strResolve = UriUtil.resolve(baseUrl.url, text);
            String str = attributeValue3 == null ? strResolve : attributeValue3;
            if (z) {
                i = baseUrl.priority;
                i2 = baseUrl.weight;
                str = baseUrl.serviceLocation;
            }
            arrayList.add(new BaseUrl(strResolve, str, i, i2));
        }
        return arrayList;
    }

    protected long parseAvailabilityTimeOffsetUs(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    protected int parseAudioChannelConfiguration(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        byte b;
        String string = parseString(xmlPullParser, "schemeIdUri", null);
        string.hashCode();
        int dtsChannelConfiguration = -1;
        switch (string.hashCode()) {
            case -2128649360:
                b = !string.equals("urn:dts:dash:audio_channel_configuration:2012") ? (byte) -1 : (byte) 0;
                break;
            case -1352850286:
                b = !string.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011") ? (byte) -1 : (byte) 1;
                break;
            case -1138141449:
                b = !string.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011") ? (byte) -1 : (byte) 2;
                break;
            case -986633423:
                b = !string.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration") ? (byte) -1 : (byte) 3;
                break;
            case -79006963:
                b = !string.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012") ? (byte) -1 : (byte) 4;
                break;
            case 312179081:
                b = !string.equals("tag:dts.com,2018:uhd:audio_channel_configuration") ? (byte) -1 : (byte) 5;
                break;
            case 2036691300:
                b = !string.equals("urn:dolby:dash:audio_channel_configuration:2011") ? (byte) -1 : (byte) 6;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 4:
                dtsChannelConfiguration = parseDtsChannelConfiguration(xmlPullParser);
                break;
            case 1:
                dtsChannelConfiguration = parseInt(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, -1);
                break;
            case 2:
            case 6:
                dtsChannelConfiguration = parseDolbyChannelConfiguration(xmlPullParser);
                break;
            case 3:
                dtsChannelConfiguration = parseMpegChannelConfiguration(xmlPullParser);
                break;
            case 5:
                dtsChannelConfiguration = parseDtsxChannelConfiguration(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "AudioChannelConfiguration"));
        return dtsChannelConfiguration;
    }

    protected int parseSelectionFlagsFromRoleDescriptors(List<Descriptor> list) {
        int selectionFlagsFromDashRoleScheme = 0;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if (parseMdhd.write("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                selectionFlagsFromDashRoleScheme |= parseSelectionFlagsFromDashRoleScheme(descriptor.value);
            }
        }
        return selectionFlagsFromDashRoleScheme;
    }

    protected int parseSelectionFlagsFromDashRoleScheme(String str) {
        if (str == null) {
            return 0;
        }
        str.hashCode();
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    protected int parseRoleFlagsFromRoleDescriptors(List<Descriptor> list) {
        int roleFlagsFromDashRoleScheme = 0;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if (parseMdhd.write("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                roleFlagsFromDashRoleScheme |= parseRoleFlagsFromDashRoleScheme(descriptor.value);
            }
        }
        return roleFlagsFromDashRoleScheme;
    }

    protected int parseRoleFlagsFromAccessibilityDescriptors(List<Descriptor> list) {
        int tvaAudioPurposeCsValue;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Descriptor descriptor = list.get(i2);
            if (parseMdhd.write("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                tvaAudioPurposeCsValue = parseRoleFlagsFromDashRoleScheme(descriptor.value);
            } else if (parseMdhd.write("urn:tva:metadata:cs:AudioPurposeCS:2007", descriptor.schemeIdUri)) {
                tvaAudioPurposeCsValue = parseTvaAudioPurposeCsValue(descriptor.value);
            }
            i |= tvaAudioPurposeCsValue;
        }
        return i;
    }

    protected int parseRoleFlagsFromProperties(List<Descriptor> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (parseMdhd.write("http://dashif.org/guidelines/trickmode", list.get(i2).schemeIdUri)) {
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
    protected int parseRoleFlagsFromDashRoleScheme(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseRoleFlagsFromDashRoleScheme(java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected int parseTvaAudioPurposeCsValue(java.lang.String r6) {
        /*
            r5 = this;
            r5 = 0
            if (r6 != 0) goto L4
            return r5
        L4:
            r6.hashCode()
            int r0 = r6.hashCode()
            r1 = 3
            r2 = 2
            r3 = 4
            r4 = 1
            switch(r0) {
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
            java.lang.String r0 = "6"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L45
            r6 = r3
            goto L46
        L1d:
            java.lang.String r0 = "4"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L45
            r6 = r1
            goto L46
        L27:
            java.lang.String r0 = "3"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L45
            r6 = r2
            goto L46
        L31:
            java.lang.String r0 = "2"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L45
            r6 = r4
            goto L46
        L3b:
            java.lang.String r0 = "1"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L45
            r6 = r5
            goto L46
        L45:
            r6 = -1
        L46:
            if (r6 == 0) goto L59
            if (r6 == r4) goto L56
            if (r6 == r2) goto L55
            if (r6 == r1) goto L52
            if (r6 == r3) goto L51
            return r5
        L51:
            return r4
        L52:
            r5 = 8
            return r5
        L55:
            return r3
        L56:
            r5 = 2048(0x800, float:2.87E-42)
            return r5
        L59:
            r5 = 512(0x200, float:7.17E-43)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseTvaAudioPurposeCsValue(java.lang.String):int");
    }

    protected String[] parseProfiles(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    protected Pair<Integer, Integer> parseTileCountFromProperties(List<Descriptor> list) {
        char c = 0;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if ((parseMdhd.write("http://dashif.org/thumbnail_tile", descriptor.schemeIdUri) || parseMdhd.write("http://dashif.org/guidelines/thumbnail_tile", descriptor.schemeIdUri)) && descriptor.value != null) {
                String[] strArrSplit = Util.split(descriptor.value, "x");
                if (strArrSplit.length == 2) {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[c])), Integer.valueOf(Integer.parseInt(strArrSplit[1])));
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

    public static void maybeSkipTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (XmlPullParserUtil.isStartTag(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (XmlPullParserUtil.isStartTag(xmlPullParser)) {
                    i++;
                } else if (XmlPullParserUtil.isEndTag(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    private static void filterRedundantIncompleteSchemeDatas(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (!schemeData.hasData()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    }
                    if (arrayList.get(i).canReplace(schemeData)) {
                        arrayList.remove(size);
                        break;
                    }
                    i++;
                }
            }
        }
    }

    private static void fillInClearKeyInformation(ArrayList<DrmInitData.SchemeData> arrayList) {
        String str;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                str = null;
                break;
            }
            DrmInitData.SchemeData schemeData = arrayList.get(i);
            if (C.CLEARKEY_UUID.equals(schemeData.uuid) && schemeData.licenseServerUrl != null) {
                str = schemeData.licenseServerUrl;
                arrayList.remove(i);
                break;
            }
            i++;
        }
        if (str != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                DrmInitData.SchemeData schemeData2 = arrayList.get(i2);
                if (C.COMMON_PSSH_UUID.equals(schemeData2.uuid) && schemeData2.licenseServerUrl == null) {
                    arrayList.set(i2, new DrmInitData.SchemeData(C.CLEARKEY_UUID, str, schemeData2.mimeType, schemeData2.data));
                }
            }
        }
    }

    private static String getSampleMimeType(String str, String str2) {
        if (MimeTypes.isAudio(str)) {
            return MimeTypes.getAudioMediaMimeType(str2);
        }
        if (MimeTypes.isVideo(str)) {
            return MimeTypes.getVideoMediaMimeType(str2);
        }
        if (MimeTypes.isText(str) || MimeTypes.isImage(str)) {
            return str;
        }
        if (!MimeTypes.APPLICATION_MP4.equals(str)) {
            return null;
        }
        String mediaMimeType = MimeTypes.getMediaMimeType(str2);
        return MimeTypes.TEXT_VTT.equals(mediaMimeType) ? MimeTypes.APPLICATION_MP4VTT : mediaMimeType;
    }

    private static String checkLanguageConsistency(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        Assertions.checkState(str.equals(str2));
        return str;
    }

    private static int checkContentTypeConsistency(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        Assertions.checkState(i == i2);
        return i;
    }

    protected static Descriptor parseDescriptor(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String string = parseString(xmlPullParser, "schemeIdUri", "");
        String string2 = parseString(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, null);
        String string3 = parseString(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str));
        return new Descriptor(string, string2, string3);
    }

    protected static int parseCea608AccessibilityChannel(List<Descriptor> list) {
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(descriptor.schemeIdUri) && descriptor.value != null) {
                Matcher matcher = CEA_608_ACCESSIBILITY_PATTERN.matcher(descriptor.value);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                StringBuilder sb = new StringBuilder("Unable to parse CEA-608 channel number from: ");
                sb.append(descriptor.value);
                Log.w(TAG, sb.toString());
            }
        }
        return -1;
    }

    protected static int parseCea708AccessibilityChannel(List<Descriptor> list) {
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(descriptor.schemeIdUri) && descriptor.value != null) {
                Matcher matcher = CEA_708_ACCESSIBILITY_PATTERN.matcher(descriptor.value);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                StringBuilder sb = new StringBuilder("Unable to parse CEA-708 service block number from: ");
                sb.append(descriptor.value);
                Log.w(TAG, sb.toString());
            }
        }
        return -1;
    }

    protected static String parseEac3SupplementalProperties(List<Descriptor> list) {
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            String str = descriptor.schemeIdUri;
            if (!"tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) || !"JOC".equals(descriptor.value)) {
                if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && MimeTypes.CODEC_E_AC3_JOC.equals(descriptor.value)) {
                    return MimeTypes.AUDIO_E_AC3_JOC;
                }
            } else {
                return MimeTypes.AUDIO_E_AC3_JOC;
            }
        }
        return MimeTypes.AUDIO_E_AC3;
    }

    protected static float parseFrameRate(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = FRAME_RATE_PATTERN.matcher(attributeValue);
            if (matcher.matches()) {
                int i = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? i / Integer.parseInt(r2) : i;
            }
        }
        return f;
    }

    protected static long parseDuration(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Util.parseXsDuration(attributeValue);
    }

    protected static long parseDateTime(XmlPullParser xmlPullParser, String str, long j) throws ParserException {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Util.parseXsDateTime(attributeValue);
    }

    protected static String parseText(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str));
        return text;
    }

    protected static int parseInt(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    protected static long parseLong(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    protected static float parseFloat(XmlPullParser xmlPullParser, String str, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f : Float.parseFloat(attributeValue);
    }

    protected static String parseString(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    protected static int parseMpegChannelConfiguration(XmlPullParser xmlPullParser) {
        int i = parseInt(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, -1);
        if (i >= 0) {
            int[] iArr = MPEG_CHANNEL_CONFIGURATION_MAPPING;
            if (i < iArr.length) {
                return iArr[i];
            }
        }
        return -1;
    }

    protected static int parseDtsChannelConfiguration(XmlPullParser xmlPullParser) {
        int i = parseInt(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, -1);
        if (i <= 0 || i >= 33) {
            return -1;
        }
        return i;
    }

    protected static int parseDtsxChannelConfiguration(XmlPullParser xmlPullParser) {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (attributeValue == null || (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return iBitCount;
    }

    protected static int parseDolbyChannelConfiguration(XmlPullParser xmlPullParser) {
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
            case 3094035:
                b = !str.equals("f801") ? (byte) -1 : (byte) 2;
                break;
            case 3133436:
                b = !str.equals("fa01") ? (byte) -1 : (byte) 3;
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
        if (b != 2) {
            return b != 3 ? -1 : 8;
        }
        return 6;
    }

    protected static long parseLastSegmentNumberSupplementalProperty(List<Descriptor> list) {
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if (parseMdhd.write("http://dashif.org/guidelines/last-segment-number", descriptor.schemeIdUri)) {
                return Long.parseLong(descriptor.value);
            }
        }
        return -1L;
    }

    private boolean isDvbProfileDeclared(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    protected static final class RepresentationInfo {
        public final initExtraTracks<BaseUrl> baseUrls;
        public final ArrayList<DrmInitData.SchemeData> drmSchemeDatas;
        public final String drmSchemeType;
        public final List<Descriptor> essentialProperties;
        public final Format format;
        public final ArrayList<Descriptor> inbandEventStreams;
        public final long revisionId;
        public final SegmentBase segmentBase;
        public final List<Descriptor> supplementalProperties;

        public RepresentationInfo(Format format, List<BaseUrl> list, SegmentBase segmentBase, String str, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<Descriptor> arrayList2, List<Descriptor> list2, List<Descriptor> list3, long j) {
            this.format = format;
            this.baseUrls = initExtraTracks.write(list);
            this.segmentBase = segmentBase;
            this.drmSchemeType = str;
            this.drmSchemeDatas = arrayList;
            this.inbandEventStreams = arrayList2;
            this.essentialProperties = list2;
            this.supplementalProperties = list3;
            this.revisionId = j;
        }
    }
}
