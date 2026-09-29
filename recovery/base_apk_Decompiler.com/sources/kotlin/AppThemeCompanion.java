package kotlin;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.MediaType;
import kotlin.Metadata;
import kotlin.ThemeAlphaConstantsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B%\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016"}, d2 = {"Lo/AppThemeCompanion;", "Lo/ThemeKtExternalSyntheticLambda2;", "", "", "p0", "p1", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "contentLength", "()J", "Lo/ExtendedColors;", "contentType", "()Lo/ExtendedColors;", "Lo/LessonCompletedDialogonViewCreatedllm1;", "", "AudioAttributesCompatParcelizer", "(Lo/LessonCompletedDialogonViewCreatedllm1;Z)J", "", "writeTo", "(Lo/LessonCompletedDialogonViewCreatedllm1;)V", "read", "Ljava/util/List;", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppThemeCompanion extends ThemeKtExternalSyntheticLambda2 {
    private static final MediaType IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final List<String> IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final List<String> RemoteActionCompatParcelizer;

    public AppThemeCompanion(List<String> list, List<String> list2) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        this.RemoteActionCompatParcelizer = FirebaseDataModule.AudioAttributesCompatParcelizer(list);
        this.IconCompatParcelizer = FirebaseDataModule.AudioAttributesCompatParcelizer(list2);
    }

    @Override // kotlin.ThemeKtExternalSyntheticLambda2
    /* JADX INFO: renamed from: contentType */
    public final MediaType getIconCompatParcelizer() {
        return IconCompatParcelizer;
    }

    @Override // kotlin.ThemeKtExternalSyntheticLambda2
    public final long contentLength() {
        return AudioAttributesCompatParcelizer(null, true);
    }

    @Override // kotlin.ThemeKtExternalSyntheticLambda2
    public final void writeTo(LessonCompletedDialogonViewCreatedllm1 p0) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        AudioAttributesCompatParcelizer(p0, false);
    }

    private final long AudioAttributesCompatParcelizer(LessonCompletedDialogonViewCreatedllm1 p0, boolean p1) throws EOFException {
        resetCurrentSelectedPosition resetcurrentselectedpositionAudioAttributesImplApi26Parcelizer;
        if (p1) {
            resetcurrentselectedpositionAudioAttributesImplApi26Parcelizer = new resetCurrentSelectedPosition();
        } else {
            toMagicModuleMetaRepoModel.write(p0);
            resetcurrentselectedpositionAudioAttributesImplApi26Parcelizer = p0.AudioAttributesImplApi26Parcelizer();
        }
        int size = this.RemoteActionCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                resetcurrentselectedpositionAudioAttributesImplApi26Parcelizer.read(38);
            }
            resetcurrentselectedpositionAudioAttributesImplApi26Parcelizer.read(this.RemoteActionCompatParcelizer.get(i));
            resetcurrentselectedpositionAudioAttributesImplApi26Parcelizer.read(61);
            resetcurrentselectedpositionAudioAttributesImplApi26Parcelizer.read(this.IconCompatParcelizer.get(i));
        }
        if (!p1) {
            return 0L;
        }
        long size2 = resetcurrentselectedpositionAudioAttributesImplApi26Parcelizer.getSize();
        resetcurrentselectedpositionAudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
        return size2;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tJ\r\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\n\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"Lo/AppThemeCompanion$IconCompatParcelizer;", "", "Ljava/nio/charset/Charset;", "p0", "<init>", "(Ljava/nio/charset/Charset;)V", "", "p1", "read", "(Ljava/lang/String;Ljava/lang/String;)Lo/AppThemeCompanion$IconCompatParcelizer;", "write", "Lo/AppThemeCompanion;", "()Lo/AppThemeCompanion;", "Ljava/nio/charset/Charset;", "AudioAttributesCompatParcelizer", "", "Ljava/util/List;", "IconCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class IconCompatParcelizer {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final List<String> write;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final Charset AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final List<String> IconCompatParcelizer;

        private IconCompatParcelizer(Charset charset) {
            this.AudioAttributesCompatParcelizer = charset;
            this.IconCompatParcelizer = new ArrayList();
            this.write = new ArrayList();
        }

        public /* synthetic */ IconCompatParcelizer(Charset charset, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? null : charset);
        }

        public final IconCompatParcelizer read(String p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            this.IconCompatParcelizer.add(ThemeAlphaConstantsKt.Companion.read(ThemeAlphaConstantsKt.INSTANCE, p0, 0, 0, ThemeAlphaConstantsKt.FORM_ENCODE_SET, false, false, true, false, this.AudioAttributesCompatParcelizer, 91));
            this.write.add(ThemeAlphaConstantsKt.Companion.read(ThemeAlphaConstantsKt.INSTANCE, p1, 0, 0, ThemeAlphaConstantsKt.FORM_ENCODE_SET, false, false, true, false, this.AudioAttributesCompatParcelizer, 91));
            return this;
        }

        public final IconCompatParcelizer write(String p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            this.IconCompatParcelizer.add(ThemeAlphaConstantsKt.Companion.read(ThemeAlphaConstantsKt.INSTANCE, p0, 0, 0, ThemeAlphaConstantsKt.FORM_ENCODE_SET, true, false, true, false, this.AudioAttributesCompatParcelizer, 83));
            this.write.add(ThemeAlphaConstantsKt.Companion.read(ThemeAlphaConstantsKt.INSTANCE, p1, 0, 0, ThemeAlphaConstantsKt.FORM_ENCODE_SET, true, false, true, false, this.AudioAttributesCompatParcelizer, 83));
            return this;
        }

        public final AppThemeCompanion write() {
            return new AppThemeCompanion(this.IconCompatParcelizer, this.write);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public IconCompatParcelizer() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    static {
        MediaType.write writeVar = MediaType.write;
        IconCompatParcelizer = MediaType.write.RemoteActionCompatParcelizer("application/x-www-form-urlencoded");
    }
}
