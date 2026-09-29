package kotlin;

import kotlin.Metadata;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\b\u0002\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010#\u001a\u00020\u00028\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010!\"\u0004\b\u001f\u0010\"R\u001c\u0010%\u001a\u00020\u00048\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b$\u0010!\"\u0004\b#\u0010\"R\u001e\u0010*\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010(\u001a\u0004\u0018\u00010\b8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b+\u0010,\"\u0004\b(\u0010-R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b.\u0010/\"\u0004\b\u001f\u00100R\u0018\u0010.\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b(\u00101R\u001e\u0010&\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b2\u00103\"\u0004\b#\u00104R\u001c\u0010$\u001a\u00020\u00048\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b5\u0010!\"\u0004\b*\u0010\"R\u001e\u0010+\u001a\u0004\u0018\u00010\u00118\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b#\u00106\"\u0004\b%\u00107R\u001e\u00102\u001a\u0004\u0018\u00010\u00138\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b8\u00109\"\u0004\b(\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b*\u0010;R\u001c\u00108\u001a\u00020\u00028\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b%\u0010!\"\u0004\b%\u0010\"R\u001e\u00105\u001a\u0004\u0018\u00010\u00188\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b=\u0010>\"\u0004\b(\u0010?R\u001e\u0010=\u001a\u0004\u0018\u00010\u001a8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b<\u0010@\"\u0004\b(\u0010A"}, d2 = {"Lo/getVisibleInsets;", "", "Lo/switchToNext;", "p0", "Lo/ReadableObjectIdReferring;", "p1", "Lo/getDataStream;", "p2", "Lo/withValueDeserializer;", "p3", "Lo/_findFormat;", "p4", "Lo/_reportMissingSetter;", "p5", "", "p6", "p7", "Lo/_find2ViaAlias;", "p8", "Lo/CreatorCandidate;", "p9", "Lo/canCreateFromBoolean;", "p10", "p11", "Lo/renameAll;", "p12", "Lo/nopInstance;", "p13", "<init>", "(JJLo/getDataStream;Lo/withValueDeserializer;Lo/_findFormat;Lo/_reportMissingSetter;Ljava/lang/String;JLo/_find2ViaAlias;Lo/CreatorCandidate;Lo/canCreateFromBoolean;JLo/renameAll;Lo/nopInstance;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/_findPropertyUnwrapper;", "IconCompatParcelizer", "()Lo/_findPropertyUnwrapper;", "J", "(J)V", "write", "AudioAttributesImplBaseParcelizer", "AudioAttributesCompatParcelizer", "MediaBrowserCompatItemReceiver", "Lo/getDataStream;", "read", "(Lo/getDataStream;)V", "RemoteActionCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Lo/withValueDeserializer;", "(Lo/withValueDeserializer;)V", "AudioAttributesImplApi21Parcelizer", "Lo/_findFormat;", "(Lo/_findFormat;)V", "Lo/_reportMissingSetter;", "AudioAttributesImplApi26Parcelizer", "Ljava/lang/String;", "(Ljava/lang/String;)V", "MediaBrowserCompatSearchResultReceiver", "Lo/_find2ViaAlias;", "(Lo/_find2ViaAlias;)V", "MediaMetadataCompat", "Lo/CreatorCandidate;", "(Lo/CreatorCandidate;)V", "Lo/canCreateFromBoolean;", "MediaDescriptionCompat", "MediaBrowserCompatMediaItem", "Lo/renameAll;", "(Lo/renameAll;)V", "Lo/nopInstance;", "(Lo/nopInstance;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getVisibleInsets {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private long MediaMetadataCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private _findFormat IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private String MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private long AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private long write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private withValueDeserializer read;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private getDataStream RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private renameAll MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private long AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private nopInstance MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private CreatorCandidate AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public canCreateFromBoolean MediaDescriptionCompat;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public _reportMissingSetter AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private _find2ViaAlias MediaBrowserCompatCustomActionResultReceiver;

    private getVisibleInsets(long j, long j2, getDataStream getdatastream, withValueDeserializer withvaluedeserializer, _findFormat _findformat, _reportMissingSetter _reportmissingsetter, String str, long j3, _find2ViaAlias _find2viaalias, CreatorCandidate creatorCandidate, canCreateFromBoolean cancreatefromboolean, long j4, renameAll renameall, nopInstance nopinstance) {
        this.write = j;
        this.AudioAttributesCompatParcelizer = j2;
        this.RemoteActionCompatParcelizer = getdatastream;
        this.read = withvaluedeserializer;
        this.IconCompatParcelizer = _findformat;
        this.AudioAttributesImplApi21Parcelizer = _reportmissingsetter;
        this.MediaBrowserCompatItemReceiver = str;
        this.AudioAttributesImplBaseParcelizer = j3;
        this.MediaBrowserCompatCustomActionResultReceiver = _find2viaalias;
        this.AudioAttributesImplApi26Parcelizer = creatorCandidate;
        this.MediaDescriptionCompat = cancreatefromboolean;
        this.MediaMetadataCompat = j4;
        this.MediaBrowserCompatSearchResultReceiver = renameall;
        this.MediaBrowserCompatMediaItem = nopinstance;
    }

    public /* synthetic */ getVisibleInsets(long j, long j2, getDataStream getdatastream, withValueDeserializer withvaluedeserializer, _findFormat _findformat, _reportMissingSetter _reportmissingsetter, String str, long j3, _find2ViaAlias _find2viaalias, CreatorCandidate creatorCandidate, canCreateFromBoolean cancreatefromboolean, long j4, renameAll renameall, nopInstance nopinstance, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer() : j, (i & 2) != 0 ? ReadableObjectIdReferring.INSTANCE.IconCompatParcelizer() : j2, (i & 4) != 0 ? null : getdatastream, (i & 8) != 0 ? null : withvaluedeserializer, (i & 16) != 0 ? null : _findformat, (i & 32) != 0 ? null : _reportmissingsetter, (i & 64) != 0 ? null : str, (i & 128) != 0 ? ReadableObjectIdReferring.INSTANCE.IconCompatParcelizer() : j3, (i & 256) != 0 ? null : _find2viaalias, (i & 512) != 0 ? null : creatorCandidate, (i & 1024) != 0 ? null : cancreatefromboolean, (i & 2048) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer() : j4, (i & 4096) != 0 ? null : renameall, (i & 8192) != 0 ? null : nopinstance, null);
    }

    public final void IconCompatParcelizer(long j) {
        this.write = j;
    }

    public final void write(long j) {
        this.AudioAttributesCompatParcelizer = j;
    }

    public final void read(getDataStream getdatastream) {
        this.RemoteActionCompatParcelizer = getdatastream;
    }

    public final void read(withValueDeserializer withvaluedeserializer) {
        this.read = withvaluedeserializer;
    }

    public final void IconCompatParcelizer(_findFormat _findformat) {
        this.IconCompatParcelizer = _findformat;
    }

    public final void write(String str) {
        this.MediaBrowserCompatItemReceiver = str;
    }

    public final void RemoteActionCompatParcelizer(long j) {
        this.AudioAttributesImplBaseParcelizer = j;
    }

    public final void AudioAttributesCompatParcelizer(_find2ViaAlias _find2viaalias) {
        this.MediaBrowserCompatCustomActionResultReceiver = _find2viaalias;
    }

    public final void read(CreatorCandidate creatorCandidate) {
        this.AudioAttributesImplApi26Parcelizer = creatorCandidate;
    }

    public final void AudioAttributesCompatParcelizer(long j) {
        this.MediaMetadataCompat = j;
    }

    public final void read(renameAll renameall) {
        this.MediaBrowserCompatSearchResultReceiver = renameall;
    }

    public final void read(nopInstance nopinstance) {
        this.MediaBrowserCompatMediaItem = nopinstance;
    }

    public final _findPropertyUnwrapper IconCompatParcelizer() {
        return new _findPropertyUnwrapper(this.write, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer, this.MediaDescriptionCompat, this.MediaMetadataCompat, this.MediaBrowserCompatSearchResultReceiver, this.MediaBrowserCompatMediaItem, null, null, CpioConstants.C_ISSOCK, null);
    }

    public /* synthetic */ getVisibleInsets(long j, long j2, getDataStream getdatastream, withValueDeserializer withvaluedeserializer, _findFormat _findformat, _reportMissingSetter _reportmissingsetter, String str, long j3, _find2ViaAlias _find2viaalias, CreatorCandidate creatorCandidate, canCreateFromBoolean cancreatefromboolean, long j4, renameAll renameall, nopInstance nopinstance, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, j2, getdatastream, withvaluedeserializer, _findformat, _reportmissingsetter, str, j3, _find2viaalias, creatorCandidate, cancreatefromboolean, j4, renameall, nopinstance);
    }
}
