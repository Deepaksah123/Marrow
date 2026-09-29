package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@getRenewGrpId
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\b7\u0018\u00002\u00020\u0001:\u0001\u0016Ba\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000f\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R(\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R(\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018\u0082\u0001\u0001\u001a"}, d2 = {"Lo/onDismiss;", "", "Lo/onDismiss$RemoteActionCompatParcelizer;", "p0", "", "p1", "p2", "Lkotlin/Function1;", "Lo/onGetLayoutInflater;", "Lkotlin/Function0;", "", "p3", "p4", "<init>", "(Lo/onDismiss$RemoteActionCompatParcelizer;IILo/getAnswerMap;Lo/getAnswerMap;)V", "write", "()Lo/onGetLayoutInflater;", "", "AudioAttributesCompatParcelizer", "(Lo/onGetLayoutInflater;Ljava/util/List;)V", "read", "Lo/onDismiss$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "I", "Lo/getAnswerMap;", "IconCompatParcelizer", "Lo/setupDialog;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class onDismiss {
    private final int AudioAttributesCompatParcelizer;
    private final getAnswerMap<onGetLayoutInflater, MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup>> IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final RemoteActionCompatParcelizer write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getAnswerMap<onGetLayoutInflater, MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup>> read;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[RemoteActionCompatParcelizer.values().length];
            try {
                iArr[RemoteActionCompatParcelizer.IconCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RemoteActionCompatParcelizer.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            write = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private onDismiss(RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i, int i2, getAnswerMap<? super onGetLayoutInflater, ? extends MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>> getanswermap, getAnswerMap<? super onGetLayoutInflater, ? extends MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>> getanswermap2) {
        this.write = remoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = i2;
        this.read = getanswermap;
        this.IconCompatParcelizer = getanswermap2;
    }

    public final onGetLayoutInflater write() {
        return new onGetLayoutInflater(this.write, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
    }

    public final void AudioAttributesCompatParcelizer(onGetLayoutInflater p0, List<MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup>> p1) {
        getAnswerMap<onGetLayoutInflater, MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup>> getanswermap = this.read;
        MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBodyInvoke = getanswermap != null ? getanswermap.invoke(p0) : null;
        getAnswerMap<onGetLayoutInflater, MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup>> getanswermap2 = this.IconCompatParcelizer;
        MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBodyInvoke2 = getanswermap2 != null ? getanswermap2.invoke(p0) : null;
        int i = WhenMappings.write[this.write.ordinal()];
        if (i == 1) {
            if (magicModuleSubmissionRequestBodyInvoke != null) {
                p1.add(magicModuleSubmissionRequestBodyInvoke);
            }
        } else if (i == 2) {
            if (magicModuleSubmissionRequestBodyInvoke != null) {
                p1.add(magicModuleSubmissionRequestBodyInvoke);
            }
            if (magicModuleSubmissionRequestBodyInvoke2 != null) {
                p1.add(magicModuleSubmissionRequestBodyInvoke2);
            }
        }
    }

    public /* synthetic */ onDismiss(RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i, int i2, getAnswerMap getanswermap, getAnswerMap getanswermap2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(remoteActionCompatParcelizer, i, i2, getanswermap, getanswermap2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/onDismiss$RemoteActionCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "read", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private static final /* synthetic */ getMagicModuleSavedMcqCount AudioAttributesCompatParcelizer;
        private static final /* synthetic */ RemoteActionCompatParcelizer[] AudioAttributesImplApi26Parcelizer;
        public static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer("Visible", 0);
        public static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer("Clip", 1);
        public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer("ExpandIndicator", 2);
        public static final RemoteActionCompatParcelizer write = new RemoteActionCompatParcelizer("ExpandOrCollapseIndicator", 3);

        private RemoteActionCompatParcelizer(String str, int i) {
        }

        static {
            RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArrIconCompatParcelizer = IconCompatParcelizer();
            AudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizerArrIconCompatParcelizer;
            AudioAttributesCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(remoteActionCompatParcelizerArrIconCompatParcelizer);
        }

        private static final /* synthetic */ RemoteActionCompatParcelizer[] IconCompatParcelizer() {
            return new RemoteActionCompatParcelizer[]{read, RemoteActionCompatParcelizer, IconCompatParcelizer, write};
        }

        public static RemoteActionCompatParcelizer valueOf(String str) {
            return (RemoteActionCompatParcelizer) Enum.valueOf(RemoteActionCompatParcelizer.class, str);
        }

        public static RemoteActionCompatParcelizer[] values() {
            return (RemoteActionCompatParcelizer[]) AudioAttributesImplApi26Parcelizer.clone();
        }
    }
}
