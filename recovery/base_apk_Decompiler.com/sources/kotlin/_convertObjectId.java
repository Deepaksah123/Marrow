package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000b\u001a-\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0001\u001a\u0004\u0018\u00010\f2\b\u0010\u0002\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a½\u0001\u0010\u0005\u001a\u00020\n*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00112\b\u0010\u0002\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u00112\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010*\u001a\u0004\u0018\u00010\f2\b\u0010,\u001a\u0004\u0018\u00010+H\u0000¢\u0006\u0004\b\u0005\u0010-\u001a\u001f\u0010.\u001a\u0004\u0018\u00010\f*\u00020\n2\b\u0010\u0001\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b.\u0010/\"\u0014\u0010\u000f\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00100\"\u0014\u0010.\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100\"\u0014\u0010\u0005\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100\"\u0014\u0010\b\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00100\"\u0014\u0010\r\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102"}, d2 = {"Lo/ReadableObjectIdReferring;", "p0", "p1", "", "p2", "AudioAttributesCompatParcelizer", "(JJF)J", "T", "IconCompatParcelizer", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "Lo/_findPropertyUnwrapper;", "(Lo/_findPropertyUnwrapper;Lo/_findPropertyUnwrapper;F)Lo/_findPropertyUnwrapper;", "Lo/_findCustomReferenceDeserializer;", "read", "(Lo/_findCustomReferenceDeserializer;Lo/_findCustomReferenceDeserializer;F)Lo/_findCustomReferenceDeserializer;", "RemoteActionCompatParcelizer", "(Lo/_findPropertyUnwrapper;)Lo/_findPropertyUnwrapper;", "Lo/switchToNext;", "Lo/Instantiatable;", "p3", "Lo/getDataStream;", "p4", "Lo/withValueDeserializer;", "p5", "Lo/_findFormat;", "p6", "Lo/_reportMissingSetter;", "p7", "", "p8", "p9", "Lo/_find2ViaAlias;", "p10", "Lo/CreatorCandidate;", "p11", "Lo/canCreateFromBoolean;", "p12", "p13", "Lo/renameAll;", "p14", "Lo/nopInstance;", "p15", "p16", "Lo/findViews;", "p17", "(Lo/_findPropertyUnwrapper;JLo/Instantiatable;FJLo/getDataStream;Lo/withValueDeserializer;Lo/_findFormat;Lo/_reportMissingSetter;Ljava/lang/String;JLo/_find2ViaAlias;Lo/CreatorCandidate;Lo/canCreateFromBoolean;JLo/renameAll;Lo/nopInstance;Lo/_findCustomReferenceDeserializer;Lo/findViews;)Lo/_findPropertyUnwrapper;", "write", "(Lo/_findPropertyUnwrapper;Lo/_findCustomReferenceDeserializer;)Lo/_findCustomReferenceDeserializer;", "J", "Lo/replace;", "Lo/replace;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _convertObjectId {
    private static final replace AudioAttributesCompatParcelizer;
    private static final long RemoteActionCompatParcelizer;
    private static final long write = setResolver.RemoteActionCompatParcelizer(14);
    private static final long IconCompatParcelizer = setResolver.RemoteActionCompatParcelizer(0);
    private static final long read = switchToNext.INSTANCE.AudioAttributesImplBaseParcelizer();

    public static final <T> T IconCompatParcelizer(T t, T t2, float f) {
        return ((double) f) < 0.5d ? t : t2;
    }

    static {
        long jAudioAttributesCompatParcelizer = switchToNext.INSTANCE.AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer = jAudioAttributesCompatParcelizer;
        AudioAttributesCompatParcelizer = replace.INSTANCE.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer);
    }

    public static final _findPropertyUnwrapper IconCompatParcelizer(_findPropertyUnwrapper _findpropertyunwrapper, _findPropertyUnwrapper _findpropertyunwrapper2, float f) {
        replace replaceVarRemoteActionCompatParcelizer = isCaseInsensitive.RemoteActionCompatParcelizer(_findpropertyunwrapper.getIconCompatParcelizer(), _findpropertyunwrapper2.getIconCompatParcelizer(), f);
        _reportMissingSetter _reportmissingsetter = (_reportMissingSetter) IconCompatParcelizer(_findpropertyunwrapper.getAudioAttributesImplBaseParcelizer(), _findpropertyunwrapper2.getAudioAttributesImplBaseParcelizer(), f);
        long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(_findpropertyunwrapper.getAudioAttributesCompatParcelizer(), _findpropertyunwrapper2.getAudioAttributesCompatParcelizer(), f);
        getDataStream remoteActionCompatParcelizer = _findpropertyunwrapper.getRemoteActionCompatParcelizer();
        if (remoteActionCompatParcelizer == null) {
            remoteActionCompatParcelizer = getDataStream.INSTANCE.RemoteActionCompatParcelizer();
        }
        getDataStream remoteActionCompatParcelizer2 = _findpropertyunwrapper2.getRemoteActionCompatParcelizer();
        if (remoteActionCompatParcelizer2 == null) {
            remoteActionCompatParcelizer2 = getDataStream.INSTANCE.RemoteActionCompatParcelizer();
        }
        getDataStream getdatastream = DataFormatReadersMatch.read(remoteActionCompatParcelizer, remoteActionCompatParcelizer2, f);
        withValueDeserializer withvaluedeserializer = (withValueDeserializer) IconCompatParcelizer(_findpropertyunwrapper.getWrite(), _findpropertyunwrapper2.getWrite(), f);
        _findFormat _findformat = (_findFormat) IconCompatParcelizer(_findpropertyunwrapper.getRead(), _findpropertyunwrapper2.getRead(), f);
        String str = (String) IconCompatParcelizer(_findpropertyunwrapper.getMediaBrowserCompatCustomActionResultReceiver(), _findpropertyunwrapper2.getMediaBrowserCompatCustomActionResultReceiver(), f);
        long jAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(_findpropertyunwrapper.getMediaBrowserCompatItemReceiver(), _findpropertyunwrapper2.getMediaBrowserCompatItemReceiver(), f);
        _find2ViaAlias audioAttributesImplApi21Parcelizer = _findpropertyunwrapper.getAudioAttributesImplApi21Parcelizer();
        float audioAttributesCompatParcelizer = audioAttributesImplApi21Parcelizer != null ? audioAttributesImplApi21Parcelizer.getAudioAttributesCompatParcelizer() : _find2ViaAlias.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        _find2ViaAlias audioAttributesImplApi21Parcelizer2 = _findpropertyunwrapper2.getAudioAttributesImplApi21Parcelizer();
        float fRemoteActionCompatParcelizer = _findFromOrdered.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer, audioAttributesImplApi21Parcelizer2 != null ? audioAttributesImplApi21Parcelizer2.getAudioAttributesCompatParcelizer() : _find2ViaAlias.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED), f);
        CreatorCandidate audioAttributesImplApi26Parcelizer = _findpropertyunwrapper.getAudioAttributesImplApi26Parcelizer();
        if (audioAttributesImplApi26Parcelizer == null) {
            audioAttributesImplApi26Parcelizer = CreatorCandidate.INSTANCE.RemoteActionCompatParcelizer();
        }
        CreatorCandidate audioAttributesImplApi26Parcelizer2 = _findpropertyunwrapper2.getAudioAttributesImplApi26Parcelizer();
        if (audioAttributesImplApi26Parcelizer2 == null) {
            audioAttributesImplApi26Parcelizer2 = CreatorCandidate.INSTANCE.RemoteActionCompatParcelizer();
        }
        CreatorCandidate creatorCandidateAudioAttributesCompatParcelizer = creator.AudioAttributesCompatParcelizer(audioAttributesImplApi26Parcelizer, audioAttributesImplApi26Parcelizer2, f);
        canCreateFromBoolean cancreatefromboolean = (canCreateFromBoolean) IconCompatParcelizer(_findpropertyunwrapper.getMediaBrowserCompatMediaItem(), _findpropertyunwrapper2.getMediaBrowserCompatMediaItem(), f);
        long jIconCompatParcelizer = RequestPayload.IconCompatParcelizer(_findpropertyunwrapper.getMediaDescriptionCompat(), _findpropertyunwrapper2.getMediaDescriptionCompat(), f);
        renameAll renameall = (renameAll) IconCompatParcelizer(_findpropertyunwrapper.getMediaMetadataCompat(), _findpropertyunwrapper2.getMediaMetadataCompat(), f);
        nopInstance mediaBrowserCompatSearchResultReceiver = _findpropertyunwrapper.getMediaBrowserCompatSearchResultReceiver();
        if (mediaBrowserCompatSearchResultReceiver == null) {
            mediaBrowserCompatSearchResultReceiver = new nopInstance(0L, 0L, BitmapDescriptorFactory.HUE_RED, 7, null);
        }
        nopInstance mediaBrowserCompatSearchResultReceiver2 = _findpropertyunwrapper2.getMediaBrowserCompatSearchResultReceiver();
        if (mediaBrowserCompatSearchResultReceiver2 == null) {
            mediaBrowserCompatSearchResultReceiver2 = new nopInstance(0L, 0L, BitmapDescriptorFactory.HUE_RED, 7, null);
        }
        return new _findPropertyUnwrapper(replaceVarRemoteActionCompatParcelizer, jAudioAttributesCompatParcelizer, getdatastream, withvaluedeserializer, _findformat, _reportmissingsetter, str, jAudioAttributesCompatParcelizer2, _find2ViaAlias.read(fRemoteActionCompatParcelizer), creatorCandidateAudioAttributesCompatParcelizer, cancreatefromboolean, jIconCompatParcelizer, renameall, _hasAnnotation.IconCompatParcelizer(mediaBrowserCompatSearchResultReceiver, mediaBrowserCompatSearchResultReceiver2, f), read(_findpropertyunwrapper.getRatingCompat(), _findpropertyunwrapper2.getRatingCompat(), f), (findViews) IconCompatParcelizer(_findpropertyunwrapper.getOnCustomAction(), _findpropertyunwrapper2.getOnCustomAction(), f), (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
    }

    private static final _findCustomReferenceDeserializer read(_findCustomReferenceDeserializer _findcustomreferencedeserializer, _findCustomReferenceDeserializer _findcustomreferencedeserializer2, float f) {
        if (_findcustomreferencedeserializer == null && _findcustomreferencedeserializer2 == null) {
            return null;
        }
        if (_findcustomreferencedeserializer == null) {
            _findcustomreferencedeserializer = _findCustomReferenceDeserializer.INSTANCE.AudioAttributesCompatParcelizer();
        }
        if (_findcustomreferencedeserializer2 == null) {
            _findcustomreferencedeserializer2 = _findCustomReferenceDeserializer.INSTANCE.AudioAttributesCompatParcelizer();
        }
        return hasSerializerModifiers.AudioAttributesCompatParcelizer(_findcustomreferencedeserializer, _findcustomreferencedeserializer2, f);
    }

    public static final _findPropertyUnwrapper RemoteActionCompatParcelizer(_findPropertyUnwrapper _findpropertyunwrapper) {
        long mediaBrowserCompatItemReceiver;
        replace replaceVarRemoteActionCompatParcelizer = _findpropertyunwrapper.getIconCompatParcelizer().RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o._findSubclassDeserializer
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return _convertObjectId.write();
            }
        });
        long audioAttributesCompatParcelizer = ReadableObjectIdReferring.RemoteActionCompatParcelizer(_findpropertyunwrapper.getAudioAttributesCompatParcelizer()) == 0 ? write : _findpropertyunwrapper.getAudioAttributesCompatParcelizer();
        getDataStream remoteActionCompatParcelizer = _findpropertyunwrapper.getRemoteActionCompatParcelizer();
        if (remoteActionCompatParcelizer == null) {
            remoteActionCompatParcelizer = getDataStream.INSTANCE.RemoteActionCompatParcelizer();
        }
        getDataStream getdatastream = remoteActionCompatParcelizer;
        withValueDeserializer write2 = _findpropertyunwrapper.getWrite();
        withValueDeserializer withvaluedeserializerIconCompatParcelizer = withValueDeserializer.IconCompatParcelizer(write2 != null ? write2.getIconCompatParcelizer() : withValueDeserializer.INSTANCE.IconCompatParcelizer());
        _findFormat read2 = _findpropertyunwrapper.getRead();
        _findFormat _findformatWrite = _findFormat.write(read2 != null ? read2.getRead() : _findFormat.INSTANCE.RemoteActionCompatParcelizer());
        _verifyAsClass audioAttributesImplBaseParcelizer = _findpropertyunwrapper.getAudioAttributesImplBaseParcelizer();
        if (audioAttributesImplBaseParcelizer == null) {
            audioAttributesImplBaseParcelizer = _reportMissingSetter.INSTANCE.IconCompatParcelizer();
        }
        _reportMissingSetter _reportmissingsetter = audioAttributesImplBaseParcelizer;
        String mediaBrowserCompatCustomActionResultReceiver = _findpropertyunwrapper.getMediaBrowserCompatCustomActionResultReceiver();
        if (mediaBrowserCompatCustomActionResultReceiver == null) {
            mediaBrowserCompatCustomActionResultReceiver = "";
        }
        String str = mediaBrowserCompatCustomActionResultReceiver;
        if (ReadableObjectIdReferring.RemoteActionCompatParcelizer(_findpropertyunwrapper.getMediaBrowserCompatItemReceiver()) == 0) {
            mediaBrowserCompatItemReceiver = IconCompatParcelizer;
        } else {
            mediaBrowserCompatItemReceiver = _findpropertyunwrapper.getMediaBrowserCompatItemReceiver();
        }
        long j = mediaBrowserCompatItemReceiver;
        _find2ViaAlias audioAttributesImplApi21Parcelizer = _findpropertyunwrapper.getAudioAttributesImplApi21Parcelizer();
        float audioAttributesCompatParcelizer2 = audioAttributesImplApi21Parcelizer != null ? audioAttributesImplApi21Parcelizer.getAudioAttributesCompatParcelizer() : _find2ViaAlias.INSTANCE.read();
        if (Float.isNaN(audioAttributesCompatParcelizer2)) {
            audioAttributesCompatParcelizer2 = _find2ViaAlias.INSTANCE.read();
        }
        _find2ViaAlias _find2viaalias = _find2ViaAlias.read(audioAttributesCompatParcelizer2);
        CreatorCandidate audioAttributesImplApi26Parcelizer = _findpropertyunwrapper.getAudioAttributesImplApi26Parcelizer();
        if (audioAttributesImplApi26Parcelizer == null) {
            audioAttributesImplApi26Parcelizer = CreatorCandidate.INSTANCE.RemoteActionCompatParcelizer();
        }
        CreatorCandidate creatorCandidate = audioAttributesImplApi26Parcelizer;
        canCreateFromBoolean mediaBrowserCompatMediaItem = _findpropertyunwrapper.getMediaBrowserCompatMediaItem();
        if (mediaBrowserCompatMediaItem == null) {
            mediaBrowserCompatMediaItem = canCreateFromBoolean.INSTANCE.read();
        }
        canCreateFromBoolean cancreatefromboolean = mediaBrowserCompatMediaItem;
        long mediaDescriptionCompat = _findpropertyunwrapper.getMediaDescriptionCompat();
        if (mediaDescriptionCompat == 16) {
            mediaDescriptionCompat = read;
        }
        long j2 = mediaDescriptionCompat;
        renameAll mediaMetadataCompat = _findpropertyunwrapper.getMediaMetadataCompat();
        if (mediaMetadataCompat == null) {
            mediaMetadataCompat = renameAll.INSTANCE.write();
        }
        renameAll renameall = mediaMetadataCompat;
        nopInstance mediaBrowserCompatSearchResultReceiver = _findpropertyunwrapper.getMediaBrowserCompatSearchResultReceiver();
        if (mediaBrowserCompatSearchResultReceiver == null) {
            mediaBrowserCompatSearchResultReceiver = nopInstance.INSTANCE.RemoteActionCompatParcelizer();
        }
        nopInstance nopinstance = mediaBrowserCompatSearchResultReceiver;
        _findCustomReferenceDeserializer ratingCompat = _findpropertyunwrapper.getRatingCompat();
        findTypeResolver onCustomAction = _findpropertyunwrapper.getOnCustomAction();
        if (onCustomAction == null) {
            onCustomAction = findTypeResolver.INSTANCE;
        }
        return new _findPropertyUnwrapper(replaceVarRemoteActionCompatParcelizer, audioAttributesCompatParcelizer, getdatastream, withvaluedeserializerIconCompatParcelizer, _findformatWrite, _reportmissingsetter, str, j, _find2viaalias, creatorCandidate, cancreatefromboolean, j2, renameall, nopinstance, ratingCompat, onCustomAction, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final replace write() {
        return AudioAttributesCompatParcelizer;
    }

    private static final _findCustomReferenceDeserializer write(_findPropertyUnwrapper _findpropertyunwrapper, _findCustomReferenceDeserializer _findcustomreferencedeserializer) {
        if (_findpropertyunwrapper.getRatingCompat() == null) {
            return _findcustomreferencedeserializer;
        }
        if (_findcustomreferencedeserializer == null) {
            return _findpropertyunwrapper.getRatingCompat();
        }
        return _findpropertyunwrapper.getRatingCompat().read(_findcustomreferencedeserializer);
    }

    public static final long AudioAttributesCompatParcelizer(long j, long j2, float f) {
        if (ReadableObjectIdReferring.RemoteActionCompatParcelizer(j) == 0 || ReadableObjectIdReferring.RemoteActionCompatParcelizer(j2) == 0) {
            return ((ReadableObjectIdReferring) IconCompatParcelizer(ReadableObjectIdReferring.read(j), ReadableObjectIdReferring.read(j2), f)).getIconCompatParcelizer();
        }
        return setResolver.write(j, j2, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin._findPropertyUnwrapper AudioAttributesCompatParcelizer(kotlin._findPropertyUnwrapper r22, long r23, kotlin.Instantiatable r25, float r26, long r27, kotlin.getDataStream r29, kotlin.withValueDeserializer r30, kotlin._findFormat r31, kotlin._reportMissingSetter r32, java.lang.String r33, long r34, kotlin._find2ViaAlias r36, kotlin.CreatorCandidate r37, kotlin.canCreateFromBoolean r38, long r39, kotlin.renameAll r41, kotlin.nopInstance r42, kotlin._findCustomReferenceDeserializer r43, kotlin.findViews r44) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._convertObjectId.AudioAttributesCompatParcelizer(o._findPropertyUnwrapper, long, o.Instantiatable, float, long, o.getDataStream, o.withValueDeserializer, o._findFormat, o._reportMissingSetter, java.lang.String, long, o._find2ViaAlias, o.CreatorCandidate, o.canCreateFromBoolean, long, o.renameAll, o.nopInstance, o._findCustomReferenceDeserializer, o.findViews):o._findPropertyUnwrapper");
    }
}
