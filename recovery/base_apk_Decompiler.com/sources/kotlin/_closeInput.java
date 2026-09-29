package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H&¢\u0006\u0004\b\n\u0010\u0005J\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u000eJ\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\b\u0010\u000fJ'\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u0011J\u000f\u0010\b\u001a\u00020\u0003H&¢\u0006\u0004\b\b\u0010\u0005J5\u0010\u0013\u001a\u00020\u00032\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H&¢\u0006\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0013\u001a\u00028\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/_closeInput;", "N", "", "", "AudioAttributesImplApi21Parcelizer", "()V", "MediaBrowserCompatItemReceiver", "p0", "AudioAttributesCompatParcelizer", "(Ljava/lang/Object;)V", "IconCompatParcelizer", "", "p1", "write", "(ILjava/lang/Object;)V", "(II)V", "p2", "(III)V", "Lkotlin/Function2;", "read", "(Lo/MagicModuleSubmissionRequestBody;Ljava/lang/Object;)V", "AudioAttributesImplApi26Parcelizer", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface _closeInput<N> {
    void AudioAttributesCompatParcelizer();

    void AudioAttributesCompatParcelizer(int p0, int p1);

    void AudioAttributesCompatParcelizer(N p0);

    default void AudioAttributesImplApi21Parcelizer() {
    }

    void IconCompatParcelizer();

    void IconCompatParcelizer(int p0, N p1);

    default void MediaBrowserCompatItemReceiver() {
    }

    N write();

    void write(int p0, int p1, int p2);

    void write(int p0, N p1);

    default void read(MagicModuleSubmissionRequestBody<? super N, Object, getShowPopup> p0, Object p1) {
        p0.invoke(write(), p1);
    }

    default void AudioAttributesImplApi26Parcelizer() {
        N nWrite = write();
        _getByteArrayBuilder _getbytearraybuilder = nWrite instanceof _getByteArrayBuilder ? (_getByteArrayBuilder) nWrite : null;
        if (_getbytearraybuilder != null) {
            _getbytearraybuilder.read();
        }
    }
}
