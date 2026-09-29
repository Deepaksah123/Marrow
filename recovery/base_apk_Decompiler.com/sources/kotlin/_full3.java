package kotlin;

import java.util.List;
import kotlin.Metadata;
import kotlin.append;
import kotlin.notFinite;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J3\u0010\u0005\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0005\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0016¢\u0006\u0004\b\u0005\u0010\u0018J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0016¢\u0006\u0004\b\u0014\u0010\u0018J\u001f\u0010\u0014\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\r\u001a\u00020\u001a¢\u0006\u0004\b\u0014\u0010\u001bJ'\u0010\u0014\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\r\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u001a¢\u0006\u0004\b\u0014\u0010\u001dJ\u001f\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u001c2\b\u0010\r\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0005\u0010\u001eJ\u0015\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u001a¢\u0006\u0004\b\u0005\u0010\u001fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010\u0003J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0005\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0005\u0010!J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u001c¢\u0006\u0004\b\u0005\u0010#J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0003J\r\u0010$\u001a\u00020\b¢\u0006\u0004\b$\u0010\u0003J\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020&¢\u0006\u0004\b\u0007\u0010'J%\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020(¢\u0006\u0004\b\t\u0010)J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u001a¢\u0006\u0004\b\u0014\u0010\u001fJ)\u0010\u0014\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0*2\u0006\u0010\r\u001a\u00020+¢\u0006\u0004\b\u0014\u0010,J\u0017\u0010\u0014\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0014\u0010!J;\u0010\u0017\u001a\u00020\b\"\u0004\b\u0000\u0010-\"\u0004\b\u0001\u0010.2\u0006\u0010\u000b\u001a\u00028\u00012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0/¢\u0006\u0004\b\u0017\u00100J\u001d\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u001a¢\u0006\u0004\b\u0014\u00101J%\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u001a¢\u0006\u0004\b\u0014\u00102J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u001a¢\u0006\u0004\b\t\u0010\u001fJ\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u001a¢\u0006\u0004\b\u0017\u0010\u001fJ\u001d\u0010\u0014\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001903¢\u0006\u0004\b\u0014\u00104J\u001b\u0010\u0017\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b05¢\u0006\u0004\b\u0017\u00106J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u0002072\u0006\u0010\r\u001a\u00020\u001c¢\u0006\u0004\b\t\u00108J%\u0010\t\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0019092\u0006\u0010\r\u001a\u000207¢\u0006\u0004\b\t\u0010:J/\u0010\u0017\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010;2\u0006\u0010\r\u001a\u00020<2\u0006\u0010\u000f\u001a\u00020=2\u0006\u0010\u0011\u001a\u00020=¢\u0006\u0004\b\u0017\u0010>J%\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020?2\u0006\u0010\r\u001a\u00020<2\u0006\u0010\u000f\u001a\u00020=¢\u0006\u0004\b\u0014\u0010@J\r\u0010A\u001a\u00020\b¢\u0006\u0004\bA\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u000107¢\u0006\u0004\b\u0007\u0010BR\u0014\u0010\u0005\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010D"}, d2 = {"Lo/_full3;", "Lo/outputLong;", "<init>", "()V", "", "write", "()Z", "IconCompatParcelizer", "", "RemoteActionCompatParcelizer", "Lo/_closeInput;", "p0", "Lo/setEncoding;", "p1", "Lo/allocConcatBuffer;", "p2", "Lo/_outputUptoMillion;", "p3", "(Lo/_closeInput;Lo/setEncoding;Lo/allocConcatBuffer;Lo/_outputUptoMillion;)V", "Lo/constructReadConstrainedTextBuffer;", "AudioAttributesCompatParcelizer", "(Lo/constructReadConstrainedTextBuffer;)V", "Lo/rawReference;", "read", "(Lo/rawReference;)V", "", "", "(Ljava/lang/Object;I)V", "Lo/_parseSlowFloat;", "(Ljava/lang/Object;Lo/_parseSlowFloat;I)V", "(Lo/_parseSlowFloat;Ljava/lang/Object;)V", "(I)V", "AudioAttributesImplApi21Parcelizer", "(Ljava/lang/Object;)V", "AudioAttributesImplApi26Parcelizer", "(Lo/_parseSlowFloat;)V", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatItemReceiver", "Lo/releaseTokenBuffer;", "(Lo/_parseSlowFloat;Lo/releaseTokenBuffer;)V", "Lo/_outputUptoBillion;", "(Lo/_parseSlowFloat;Lo/releaseTokenBuffer;Lo/_outputUptoBillion;)V", "Lkotlin/Function1;", "Lo/createChildArrayContext;", "(Lo/getAnswerMap;Lo/createChildArrayContext;)V", "T", "V", "Lkotlin/Function2;", "(Ljava/lang/Object;Lo/MagicModuleSubmissionRequestBody;)V", "(II)V", "(III)V", "", "([Ljava/lang/Object;)V", "Lkotlin/Function0;", "(Lo/getCreatedOnDateMs;)V", "Lo/ifftMixedRadix;", "(Lo/ifftMixedRadix;Lo/_parseSlowFloat;)V", "", "(Ljava/util/List;Lo/ifftMixedRadix;)V", "Lo/checkValue;", "Lo/convertNumberToLong;", "Lo/getFilter;", "(Lo/checkValue;Lo/convertNumberToLong;Lo/getFilter;Lo/getFilter;)V", "Lo/_reportMissingRootWS;", "(Lo/_reportMissingRootWS;Lo/convertNumberToLong;Lo/getFilter;)V", "MediaBrowserCompatCustomActionResultReceiver", "(Lo/_full3;Lo/ifftMixedRadix;)V", "Lo/append;", "Lo/append;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _full3 extends outputLong {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final append write = new append();

    public final boolean write() {
        return this.write.AudioAttributesCompatParcelizer();
    }

    public final boolean IconCompatParcelizer() {
        return this.write.read();
    }

    public final void RemoteActionCompatParcelizer() {
        this.write.write();
    }

    public final void write(_closeInput<?> p0, setEncoding p1, allocConcatBuffer p2, _outputUptoMillion p3) {
        this.write.IconCompatParcelizer(p0, p1, p2, p3);
    }

    public final void AudioAttributesCompatParcelizer(constructReadConstrainedTextBuffer p0) {
        append appendVar = this.write;
        notFinite.onPause onpause = notFinite.onPause.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(onpause);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.onPause onpause2 = notFinite.onPause.INSTANCE;
        append.RemoteActionCompatParcelizer.write(appendVarIconCompatParcelizer, notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(0), p0);
        appendVar.AudioAttributesCompatParcelizer(onpause);
    }

    public final void read(rawReference p0) {
        append appendVar = this.write;
        notFinite.onFastForward onfastforward = notFinite.onFastForward.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(onfastforward);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.onFastForward onfastforward2 = notFinite.onFastForward.INSTANCE;
        append.RemoteActionCompatParcelizer.write(appendVarIconCompatParcelizer, notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(0), p0);
        appendVar.AudioAttributesCompatParcelizer(onfastforward);
    }

    public final void write(rawReference p0) {
        append appendVar = this.write;
        notFinite.onPlayFromUri onplayfromuri = notFinite.onPlayFromUri.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(onplayfromuri);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.onPlayFromUri onplayfromuri2 = notFinite.onPlayFromUri.INSTANCE;
        append.RemoteActionCompatParcelizer.write(appendVarIconCompatParcelizer, notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(0), p0);
        appendVar.AudioAttributesCompatParcelizer(onplayfromuri);
    }

    public final void AudioAttributesCompatParcelizer(rawReference p0) {
        append appendVar = this.write;
        notFinite.RatingCompat ratingCompat = notFinite.RatingCompat.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(ratingCompat);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.RatingCompat ratingCompat2 = notFinite.RatingCompat.INSTANCE;
        append.RemoteActionCompatParcelizer.write(appendVarIconCompatParcelizer, notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(0), p0);
        appendVar.AudioAttributesCompatParcelizer(ratingCompat);
    }

    public final void AudioAttributesCompatParcelizer(Object p0, int p1) {
        append appendVar = this.write;
        notFinite.onRewind onrewind = notFinite.onRewind.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(onrewind);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.onRewind onrewind2 = notFinite.onRewind.INSTANCE;
        append.RemoteActionCompatParcelizer.write(appendVarIconCompatParcelizer, notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(0), p0);
        notFinite.onRewind onrewind3 = notFinite.onRewind.INSTANCE;
        appendVarIconCompatParcelizer.RemoteActionCompatParcelizer[appendVarIconCompatParcelizer.AudioAttributesCompatParcelizer - appendVarIconCompatParcelizer.read[appendVarIconCompatParcelizer.IconCompatParcelizer - 1].getAudioAttributesCompatParcelizer()] = p1;
        appendVar.AudioAttributesCompatParcelizer(onrewind);
    }

    public final void AudioAttributesCompatParcelizer(Object p0, _parseSlowFloat p1, int p2) {
        append appendVar = this.write;
        notFinite.onSeekTo onseekto = notFinite.onSeekTo.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(onseekto);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.onSeekTo onseekto2 = notFinite.onSeekTo.INSTANCE;
        int iRemoteActionCompatParcelizer = notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(0);
        notFinite.onSeekTo onseekto3 = notFinite.onSeekTo.INSTANCE;
        append.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(appendVarIconCompatParcelizer, iRemoteActionCompatParcelizer, p0, notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(1), p1);
        notFinite.onSeekTo onseekto4 = notFinite.onSeekTo.INSTANCE;
        appendVarIconCompatParcelizer.RemoteActionCompatParcelizer[appendVarIconCompatParcelizer.AudioAttributesCompatParcelizer - appendVarIconCompatParcelizer.read[appendVarIconCompatParcelizer.IconCompatParcelizer - 1].getAudioAttributesCompatParcelizer()] = p2;
        appendVar.AudioAttributesCompatParcelizer(onseekto);
    }

    public final void write(_parseSlowFloat p0, Object p1) {
        append appendVar = this.write;
        notFinite.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = notFinite.AudioAttributesCompatParcelizer.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = notFinite.AudioAttributesCompatParcelizer.INSTANCE;
        int iRemoteActionCompatParcelizer = notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(0);
        notFinite.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer3 = notFinite.AudioAttributesCompatParcelizer.INSTANCE;
        append.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(appendVarIconCompatParcelizer, iRemoteActionCompatParcelizer, p0, notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(1), p1);
        appendVar.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer);
    }

    public final void write(int p0) {
        append appendVar = this.write;
        notFinite.onRemoveQueueItemAt onremovequeueitemat = notFinite.onRemoveQueueItemAt.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(onremovequeueitemat);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.onRemoveQueueItemAt onremovequeueitemat2 = notFinite.onRemoveQueueItemAt.INSTANCE;
        appendVarIconCompatParcelizer.RemoteActionCompatParcelizer[appendVarIconCompatParcelizer.AudioAttributesCompatParcelizer - appendVarIconCompatParcelizer.read[appendVarIconCompatParcelizer.IconCompatParcelizer - 1].getAudioAttributesCompatParcelizer()] = p0;
        appendVar.AudioAttributesCompatParcelizer(onremovequeueitemat);
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        this.write.IconCompatParcelizer(notFinite.onPrepare.INSTANCE);
    }

    public final void AudioAttributesCompatParcelizer() {
        this.write.IconCompatParcelizer(notFinite.AudioAttributesImplApi21Parcelizer.INSTANCE);
    }

    public final void write(Object p0) {
        append appendVar = this.write;
        notFinite.onPrepareFromUri onpreparefromuri = notFinite.onPrepareFromUri.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(onpreparefromuri);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.onPrepareFromUri onpreparefromuri2 = notFinite.onPrepareFromUri.INSTANCE;
        append.RemoteActionCompatParcelizer.write(appendVarIconCompatParcelizer, notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(0), p0);
        appendVar.AudioAttributesCompatParcelizer(onpreparefromuri);
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        this.write.IconCompatParcelizer(notFinite.MediaDescriptionCompat.INSTANCE);
    }

    public final void write(_parseSlowFloat p0) {
        append appendVar = this.write;
        notFinite.MediaMetadataCompat mediaMetadataCompat = notFinite.MediaMetadataCompat.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(mediaMetadataCompat);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.MediaMetadataCompat mediaMetadataCompat2 = notFinite.MediaMetadataCompat.INSTANCE;
        append.RemoteActionCompatParcelizer.write(appendVarIconCompatParcelizer, notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(0), p0);
        appendVar.AudioAttributesCompatParcelizer(mediaMetadataCompat);
    }

    public final void read() {
        this.write.IconCompatParcelizer(notFinite.MediaBrowserCompatItemReceiver.INSTANCE);
    }

    public final void AudioAttributesImplBaseParcelizer() {
        this.write.IconCompatParcelizer(notFinite.onPrepareFromMediaId.INSTANCE);
    }

    public final void MediaBrowserCompatItemReceiver() {
        this.write.IconCompatParcelizer(notFinite.onMediaButtonEvent.INSTANCE);
    }

    public final void IconCompatParcelizer(_parseSlowFloat p0, releaseTokenBuffer p1) {
        append appendVar = this.write;
        notFinite.onCustomAction oncustomaction = notFinite.onCustomAction.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(oncustomaction);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.onCustomAction oncustomaction2 = notFinite.onCustomAction.INSTANCE;
        int iRemoteActionCompatParcelizer = notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(0);
        notFinite.onCustomAction oncustomaction3 = notFinite.onCustomAction.INSTANCE;
        append.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(appendVarIconCompatParcelizer, iRemoteActionCompatParcelizer, p0, notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(1), p1);
        appendVar.AudioAttributesCompatParcelizer(oncustomaction);
    }

    public final void RemoteActionCompatParcelizer(_parseSlowFloat p0, releaseTokenBuffer p1, _outputUptoBillion p2) {
        append appendVar = this.write;
        notFinite.onAddQueueItem onaddqueueitem = notFinite.onAddQueueItem.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(onaddqueueitem);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.onAddQueueItem onaddqueueitem2 = notFinite.onAddQueueItem.INSTANCE;
        int iRemoteActionCompatParcelizer = notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(0);
        notFinite.onAddQueueItem onaddqueueitem3 = notFinite.onAddQueueItem.INSTANCE;
        int iRemoteActionCompatParcelizer2 = notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(1);
        notFinite.onAddQueueItem onaddqueueitem4 = notFinite.onAddQueueItem.INSTANCE;
        append.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(appendVarIconCompatParcelizer, iRemoteActionCompatParcelizer, p0, iRemoteActionCompatParcelizer2, p1, notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(2), p2);
        appendVar.AudioAttributesCompatParcelizer(onaddqueueitem);
    }

    public final void AudioAttributesCompatParcelizer(int p0) {
        append appendVar = this.write;
        notFinite.onCommand oncommand = notFinite.onCommand.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(oncommand);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.onCommand oncommand2 = notFinite.onCommand.INSTANCE;
        appendVarIconCompatParcelizer.RemoteActionCompatParcelizer[appendVarIconCompatParcelizer.AudioAttributesCompatParcelizer - appendVarIconCompatParcelizer.read[appendVarIconCompatParcelizer.IconCompatParcelizer - 1].getAudioAttributesCompatParcelizer()] = p0;
        appendVar.AudioAttributesCompatParcelizer(oncommand);
    }

    public final void AudioAttributesCompatParcelizer(getAnswerMap<? super createChildArrayContext, getShowPopup> p0, createChildArrayContext p1) {
        append appendVar = this.write;
        notFinite.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = notFinite.AudioAttributesImplBaseParcelizer.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(audioAttributesImplBaseParcelizer);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer2 = notFinite.AudioAttributesImplBaseParcelizer.INSTANCE;
        int iRemoteActionCompatParcelizer = notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(0);
        notFinite.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer3 = notFinite.AudioAttributesImplBaseParcelizer.INSTANCE;
        append.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(appendVarIconCompatParcelizer, iRemoteActionCompatParcelizer, p0, notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(1), p1);
        appendVar.AudioAttributesCompatParcelizer(audioAttributesImplBaseParcelizer);
    }

    public final void AudioAttributesCompatParcelizer(Object p0) {
        if (p0 instanceof _getByteArrayBuilder) {
            this.write.IconCompatParcelizer(notFinite.onSetPlaybackSpeed.INSTANCE);
        }
    }

    public final <T, V> void read(V p0, MagicModuleSubmissionRequestBody<? super T, ? super V, getShowPopup> p1) {
        append appendVar = this.write;
        notFinite.onRemoveQueueItem onremovequeueitem = notFinite.onRemoveQueueItem.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(onremovequeueitem);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.onRemoveQueueItem onremovequeueitem2 = notFinite.onRemoveQueueItem.INSTANCE;
        int iRemoteActionCompatParcelizer = notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(0);
        notFinite.onRemoveQueueItem onremovequeueitem3 = notFinite.onRemoveQueueItem.INSTANCE;
        int iRemoteActionCompatParcelizer2 = notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(1);
        toMagicModuleMetaRepoModel.read(p1, "");
        append.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(appendVarIconCompatParcelizer, iRemoteActionCompatParcelizer, p0, iRemoteActionCompatParcelizer2, (MagicModuleSubmissionRequestBody) toMagicModuleStatsLSModel.RemoteActionCompatParcelizer(p1, 2));
        appendVar.AudioAttributesCompatParcelizer(onremovequeueitem);
    }

    public final void AudioAttributesCompatParcelizer(int p0, int p1) {
        append appendVar = this.write;
        notFinite.onPrepareFromSearch onpreparefromsearch = notFinite.onPrepareFromSearch.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(onpreparefromsearch);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.onPrepareFromSearch onpreparefromsearch2 = notFinite.onPrepareFromSearch.INSTANCE;
        notFinite.onPrepareFromSearch onpreparefromsearch3 = notFinite.onPrepareFromSearch.INSTANCE;
        int iWrite = appendVarIconCompatParcelizer.AudioAttributesCompatParcelizer - appendVarIconCompatParcelizer.read[appendVarIconCompatParcelizer.IconCompatParcelizer - 1].getAudioAttributesCompatParcelizer();
        int[] iArr = appendVarIconCompatParcelizer.RemoteActionCompatParcelizer;
        iArr[iWrite] = p0;
        iArr[iWrite + 1] = p1;
        appendVar.AudioAttributesCompatParcelizer(onpreparefromsearch);
    }

    public final void AudioAttributesCompatParcelizer(int p0, int p1, int p2) {
        append appendVar = this.write;
        notFinite.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = notFinite.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = notFinite.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.INSTANCE;
        notFinite.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver3 = notFinite.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.INSTANCE;
        notFinite.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver4 = notFinite.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.INSTANCE;
        int iWrite = appendVarIconCompatParcelizer.AudioAttributesCompatParcelizer - appendVarIconCompatParcelizer.read[appendVarIconCompatParcelizer.IconCompatParcelizer - 1].getAudioAttributesCompatParcelizer();
        int[] iArr = appendVarIconCompatParcelizer.RemoteActionCompatParcelizer;
        iArr[iWrite + 1] = p0;
        iArr[iWrite] = p1;
        iArr[iWrite + 2] = p2;
        appendVar.AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    public final void RemoteActionCompatParcelizer(int p0) {
        append appendVar = this.write;
        notFinite.write writeVar = notFinite.write.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(writeVar);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.write writeVar2 = notFinite.write.INSTANCE;
        appendVarIconCompatParcelizer.RemoteActionCompatParcelizer[appendVarIconCompatParcelizer.AudioAttributesCompatParcelizer - appendVarIconCompatParcelizer.read[appendVarIconCompatParcelizer.IconCompatParcelizer - 1].getAudioAttributesCompatParcelizer()] = p0;
        appendVar.AudioAttributesCompatParcelizer(writeVar);
    }

    public final void read(int p0) {
        append appendVar = this.write;
        notFinite.onSetCaptioningEnabled onsetcaptioningenabled = notFinite.onSetCaptioningEnabled.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(onsetcaptioningenabled);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.onSetCaptioningEnabled onsetcaptioningenabled2 = notFinite.onSetCaptioningEnabled.INSTANCE;
        appendVarIconCompatParcelizer.RemoteActionCompatParcelizer[appendVarIconCompatParcelizer.AudioAttributesCompatParcelizer - appendVarIconCompatParcelizer.read[appendVarIconCompatParcelizer.IconCompatParcelizer - 1].getAudioAttributesCompatParcelizer()] = p0;
        appendVar.AudioAttributesCompatParcelizer(onsetcaptioningenabled);
    }

    public final void AudioAttributesCompatParcelizer(Object[] p0) {
        if (p0.length == 0) {
            return;
        }
        append appendVar = this.write;
        notFinite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = notFinite.AudioAttributesImplApi26Parcelizer.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(audioAttributesImplApi26Parcelizer);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer2 = notFinite.AudioAttributesImplApi26Parcelizer.INSTANCE;
        append.RemoteActionCompatParcelizer.write(appendVarIconCompatParcelizer, notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(0), p0);
        appendVar.AudioAttributesCompatParcelizer(audioAttributesImplApi26Parcelizer);
    }

    public final void read(getCreatedOnDateMs<getShowPopup> p0) {
        append appendVar = this.write;
        notFinite.onPlayFromSearch onplayfromsearch = notFinite.onPlayFromSearch.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(onplayfromsearch);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.onPlayFromSearch onplayfromsearch2 = notFinite.onPlayFromSearch.INSTANCE;
        append.RemoteActionCompatParcelizer.write(appendVarIconCompatParcelizer, notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(0), p0);
        appendVar.AudioAttributesCompatParcelizer(onplayfromsearch);
    }

    public final void RemoteActionCompatParcelizer(ifftMixedRadix p0, _parseSlowFloat p1) {
        append appendVar = this.write;
        notFinite.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = notFinite.MediaBrowserCompatCustomActionResultReceiver.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver2 = notFinite.MediaBrowserCompatCustomActionResultReceiver.INSTANCE;
        int iRemoteActionCompatParcelizer = notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(0);
        notFinite.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver3 = notFinite.MediaBrowserCompatCustomActionResultReceiver.INSTANCE;
        append.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(appendVarIconCompatParcelizer, iRemoteActionCompatParcelizer, p0, notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(1), p1);
        appendVar.AudioAttributesCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver);
    }

    public final void RemoteActionCompatParcelizer(List<? extends Object> p0, ifftMixedRadix p1) {
        if (p0.isEmpty()) {
            return;
        }
        append appendVar = this.write;
        notFinite.RemoteActionCompatParcelizer remoteActionCompatParcelizer = notFinite.RemoteActionCompatParcelizer.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = notFinite.RemoteActionCompatParcelizer.INSTANCE;
        int iRemoteActionCompatParcelizer = notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(1);
        notFinite.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = notFinite.RemoteActionCompatParcelizer.INSTANCE;
        append.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(appendVarIconCompatParcelizer, iRemoteActionCompatParcelizer, p0, notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(0), p1);
        appendVar.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
    }

    public final void read(checkValue p0, convertNumberToLong p1, getFilter p2, getFilter p3) {
        append appendVar = this.write;
        notFinite.IconCompatParcelizer iconCompatParcelizer = notFinite.IconCompatParcelizer.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(iconCompatParcelizer);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.IconCompatParcelizer iconCompatParcelizer2 = notFinite.IconCompatParcelizer.INSTANCE;
        int iRemoteActionCompatParcelizer = notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(0);
        notFinite.IconCompatParcelizer iconCompatParcelizer3 = notFinite.IconCompatParcelizer.INSTANCE;
        int iRemoteActionCompatParcelizer2 = notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(1);
        notFinite.IconCompatParcelizer iconCompatParcelizer4 = notFinite.IconCompatParcelizer.INSTANCE;
        int iRemoteActionCompatParcelizer3 = notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(3);
        notFinite.IconCompatParcelizer iconCompatParcelizer5 = notFinite.IconCompatParcelizer.INSTANCE;
        append.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(appendVarIconCompatParcelizer, iRemoteActionCompatParcelizer, p0, iRemoteActionCompatParcelizer2, p1, iRemoteActionCompatParcelizer3, p3, notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(2), p2);
        appendVar.AudioAttributesCompatParcelizer(iconCompatParcelizer);
    }

    public final void AudioAttributesCompatParcelizer(_reportMissingRootWS p0, convertNumberToLong p1, getFilter p2) {
        append appendVar = this.write;
        notFinite.onPlay onplay = notFinite.onPlay.INSTANCE;
        appendVar.RemoteActionCompatParcelizer(onplay);
        append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
        notFinite.onPlay onplay2 = notFinite.onPlay.INSTANCE;
        int iRemoteActionCompatParcelizer = notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(0);
        notFinite.onPlay onplay3 = notFinite.onPlay.INSTANCE;
        int iRemoteActionCompatParcelizer2 = notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(1);
        notFinite.onPlay onplay4 = notFinite.onPlay.INSTANCE;
        append.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(appendVarIconCompatParcelizer, iRemoteActionCompatParcelizer, p0, iRemoteActionCompatParcelizer2, p1, notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(2), p2);
        appendVar.AudioAttributesCompatParcelizer(onplay);
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        this.write.IconCompatParcelizer(notFinite.MediaBrowserCompatMediaItem.INSTANCE);
    }

    public final void IconCompatParcelizer(_full3 p0, ifftMixedRadix p1) {
        if (p0.IconCompatParcelizer()) {
            append appendVar = this.write;
            notFinite.read readVar = notFinite.read.INSTANCE;
            appendVar.RemoteActionCompatParcelizer(readVar);
            append appendVarIconCompatParcelizer = append.RemoteActionCompatParcelizer.IconCompatParcelizer(appendVar);
            notFinite.read readVar2 = notFinite.read.INSTANCE;
            int iRemoteActionCompatParcelizer = notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(0);
            notFinite.read readVar3 = notFinite.read.INSTANCE;
            append.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(appendVarIconCompatParcelizer, iRemoteActionCompatParcelizer, p0, notFinite.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(1), p1);
            appendVar.AudioAttributesCompatParcelizer(readVar);
        }
    }
}
