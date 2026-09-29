package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import kotlin.AtomicLongDeserializer;
import kotlin.CoercionConfigs;
import kotlin.JavaBigIntegerFromCharSequence;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleUseCase;
import kotlin.Metadata;
import kotlin._configureGenerator;
import kotlin.convertNumberToLong;
import kotlin.getAnswerMap;
import kotlin.getCreatedOnDateMs;
import kotlin.getShowPopup;
import kotlin.reportBadDefinition;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004BI\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013BK\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001c\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\n8\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R(\u0010%\u001a\u0004\u0018\u00010(2\b\u0010\u0006\u001a\u0004\u0018\u00010(8\u0002@CX\u0082\u000e¢\u0006\f\n\u0004\b\u001c\u0010)\"\u0004\b#\u0010*RB\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u00142\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u00148\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100RB\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u00142\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u00148\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100RB\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u00142\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u00148\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.\"\u0004\b6\u00100"}, d2 = {"Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Landroid/view/View;", "T", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Lo/CoercionConfigs;", "Landroid/content/Context;", "p0", "Lo/convertNumberToLong;", "p1", "p2", "Lo/reportBadDefinition;", "p3", "Lo/JavaBigIntegerFromCharSequence;", "p4", "", "p5", "Lo/_configureGenerator;", "p6", "<init>", "(Landroid/content/Context;Lo/convertNumberToLong;Landroid/view/View;Lo/reportBadDefinition;Lo/JavaBigIntegerFromCharSequence;ILo/_configureGenerator;)V", "Lkotlin/Function1;", "(Landroid/content/Context;Lo/getAnswerMap;Lo/convertNumberToLong;Lo/JavaBigIntegerFromCharSequence;ILo/_configureGenerator;)V", "", "MediaBrowserCompatSearchResultReceiver", "()V", "RatingCompat", "MediaBrowserCompatItemReceiver", "Landroid/view/View;", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "Lo/reportBadDefinition;", "AudioAttributesImplBaseParcelizer", "Lo/JavaBigIntegerFromCharSequence;", "write", "I", "read", "", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Lo/JavaBigIntegerFromCharSequence$read;", "Lo/JavaBigIntegerFromCharSequence$read;", "(Lo/JavaBigIntegerFromCharSequence$read;)V", "updateBlock", "Lo/getAnswerMap;", "getUpdateBlock", "()Lo/getAnswerMap;", "setUpdateBlock", "(Lo/getAnswerMap;)V", "resetBlock", "getResetBlock", "setResetBlock", "releaseBlock", "getReleaseBlock", "setReleaseBlock"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements CoercionConfigs {

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final JavaBigIntegerFromCharSequence write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private JavaBigIntegerFromCharSequence.read MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final T IconCompatParcelizer;
    private final reportBadDefinition RemoteActionCompatParcelizer;
    private getAnswerMap<? super T, getShowPopup> releaseBlock;
    private getAnswerMap<? super T, getShowPopup> resetBlock;
    private getAnswerMap<? super T, getShowPopup> updateBlock;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int read;

    private ViewFactoryHolder(Context context, convertNumberToLong convertnumbertolong, T t, reportBadDefinition reportbaddefinition, JavaBigIntegerFromCharSequence javaBigIntegerFromCharSequence, int i, _configureGenerator _configuregenerator) {
        super(context, convertnumbertolong, i, reportbaddefinition, t, _configuregenerator);
        this.IconCompatParcelizer = t;
        this.RemoteActionCompatParcelizer = reportbaddefinition;
        this.write = javaBigIntegerFromCharSequence;
        this.read = i;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        this.AudioAttributesCompatParcelizer = strValueOf;
        Object objAudioAttributesCompatParcelizer = javaBigIntegerFromCharSequence != null ? javaBigIntegerFromCharSequence.AudioAttributesCompatParcelizer(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objAudioAttributesCompatParcelizer instanceof SparseArray ? (SparseArray) objAudioAttributesCompatParcelizer : null;
        if (sparseArray != null) {
            t.restoreHierarchyState(sparseArray);
        }
        MediaBrowserCompatSearchResultReceiver();
        this.updateBlock = AtomicLongDeserializer.RemoteActionCompatParcelizer();
        this.resetBlock = AtomicLongDeserializer.RemoteActionCompatParcelizer();
        this.releaseBlock = AtomicLongDeserializer.RemoteActionCompatParcelizer();
    }

    /* synthetic */ ViewFactoryHolder(Context context, convertNumberToLong convertnumbertolong, View view, reportBadDefinition reportbaddefinition, JavaBigIntegerFromCharSequence javaBigIntegerFromCharSequence, int i, _configureGenerator _configuregenerator, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, (i2 & 2) != 0 ? null : convertnumbertolong, view, (i2 & 8) != 0 ? new reportBadDefinition() : reportbaddefinition, javaBigIntegerFromCharSequence, i, _configuregenerator);
    }

    public ViewFactoryHolder(Context context, getAnswerMap<? super Context, ? extends T> getanswermap, convertNumberToLong convertnumbertolong, JavaBigIntegerFromCharSequence javaBigIntegerFromCharSequence, int i, _configureGenerator _configuregenerator) {
        this(context, convertnumbertolong, getanswermap.invoke(context), null, javaBigIntegerFromCharSequence, i, _configuregenerator, 8, null);
    }

    private final void read(JavaBigIntegerFromCharSequence.read readVar) {
        JavaBigIntegerFromCharSequence.read readVar2 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (readVar2 != null) {
            readVar2.RemoteActionCompatParcelizer();
        }
        this.MediaBrowserCompatCustomActionResultReceiver = readVar;
    }

    public final getAnswerMap<T, getShowPopup> getUpdateBlock() {
        return this.updateBlock;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "read", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        final /* synthetic */ ViewFactoryHolder<T> AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            read();
            return getShowPopup.INSTANCE;
        }

        public final void read() {
            this.AudioAttributesCompatParcelizer.getUpdateBlock().invoke(((ViewFactoryHolder) this.AudioAttributesCompatParcelizer).IconCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.AudioAttributesCompatParcelizer = viewFactoryHolder;
        }
    }

    public final void setUpdateBlock(getAnswerMap<? super T, getShowPopup> getanswermap) {
        this.updateBlock = getanswermap;
        RemoteActionCompatParcelizer(new AnonymousClass1(this));
    }

    public final getAnswerMap<T, getShowPopup> getResetBlock() {
        return this.resetBlock;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "RemoteActionCompatParcelizer", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        final /* synthetic */ ViewFactoryHolder<T> AudioAttributesCompatParcelizer;

        public final void RemoteActionCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.getResetBlock().invoke(((ViewFactoryHolder) this.AudioAttributesCompatParcelizer).IconCompatParcelizer);
        }

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            RemoteActionCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.AudioAttributesCompatParcelizer = viewFactoryHolder;
        }
    }

    public final void setResetBlock(getAnswerMap<? super T, getShowPopup> getanswermap) {
        this.resetBlock = getanswermap;
        write(new AnonymousClass3(this));
    }

    public final getAnswerMap<T, getShowPopup> getReleaseBlock() {
        return this.releaseBlock;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "read", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        final /* synthetic */ ViewFactoryHolder<T> RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            read();
            return getShowPopup.INSTANCE;
        }

        public final void read() {
            this.RemoteActionCompatParcelizer.getReleaseBlock().invoke(((ViewFactoryHolder) this.RemoteActionCompatParcelizer).IconCompatParcelizer);
            this.RemoteActionCompatParcelizer.RatingCompat();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.RemoteActionCompatParcelizer = viewFactoryHolder;
        }
    }

    public final void setReleaseBlock(getAnswerMap<? super T, getShowPopup> getanswermap) {
        this.releaseBlock = getanswermap;
        read(new AnonymousClass4(this));
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        JavaBigIntegerFromCharSequence javaBigIntegerFromCharSequence = this.write;
        if (javaBigIntegerFromCharSequence != null) {
            read(javaBigIntegerFromCharSequence.read(this.AudioAttributesCompatParcelizer, new AnonymousClass2(this)));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Object> {
        final /* synthetic */ ViewFactoryHolder<T> AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            ((ViewFactoryHolder) this.AudioAttributesCompatParcelizer).IconCompatParcelizer.saveHierarchyState(sparseArray);
            return sparseArray;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.AudioAttributesCompatParcelizer = viewFactoryHolder;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RatingCompat() {
        read((JavaBigIntegerFromCharSequence.read) null);
    }
}
