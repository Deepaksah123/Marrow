package kotlin;

import kotlin.Metadata;
import kotlin._skipWSOrEnd;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000 \u00122\u00020\u0001:\u0003\u0012\u0013\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H ¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\tH\u0010¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0011\u0082\u0001\u0002\u0014\u0015"}, d2 = {"Lo/BackStackState;", "", "<init>", "()V", "", "p0", "p1", "Lo/tryToResolveUnresolved;", "p2", "Lo/_parser;", "p3", "p4", "RemoteActionCompatParcelizer", "(IILo/tryToResolveUnresolved;Lo/_parser;I)I", "AudioAttributesCompatParcelizer", "(Lo/_parser;)Ljava/lang/Integer;", "", "()Z", "read", "write", "Lo/BackStackState$AudioAttributesCompatParcelizer;", "Lo/BackStackState$write;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BackStackState {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public Integer AudioAttributesCompatParcelizer(_parser p0) {
        return null;
    }

    public abstract int RemoteActionCompatParcelizer(int p0, int p1, tryToResolveUnresolved p2, _parser p3, int p4);

    public boolean RemoteActionCompatParcelizer() {
        return false;
    }

    private BackStackState() {
    }

    public /* synthetic */ BackStackState(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    /* JADX INFO: renamed from: o.BackStackState$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0007\u0010\n"}, d2 = {"Lo/BackStackState$read;", "", "<init>", "()V", "Lo/_skipWSOrEnd$read;", "p0", "Lo/BackStackState;", "AudioAttributesCompatParcelizer", "(Lo/_skipWSOrEnd$read;)Lo/BackStackState;", "Lo/_skipWSOrEnd$write;", "(Lo/_skipWSOrEnd$write;)Lo/BackStackState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final BackStackState AudioAttributesCompatParcelizer(_skipWSOrEnd.read p0) {
            return new write(p0);
        }

        public final BackStackState AudioAttributesCompatParcelizer(_skipWSOrEnd.write p0) {
            return new AudioAttributesCompatParcelizer(p0);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/BackStackState$write;", "Lo/BackStackState;", "Lo/_skipWSOrEnd$read;", "p0", "<init>", "(Lo/_skipWSOrEnd$read;)V", "", "p1", "Lo/tryToResolveUnresolved;", "p2", "Lo/_parser;", "p3", "p4", "RemoteActionCompatParcelizer", "(IILo/tryToResolveUnresolved;Lo/_parser;I)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Lo/_skipWSOrEnd$read;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class write extends BackStackState {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final _skipWSOrEnd.read IconCompatParcelizer;

        public write(_skipWSOrEnd.read readVar) {
            super(null);
            this.IconCompatParcelizer = readVar;
        }

        @Override // kotlin.BackStackState
        public final int RemoteActionCompatParcelizer(int p0, int p1, tryToResolveUnresolved p2, _parser p3, int p4) {
            return this.IconCompatParcelizer.read(p1, p0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ((write) p0).IconCompatParcelizer);
        }

        public final int hashCode() {
            return this.IconCompatParcelizer.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("write(IconCompatParcelizer=");
            sb.append(this.IconCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/BackStackState$AudioAttributesCompatParcelizer;", "Lo/BackStackState;", "Lo/_skipWSOrEnd$write;", "p0", "<init>", "(Lo/_skipWSOrEnd$write;)V", "", "p1", "Lo/tryToResolveUnresolved;", "p2", "Lo/_parser;", "p3", "p4", "RemoteActionCompatParcelizer", "(IILo/tryToResolveUnresolved;Lo/_parser;I)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Lo/_skipWSOrEnd$write;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class AudioAttributesCompatParcelizer extends BackStackState {
        private final _skipWSOrEnd.write IconCompatParcelizer;

        public AudioAttributesCompatParcelizer(_skipWSOrEnd.write writeVar) {
            super(null);
            this.IconCompatParcelizer = writeVar;
        }

        @Override // kotlin.BackStackState
        public final int RemoteActionCompatParcelizer(int p0, int p1, tryToResolveUnresolved p2, _parser p3, int p4) {
            return this.IconCompatParcelizer.IconCompatParcelizer(p1, p0, p2);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ((AudioAttributesCompatParcelizer) p0).IconCompatParcelizer);
        }

        public final int hashCode() {
            return this.IconCompatParcelizer.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioAttributesCompatParcelizer(IconCompatParcelizer=");
            sb.append(this.IconCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }
}
