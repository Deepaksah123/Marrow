package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b \u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\u0003R(\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0005@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lo/ViewPager2SavedState;", "Lo/getNullValueProvider;", "<init>", "()V", "Lo/ViewPager2SavedState$read;", "p0", "", "write", "(Lo/ViewPager2SavedState$read;)V", "read", "AudioAttributesImplApi26Parcelizer", "AudioAttributesCompatParcelizer", "Lo/ViewPager2SavedState$read;", "IconCompatParcelizer", "()Lo/ViewPager2SavedState$read;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ViewPager2SavedState implements getNullValueProvider {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private read read;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\b\u001a\u0004\u0018\u00010\u00072\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H&¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\b\u001a\u0004\u0018\u00010\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/ViewPager2SavedState$read;", "", "Lkotlin/Function2;", "Lo/JsonTypeIdResolver;", "Lo/SampleVideos;", "", "p0", "Lo/setPassingYear;", "write", "(Lo/MagicModuleSubmissionRequestBody;)Lo/setPassingYear;", "Lo/BaseSettings;", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/BaseSettings;", "Lo/isAbstract;", "read", "()Lo/isAbstract;", "IconCompatParcelizer", "Lo/setImageDisplayMode;", "()Lo/setImageDisplayMode;", "Lo/Typed3EpoxyController;", "MediaBrowserCompatItemReceiver", "()Lo/Typed3EpoxyController;", "AudioAttributesCompatParcelizer", "Lo/CoercionConfig;", "AudioAttributesImplApi26Parcelizer", "()Lo/CoercionConfig;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface read {
        CoercionConfig AudioAttributesImplApi26Parcelizer();

        BaseSettings MediaBrowserCompatCustomActionResultReceiver();

        Typed3EpoxyController MediaBrowserCompatItemReceiver();

        isAbstract read();

        setImageDisplayMode write();

        setPassingYear write(MagicModuleSubmissionRequestBody<? super JsonTypeIdResolver, ? super SampleVideos<?>, ? extends Object> p0);
    }

    public abstract void write();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    protected final read getRead() {
        return this.read;
    }

    public final void write(read p0) {
        if (this.read != null) {
            getRootStableInsets.AudioAttributesCompatParcelizer("Expected textInputModifierNode to be null");
        }
        this.read = p0;
    }

    public final void read(read p0) {
        if (this.read != p0) {
            StringBuilder sb = new StringBuilder("Expected textInputModifierNode to be ");
            sb.append(p0);
            sb.append(" but was ");
            sb.append(this.read);
            getRootStableInsets.AudioAttributesCompatParcelizer(sb.toString());
        }
        this.read = null;
    }

    @Override // kotlin.getNullValueProvider
    public final void AudioAttributesImplApi26Parcelizer() {
        BaseSettings baseSettingsMediaBrowserCompatCustomActionResultReceiver;
        read readVar = this.read;
        if (readVar == null || (baseSettingsMediaBrowserCompatCustomActionResultReceiver = readVar.MediaBrowserCompatCustomActionResultReceiver()) == null) {
            return;
        }
        baseSettingsMediaBrowserCompatCustomActionResultReceiver.write();
    }

    @Override // kotlin.getNullValueProvider
    public final void AudioAttributesCompatParcelizer() {
        BaseSettings baseSettingsMediaBrowserCompatCustomActionResultReceiver;
        read readVar = this.read;
        if (readVar == null || (baseSettingsMediaBrowserCompatCustomActionResultReceiver = readVar.MediaBrowserCompatCustomActionResultReceiver()) == null) {
            return;
        }
        baseSettingsMediaBrowserCompatCustomActionResultReceiver.read();
    }
}
