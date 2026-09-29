package kotlin;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00020\u0000H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H&¢\u0006\u0004\b\u000f\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\fH&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H&¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\fH&¢\u0006\u0004\b\u0015\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\fH&¢\u0006\u0004\b\u001c\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u001dH&¢\u0006\u0004\b\u0017\u0010\u001eJ'\u0010\u000f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u001fR\u0014\u0010\n\u001a\u00020 8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010!\u0082\u0001\u0002 \"ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/LessonCompletedDialogonViewCreatedllm1;", "Lo/setCompoundDrawablesWithIntrinsicBoundsCompatdefault;", "Ljava/nio/channels/WritableByteChannel;", "MediaBrowserCompatItemReceiver", "()Lo/LessonCompletedDialogonViewCreatedllm1;", "", "flush", "()V", "", "p0", "RemoteActionCompatParcelizer", "([B)Lo/LessonCompletedDialogonViewCreatedllm1;", "", "p1", "p2", "AudioAttributesCompatParcelizer", "([BII)Lo/LessonCompletedDialogonViewCreatedllm1;", "Lo/getRelatedModuleAdapter;", "(Lo/getRelatedModuleAdapter;)Lo/LessonCompletedDialogonViewCreatedllm1;", "Lo/setLockedFromSeek;", "", "write", "(Lo/setLockedFromSeek;)J", "read", "(I)Lo/LessonCompletedDialogonViewCreatedllm1;", "MediaBrowserCompatMediaItem", "(J)Lo/LessonCompletedDialogonViewCreatedllm1;", "MediaDescriptionCompat", "AudioAttributesImplApi26Parcelizer", "", "(Ljava/lang/String;)Lo/LessonCompletedDialogonViewCreatedllm1;", "(Ljava/lang/String;II)Lo/LessonCompletedDialogonViewCreatedllm1;", "Lo/resetCurrentSelectedPosition;", "()Lo/resetCurrentSelectedPosition;", "Lo/setViewPaint;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LessonCompletedDialogonViewCreatedllm1 extends setCompoundDrawablesWithIntrinsicBoundsCompatdefault, WritableByteChannel {
    LessonCompletedDialogonViewCreatedllm1 AudioAttributesCompatParcelizer(String p0, int p1, int p2) throws IOException;

    LessonCompletedDialogonViewCreatedllm1 AudioAttributesCompatParcelizer(getRelatedModuleAdapter p0) throws IOException;

    LessonCompletedDialogonViewCreatedllm1 AudioAttributesCompatParcelizer(byte[] p0, int p1, int p2) throws IOException;

    LessonCompletedDialogonViewCreatedllm1 AudioAttributesImplApi26Parcelizer(int p0) throws IOException;

    resetCurrentSelectedPosition AudioAttributesImplApi26Parcelizer();

    LessonCompletedDialogonViewCreatedllm1 MediaBrowserCompatItemReceiver() throws IOException;

    LessonCompletedDialogonViewCreatedllm1 MediaBrowserCompatMediaItem(long p0) throws IOException;

    LessonCompletedDialogonViewCreatedllm1 MediaDescriptionCompat(long p0) throws IOException;

    LessonCompletedDialogonViewCreatedllm1 RemoteActionCompatParcelizer(byte[] p0) throws IOException;

    @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault, java.io.Flushable
    void flush() throws IOException;

    LessonCompletedDialogonViewCreatedllm1 read(int p0) throws IOException;

    LessonCompletedDialogonViewCreatedllm1 read(String p0) throws IOException;

    long write(setLockedFromSeek p0) throws IOException;

    LessonCompletedDialogonViewCreatedllm1 write(int p0) throws IOException;
}
