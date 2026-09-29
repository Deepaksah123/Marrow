package kotlin;

import kotlin.Metadata;
import kotlin.onForceLoad;
import o.registerListener.AudioAttributesCompatParcelizer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/registerListener;", "Lo/registerListener$AudioAttributesCompatParcelizer;", "Interval", "", "<init>", "()V", "", "p0", "write", "(I)Ljava/lang/Object;", "read", "Lo/onForceLoad;", "AudioAttributesCompatParcelizer", "()Lo/onForceLoad;", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class registerListener<Interval extends AudioAttributesCompatParcelizer> {
    public abstract onForceLoad<Interval> AudioAttributesCompatParcelizer();

    public final int AudioAttributesImplApi21Parcelizer() {
        return AudioAttributesCompatParcelizer().write();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/registerListener$AudioAttributesCompatParcelizer;", "", "Lkotlin/Function1;", "", "IconCompatParcelizer", "()Lo/getAnswerMap;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface AudioAttributesCompatParcelizer {
        default getAnswerMap<Integer, Object> IconCompatParcelizer() {
            return null;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class write implements getAnswerMap {
            public static final write RemoteActionCompatParcelizer = new write();

            public final Void read(int i) {
                return null;
            }

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ Object invoke(Object obj) {
                return read(((Number) obj).intValue());
            }

            write() {
            }
        }

        default getAnswerMap<Integer, Object> RemoteActionCompatParcelizer() {
            return write.RemoteActionCompatParcelizer;
        }
    }

    public final Object write(int p0) {
        Object objInvoke;
        onForceLoad.write<Interval> writeVarRemoteActionCompatParcelizer = AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(p0);
        int iconCompatParcelizer = writeVarRemoteActionCompatParcelizer.getIconCompatParcelizer();
        getAnswerMap<Integer, Object> getanswermapIconCompatParcelizer = writeVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer().IconCompatParcelizer();
        return (getanswermapIconCompatParcelizer == null || (objInvoke = getanswermapIconCompatParcelizer.invoke(Integer.valueOf(p0 - iconCompatParcelizer))) == null) ? prepare.AudioAttributesCompatParcelizer(p0) : objInvoke;
    }

    public final Object read(int p0) {
        onForceLoad.write<Interval> writeVarRemoteActionCompatParcelizer = AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(p0);
        return writeVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer().invoke(Integer.valueOf(p0 - writeVarRemoteActionCompatParcelizer.getIconCompatParcelizer()));
    }
}
