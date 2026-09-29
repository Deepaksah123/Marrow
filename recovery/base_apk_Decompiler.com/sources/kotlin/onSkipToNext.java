package kotlin;

import android.content.res.Resources;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB5\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001a\u0010\f\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\f\u0010\u0015"}, d2 = {"Lo/onSkipToNext;", "", "", "p0", "p1", "p2", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "p3", "<init>", "(IIILo/getAnswerMap;)V", "read", "(Z)I", "RemoteActionCompatParcelizer", "I", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "Lo/getAnswerMap;", "write", "()Lo/getAnswerMap;", "()I"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class onSkipToNext {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;
    private final getAnswerMap<Resources, Boolean> IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int read;

    /* JADX WARN: Multi-variable type inference failed */
    private onSkipToNext(int i, int i2, int i3, getAnswerMap<? super Resources, Boolean> getanswermap) {
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = i2;
        this.read = i3;
        this.IconCompatParcelizer = getanswermap;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    public final getAnswerMap<Resources, Boolean> write() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.onSkipToNext$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007J\u0012\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u0006H\u0007J\u001c\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, d2 = {"Landroidx/activity/SystemBarStyle$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_AUTO, "Landroidx/activity/SystemBarStyle;", "lightScrim", "", "darkScrim", "detectDarkMode", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "dark", "scrim", "light", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: o.onSkipToNext$RemoteActionCompatParcelizer$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Resources;", "p0", "", "read", "(Landroid/content/res/Resources;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<Resources, Boolean> {
            public static final AnonymousClass2 IconCompatParcelizer = new AnonymousClass2();

            @Override // kotlin.getAnswerMap
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Resources resources) {
                toMagicModuleMetaRepoModel.write(resources, "");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            }

            AnonymousClass2() {
                super(1);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @getMagicModuleMeta
        public static onSkipToNext RemoteActionCompatParcelizer(int i, int i2, getAnswerMap<? super Resources, Boolean> getanswermap) {
            toMagicModuleMetaRepoModel.write(getanswermap, "");
            return new onSkipToNext(i, i2, 0, getanswermap, null);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final int read(boolean p0) {
        return p0 ? this.AudioAttributesCompatParcelizer : this.RemoteActionCompatParcelizer;
    }

    public final int RemoteActionCompatParcelizer(boolean p0) {
        if (this.read == 0) {
            return 0;
        }
        if (p0) {
            return this.AudioAttributesCompatParcelizer;
        }
        return this.RemoteActionCompatParcelizer;
    }

    public /* synthetic */ onSkipToNext(int i, int i2, int i3, getAnswerMap getanswermap, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, i2, i3, getanswermap);
    }
}
