package kotlin;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\b\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0013J\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u0014J\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0016J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\fH\u0016¢\u0006\u0004\b\n\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\u001dR\u0016\u0010\b\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b\b\u0010 R\u0016\u0010\n\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u001e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010$"}, d2 = {"Lo/setPresenter;", "E", "", "", "p0", "<init>", "(I)V", "", "IconCompatParcelizer", "()V", "RemoteActionCompatParcelizer", "()Lo/setPresenter;", "", "", "AudioAttributesCompatParcelizer", "(J)Z", "(J)Ljava/lang/Object;", "write", "(J)I", "()Z", "(I)J", "p1", "(JLjava/lang/Object;)V", "(J)V", "read", "()I", "", "toString", "()Ljava/lang/String;", "(I)Ljava/lang/Object;", "Z", "", "[J", "I", "", "", "[Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class setPresenter<E> implements Cloneable {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public /* synthetic */ Object[] read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public /* synthetic */ long[] AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public /* synthetic */ boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public /* synthetic */ int RemoteActionCompatParcelizer;

    public setPresenter(int i) {
        if (i == 0) {
            this.AudioAttributesCompatParcelizer = setCheckMarkDrawable.AudioAttributesCompatParcelizer;
            this.read = setCheckMarkDrawable.read;
        } else {
            int i2 = setCheckMarkDrawable.read(i);
            this.AudioAttributesCompatParcelizer = new long[i2];
            this.read = new Object[i2];
        }
    }

    public /* synthetic */ setPresenter(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public setPresenter<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        toMagicModuleMetaRepoModel.read(objClone, "");
        setPresenter<E> setpresenter = (setPresenter) objClone;
        setpresenter.AudioAttributesCompatParcelizer = (long[]) this.AudioAttributesCompatParcelizer.clone();
        setpresenter.read = (Object[]) this.read.clone();
        return setpresenter;
    }

    public final E IconCompatParcelizer(long p0) {
        int iAudioAttributesCompatParcelizer = setCheckMarkDrawable.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, p0);
        if (iAudioAttributesCompatParcelizer < 0 || this.read[iAudioAttributesCompatParcelizer] == setActivityChooserModel.IconCompatParcelizer) {
            return null;
        }
        return (E) this.read[iAudioAttributesCompatParcelizer];
    }

    public final void RemoteActionCompatParcelizer(long p0) {
        int iAudioAttributesCompatParcelizer = setCheckMarkDrawable.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, p0);
        if (iAudioAttributesCompatParcelizer < 0 || this.read[iAudioAttributesCompatParcelizer] == setActivityChooserModel.IconCompatParcelizer) {
            return;
        }
        this.read[iAudioAttributesCompatParcelizer] = setActivityChooserModel.IconCompatParcelizer;
        this.IconCompatParcelizer = true;
    }

    public final void read(int p0) {
        if (this.read[p0] != setActivityChooserModel.IconCompatParcelizer) {
            this.read[p0] = setActivityChooserModel.IconCompatParcelizer;
            this.IconCompatParcelizer = true;
        }
    }

    public final void write(long p0, E p1) {
        int iAudioAttributesCompatParcelizer = setCheckMarkDrawable.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, p0);
        if (iAudioAttributesCompatParcelizer >= 0) {
            this.read[iAudioAttributesCompatParcelizer] = p1;
            return;
        }
        int i = ~iAudioAttributesCompatParcelizer;
        if (i < this.RemoteActionCompatParcelizer && this.read[i] == setActivityChooserModel.IconCompatParcelizer) {
            this.AudioAttributesCompatParcelizer[i] = p0;
            this.read[i] = p1;
            return;
        }
        if (this.IconCompatParcelizer) {
            int i2 = this.RemoteActionCompatParcelizer;
            long[] jArr = this.AudioAttributesCompatParcelizer;
            if (i2 >= jArr.length) {
                Object[] objArr = this.read;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != setActivityChooserModel.IconCompatParcelizer) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.IconCompatParcelizer = false;
                this.RemoteActionCompatParcelizer = i3;
                i = ~setCheckMarkDrawable.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, i3, p0);
            }
        }
        int i5 = this.RemoteActionCompatParcelizer;
        if (i5 >= this.AudioAttributesCompatParcelizer.length) {
            int i6 = setCheckMarkDrawable.read(i5 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.AudioAttributesCompatParcelizer, i6);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jArrCopyOf, "");
            this.AudioAttributesCompatParcelizer = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.read, i6);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
            this.read = objArrCopyOf;
        }
        int i7 = this.RemoteActionCompatParcelizer;
        if (i7 - i != 0) {
            long[] jArr2 = this.AudioAttributesCompatParcelizer;
            int i8 = i + 1;
            getOrderDetails.AudioAttributesCompatParcelizer(jArr2, jArr2, i8, i, i7);
            Object[] objArr2 = this.read;
            getOrderDetails.RemoteActionCompatParcelizer(objArr2, objArr2, i8, i, this.RemoteActionCompatParcelizer);
        }
        this.AudioAttributesCompatParcelizer[i] = p0;
        this.read[i] = p1;
        this.RemoteActionCompatParcelizer++;
    }

    public final int write() {
        if (this.IconCompatParcelizer) {
            int i = this.RemoteActionCompatParcelizer;
            long[] jArr = this.AudioAttributesCompatParcelizer;
            Object[] objArr = this.read;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != setActivityChooserModel.IconCompatParcelizer) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.IconCompatParcelizer = false;
            this.RemoteActionCompatParcelizer = i2;
        }
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return write() == 0;
    }

    public final long AudioAttributesCompatParcelizer(int p0) {
        if (p0 < 0 || p0 >= this.RemoteActionCompatParcelizer) {
            AppCompatImageButton.read("Expected index to be within 0..size()-1, but was ".concat(String.valueOf(p0)));
        }
        if (this.IconCompatParcelizer) {
            int i = this.RemoteActionCompatParcelizer;
            long[] jArr = this.AudioAttributesCompatParcelizer;
            Object[] objArr = this.read;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != setActivityChooserModel.IconCompatParcelizer) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.IconCompatParcelizer = false;
            this.RemoteActionCompatParcelizer = i2;
        }
        return this.AudioAttributesCompatParcelizer[p0];
    }

    public final E IconCompatParcelizer(int p0) {
        if (p0 < 0 || p0 >= this.RemoteActionCompatParcelizer) {
            AppCompatImageButton.read("Expected index to be within 0..size()-1, but was ".concat(String.valueOf(p0)));
        }
        if (this.IconCompatParcelizer) {
            int i = this.RemoteActionCompatParcelizer;
            long[] jArr = this.AudioAttributesCompatParcelizer;
            Object[] objArr = this.read;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != setActivityChooserModel.IconCompatParcelizer) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.IconCompatParcelizer = false;
            this.RemoteActionCompatParcelizer = i2;
        }
        return (E) this.read[p0];
    }

    public final int write(long p0) {
        if (this.IconCompatParcelizer) {
            int i = this.RemoteActionCompatParcelizer;
            long[] jArr = this.AudioAttributesCompatParcelizer;
            Object[] objArr = this.read;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != setActivityChooserModel.IconCompatParcelizer) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.IconCompatParcelizer = false;
            this.RemoteActionCompatParcelizer = i2;
        }
        return setCheckMarkDrawable.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, p0);
    }

    public final boolean AudioAttributesCompatParcelizer(long p0) {
        return write(p0) >= 0;
    }

    public final void IconCompatParcelizer() {
        int i = this.RemoteActionCompatParcelizer;
        Object[] objArr = this.read;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.RemoteActionCompatParcelizer = 0;
        this.IconCompatParcelizer = false;
    }

    public String toString() {
        if (write() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.RemoteActionCompatParcelizer * 28);
        sb.append('{');
        int i = this.RemoteActionCompatParcelizer;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(AudioAttributesCompatParcelizer(i2));
            sb.append('=');
            E eIconCompatParcelizer = IconCompatParcelizer(i2);
            if (eIconCompatParcelizer != sb) {
                sb.append(eIconCompatParcelizer);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    public setPresenter() {
        this(0, 1, null);
    }
}
