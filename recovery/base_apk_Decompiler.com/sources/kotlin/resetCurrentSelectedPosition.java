package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaPeriodQueue;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\nB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u0006J\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\bJ%\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u0006J\u0018\u0010\n\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\n\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\"J\u0017\u0010\n\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020#H\u0016¢\u0006\u0004\b\n\u0010$J\u001f\u0010\u000b\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020#2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000b\u0010%J\u0017\u0010&\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010$J\u001f\u0010\u0007\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020#2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0007\u0010%J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0017H\u0016¢\u0006\u0004\b*\u0010\u001bJ\u000f\u0010+\u001a\u00020\u0001H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010\u0007\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020-H\u0016¢\u0006\u0004\b\u0007\u0010.J'\u0010\u000e\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020/2\u0006\u0010\u0012\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\u000e\u00100J\u001f\u0010\u000b\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000b\u00101J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u000202H\u0016¢\u0006\u0004\b\u000e\u00103J\u000f\u00104\u001a\u00020\u001dH\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020/H\u0016¢\u0006\u0004\b6\u00107J\u0017\u0010\u000b\u001a\u00020/2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000b\u00108J\u000f\u00109\u001a\u00020#H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010\u0007\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0007\u0010;J\u000f\u0010<\u001a\u00020\rH\u0016¢\u0006\u0004\b<\u0010\u000fJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020/H\u0016¢\u0006\u0004\b\n\u0010=J\u000f\u0010>\u001a\u00020\rH\u0016¢\u0006\u0004\b>\u0010\u000fJ\u000f\u0010?\u001a\u00020\u001fH\u0016¢\u0006\u0004\b?\u0010!J\u000f\u0010@\u001a\u00020\u001fH\u0016¢\u0006\u0004\b@\u0010!J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020AH\u0016¢\u0006\u0004\bD\u0010CJ\u0017\u0010\u000e\u001a\u00020F2\u0006\u0010\u0011\u001a\u00020EH\u0016¢\u0006\u0004\b\u000e\u0010GJ\u001f\u0010&\u001a\u00020F2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020EH\u0016¢\u0006\u0004\b&\u0010HJ\u000f\u0010I\u001a\u00020FH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010&\u001a\u00020F2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010KJ\u000f\u0010L\u001a\u00020\u001fH\u0016¢\u0006\u0004\bL\u0010!J\u000f\u0010M\u001a\u00020FH\u0016¢\u0006\u0004\bM\u0010JJ\u0017\u0010\u000e\u001a\u00020F2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010KJ\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010NJ\u0017\u0010O\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010&\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020QH\u0016¢\u0006\u0004\b&\u0010RJ\u0017\u0010(\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010PJ\r\u0010S\u001a\u00020#¢\u0006\u0004\bS\u0010:J\u0015\u0010+\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u001f¢\u0006\u0004\b+\u0010TJ\u000f\u0010&\u001a\u00020UH\u0016¢\u0006\u0004\b&\u0010VJ\u000f\u0010W\u001a\u00020FH\u0016¢\u0006\u0004\bW\u0010JJ\u0017\u0010\n\u001a\u00020X2\u0006\u0010\u0011\u001a\u00020\u001fH\u0000¢\u0006\u0004\b\n\u0010YJ\u0017\u0010\u000e\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020-H\u0016¢\u0006\u0004\b\u000e\u0010.J\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020/H\u0016¢\u0006\u0004\b\u0007\u0010ZJ'\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020/2\u0006\u0010\u0012\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\u0007\u0010[J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\n\u0010\\J\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020#H\u0016¢\u0006\u0004\b\u000e\u0010]J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020^H\u0016¢\u0006\u0004\b\u000e\u0010_J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010`J\u0017\u0010+\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b+\u0010aJ\u0017\u00106\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b6\u0010aJ\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\u000b\u0010`J\u0017\u0010(\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010`J\u001f\u0010&\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020F2\u0006\u0010\u0012\u001a\u00020EH\u0016¢\u0006\u0004\b&\u0010bJ/\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020F2\u0006\u0010\u0012\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f2\u0006\u0010c\u001a\u00020EH\u0016¢\u0006\u0004\b\u000e\u0010dJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020FH\u0016¢\u0006\u0004\b\u000e\u0010eJ'\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020F2\u0006\u0010\u0012\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\u0007\u0010fJ\u0017\u0010g\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u001fH\u0016¢\u0006\u0004\bg\u0010`R\u0014\u0010\u0007\u001a\u00020\u00008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\bR\u0018\u0010h\u001a\u0004\u0018\u00010X8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bh\u0010iR*\u0010j\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r8G@AX\u0087\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010\u000f\"\u0004\bg\u0010P"}, d2 = {"Lo/resetCurrentSelectedPosition;", "Lo/LessonCompletedDialog;", "Lo/LessonCompletedDialogonViewCreatedllm1;", "", "Ljava/nio/channels/ByteChannel;", "<init>", "()V", "read", "()Lo/resetCurrentSelectedPosition;", "", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "close", "", "write", "()J", "onPause", "p0", "p1", "p2", "(Lo/resetCurrentSelectedPosition;JJ)Lo/resetCurrentSelectedPosition;", "onPlayFromMediaId", "", "", "equals", "(Ljava/lang/Object;)Z", "MediaBrowserCompatCustomActionResultReceiver", "()Z", "flush", "", "(J)B", "", "hashCode", "()I", "(BJJ)J", "Lo/getRelatedModuleAdapter;", "(Lo/getRelatedModuleAdapter;)J", "(Lo/getRelatedModuleAdapter;J)J", "RemoteActionCompatParcelizer", "Ljava/io/InputStream;", "AudioAttributesImplBaseParcelizer", "()Ljava/io/InputStream;", "isOpen", "AudioAttributesImplApi21Parcelizer", "()Lo/LessonCompletedDialog;", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "", "([BII)I", "(Lo/resetCurrentSelectedPosition;J)J", "Lo/setCompoundDrawablesWithIntrinsicBoundsCompatdefault;", "(Lo/setCompoundDrawablesWithIntrinsicBoundsCompatdefault;)J", "MediaMetadataCompat", "()B", "MediaBrowserCompatSearchResultReceiver", "()[B", "(J)[B", "MediaDescriptionCompat", "()Lo/getRelatedModuleAdapter;", "(J)Lo/getRelatedModuleAdapter;", "RatingCompat", "([B)V", "MediaBrowserCompatMediaItem", "onCustomAction", "onCommand", "", "onAddQueueItem", "()S", "handleMediaPlayPauseIfPendingOnHandler", "Ljava/nio/charset/Charset;", "", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()Ljava/lang/String;", "(J)Ljava/lang/String;", "onFastForward", "onMediaButtonEvent", "(J)Z", "AudioAttributesImplApi26Parcelizer", "(J)V", "Lo/CustomButton;", "(Lo/CustomButton;)I", "onPrepare", "(I)Lo/getRelatedModuleAdapter;", "Lo/CustomTextView;", "()Lo/CustomTextView;", "toString", "Lo/getMarkerPaint;", "(I)Lo/getMarkerPaint;", "([B)Lo/resetCurrentSelectedPosition;", "([BII)Lo/resetCurrentSelectedPosition;", "(Lo/resetCurrentSelectedPosition;J)V", "(Lo/getRelatedModuleAdapter;)Lo/resetCurrentSelectedPosition;", "Lo/setLockedFromSeek;", "(Lo/setLockedFromSeek;)J", "(I)Lo/resetCurrentSelectedPosition;", "(J)Lo/resetCurrentSelectedPosition;", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lo/resetCurrentSelectedPosition;", "p3", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lo/resetCurrentSelectedPosition;", "(Ljava/lang/String;)Lo/resetCurrentSelectedPosition;", "(Ljava/lang/String;II)Lo/resetCurrentSelectedPosition;", "MediaBrowserCompatItemReceiver", TtmlNode.TAG_HEAD, "Lo/getMarkerPaint;", "size", "J", "onPlay"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class resetCurrentSelectedPosition implements LessonCompletedDialog, LessonCompletedDialogonViewCreatedllm1, Cloneable, ByteChannel {
    public getMarkerPaint head;
    private long size;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.LessonCompletedDialogonViewCreatedllm1
    /* JADX INFO: renamed from: onPlayFromMediaId, reason: merged with bridge method [inline-methods] */
    public resetCurrentSelectedPosition MediaBrowserCompatItemReceiver() {
        return this;
    }

    @Override // kotlin.LessonCompletedDialog
    public final resetCurrentSelectedPosition AudioAttributesImplApi26Parcelizer() {
        return this;
    }

    @Override // kotlin.setLockedFromSeek, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // kotlin.LessonCompletedDialogonViewCreatedllm1, kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // kotlin.LessonCompletedDialog
    public final resetCurrentSelectedPosition read() {
        return this;
    }

    /* JADX INFO: renamed from: onPlay, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final void MediaBrowserCompatItemReceiver(long j) {
        this.size = j;
    }

    @Override // kotlin.LessonCompletedDialog
    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.size == 0;
    }

    @Override // kotlin.LessonCompletedDialog
    public final void AudioAttributesImplApi26Parcelizer(long p0) throws EOFException {
        if (this.size < p0) {
            throw new EOFException();
        }
    }

    @Override // kotlin.LessonCompletedDialog
    public final boolean MediaBrowserCompatCustomActionResultReceiver(long p0) {
        return this.size >= p0;
    }

    @Override // kotlin.LessonCompletedDialog
    public final LessonCompletedDialog AudioAttributesImplApi21Parcelizer() {
        return CustomAppBarLayout.AudioAttributesCompatParcelizer(new CustomEditView(this));
    }

    public static final class read extends InputStream {
        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        read() {
        }

        @Override // java.io.InputStream
        public final int read() {
            if (resetCurrentSelectedPosition.this.getSize() > 0) {
                return resetCurrentSelectedPosition.this.MediaMetadataCompat() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            toMagicModuleMetaRepoModel.write(bArr, "");
            return resetCurrentSelectedPosition.this.write(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(resetCurrentSelectedPosition.this.getSize(), 2147483647L);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(resetCurrentSelectedPosition.this);
            sb.append(".inputStream()");
            return sb.toString();
        }
    }

    @Override // kotlin.LessonCompletedDialog
    public final InputStream AudioAttributesImplBaseParcelizer() {
        return new read();
    }

    public final short handleMediaPlayPauseIfPendingOnHandler() throws EOFException {
        return isConciseModeOn.AudioAttributesCompatParcelizer(onAddQueueItem());
    }

    public final int onCommand() throws EOFException {
        return isConciseModeOn.AudioAttributesCompatParcelizer(onCustomAction());
    }

    @Override // kotlin.LessonCompletedDialog
    public final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return RemoteActionCompatParcelizer(this.size, getSubmissionTimestamp.IconCompatParcelizer);
    }

    public final String RemoteActionCompatParcelizer(long p0) throws EOFException {
        return RemoteActionCompatParcelizer(p0, getSubmissionTimestamp.IconCompatParcelizer);
    }

    @Override // kotlin.LessonCompletedDialog
    public final String write(Charset p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return RemoteActionCompatParcelizer(this.size, p0);
    }

    private String RemoteActionCompatParcelizer(long p0, Charset p1) throws EOFException {
        toMagicModuleMetaRepoModel.write(p1, "");
        if (p0 < 0 || p0 > 2147483647L) {
            throw new IllegalArgumentException("byteCount: ".concat(String.valueOf(p0)).toString());
        }
        if (this.size < p0) {
            throw new EOFException();
        }
        if (p0 == 0) {
            return "";
        }
        getMarkerPaint getmarkerpaint = this.head;
        toMagicModuleMetaRepoModel.write(getmarkerpaint);
        if (((long) getmarkerpaint.pos) + p0 > getmarkerpaint.limit) {
            return new String(AudioAttributesCompatParcelizer(p0), p1);
        }
        int i = (int) p0;
        String str = new String(getmarkerpaint.data, getmarkerpaint.pos, i, p1);
        getmarkerpaint.pos += i;
        this.size -= p0;
        if (getmarkerpaint.pos == getmarkerpaint.limit) {
            this.head = getmarkerpaint.AudioAttributesCompatParcelizer();
            setMarkerPaint.RemoteActionCompatParcelizer(getmarkerpaint);
        }
        return str;
    }

    @Override // kotlin.LessonCompletedDialog
    public final String onMediaButtonEvent() throws EOFException {
        return write(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer p0) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        getMarkerPaint getmarkerpaint = this.head;
        if (getmarkerpaint == null) {
            return -1;
        }
        int iMin = Math.min(p0.remaining(), getmarkerpaint.limit - getmarkerpaint.pos);
        p0.put(getmarkerpaint.data, getmarkerpaint.pos, iMin);
        getmarkerpaint.pos += iMin;
        this.size -= (long) iMin;
        if (getmarkerpaint.pos == getmarkerpaint.limit) {
            this.head = getmarkerpaint.AudioAttributesCompatParcelizer();
            setMarkerPaint.RemoteActionCompatParcelizer(getmarkerpaint);
        }
        return iMin;
    }

    @Override // kotlin.LessonCompletedDialogonViewCreatedllm1
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final resetCurrentSelectedPosition read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return AudioAttributesCompatParcelizer(p0, 0, p0.length());
    }

    public final resetCurrentSelectedPosition RemoteActionCompatParcelizer(String p0, Charset p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return write(p0, 0, p0.length(), p1);
    }

    public final resetCurrentSelectedPosition write(String p0, int p1, int p2, Charset p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        if (p1 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(p1)).toString());
        }
        if (p2 < p1) {
            StringBuilder sb = new StringBuilder("endIndex < beginIndex: ");
            sb.append(p2);
            sb.append(" < ");
            sb.append(p1);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (p2 > p0.length()) {
            StringBuilder sb2 = new StringBuilder("endIndex > string.length: ");
            sb2.append(p2);
            sb2.append(" > ");
            sb2.append(p0.length());
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p3, getSubmissionTimestamp.IconCompatParcelizer)) {
            return AudioAttributesCompatParcelizer(p0, p1, p2);
        }
        String strSubstring = p0.substring(p1, p2);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        byte[] bytes = strSubstring.getBytes(p3);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
        return AudioAttributesCompatParcelizer(bytes, 0, bytes.length);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer p0) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        int iRemaining = p0.remaining();
        int i = iRemaining;
        while (i > 0) {
            getMarkerPaint getmarkerpaintIconCompatParcelizer = IconCompatParcelizer(1);
            int iMin = Math.min(i, 8192 - getmarkerpaintIconCompatParcelizer.limit);
            p0.get(getmarkerpaintIconCompatParcelizer.data, getmarkerpaintIconCompatParcelizer.limit, iMin);
            i -= iMin;
            getmarkerpaintIconCompatParcelizer.limit += iMin;
        }
        this.size += (long) iRemaining;
        return iRemaining;
    }

    @Override // kotlin.LessonCompletedDialog
    public final long IconCompatParcelizer(getRelatedModuleAdapter p0) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        return AudioAttributesCompatParcelizer(p0, 0L);
    }

    @Override // kotlin.LessonCompletedDialog
    public final long RemoteActionCompatParcelizer(getRelatedModuleAdapter p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return read(p0, 0L);
    }

    @Override // kotlin.setLockedFromSeek
    public final CustomTextView RemoteActionCompatParcelizer() {
        return CustomTextView.IconCompatParcelizer;
    }

    public final String toString() {
        return onPrepare().toString();
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final resetCurrentSelectedPosition clone() {
        return onPause();
    }

    public final resetCurrentSelectedPosition write(resetCurrentSelectedPosition p0, long p1, long p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        isConciseModeOn.write(getSize(), p1, p2);
        if (p2 != 0) {
            p0.MediaBrowserCompatItemReceiver(p0.getSize() + p2);
            getMarkerPaint getmarkerpaint = this.head;
            while (true) {
                toMagicModuleMetaRepoModel.write(getmarkerpaint);
                if (p1 < getmarkerpaint.limit - getmarkerpaint.pos) {
                    break;
                }
                p1 -= (long) (getmarkerpaint.limit - getmarkerpaint.pos);
                getmarkerpaint = getmarkerpaint.next;
            }
            while (p2 > 0) {
                toMagicModuleMetaRepoModel.write(getmarkerpaint);
                getMarkerPaint getmarkerpaintWrite = getmarkerpaint.write();
                getmarkerpaintWrite.pos += (int) p1;
                getmarkerpaintWrite.limit = Math.min(getmarkerpaintWrite.pos + ((int) p2), getmarkerpaintWrite.limit);
                getMarkerPaint getmarkerpaint2 = p0.head;
                if (getmarkerpaint2 == null) {
                    getmarkerpaintWrite.prev = getmarkerpaintWrite;
                    getmarkerpaintWrite.next = getmarkerpaintWrite.prev;
                    p0.head = getmarkerpaintWrite.next;
                } else {
                    toMagicModuleMetaRepoModel.write(getmarkerpaint2);
                    getMarkerPaint getmarkerpaint3 = getmarkerpaint2.prev;
                    toMagicModuleMetaRepoModel.write(getmarkerpaint3);
                    getmarkerpaint3.read(getmarkerpaintWrite);
                }
                p2 -= (long) (getmarkerpaintWrite.limit - getmarkerpaintWrite.pos);
                getmarkerpaint = getmarkerpaint.next;
                p1 = 0;
            }
        }
        return this;
    }

    public final long write() {
        long size = getSize();
        if (size == 0) {
            return 0L;
        }
        getMarkerPaint getmarkerpaint = this.head;
        toMagicModuleMetaRepoModel.write(getmarkerpaint);
        getMarkerPaint getmarkerpaint2 = getmarkerpaint.prev;
        toMagicModuleMetaRepoModel.write(getmarkerpaint2);
        return (getmarkerpaint2.limit >= 8192 || !getmarkerpaint2.owner) ? size : size - ((long) (getmarkerpaint2.limit - getmarkerpaint2.pos));
    }

    @Override // kotlin.LessonCompletedDialog
    public final byte MediaMetadataCompat() throws EOFException {
        if (getSize() == 0) {
            throw new EOFException();
        }
        getMarkerPaint getmarkerpaint = this.head;
        toMagicModuleMetaRepoModel.write(getmarkerpaint);
        int i = getmarkerpaint.pos;
        int i2 = getmarkerpaint.limit;
        int i3 = i + 1;
        byte b = getmarkerpaint.data[i];
        MediaBrowserCompatItemReceiver(getSize() - 1);
        if (i3 == i2) {
            this.head = getmarkerpaint.AudioAttributesCompatParcelizer();
            setMarkerPaint.RemoteActionCompatParcelizer(getmarkerpaint);
            return b;
        }
        getmarkerpaint.pos = i3;
        return b;
    }

    public final byte IconCompatParcelizer(long p0) {
        isConciseModeOn.write(getSize(), p0, 1L);
        getMarkerPaint getmarkerpaint = this.head;
        if (getmarkerpaint == null) {
            getMarkerPaint getmarkerpaint2 = null;
            toMagicModuleMetaRepoModel.write((Object) null);
            byte[] bArr = getmarkerpaint2.data;
            throw null;
        }
        if (getSize() - p0 < p0) {
            long size = getSize();
            while (size > p0) {
                getmarkerpaint = getmarkerpaint.prev;
                toMagicModuleMetaRepoModel.write(getmarkerpaint);
                size -= (long) (getmarkerpaint.limit - getmarkerpaint.pos);
            }
            toMagicModuleMetaRepoModel.write(getmarkerpaint);
            return getmarkerpaint.data[(int) ((((long) getmarkerpaint.pos) + p0) - size)];
        }
        long j = 0;
        while (true) {
            long j2 = ((long) (getmarkerpaint.limit - getmarkerpaint.pos)) + j;
            if (j2 > p0) {
                toMagicModuleMetaRepoModel.write(getmarkerpaint);
                return getmarkerpaint.data[(int) ((((long) getmarkerpaint.pos) + p0) - j)];
            }
            getmarkerpaint = getmarkerpaint.next;
            toMagicModuleMetaRepoModel.write(getmarkerpaint);
            j = j2;
        }
    }

    @Override // kotlin.LessonCompletedDialog
    public final short onAddQueueItem() throws EOFException {
        int iMediaMetadataCompat;
        int i;
        if (getSize() < 2) {
            throw new EOFException();
        }
        getMarkerPaint getmarkerpaint = this.head;
        toMagicModuleMetaRepoModel.write(getmarkerpaint);
        int i2 = getmarkerpaint.pos;
        int i3 = getmarkerpaint.limit;
        if (i3 - i2 < 2) {
            byte bMediaMetadataCompat = MediaMetadataCompat();
            iMediaMetadataCompat = MediaMetadataCompat() & 255;
            i = bMediaMetadataCompat & 255;
        } else {
            byte[] bArr = getmarkerpaint.data;
            byte b = bArr[i2];
            int i4 = i2 + 2;
            byte b2 = bArr[i2 + 1];
            MediaBrowserCompatItemReceiver(getSize() - 2);
            if (i4 == i3) {
                this.head = getmarkerpaint.AudioAttributesCompatParcelizer();
                setMarkerPaint.RemoteActionCompatParcelizer(getmarkerpaint);
            } else {
                getmarkerpaint.pos = i4;
            }
            iMediaMetadataCompat = b2 & 255;
            i = b & 255;
        }
        return (short) (iMediaMetadataCompat | (i << 8));
    }

    @Override // kotlin.LessonCompletedDialog
    public final int onCustomAction() throws EOFException {
        if (getSize() < 4) {
            throw new EOFException();
        }
        getMarkerPaint getmarkerpaint = this.head;
        toMagicModuleMetaRepoModel.write(getmarkerpaint);
        int i = getmarkerpaint.pos;
        int i2 = getmarkerpaint.limit;
        if (i2 - i < 4) {
            return (MediaMetadataCompat() & 255) | ((MediaMetadataCompat() & 255) << 24) | ((MediaMetadataCompat() & 255) << 16) | ((MediaMetadataCompat() & 255) << 8);
        }
        byte[] bArr = getmarkerpaint.data;
        int i3 = i + 4;
        int i4 = (bArr[i + 3] & 255) | ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        MediaBrowserCompatItemReceiver(getSize() - 4);
        if (i3 == i2) {
            this.head = getmarkerpaint.AudioAttributesCompatParcelizer();
            setMarkerPaint.RemoteActionCompatParcelizer(getmarkerpaint);
            return i4;
        }
        getmarkerpaint.pos = i3;
        return i4;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class IconCompatParcelizer implements Closeable {
        private resetCurrentSelectedPosition RemoteActionCompatParcelizer;
        private long read = -1;
        private int AudioAttributesCompatParcelizer = -1;
        private int IconCompatParcelizer = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
    }

    @Override // kotlin.LessonCompletedDialog
    public final long RatingCompat() throws EOFException {
        if (getSize() == 0) {
            throw new EOFException();
        }
        boolean z = false;
        int i = 0;
        long j = 0;
        long j2 = -7;
        boolean z2 = false;
        do {
            getMarkerPaint getmarkerpaint = this.head;
            toMagicModuleMetaRepoModel.write(getmarkerpaint);
            byte[] bArr = getmarkerpaint.data;
            int i2 = getmarkerpaint.pos;
            int i3 = getmarkerpaint.limit;
            while (i2 < i3) {
                byte b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j < -922337203685477580L || (j == -922337203685477580L && i4 < j2)) {
                        resetCurrentSelectedPosition resetcurrentselectedposition = new resetCurrentSelectedPosition().MediaBrowserCompatMediaItem(j).read((int) b);
                        if (!z2) {
                            resetcurrentselectedposition.MediaMetadataCompat();
                        }
                        StringBuilder sb = new StringBuilder("Number too large: ");
                        sb.append(resetcurrentselectedposition.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
                        throw new NumberFormatException(sb.toString());
                    }
                    j = (j * 10) + ((long) i4);
                } else {
                    if (b != 45 || i != 0) {
                        z = true;
                        break;
                    }
                    j2--;
                    z2 = true;
                }
                i2++;
                i++;
            }
            if (i2 == i3) {
                this.head = getmarkerpaint.AudioAttributesCompatParcelizer();
                setMarkerPaint.RemoteActionCompatParcelizer(getmarkerpaint);
            } else {
                getmarkerpaint.pos = i2;
            }
            if (z) {
                break;
            }
        } while (this.head != null);
        MediaBrowserCompatItemReceiver(getSize() - ((long) i));
        if (i >= (z2 ? 2 : 1)) {
            return z2 ? j : -j;
        }
        if (getSize() == 0) {
            throw new EOFException();
        }
        String str = z2 ? "Expected a digit" : "Expected a digit or '-'";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" but was 0x");
        sb2.append(isConciseModeOn.AudioAttributesCompatParcelizer(IconCompatParcelizer(0L)));
        throw new NumberFormatException(sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1 A[EDGE_INSN: B:43:0x00a1->B:37:0x00a1 BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // kotlin.LessonCompletedDialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long MediaBrowserCompatMediaItem() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.getSize()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lab
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            o.getMarkerPaint r6 = r14.head
            kotlin.toMagicModuleMetaRepoModel.write(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L18:
            if (r8 >= r9) goto L8d
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L71
            r11 = 70
            if (r10 > r11) goto L71
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            o.resetCurrentSelectedPosition r14 = new o.resetCurrentSelectedPosition
            r14.<init>()
            o.resetCurrentSelectedPosition r14 = r14.MediaDescriptionCompat(r4)
            o.resetCurrentSelectedPosition r14 = r14.read(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Number too large: "
            r1.<init>(r2)
            java.lang.String r14 = r14.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L71:
            if (r0 == 0) goto L75
            r1 = 1
            goto L8d
        L75:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was 0x"
            r14.<init>(r0)
            java.lang.String r0 = kotlin.isConciseModeOn.AudioAttributesCompatParcelizer(r10)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r14)
            throw r0
        L8d:
            if (r8 != r9) goto L99
            o.getMarkerPaint r7 = r6.AudioAttributesCompatParcelizer()
            r14.head = r7
            kotlin.setMarkerPaint.RemoteActionCompatParcelizer(r6)
            goto L9b
        L99:
            r6.pos = r8
        L9b:
            if (r1 != 0) goto La1
            o.getMarkerPaint r6 = r14.head
            if (r6 != 0) goto Ld
        La1:
            long r1 = r14.getSize()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.MediaBrowserCompatItemReceiver(r1)
            return r4
        Lab:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.resetCurrentSelectedPosition.MediaBrowserCompatMediaItem():long");
    }

    public final getRelatedModuleAdapter MediaDescriptionCompat() {
        return read(getSize());
    }

    @Override // kotlin.LessonCompletedDialog
    public final getRelatedModuleAdapter read(long p0) throws EOFException {
        if (p0 < 0 || p0 > 2147483647L) {
            throw new IllegalArgumentException("byteCount: ".concat(String.valueOf(p0)).toString());
        }
        if (getSize() < p0) {
            throw new EOFException();
        }
        if (p0 >= 4096) {
            getRelatedModuleAdapter getrelatedmoduleadapterAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer((int) p0);
            AudioAttributesImplBaseParcelizer(p0);
            return getrelatedmoduleadapterAudioAttributesImplApi21Parcelizer;
        }
        return new getRelatedModuleAdapter(AudioAttributesCompatParcelizer(p0));
    }

    @Override // kotlin.LessonCompletedDialog
    public final int RemoteActionCompatParcelizer(Options p0) throws EOFException {
        toMagicModuleMetaRepoModel.write(p0, "");
        int iWrite = setStatuses.write(this, p0, false);
        if (iWrite == -1) {
            return -1;
        }
        AudioAttributesImplBaseParcelizer(p0.getRead()[iWrite].MediaBrowserCompatCustomActionResultReceiver());
        return iWrite;
    }

    @Override // kotlin.LessonCompletedDialog
    public final long write(setCompoundDrawablesWithIntrinsicBoundsCompatdefault p0) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        long size = getSize();
        if (size > 0) {
            p0.IconCompatParcelizer(this, size);
        }
        return size;
    }

    @Override // kotlin.LessonCompletedDialog
    public final String write(long p0) throws EOFException {
        if (p0 < 0) {
            throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(p0)).toString());
        }
        long j = p0 != Long.MAX_VALUE ? p0 + 1 : Long.MAX_VALUE;
        long jWrite = write((byte) 10, 0L, j);
        if (jWrite != -1) {
            return setStatuses.RemoteActionCompatParcelizer(this, jWrite);
        }
        if (j < getSize() && IconCompatParcelizer(j - 1) == 13 && IconCompatParcelizer(j) == 10) {
            return setStatuses.RemoteActionCompatParcelizer(this, j);
        }
        resetCurrentSelectedPosition resetcurrentselectedposition = new resetCurrentSelectedPosition();
        write(resetcurrentselectedposition, 0L, Math.min(32L, getSize()));
        StringBuilder sb = new StringBuilder("\\n not found: limit=");
        sb.append(Math.min(getSize(), p0));
        sb.append(" content=");
        sb.append(resetcurrentselectedposition.MediaDescriptionCompat().RemoteActionCompatParcelizer());
        sb.append((char) 8230);
        throw new EOFException(sb.toString());
    }

    public final int onFastForward() throws EOFException {
        int i;
        int i2;
        int i3;
        if (getSize() == 0) {
            throw new EOFException();
        }
        byte bIconCompatParcelizer = IconCompatParcelizer(0L);
        if ((bIconCompatParcelizer & 128) == 0) {
            i = bIconCompatParcelizer & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bIconCompatParcelizer & 224) == 192) {
            i = bIconCompatParcelizer & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bIconCompatParcelizer & 240) == 224) {
            i = bIconCompatParcelizer & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bIconCompatParcelizer & 248) != 240) {
                AudioAttributesImplBaseParcelizer(1L);
                return 65533;
            }
            i = bIconCompatParcelizer & 7;
            i2 = 4;
            i3 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        long j = i2;
        if (getSize() < j) {
            StringBuilder sb = new StringBuilder("size < ");
            sb.append(i2);
            sb.append(": ");
            sb.append(getSize());
            sb.append(" (to read code point prefixed 0x");
            sb.append(isConciseModeOn.AudioAttributesCompatParcelizer(bIconCompatParcelizer));
            sb.append(')');
            throw new EOFException(sb.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bIconCompatParcelizer2 = IconCompatParcelizer(j2);
            if ((bIconCompatParcelizer2 & 192) != 128) {
                AudioAttributesImplBaseParcelizer(j2);
                return 65533;
            }
            i = (i << 6) | (bIconCompatParcelizer2 & 63);
        }
        AudioAttributesImplBaseParcelizer(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    @Override // kotlin.LessonCompletedDialog
    public final byte[] MediaBrowserCompatSearchResultReceiver() {
        return AudioAttributesCompatParcelizer(getSize());
    }

    @Override // kotlin.LessonCompletedDialog
    public final byte[] AudioAttributesCompatParcelizer(long p0) throws EOFException {
        if (p0 < 0 || p0 > 2147483647L) {
            throw new IllegalArgumentException("byteCount: ".concat(String.valueOf(p0)).toString());
        }
        if (getSize() < p0) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) p0];
        IconCompatParcelizer(bArr);
        return bArr;
    }

    private void IconCompatParcelizer(byte[] p0) throws EOFException {
        toMagicModuleMetaRepoModel.write(p0, "");
        int i = 0;
        while (i < p0.length) {
            int iWrite = write(p0, i, p0.length - i);
            if (iWrite == -1) {
                throw new EOFException();
            }
            i += iWrite;
        }
    }

    public final int write(byte[] p0, int p1, int p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        isConciseModeOn.write(p0.length, p1, p2);
        getMarkerPaint getmarkerpaint = this.head;
        if (getmarkerpaint == null) {
            return -1;
        }
        int iMin = Math.min(p2, getmarkerpaint.limit - getmarkerpaint.pos);
        getOrderDetails.read(getmarkerpaint.data, p0, p1, getmarkerpaint.pos, getmarkerpaint.pos + iMin);
        getmarkerpaint.pos += iMin;
        MediaBrowserCompatItemReceiver(getSize() - ((long) iMin));
        if (getmarkerpaint.pos == getmarkerpaint.limit) {
            this.head = getmarkerpaint.AudioAttributesCompatParcelizer();
            setMarkerPaint.RemoteActionCompatParcelizer(getmarkerpaint);
        }
        return iMin;
    }

    public final void IconCompatParcelizer() throws EOFException {
        AudioAttributesImplBaseParcelizer(getSize());
    }

    @Override // kotlin.LessonCompletedDialog
    public final void AudioAttributesImplBaseParcelizer(long p0) throws EOFException {
        while (p0 > 0) {
            getMarkerPaint getmarkerpaint = this.head;
            if (getmarkerpaint == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(p0, getmarkerpaint.limit - getmarkerpaint.pos);
            long j = iMin;
            MediaBrowserCompatItemReceiver(getSize() - j);
            p0 -= j;
            getmarkerpaint.pos += iMin;
            if (getmarkerpaint.pos == getmarkerpaint.limit) {
                this.head = getmarkerpaint.AudioAttributesCompatParcelizer();
                setMarkerPaint.RemoteActionCompatParcelizer(getmarkerpaint);
            }
        }
    }

    @Override // kotlin.LessonCompletedDialogonViewCreatedllm1
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final resetCurrentSelectedPosition AudioAttributesCompatParcelizer(getRelatedModuleAdapter p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.AudioAttributesCompatParcelizer(this, 0, p0.MediaBrowserCompatCustomActionResultReceiver());
        return this;
    }

    @Override // kotlin.LessonCompletedDialogonViewCreatedllm1
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final resetCurrentSelectedPosition AudioAttributesCompatParcelizer(String p0, int p1, int p2) {
        char cCharAt;
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p1 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(p1)).toString());
        }
        if (p2 < p1) {
            StringBuilder sb = new StringBuilder("endIndex < beginIndex: ");
            sb.append(p2);
            sb.append(" < ");
            sb.append(p1);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (p2 > p0.length()) {
            StringBuilder sb2 = new StringBuilder("endIndex > string.length: ");
            sb2.append(p2);
            sb2.append(" > ");
            sb2.append(p0.length());
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        while (p1 < p2) {
            char cCharAt2 = p0.charAt(p1);
            if (cCharAt2 < 128) {
                getMarkerPaint getmarkerpaintIconCompatParcelizer = IconCompatParcelizer(1);
                byte[] bArr = getmarkerpaintIconCompatParcelizer.data;
                int i = getmarkerpaintIconCompatParcelizer.limit - p1;
                int iMin = Math.min(p2, 8192 - i);
                int i2 = p1 + 1;
                bArr[p1 + i] = (byte) cCharAt2;
                while (true) {
                    p1 = i2;
                    if (p1 >= iMin || (cCharAt = p0.charAt(p1)) >= 128) {
                        break;
                    }
                    i2 = p1 + 1;
                    bArr[p1 + i] = (byte) cCharAt;
                }
                int i3 = (i + p1) - getmarkerpaintIconCompatParcelizer.limit;
                getmarkerpaintIconCompatParcelizer.limit += i3;
                MediaBrowserCompatItemReceiver(getSize() + ((long) i3));
            } else {
                if (cCharAt2 < 2048) {
                    getMarkerPaint getmarkerpaintIconCompatParcelizer2 = IconCompatParcelizer(2);
                    getmarkerpaintIconCompatParcelizer2.data[getmarkerpaintIconCompatParcelizer2.limit] = (byte) ((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                    getmarkerpaintIconCompatParcelizer2.data[getmarkerpaintIconCompatParcelizer2.limit + 1] = (byte) ((cCharAt2 & '?') | 128);
                    getmarkerpaintIconCompatParcelizer2.limit += 2;
                    MediaBrowserCompatItemReceiver(getSize() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    getMarkerPaint getmarkerpaintIconCompatParcelizer3 = IconCompatParcelizer(3);
                    getmarkerpaintIconCompatParcelizer3.data[getmarkerpaintIconCompatParcelizer3.limit] = (byte) ((cCharAt2 >> '\f') | 224);
                    getmarkerpaintIconCompatParcelizer3.data[getmarkerpaintIconCompatParcelizer3.limit + 1] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                    getmarkerpaintIconCompatParcelizer3.data[getmarkerpaintIconCompatParcelizer3.limit + 2] = (byte) ((cCharAt2 & '?') | 128);
                    getmarkerpaintIconCompatParcelizer3.limit += 3;
                    MediaBrowserCompatItemReceiver(getSize() + 3);
                } else {
                    int i4 = p1 + 1;
                    char cCharAt3 = i4 < p2 ? p0.charAt(i4) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        read(63);
                        p1 = i4;
                    } else {
                        int i5 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        getMarkerPaint getmarkerpaintIconCompatParcelizer4 = IconCompatParcelizer(4);
                        getmarkerpaintIconCompatParcelizer4.data[getmarkerpaintIconCompatParcelizer4.limit] = (byte) ((i5 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                        getmarkerpaintIconCompatParcelizer4.data[getmarkerpaintIconCompatParcelizer4.limit + 1] = (byte) (((i5 >> 12) & 63) | 128);
                        getmarkerpaintIconCompatParcelizer4.data[getmarkerpaintIconCompatParcelizer4.limit + 2] = (byte) (((i5 >> 6) & 63) | 128);
                        getmarkerpaintIconCompatParcelizer4.data[getmarkerpaintIconCompatParcelizer4.limit + 3] = (byte) ((i5 & 63) | 128);
                        getmarkerpaintIconCompatParcelizer4.limit += 4;
                        MediaBrowserCompatItemReceiver(getSize() + 4);
                        p1 += 2;
                    }
                }
                p1++;
            }
        }
        return this;
    }

    public final resetCurrentSelectedPosition MediaBrowserCompatItemReceiver(int p0) {
        if (p0 < 128) {
            read(p0);
            return this;
        }
        if (p0 < 2048) {
            getMarkerPaint getmarkerpaintIconCompatParcelizer = IconCompatParcelizer(2);
            getmarkerpaintIconCompatParcelizer.data[getmarkerpaintIconCompatParcelizer.limit] = (byte) ((p0 >> 6) | PsExtractor.AUDIO_STREAM);
            getmarkerpaintIconCompatParcelizer.data[getmarkerpaintIconCompatParcelizer.limit + 1] = (byte) ((p0 & 63) | 128);
            getmarkerpaintIconCompatParcelizer.limit += 2;
            MediaBrowserCompatItemReceiver(getSize() + 2);
            return this;
        }
        if (55296 <= p0 && p0 < 57344) {
            read(63);
            return this;
        }
        if (p0 < 65536) {
            getMarkerPaint getmarkerpaintIconCompatParcelizer2 = IconCompatParcelizer(3);
            getmarkerpaintIconCompatParcelizer2.data[getmarkerpaintIconCompatParcelizer2.limit] = (byte) ((p0 >> 12) | 224);
            getmarkerpaintIconCompatParcelizer2.data[getmarkerpaintIconCompatParcelizer2.limit + 1] = (byte) (((p0 >> 6) & 63) | 128);
            getmarkerpaintIconCompatParcelizer2.data[getmarkerpaintIconCompatParcelizer2.limit + 2] = (byte) ((p0 & 63) | 128);
            getmarkerpaintIconCompatParcelizer2.limit += 3;
            MediaBrowserCompatItemReceiver(getSize() + 3);
            return this;
        }
        if (p0 <= 1114111) {
            getMarkerPaint getmarkerpaintIconCompatParcelizer3 = IconCompatParcelizer(4);
            getmarkerpaintIconCompatParcelizer3.data[getmarkerpaintIconCompatParcelizer3.limit] = (byte) ((p0 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            getmarkerpaintIconCompatParcelizer3.data[getmarkerpaintIconCompatParcelizer3.limit + 1] = (byte) (((p0 >> 12) & 63) | 128);
            getmarkerpaintIconCompatParcelizer3.data[getmarkerpaintIconCompatParcelizer3.limit + 2] = (byte) (((p0 >> 6) & 63) | 128);
            getmarkerpaintIconCompatParcelizer3.data[getmarkerpaintIconCompatParcelizer3.limit + 3] = (byte) ((p0 & 63) | 128);
            getmarkerpaintIconCompatParcelizer3.limit += 4;
            MediaBrowserCompatItemReceiver(getSize() + 4);
            return this;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        sb.append(isConciseModeOn.write(p0));
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // kotlin.LessonCompletedDialogonViewCreatedllm1
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final resetCurrentSelectedPosition RemoteActionCompatParcelizer(byte[] p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return AudioAttributesCompatParcelizer(p0, 0, p0.length);
    }

    @Override // kotlin.LessonCompletedDialogonViewCreatedllm1
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final resetCurrentSelectedPosition AudioAttributesCompatParcelizer(byte[] p0, int p1, int p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        long j = p2;
        isConciseModeOn.write(p0.length, p1, j);
        int i = p2 + p1;
        while (p1 < i) {
            getMarkerPaint getmarkerpaintIconCompatParcelizer = IconCompatParcelizer(1);
            int iMin = Math.min(i - p1, 8192 - getmarkerpaintIconCompatParcelizer.limit);
            int i2 = p1 + iMin;
            getOrderDetails.read(p0, getmarkerpaintIconCompatParcelizer.data, getmarkerpaintIconCompatParcelizer.limit, p1, i2);
            getmarkerpaintIconCompatParcelizer.limit += iMin;
            p1 = i2;
        }
        MediaBrowserCompatItemReceiver(getSize() + j);
        return this;
    }

    @Override // kotlin.LessonCompletedDialogonViewCreatedllm1
    public final long write(setLockedFromSeek p0) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        long j = 0;
        while (true) {
            long jAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer(this, 8192L);
            if (jAudioAttributesCompatParcelizer == -1) {
                return j;
            }
            j += jAudioAttributesCompatParcelizer;
        }
    }

    @Override // kotlin.LessonCompletedDialogonViewCreatedllm1
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final resetCurrentSelectedPosition read(int p0) {
        getMarkerPaint getmarkerpaintIconCompatParcelizer = IconCompatParcelizer(1);
        byte[] bArr = getmarkerpaintIconCompatParcelizer.data;
        int i = getmarkerpaintIconCompatParcelizer.limit;
        getmarkerpaintIconCompatParcelizer.limit = i + 1;
        bArr[i] = (byte) p0;
        MediaBrowserCompatItemReceiver(getSize() + 1);
        return this;
    }

    @Override // kotlin.LessonCompletedDialogonViewCreatedllm1
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] */
    public final resetCurrentSelectedPosition AudioAttributesImplApi26Parcelizer(int p0) {
        getMarkerPaint getmarkerpaintIconCompatParcelizer = IconCompatParcelizer(2);
        byte[] bArr = getmarkerpaintIconCompatParcelizer.data;
        int i = getmarkerpaintIconCompatParcelizer.limit;
        bArr[i] = (byte) (p0 >>> 8);
        bArr[i + 1] = (byte) p0;
        getmarkerpaintIconCompatParcelizer.limit = i + 2;
        MediaBrowserCompatItemReceiver(getSize() + 2);
        return this;
    }

    @Override // kotlin.LessonCompletedDialogonViewCreatedllm1
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final resetCurrentSelectedPosition write(int p0) {
        getMarkerPaint getmarkerpaintIconCompatParcelizer = IconCompatParcelizer(4);
        byte[] bArr = getmarkerpaintIconCompatParcelizer.data;
        int i = getmarkerpaintIconCompatParcelizer.limit;
        bArr[i] = (byte) (p0 >>> 24);
        bArr[i + 1] = (byte) (p0 >>> 16);
        bArr[i + 2] = (byte) (p0 >>> 8);
        bArr[i + 3] = (byte) p0;
        getmarkerpaintIconCompatParcelizer.limit = i + 4;
        MediaBrowserCompatItemReceiver(getSize() + 4);
        return this;
    }

    @Override // kotlin.LessonCompletedDialogonViewCreatedllm1
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
    public final resetCurrentSelectedPosition MediaBrowserCompatMediaItem(long p0) {
        boolean z;
        if (p0 == 0) {
            return read(48);
        }
        if (p0 < 0) {
            p0 = -p0;
            if (p0 < 0) {
                return read("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        int i = p0 < 100000000 ? p0 < 10000 ? p0 < 100 ? p0 >= 10 ? 2 : 1 : p0 < 1000 ? 3 : 4 : p0 < 1000000 ? p0 < 100000 ? 5 : 6 : p0 < 10000000 ? 7 : 8 : p0 < MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US ? p0 < VideoAnalyticModule.IDLE_CONNECTION_HEALTHY_NS ? p0 < C.NANOS_PER_SECOND ? 9 : 10 : p0 < 100000000000L ? 11 : 12 : p0 < 1000000000000000L ? p0 < 10000000000000L ? 13 : p0 < 100000000000000L ? 14 : 15 : p0 < 100000000000000000L ? p0 < 10000000000000000L ? 16 : 17 : p0 < 1000000000000000000L ? 18 : 19;
        if (z) {
            i++;
        }
        getMarkerPaint getmarkerpaintIconCompatParcelizer = IconCompatParcelizer(i);
        byte[] bArr = getmarkerpaintIconCompatParcelizer.data;
        int i2 = getmarkerpaintIconCompatParcelizer.limit + i;
        while (p0 != 0) {
            i2--;
            bArr[i2] = setStatuses.AudioAttributesCompatParcelizer()[(int) (p0 % 10)];
            p0 /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        getmarkerpaintIconCompatParcelizer.limit += i;
        MediaBrowserCompatItemReceiver(getSize() + ((long) i));
        return this;
    }

    @Override // kotlin.LessonCompletedDialogonViewCreatedllm1
    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: merged with bridge method [inline-methods] */
    public final resetCurrentSelectedPosition MediaDescriptionCompat(long p0) {
        if (p0 == 0) {
            return read(48);
        }
        long j = (p0 >>> 1) | p0;
        long j2 = j | (j >>> 2);
        long j3 = j2 | (j2 >>> 4);
        long j4 = j3 | (j3 >>> 8);
        long j5 = j4 | (j4 >>> 16);
        long j6 = j5 | (j5 >>> 32);
        long j7 = j6 - ((j6 >>> 1) & 6148914691236517205L);
        long j8 = ((j7 >>> 2) & 3689348814741910323L) + (j7 & 3689348814741910323L);
        long j9 = ((j8 >>> 4) + j8) & 1085102592571150095L;
        long j10 = j9 + (j9 >>> 8);
        long j11 = j10 + (j10 >>> 16);
        int i = (int) ((((j11 & 63) + ((j11 >>> 32) & 63)) + 3) / 4);
        getMarkerPaint getmarkerpaintIconCompatParcelizer = IconCompatParcelizer(i);
        byte[] bArr = getmarkerpaintIconCompatParcelizer.data;
        int i2 = getmarkerpaintIconCompatParcelizer.limit;
        for (int i3 = (getmarkerpaintIconCompatParcelizer.limit + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = setStatuses.AudioAttributesCompatParcelizer()[(int) (15 & p0)];
            p0 >>>= 4;
        }
        getmarkerpaintIconCompatParcelizer.limit += i;
        MediaBrowserCompatItemReceiver(getSize() + ((long) i));
        return this;
    }

    public final getMarkerPaint IconCompatParcelizer(int p0) {
        if (p0 <= 0 || p0 > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        getMarkerPaint getmarkerpaint = this.head;
        if (getmarkerpaint == null) {
            getMarkerPaint getmarkerpaintAudioAttributesCompatParcelizer = setMarkerPaint.AudioAttributesCompatParcelizer();
            this.head = getmarkerpaintAudioAttributesCompatParcelizer;
            getmarkerpaintAudioAttributesCompatParcelizer.prev = getmarkerpaintAudioAttributesCompatParcelizer;
            getmarkerpaintAudioAttributesCompatParcelizer.next = getmarkerpaintAudioAttributesCompatParcelizer;
            return getmarkerpaintAudioAttributesCompatParcelizer;
        }
        toMagicModuleMetaRepoModel.write(getmarkerpaint);
        getMarkerPaint getmarkerpaint2 = getmarkerpaint.prev;
        toMagicModuleMetaRepoModel.write(getmarkerpaint2);
        return (getmarkerpaint2.limit + p0 > 8192 || !getmarkerpaint2.owner) ? getmarkerpaint2.read(setMarkerPaint.AudioAttributesCompatParcelizer()) : getmarkerpaint2;
    }

    @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault
    public final void IconCompatParcelizer(resetCurrentSelectedPosition p0, long p1) {
        getMarkerPaint getmarkerpaint;
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 == this) {
            throw new IllegalArgumentException("source == this".toString());
        }
        isConciseModeOn.write(p0.getSize(), 0L, p1);
        while (p1 > 0) {
            getMarkerPaint getmarkerpaint2 = p0.head;
            toMagicModuleMetaRepoModel.write(getmarkerpaint2);
            int i = getmarkerpaint2.limit;
            toMagicModuleMetaRepoModel.write(p0.head);
            if (p1 < i - r1.pos) {
                getMarkerPaint getmarkerpaint3 = this.head;
                if (getmarkerpaint3 != null) {
                    toMagicModuleMetaRepoModel.write(getmarkerpaint3);
                    getmarkerpaint = getmarkerpaint3.prev;
                } else {
                    getmarkerpaint = null;
                }
                if (getmarkerpaint != null && getmarkerpaint.owner) {
                    if ((((long) getmarkerpaint.limit) + p1) - ((long) (getmarkerpaint.shared ? 0 : getmarkerpaint.pos)) <= 8192) {
                        getMarkerPaint getmarkerpaint4 = p0.head;
                        toMagicModuleMetaRepoModel.write(getmarkerpaint4);
                        getmarkerpaint4.write(getmarkerpaint, (int) p1);
                        p0.MediaBrowserCompatItemReceiver(p0.getSize() - p1);
                        MediaBrowserCompatItemReceiver(getSize() + p1);
                        return;
                    }
                }
                getMarkerPaint getmarkerpaint5 = p0.head;
                toMagicModuleMetaRepoModel.write(getmarkerpaint5);
                p0.head = getmarkerpaint5.IconCompatParcelizer((int) p1);
            }
            getMarkerPaint getmarkerpaint6 = p0.head;
            toMagicModuleMetaRepoModel.write(getmarkerpaint6);
            long j = getmarkerpaint6.limit - getmarkerpaint6.pos;
            p0.head = getmarkerpaint6.AudioAttributesCompatParcelizer();
            getMarkerPaint getmarkerpaint7 = this.head;
            if (getmarkerpaint7 == null) {
                this.head = getmarkerpaint6;
                getmarkerpaint6.prev = getmarkerpaint6;
                getmarkerpaint6.next = getmarkerpaint6.prev;
            } else {
                toMagicModuleMetaRepoModel.write(getmarkerpaint7);
                getMarkerPaint getmarkerpaint8 = getmarkerpaint7.prev;
                toMagicModuleMetaRepoModel.write(getmarkerpaint8);
                getmarkerpaint8.read(getmarkerpaint6).read();
            }
            p0.MediaBrowserCompatItemReceiver(p0.getSize() - j);
            MediaBrowserCompatItemReceiver(getSize() + j);
            p1 -= j;
        }
    }

    @Override // kotlin.setLockedFromSeek
    public final long AudioAttributesCompatParcelizer(resetCurrentSelectedPosition p0, long p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p1 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(p1)).toString());
        }
        if (getSize() == 0) {
            return -1L;
        }
        if (p1 > getSize()) {
            p1 = getSize();
        }
        p0.IconCompatParcelizer(this, p1);
        return p1;
    }

    public final long write(byte p0, long p1, long p2) {
        getMarkerPaint getmarkerpaint;
        int i;
        long size = 0;
        if (0 > p1 || p1 > p2) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(getSize());
            sb.append(" fromIndex=");
            sb.append(p1);
            sb.append(" toIndex=");
            sb.append(p2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (p2 > getSize()) {
            p2 = getSize();
        }
        if (p1 == p2 || (getmarkerpaint = this.head) == null) {
            return -1L;
        }
        if (getSize() - p1 < p1) {
            size = getSize();
            while (size > p1) {
                getmarkerpaint = getmarkerpaint.prev;
                toMagicModuleMetaRepoModel.write(getmarkerpaint);
                size -= (long) (getmarkerpaint.limit - getmarkerpaint.pos);
            }
            if (getmarkerpaint == null) {
                return -1L;
            }
            while (size < p2) {
                byte[] bArr = getmarkerpaint.data;
                int iMin = (int) Math.min(getmarkerpaint.limit, (((long) getmarkerpaint.pos) + p2) - size);
                i = (int) ((((long) getmarkerpaint.pos) + p1) - size);
                while (i < iMin) {
                    if (bArr[i] != p0) {
                        i++;
                    }
                }
                size += (long) (getmarkerpaint.limit - getmarkerpaint.pos);
                getmarkerpaint = getmarkerpaint.next;
                toMagicModuleMetaRepoModel.write(getmarkerpaint);
                p1 = size;
            }
            return -1L;
        }
        while (true) {
            long j = ((long) (getmarkerpaint.limit - getmarkerpaint.pos)) + size;
            if (j > p1) {
                break;
            }
            getmarkerpaint = getmarkerpaint.next;
            toMagicModuleMetaRepoModel.write(getmarkerpaint);
            size = j;
        }
        if (getmarkerpaint == null) {
            return -1L;
        }
        while (size < p2) {
            byte[] bArr2 = getmarkerpaint.data;
            int iMin2 = (int) Math.min(getmarkerpaint.limit, (((long) getmarkerpaint.pos) + p2) - size);
            i = (int) ((((long) getmarkerpaint.pos) + p1) - size);
            while (i < iMin2) {
                if (bArr2[i] != p0) {
                    i++;
                }
            }
            size += (long) (getmarkerpaint.limit - getmarkerpaint.pos);
            getmarkerpaint = getmarkerpaint.next;
            toMagicModuleMetaRepoModel.write(getmarkerpaint);
            p1 = size;
        }
        return -1L;
        return ((long) (i - getmarkerpaint.pos)) + size;
    }

    public final long AudioAttributesCompatParcelizer(getRelatedModuleAdapter p0, long p1) throws IOException {
        long j;
        int i;
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.MediaBrowserCompatCustomActionResultReceiver() <= 0) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j2 = 0;
        if (p1 < 0) {
            throw new IllegalArgumentException("fromIndex < 0: ".concat(String.valueOf(p1)).toString());
        }
        getMarkerPaint getmarkerpaint = this.head;
        long j3 = -1;
        if (getmarkerpaint == null) {
            return -1L;
        }
        if (getSize() - p1 < p1) {
            long size = getSize();
            while (size > p1) {
                getmarkerpaint = getmarkerpaint.prev;
                toMagicModuleMetaRepoModel.write(getmarkerpaint);
                size -= (long) (getmarkerpaint.limit - getmarkerpaint.pos);
            }
            if (getmarkerpaint == null) {
                return -1L;
            }
            byte[] bArrMediaBrowserCompatItemReceiver = p0.MediaBrowserCompatItemReceiver();
            byte b = bArrMediaBrowserCompatItemReceiver[0];
            int iMediaBrowserCompatCustomActionResultReceiver = p0.MediaBrowserCompatCustomActionResultReceiver();
            long size2 = (getSize() - ((long) iMediaBrowserCompatCustomActionResultReceiver)) + 1;
            j = size;
            long j4 = p1;
            while (j < size2) {
                byte[] bArr = getmarkerpaint.data;
                int iMin = (int) Math.min(getmarkerpaint.limit, (((long) getmarkerpaint.pos) + size2) - j);
                i = (int) ((((long) getmarkerpaint.pos) + j4) - j);
                while (i < iMin) {
                    if (bArr[i] != b || !setStatuses.read(getmarkerpaint, i + 1, bArrMediaBrowserCompatItemReceiver, 1, iMediaBrowserCompatCustomActionResultReceiver)) {
                        i++;
                    }
                }
                j += (long) (getmarkerpaint.limit - getmarkerpaint.pos);
                getmarkerpaint = getmarkerpaint.next;
                toMagicModuleMetaRepoModel.write(getmarkerpaint);
                j4 = j;
                j3 = -1;
            }
            return j3;
        }
        while (true) {
            long j5 = ((long) (getmarkerpaint.limit - getmarkerpaint.pos)) + j2;
            if (j5 > p1) {
                break;
            }
            getmarkerpaint = getmarkerpaint.next;
            toMagicModuleMetaRepoModel.write(getmarkerpaint);
            j2 = j5;
        }
        if (getmarkerpaint == null) {
            return -1L;
        }
        byte[] bArrMediaBrowserCompatItemReceiver2 = p0.MediaBrowserCompatItemReceiver();
        byte b2 = bArrMediaBrowserCompatItemReceiver2[0];
        int iMediaBrowserCompatCustomActionResultReceiver2 = p0.MediaBrowserCompatCustomActionResultReceiver();
        long size3 = (getSize() - ((long) iMediaBrowserCompatCustomActionResultReceiver2)) + 1;
        j = j2;
        long j6 = p1;
        while (j < size3) {
            byte[] bArr2 = getmarkerpaint.data;
            int iMin2 = (int) Math.min(getmarkerpaint.limit, (((long) getmarkerpaint.pos) + size3) - j);
            i = (int) ((((long) getmarkerpaint.pos) + j6) - j);
            while (i < iMin2) {
                if (bArr2[i] == b2 && setStatuses.read(getmarkerpaint, i + 1, bArrMediaBrowserCompatItemReceiver2, 1, iMediaBrowserCompatCustomActionResultReceiver2)) {
                }
                i++;
            }
            j += (long) (getmarkerpaint.limit - getmarkerpaint.pos);
            getmarkerpaint = getmarkerpaint.next;
            toMagicModuleMetaRepoModel.write(getmarkerpaint);
            j6 = j;
        }
        return -1L;
        return ((long) (i - getmarkerpaint.pos)) + j;
    }

    public final long read(getRelatedModuleAdapter p0, long p1) {
        int i;
        int i2;
        toMagicModuleMetaRepoModel.write(p0, "");
        long size = 0;
        if (p1 < 0) {
            throw new IllegalArgumentException("fromIndex < 0: ".concat(String.valueOf(p1)).toString());
        }
        getMarkerPaint getmarkerpaint = this.head;
        if (getmarkerpaint == null) {
            return -1L;
        }
        if (getSize() - p1 < p1) {
            size = getSize();
            while (size > p1) {
                getmarkerpaint = getmarkerpaint.prev;
                toMagicModuleMetaRepoModel.write(getmarkerpaint);
                size -= (long) (getmarkerpaint.limit - getmarkerpaint.pos);
            }
            if (getmarkerpaint == null) {
                return -1L;
            }
            if (p0.MediaBrowserCompatCustomActionResultReceiver() == 2) {
                byte b = p0.read(0);
                byte b2 = p0.read(1);
                while (size < getSize()) {
                    byte[] bArr = getmarkerpaint.data;
                    i = (int) ((((long) getmarkerpaint.pos) + p1) - size);
                    int i3 = getmarkerpaint.limit;
                    while (i < i3) {
                        byte b3 = bArr[i];
                        if (b3 == b || b3 == b2) {
                            i2 = getmarkerpaint.pos;
                        } else {
                            i++;
                        }
                    }
                    size += (long) (getmarkerpaint.limit - getmarkerpaint.pos);
                    getmarkerpaint = getmarkerpaint.next;
                    toMagicModuleMetaRepoModel.write(getmarkerpaint);
                    p1 = size;
                }
            } else {
                byte[] bArrMediaBrowserCompatItemReceiver = p0.MediaBrowserCompatItemReceiver();
                while (size < getSize()) {
                    byte[] bArr2 = getmarkerpaint.data;
                    i = (int) ((((long) getmarkerpaint.pos) + p1) - size);
                    int i4 = getmarkerpaint.limit;
                    while (i < i4) {
                        byte b4 = bArr2[i];
                        for (byte b5 : bArrMediaBrowserCompatItemReceiver) {
                            if (b4 == b5) {
                                i2 = getmarkerpaint.pos;
                            }
                        }
                        i++;
                    }
                    size += (long) (getmarkerpaint.limit - getmarkerpaint.pos);
                    getmarkerpaint = getmarkerpaint.next;
                    toMagicModuleMetaRepoModel.write(getmarkerpaint);
                    p1 = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j = ((long) (getmarkerpaint.limit - getmarkerpaint.pos)) + size;
            if (j > p1) {
                break;
            }
            getmarkerpaint = getmarkerpaint.next;
            toMagicModuleMetaRepoModel.write(getmarkerpaint);
            size = j;
        }
        if (getmarkerpaint == null) {
            return -1L;
        }
        if (p0.MediaBrowserCompatCustomActionResultReceiver() == 2) {
            byte b6 = p0.read(0);
            byte b7 = p0.read(1);
            while (size < getSize()) {
                byte[] bArr3 = getmarkerpaint.data;
                i = (int) ((((long) getmarkerpaint.pos) + p1) - size);
                int i5 = getmarkerpaint.limit;
                while (i < i5) {
                    byte b8 = bArr3[i];
                    if (b8 == b6 || b8 == b7) {
                        i2 = getmarkerpaint.pos;
                    } else {
                        i++;
                    }
                }
                size += (long) (getmarkerpaint.limit - getmarkerpaint.pos);
                getmarkerpaint = getmarkerpaint.next;
                toMagicModuleMetaRepoModel.write(getmarkerpaint);
                p1 = size;
            }
        } else {
            byte[] bArrMediaBrowserCompatItemReceiver2 = p0.MediaBrowserCompatItemReceiver();
            while (size < getSize()) {
                byte[] bArr4 = getmarkerpaint.data;
                i = (int) ((((long) getmarkerpaint.pos) + p1) - size);
                int i6 = getmarkerpaint.limit;
                while (i < i6) {
                    byte b9 = bArr4[i];
                    for (byte b10 : bArrMediaBrowserCompatItemReceiver2) {
                        if (b9 == b10) {
                            i2 = getmarkerpaint.pos;
                        }
                    }
                    i++;
                }
                size += (long) (getmarkerpaint.limit - getmarkerpaint.pos);
                getmarkerpaint = getmarkerpaint.next;
                toMagicModuleMetaRepoModel.write(getmarkerpaint);
                p1 = size;
            }
        }
        return -1L;
        return ((long) (i - i2)) + size;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof resetCurrentSelectedPosition)) {
            return false;
        }
        resetCurrentSelectedPosition resetcurrentselectedposition = (resetCurrentSelectedPosition) p0;
        if (getSize() != resetcurrentselectedposition.getSize()) {
            return false;
        }
        long j = 0;
        if (getSize() == 0) {
            return true;
        }
        getMarkerPaint getmarkerpaint = this.head;
        toMagicModuleMetaRepoModel.write(getmarkerpaint);
        getMarkerPaint getmarkerpaint2 = resetcurrentselectedposition.head;
        toMagicModuleMetaRepoModel.write(getmarkerpaint2);
        int i = getmarkerpaint.pos;
        int i2 = getmarkerpaint2.pos;
        long j2 = 0;
        while (j2 < getSize()) {
            long jMin = Math.min(getmarkerpaint.limit - i, getmarkerpaint2.limit - i2);
            long j3 = j;
            while (j3 < jMin) {
                if (getmarkerpaint.data[i] != getmarkerpaint2.data[i2]) {
                    return false;
                }
                j3++;
                i++;
                i2++;
            }
            if (i == getmarkerpaint.limit) {
                getmarkerpaint = getmarkerpaint.next;
                toMagicModuleMetaRepoModel.write(getmarkerpaint);
                i = getmarkerpaint.pos;
            }
            if (i2 == getmarkerpaint2.limit) {
                getmarkerpaint2 = getmarkerpaint2.next;
                toMagicModuleMetaRepoModel.write(getmarkerpaint2);
                i2 = getmarkerpaint2.pos;
            }
            j2 += jMin;
            j = 0;
        }
        return true;
    }

    public final int hashCode() {
        getMarkerPaint getmarkerpaint = this.head;
        if (getmarkerpaint == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = getmarkerpaint.limit;
            for (int i3 = getmarkerpaint.pos; i3 < i2; i3++) {
                i = (i * 31) + getmarkerpaint.data[i3];
            }
            getmarkerpaint = getmarkerpaint.next;
            toMagicModuleMetaRepoModel.write(getmarkerpaint);
        } while (getmarkerpaint != this.head);
        return i;
    }

    private resetCurrentSelectedPosition onPause() {
        resetCurrentSelectedPosition resetcurrentselectedposition = new resetCurrentSelectedPosition();
        if (getSize() == 0) {
            return resetcurrentselectedposition;
        }
        getMarkerPaint getmarkerpaint = this.head;
        toMagicModuleMetaRepoModel.write(getmarkerpaint);
        getMarkerPaint getmarkerpaintWrite = getmarkerpaint.write();
        resetcurrentselectedposition.head = getmarkerpaintWrite;
        getmarkerpaintWrite.prev = getmarkerpaintWrite;
        getmarkerpaintWrite.next = getmarkerpaintWrite.prev;
        for (getMarkerPaint getmarkerpaint2 = getmarkerpaint.next; getmarkerpaint2 != getmarkerpaint; getmarkerpaint2 = getmarkerpaint2.next) {
            getMarkerPaint getmarkerpaint3 = getmarkerpaintWrite.prev;
            toMagicModuleMetaRepoModel.write(getmarkerpaint3);
            toMagicModuleMetaRepoModel.write(getmarkerpaint2);
            getmarkerpaint3.read(getmarkerpaint2.write());
        }
        resetcurrentselectedposition.MediaBrowserCompatItemReceiver(getSize());
        return resetcurrentselectedposition;
    }

    private getRelatedModuleAdapter onPrepare() {
        if (getSize() > 2147483647L) {
            StringBuilder sb = new StringBuilder("size > Int.MAX_VALUE: ");
            sb.append(getSize());
            throw new IllegalStateException(sb.toString().toString());
        }
        return AudioAttributesImplApi21Parcelizer((int) getSize());
    }

    private getRelatedModuleAdapter AudioAttributesImplApi21Parcelizer(int p0) {
        if (p0 == 0) {
            return getRelatedModuleAdapter.EMPTY;
        }
        isConciseModeOn.write(getSize(), 0L, p0);
        getMarkerPaint getmarkerpaint = this.head;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < p0) {
            toMagicModuleMetaRepoModel.write(getmarkerpaint);
            if (getmarkerpaint.limit == getmarkerpaint.pos) {
                throw new AssertionError("s.limit == s.pos");
            }
            i2 += getmarkerpaint.limit - getmarkerpaint.pos;
            i3++;
            getmarkerpaint = getmarkerpaint.next;
        }
        byte[][] bArr = new byte[i3][];
        int[] iArr = new int[i3 << 1];
        getMarkerPaint getmarkerpaint2 = this.head;
        int i4 = 0;
        while (i < p0) {
            toMagicModuleMetaRepoModel.write(getmarkerpaint2);
            bArr[i4] = getmarkerpaint2.data;
            i += getmarkerpaint2.limit - getmarkerpaint2.pos;
            iArr[i4] = Math.min(i, p0);
            iArr[bArr.length + i4] = getmarkerpaint2.pos;
            getmarkerpaint2.shared = true;
            i4++;
            getmarkerpaint2 = getmarkerpaint2.next;
        }
        return new getViewPaint(bArr, iArr);
    }
}
