package kotlin;

import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0011\u0010\u000fJ*\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0015\u0010\u000fJ(\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0015\u0010\u0017J7\u0010\u000e\u001a\u00020\u0010*\u00020\u00182\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100\u0019H\u0000¢\u0006\u0004\b\u000e\u0010\u001aJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u001cJ<\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001d2\"\u0010\u0003\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\u0006\u0012\u0004\u0018\u00010 0\u001eH\u0082@¢\u0006\u0004\b\u000e\u0010!R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0014\u0010\u0015\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R/\u0010.\u001a\u0004\u0018\u00010-2\b\u0010\u0003\u001a\u0004\u0018\u00010-8C@CX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b\u0011\u00100\"\u0004\b\u0015\u00101R\u0014\u00104\u001a\u0002028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u00103R\u0014\u0010*\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u00105"}, d2 = {"Lo/buildModels;", "Lo/setGlobalExceptionHandler;", "Lo/CurrentQuery;", "p0", "Landroid/content/Context;", "p1", "Lo/getSpanCount;", "p2", "Lo/canCreateFromBoolean;", "p3", "<init>", "(Lo/CurrentQuery;Landroid/content/Context;Lo/getSpanCount;Lo/canCreateFromBoolean;)V", "", "Lo/findProperty;", "RemoteActionCompatParcelizer", "(Ljava/lang/CharSequence;JLo/SampleVideos;)Ljava/lang/Object;", "", "write", "Lo/getReferencedType;", "AudioAttributesCompatParcelizer", "(Ljava/lang/CharSequence;JLo/getReferencedType;Lo/SampleVideos;)Ljava/lang/Object;", "IconCompatParcelizer", "Landroid/view/textclassifier/TextClassifier;", "(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassifier;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/getAdapterPosition;", "Lkotlin/Function1;", "(Lo/getAdapterPosition;Ljava/lang/CharSequence;JLo/getAnswerMap;)V", "Landroid/view/textclassifier/TextClassification;", "(Ljava/lang/CharSequence;J)Landroid/view/textclassifier/TextClassification;", "T", "Lkotlin/Function2;", "Lo/SampleVideos;", "", "(Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/CurrentQuery;", "read", "Landroid/content/Context;", "AudioAttributesImplBaseParcelizer", "Lo/getSpanCount;", "Lo/canCreateFromBoolean;", "Lo/setDownloadPercent;", "Lo/setDownloadPercent;", "MediaBrowserCompatCustomActionResultReceiver", "Landroid/view/textclassifier/TextClassifier;", "MediaBrowserCompatItemReceiver", "Lo/onContextDestroyed;", "AudioAttributesImplApi26Parcelizer", "Lo/InputAccessor;", "()Lo/onContextDestroyed;", "(Lo/onContextDestroyed;)V", "Landroid/os/LocaleList;", "()Landroid/os/LocaleList;", "AudioAttributesImplApi21Parcelizer", "Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class buildModels implements setGlobalExceptionHandler {

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final getSpanCount write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final CurrentQuery read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private TextClassifier MediaBrowserCompatItemReceiver;
    private final Context RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final canCreateFromBoolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setDownloadPercent IconCompatParcelizer = setEncryptSalt.AudioAttributesCompatParcelizer(false);
    private final InputAccessor AudioAttributesImplApi26Parcelizer = available.RemoteActionCompatParcelizer$default(null, null, 2, null);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Object MediaBrowserCompatCustomActionResultReceiver = new Object();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getTotalMcq {
        long AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
        Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        Object read;
        int write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi26Parcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return buildModels.this.IconCompatParcelizer(null, 0L, null, this);
        }
    }

    public buildModels(CurrentQuery currentQuery, Context context, getSpanCount getspancount, canCreateFromBoolean cancreatefromboolean) {
        this.read = currentQuery;
        this.RemoteActionCompatParcelizer = context;
        this.write = getspancount;
        this.AudioAttributesCompatParcelizer = cancreatefromboolean;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(onContextDestroyed oncontextdestroyed) {
        this.AudioAttributesImplApi26Parcelizer.write(oncontextdestroyed);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final onContextDestroyed write() {
        return (onContextDestroyed) this.AudioAttributesImplApi26Parcelizer.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocaleList read() {
        LocaleList localeListWrite;
        canCreateFromBoolean cancreatefromboolean = this.AudioAttributesCompatParcelizer;
        return (cancreatefromboolean == null || (localeListWrite = EpoxyRecyclerViewWithModelsController.INSTANCE.write(cancreatefromboolean)) == null) ? new LocaleList(canCreateFromInt.INSTANCE.IconCompatParcelizer().getRemoteActionCompatParcelizer()) : localeListWrite;
    }

    @Override // kotlin.setGlobalExceptionHandler
    public final Object RemoteActionCompatParcelizer(CharSequence charSequence, long j, SampleVideos<? super findProperty> sampleVideos) {
        if (charSequence.length() == 0 || findProperty.write(j)) {
            return null;
        }
        return RemoteActionCompatParcelizer(new RemoteActionCompatParcelizer(charSequence, j, this, null), sampleVideos);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/TextRange;", "Landroid/view/textclassifier/TextClassifier;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TextClassifier, SampleVideos<? super findProperty>, Object> {
        final /* synthetic */ CharSequence AudioAttributesCompatParcelizer;
        private /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        Object AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ buildModels AudioAttributesImplBaseParcelizer;
        final /* synthetic */ long IconCompatParcelizer;
        int MediaBrowserCompatCustomActionResultReceiver;
        long RemoteActionCompatParcelizer;
        Object read;
        Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            long j;
            setDownloadPercent setdownloadpercent;
            CharSequence charSequence;
            TextSelection textSelection;
            buildModels buildmodels;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                TextClassifier textClassifier = (TextClassifier) this.AudioAttributesImplApi21Parcelizer;
                TextSelection.Request.Builder defaultLocales = new TextSelection.Request.Builder(this.AudioAttributesCompatParcelizer, findProperty.MediaBrowserCompatCustomActionResultReceiver(this.IconCompatParcelizer), findProperty.AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer)).setDefaultLocales(this.AudioAttributesImplBaseParcelizer.read());
                if (Build.VERSION.SDK_INT >= 31) {
                    defaultLocales.setIncludeTextClassification(true);
                }
                TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
                long jWrite = getValueInstantiator.write(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
                if (Build.VERSION.SDK_INT < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                    this.RemoteActionCompatParcelizer = jWrite;
                    this.MediaBrowserCompatCustomActionResultReceiver = 2;
                    if (this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, jWrite, textClassifier, this) != objIconCompatParcelizer) {
                        j = jWrite;
                    }
                } else {
                    setdownloadpercent = this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer;
                    buildModels buildmodels2 = this.AudioAttributesImplBaseParcelizer;
                    charSequence = this.AudioAttributesCompatParcelizer;
                    this.AudioAttributesImplApi21Parcelizer = textSelectionSuggestSelection;
                    this.read = setdownloadpercent;
                    this.write = buildmodels2;
                    this.AudioAttributesImplApi26Parcelizer = charSequence;
                    this.RemoteActionCompatParcelizer = jWrite;
                    this.MediaBrowserCompatCustomActionResultReceiver = 1;
                    if (setdownloadpercent.RemoteActionCompatParcelizer(null, this) != objIconCompatParcelizer) {
                        textSelection = textSelectionSuggestSelection;
                        buildmodels = buildmodels2;
                        j = jWrite;
                        setDownloadPercent setdownloadpercent2 = setdownloadpercent;
                        CharSequence charSequence2 = charSequence;
                        TextClassification textClassification = textSelection.getTextClassification();
                        toMagicModuleMetaRepoModel.write(textClassification);
                        buildmodels.IconCompatParcelizer(new onContextDestroyed(charSequence2, j, textClassification, null));
                        getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    }
                }
                return objIconCompatParcelizer;
            }
            if (i == 1) {
                j = this.RemoteActionCompatParcelizer;
                charSequence = (CharSequence) this.AudioAttributesImplApi26Parcelizer;
                buildModels buildmodels3 = (buildModels) this.write;
                setdownloadpercent = (setDownloadPercent) this.read;
                textSelection = (TextSelection) this.AudioAttributesImplApi21Parcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
                buildmodels = buildmodels3;
                setDownloadPercent setdownloadpercent22 = setdownloadpercent;
                CharSequence charSequence22 = charSequence;
                try {
                    TextClassification textClassification2 = textSelection.getTextClassification();
                    toMagicModuleMetaRepoModel.write(textClassification2);
                    buildmodels.IconCompatParcelizer(new onContextDestroyed(charSequence22, j, textClassification2, null));
                    getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                } finally {
                    setdownloadpercent22.write(null);
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.RemoteActionCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return findProperty.AudioAttributesCompatParcelizer(j);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(CharSequence charSequence, long j, buildModels buildmodels, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = charSequence;
            this.IconCompatParcelizer = j;
            this.AudioAttributesImplBaseParcelizer = buildmodels;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.AudioAttributesImplBaseParcelizer, sampleVideos);
            remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer = obj;
            return remoteActionCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TextClassifier textClassifier, SampleVideos<? super findProperty> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(textClassifier, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final Object write(CharSequence charSequence, long j, SampleVideos<? super getShowPopup> sampleVideos) {
        if (charSequence.length() == 0 || findProperty.write(j)) {
            return getShowPopup.INSTANCE;
        }
        return RemoteActionCompatParcelizer(new IconCompatParcelizer(charSequence, j, null), sampleVideos);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroid/view/textclassifier/TextClassifier;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TextClassifier, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Object IconCompatParcelizer;
        final /* synthetic */ long RemoteActionCompatParcelizer;
        int read;
        final /* synthetic */ CharSequence write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                TextClassifier textClassifier = (TextClassifier) this.IconCompatParcelizer;
                this.read = 1;
                if (buildModels.this.IconCompatParcelizer(this.write, this.RemoteActionCompatParcelizer, textClassifier, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(CharSequence charSequence, long j, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = charSequence;
            this.RemoteActionCompatParcelizer = j;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            IconCompatParcelizer iconCompatParcelizer = buildModels.this.new IconCompatParcelizer(this.write, this.RemoteActionCompatParcelizer, sampleVideos);
            iconCompatParcelizer.IconCompatParcelizer = obj;
            return iconCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TextClassifier textClassifier, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(textClassifier, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.setGlobalExceptionHandler
    public final Object AudioAttributesCompatParcelizer(CharSequence charSequence, long j, getReferencedType getreferencedtype, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objWrite = write(charSequence, j, sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }

    @Override // kotlin.setGlobalExceptionHandler
    public final Object IconCompatParcelizer(CharSequence charSequence, long j, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objWrite = write(charSequence, j, sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(java.lang.CharSequence r21, long r22, android.view.textclassifier.TextClassifier r24, kotlin.SampleVideos<? super kotlin.getShowPopup> r25) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.buildModels.IconCompatParcelizer(java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, o.SampleVideos):java.lang.Object");
    }

    public final void RemoteActionCompatParcelizer(getAdapterPosition getadapterposition, CharSequence charSequence, long j, getAnswerMap<? super getAdapterPosition, getShowPopup> getanswermap) {
        TextClassification textClassificationRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(charSequence, j);
        if (textClassificationRemoteActionCompatParcelizer == null) {
            getanswermap.invoke(getadapterposition);
            return;
        }
        if (!textClassificationRemoteActionCompatParcelizer.getActions().isEmpty()) {
            getLayoutPosition.read(getadapterposition, this.MediaBrowserCompatCustomActionResultReceiver, textClassificationRemoteActionCompatParcelizer, 0);
        } else if (EpoxyRecyclerViewWithModelsController.INSTANCE.RemoteActionCompatParcelizer(textClassificationRemoteActionCompatParcelizer)) {
            getLayoutPosition.read(getadapterposition, this.MediaBrowserCompatCustomActionResultReceiver, textClassificationRemoteActionCompatParcelizer, -1);
        }
        getanswermap.invoke(getadapterposition);
        List<RemoteAction> actions = textClassificationRemoteActionCompatParcelizer.getActions();
        int size = actions.size();
        for (int i = 0; i < size; i++) {
            actions.get(i);
            if (i > 0) {
                getLayoutPosition.read(getadapterposition, this.MediaBrowserCompatCustomActionResultReceiver, textClassificationRemoteActionCompatParcelizer, i);
            }
        }
    }

    public final TextClassification RemoteActionCompatParcelizer(CharSequence p0, long p1) {
        TextClassification iconCompatParcelizer = null;
        if (!this.IconCompatParcelizer.RemoteActionCompatParcelizer(null)) {
            return null;
        }
        onContextDestroyed oncontextdestroyedWrite = write();
        if (oncontextdestroyedWrite != null && addModelBuildListener.read(oncontextdestroyedWrite, p0, p1)) {
            iconCompatParcelizer = oncontextdestroyedWrite.getIconCompatParcelizer();
        }
        this.IconCompatParcelizer.write(null);
        return iconCompatParcelizer;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer<T> extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super T>, Object> {
        int AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        Object read;
        final /* synthetic */ MagicModuleSubmissionRequestBody<TextClassifier, SampleVideos<? super T>, Object> write;

        /* JADX WARN: Removed duplicated region for block: B:32:0x0092 A[RETURN] */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r8.AudioAttributesCompatParcelizer
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L34
                if (r1 == r4) goto L28
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.SdkPayloadData.IconCompatParcelizer(r9)
                return r9
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L1e:
                java.lang.Object r1 = r8.IconCompatParcelizer
                o.setDownloadPercent r1 = (kotlin.setDownloadPercent) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r9)     // Catch: java.lang.Throwable -> L26
                goto L71
            L26:
                r8 = move-exception
                goto L93
            L28:
                java.lang.Object r1 = r8.read
                o.buildModels r1 = (kotlin.buildModels) r1
                java.lang.Object r4 = r8.IconCompatParcelizer
                o.setDownloadPercent r4 = (kotlin.setDownloadPercent) r4
                kotlin.SdkPayloadData.IconCompatParcelizer(r9)
                goto L4f
            L34:
                kotlin.SdkPayloadData.IconCompatParcelizer(r9)
                o.buildModels r9 = kotlin.buildModels.this
                o.setDownloadPercent r9 = kotlin.buildModels.RemoteActionCompatParcelizer(r9)
                o.buildModels r1 = kotlin.buildModels.this
                r6 = r8
                o.SampleVideos r6 = (kotlin.SampleVideos) r6
                r8.IconCompatParcelizer = r9
                r8.read = r1
                r8.AudioAttributesCompatParcelizer = r4
                java.lang.Object r4 = r9.RemoteActionCompatParcelizer(r5, r6)
                if (r4 == r0) goto L9a
                r4 = r9
            L4f:
                android.view.textclassifier.TextClassifier r9 = kotlin.buildModels.write(r1)     // Catch: java.lang.Throwable -> L95
                if (r9 == 0) goto L5b
                boolean r6 = r9.isDestroyed()     // Catch: java.lang.Throwable -> L95
                if (r6 == 0) goto L74
            L5b:
                o.buildModels$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer r9 = new o.buildModels$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L95
                r9.<init>(r1, r5)     // Catch: java.lang.Throwable -> L95
                o.MagicModuleSubmissionRequestBody r9 = (kotlin.MagicModuleSubmissionRequestBody) r9     // Catch: java.lang.Throwable -> L95
                r8.IconCompatParcelizer = r4     // Catch: java.lang.Throwable -> L95
                r8.read = r5     // Catch: java.lang.Throwable -> L95
                r8.AudioAttributesCompatParcelizer = r3     // Catch: java.lang.Throwable -> L95
                r6 = 300(0x12c, double:1.48E-321)
                java.lang.Object r9 = kotlin.NestfputmCountryCode.RemoteActionCompatParcelizer(r6, r9, r8)     // Catch: java.lang.Throwable -> L95
                if (r9 == r0) goto L9a
                r1 = r4
            L71:
                android.view.textclassifier.TextClassifier r9 = (android.view.textclassifier.TextClassifier) r9     // Catch: java.lang.Throwable -> L26
                r4 = r1
            L74:
                r4.write(r5)
                o.buildModels$AudioAttributesCompatParcelizer$2 r1 = new o.buildModels$AudioAttributesCompatParcelizer$2
                o.MagicModuleSubmissionRequestBody<android.view.textclassifier.TextClassifier, o.SampleVideos<? super T>, java.lang.Object> r3 = r8.write
                r1.<init>(r9, r3, r5)
                o.MagicModuleSubmissionRequestBody r1 = (kotlin.MagicModuleSubmissionRequestBody) r1
                r9 = r8
                o.SampleVideos r9 = (kotlin.SampleVideos) r9
                r8.IconCompatParcelizer = r5
                r8.read = r5
                r8.AudioAttributesCompatParcelizer = r2
                r2 = 200(0xc8, double:9.9E-322)
                java.lang.Object r8 = kotlin.NestfputmCountryCode.RemoteActionCompatParcelizer(r2, r1, r9)
                if (r8 != r0) goto L92
                goto L9a
            L92:
                return r8
            L93:
                r4 = r1
                goto L96
            L95:
                r8 = move-exception
            L96:
                r4.write(r5)
                throw r8
            L9a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.buildModels.AudioAttributesCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: o.buildModels$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/view/textclassifier/TextClassifier;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C0065AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super TextClassifier>, Object> {
            int RemoteActionCompatParcelizer;
            final /* synthetic */ buildModels read;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getYear.IconCompatParcelizer();
                if (this.RemoteActionCompatParcelizer == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    TextClassifier textClassifierAudioAttributesCompatParcelizer = EpoxyRecyclerViewWithModelsController.INSTANCE.AudioAttributesCompatParcelizer(this.read.RemoteActionCompatParcelizer, this.read.write);
                    this.read.MediaBrowserCompatItemReceiver = textClassifierAudioAttributesCompatParcelizer;
                    return textClassifierAudioAttributesCompatParcelizer;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0065AudioAttributesCompatParcelizer(buildModels buildmodels, SampleVideos<? super C0065AudioAttributesCompatParcelizer> sampleVideos) {
                super(2, sampleVideos);
                this.read = buildmodels;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new C0065AudioAttributesCompatParcelizer(this.read, sampleVideos);
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super TextClassifier> sampleVideos) {
                return ((C0065AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: o.buildModels$AudioAttributesCompatParcelizer$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super T>, Object> {
            final /* synthetic */ MagicModuleSubmissionRequestBody<TextClassifier, SampleVideos<? super T>, Object> IconCompatParcelizer;
            int RemoteActionCompatParcelizer;
            final /* synthetic */ TextClassifier read;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.RemoteActionCompatParcelizer;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                    return obj;
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                TextClassifier textClassifier = this.read;
                if (textClassifier == null) {
                    return null;
                }
                MagicModuleSubmissionRequestBody<TextClassifier, SampleVideos<? super T>, Object> magicModuleSubmissionRequestBody = this.IconCompatParcelizer;
                this.RemoteActionCompatParcelizer = 1;
                Object objInvoke = magicModuleSubmissionRequestBody.invoke(textClassifier, this);
                return objInvoke == objIconCompatParcelizer ? objIconCompatParcelizer : objInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(TextClassifier textClassifier, MagicModuleSubmissionRequestBody<? super TextClassifier, ? super SampleVideos<? super T>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super AnonymousClass2> sampleVideos) {
                super(2, sampleVideos);
                this.read = textClassifier;
                this.IconCompatParcelizer = magicModuleSubmissionRequestBody;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass2(this.read, this.IconCompatParcelizer, sampleVideos);
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super T> sampleVideos) {
                return ((AnonymousClass2) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(MagicModuleSubmissionRequestBody<? super TextClassifier, ? super SampleVideos<? super T>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = magicModuleSubmissionRequestBody;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return buildModels.this.new AudioAttributesCompatParcelizer(this.write, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super T> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final <T> Object RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody<? super TextClassifier, ? super SampleVideos<? super T>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super T> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.read, new AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody, null), sampleVideos);
    }
}
