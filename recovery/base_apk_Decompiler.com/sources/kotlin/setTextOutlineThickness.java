package kotlin;

import java.util.concurrent.CancellationException;
import kotlin.C0177getRfBanners;
import kotlin.Metadata;
import kotlin.setTextureWidth;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\f\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f"}, d2 = {"Lo/setTextOutlineThickness;", "", "<init>", "()V", "Lo/setTextureWidth$AudioAttributesCompatParcelizer;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/setTextureWidth$AudioAttributesCompatParcelizer;)Z", "", "read", "", "RemoteActionCompatParcelizer", "(Ljava/lang/Throwable;)V", "Lo/UTF32Reader;", "Lo/UTF32Reader;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setTextOutlineThickness {
    public static final int IconCompatParcelizer = UTF32Reader.read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final UTF32Reader<setTextureWidth.AudioAttributesCompatParcelizer> write = new UTF32Reader<>(new setTextureWidth.AudioAttributesCompatParcelizer[16], 0);

    public final boolean AudioAttributesCompatParcelizer(final setTextureWidth.AudioAttributesCompatParcelizer p0) {
        WritableTypeIdInclusion writableTypeIdInclusionInvoke = p0.RemoteActionCompatParcelizer().invoke();
        if (writableTypeIdInclusionInvoke == null) {
            setStateRank<getShowPopup> setstaterankWrite = p0.write();
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            setstaterankWrite.resumeWith(C0177getRfBanners.read(getShowPopup.INSTANCE));
            return false;
        }
        p0.write().write(new getAnswerMap() { // from class: o.setTextureHeight
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setTextOutlineThickness.AudioAttributesCompatParcelizer(this.write, p0, (Throwable) obj);
            }
        });
        newEncryptedObject newencryptedobjectIconCompatParcelizer = getQues.IconCompatParcelizer(0, this.write.getAudioAttributesCompatParcelizer());
        int read = newencryptedobjectIconCompatParcelizer.getRead();
        int audioAttributesCompatParcelizer = newencryptedobjectIconCompatParcelizer.getAudioAttributesCompatParcelizer();
        if (read <= audioAttributesCompatParcelizer) {
            while (true) {
                WritableTypeIdInclusion writableTypeIdInclusionInvoke2 = this.write.IconCompatParcelizer[audioAttributesCompatParcelizer].RemoteActionCompatParcelizer().invoke();
                if (writableTypeIdInclusionInvoke2 != null) {
                    WritableTypeIdInclusion writableTypeIdInclusionWrite = writableTypeIdInclusionInvoke.write(writableTypeIdInclusionInvoke2);
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writableTypeIdInclusionWrite, writableTypeIdInclusionInvoke)) {
                        this.write.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer + 1, p0);
                        return true;
                    }
                    if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writableTypeIdInclusionWrite, writableTypeIdInclusionInvoke2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int audioAttributesCompatParcelizer2 = this.write.getAudioAttributesCompatParcelizer() - 1;
                        if (audioAttributesCompatParcelizer2 <= audioAttributesCompatParcelizer) {
                            while (true) {
                                this.write.IconCompatParcelizer[audioAttributesCompatParcelizer].write().write((Throwable) cancellationException);
                                if (audioAttributesCompatParcelizer2 == audioAttributesCompatParcelizer) {
                                    break;
                                }
                                audioAttributesCompatParcelizer2++;
                            }
                        }
                    }
                }
                if (audioAttributesCompatParcelizer == read) {
                    break;
                }
                audioAttributesCompatParcelizer--;
            }
        }
        this.write.RemoteActionCompatParcelizer(0, p0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(setTextOutlineThickness settextoutlinethickness, setTextureWidth.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, Throwable th) {
        settextoutlinethickness.write.IconCompatParcelizer(audioAttributesCompatParcelizer);
        return getShowPopup.INSTANCE;
    }

    public final void read() {
        newEncryptedObject newencryptedobjectIconCompatParcelizer = getQues.IconCompatParcelizer(0, this.write.getAudioAttributesCompatParcelizer());
        int read = newencryptedobjectIconCompatParcelizer.getRead();
        int audioAttributesCompatParcelizer = newencryptedobjectIconCompatParcelizer.getAudioAttributesCompatParcelizer();
        if (read <= audioAttributesCompatParcelizer) {
            while (true) {
                setStateRank<getShowPopup> setstaterankWrite = this.write.IconCompatParcelizer[read].write();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                setstaterankWrite.resumeWith(C0177getRfBanners.read(getshowpopup));
                if (read == audioAttributesCompatParcelizer) {
                    break;
                } else {
                    read++;
                }
            }
        }
        this.write.RemoteActionCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer(Throwable p0) {
        UTF32Reader<setTextureWidth.AudioAttributesCompatParcelizer> uTF32Reader = this.write;
        int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
        setStateRank[] setstaterankArr = new setStateRank[audioAttributesCompatParcelizer];
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            setstaterankArr[i] = uTF32Reader.IconCompatParcelizer[i].write();
        }
        for (int i2 = 0; i2 < audioAttributesCompatParcelizer; i2++) {
            setstaterankArr[i2].write(p0);
        }
        if (this.write.getAudioAttributesCompatParcelizer() == 0) {
            return;
        }
        getRootStableInsets.AudioAttributesCompatParcelizer("uncancelled requests present");
    }
}
