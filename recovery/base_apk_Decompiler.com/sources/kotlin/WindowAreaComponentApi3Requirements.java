package kotlin;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ViewPager2SavedState;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJU\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\u000e2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0014\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ5\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\"R\u0011\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R(\u0010!\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00060\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\"\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u0018\u0010\u001c\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010,\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001e\u0010%\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\u0006\n\u0004\b\u001c\u00105R\u0016\u0010*\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00106R\"\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001708078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00109R\u001b\u0010/\u001a\u00020:8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010;\u001a\u0004\b\u001c\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010=8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b!\u0010>R\u0014\u0010#\u001a\u00020@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010A"}, d2 = {"Lo/WindowAreaComponentApi3Requirements;", "Lo/nullsUsing;", "Landroid/view/View;", "p0", "Lkotlin/Function1;", "Lo/resetWithShared;", "", "p1", "Lo/ViewPagerSavedState;", "p2", "<init>", "(Landroid/view/View;Lo/getAnswerMap;Lo/ViewPagerSavedState;)V", "Lo/hasValueTypeDeserializer;", "Lo/ViewPager2SavedState$read;", "Lo/KeyDeserializers;", "", "Lo/findBeanDeserializer;", "p3", "Lo/ResolvableDeserializer;", "p4", "AudioAttributesCompatParcelizer", "(Lo/hasValueTypeDeserializer;Lo/ViewPager2SavedState$read;Lo/KeyDeserializers;Lo/getAnswerMap;Lo/getAnswerMap;)V", "Landroid/view/inputmethod/EditorInfo;", "Lo/endRearDisplayPresentationSession;", "write", "(Landroid/view/inputmethod/EditorInfo;)Lo/endRearDisplayPresentationSession;", "(Lo/hasValueTypeDeserializer;Lo/hasValueTypeDeserializer;)V", "Lo/WritableTypeIdInclusion;", "RemoteActionCompatParcelizer", "(Lo/WritableTypeIdInclusion;)V", "Lo/SettableBeanProperty;", "Lo/deserializeFromNumber;", "(Lo/hasValueTypeDeserializer;Lo/SettableBeanProperty;Lo/deserializeFromNumber;Lo/WritableTypeIdInclusion;Lo/WritableTypeIdInclusion;)V", "read", "()V", "MediaMetadataCompat", "Landroid/view/View;", "MediaBrowserCompatItemReceiver", "Lo/ViewPagerSavedState;", "IconCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "Lo/getAnswerMap;", "AudioAttributesImplApi21Parcelizer", "Lo/setImageDisplayMode;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/setImageDisplayMode;", "Lo/Typed3EpoxyController;", "MediaBrowserCompatSearchResultReceiver", "Lo/Typed3EpoxyController;", "Lo/CoercionConfig;", "MediaBrowserCompatMediaItem", "Lo/CoercionConfig;", "AudioAttributesImplBaseParcelizer", "Lo/hasValueTypeDeserializer;", "Lo/KeyDeserializers;", "", "Ljava/lang/ref/WeakReference;", "Ljava/util/List;", "Landroid/view/inputmethod/BaseInputConnection;", "Lo/RenewEligible;", "()Landroid/view/inputmethod/BaseInputConnection;", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "RatingCompat", "Lo/setPresentationView;", "Lo/setPresentationView;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WindowAreaComponentApi3Requirements implements nullsUsing {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setPresentationView MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private setImageDisplayMode RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final ViewPagerSavedState IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private CoercionConfig AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private Typed3EpoxyController MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final View write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public Rect RatingCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private getAnswerMap<? super List<? extends findBeanDeserializer>, getShowPopup> read = new getAnswerMap() { // from class: o.addRearDisplayStatusListener
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return WindowAreaComponentApi3Requirements.read((List) obj);
        }
    };

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private getAnswerMap<? super ResolvableDeserializer, getShowPopup> AudioAttributesCompatParcelizer = new getAnswerMap() { // from class: o.addRearDisplayPresentationStatusListener
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return WindowAreaComponentApi3Requirements.IconCompatParcelizer((ResolvableDeserializer) obj);
        }
    };

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public hasValueTypeDeserializer MediaBrowserCompatItemReceiver = new hasValueTypeDeserializer("", findProperty.INSTANCE.AudioAttributesCompatParcelizer(), (findProperty) null, 4, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private KeyDeserializers AudioAttributesImplApi21Parcelizer = KeyDeserializers.INSTANCE.read();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private List<WeakReference<endRearDisplayPresentationSession>> AudioAttributesImplApi26Parcelizer = new ArrayList();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final RenewEligible MediaBrowserCompatSearchResultReceiver = getRenewExpiresOn.write(RenewEligibleCompanion.read, new getCreatedOnDateMs() { // from class: o.getWindowAreaStatus
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return WindowAreaComponentApi3Requirements.AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer);
        }
    });

    public WindowAreaComponentApi3Requirements(View view, getAnswerMap<? super resetWithShared, getShowPopup> getanswermap, ViewPagerSavedState viewPagerSavedState) {
        this.write = view;
        this.IconCompatParcelizer = viewPagerSavedState;
        this.MediaMetadataCompat = new setPresentationView(getanswermap, viewPagerSavedState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(List list) {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(ResolvableDeserializer resolvableDeserializer) {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseInputConnection AudioAttributesImplApi26Parcelizer(WindowAreaComponentApi3Requirements windowAreaComponentApi3Requirements) {
        return new BaseInputConnection(windowAreaComponentApi3Requirements.write, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection RemoteActionCompatParcelizer() {
        return (BaseInputConnection) this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer();
    }

    public final void AudioAttributesCompatParcelizer(hasValueTypeDeserializer p0, ViewPager2SavedState.read p1, KeyDeserializers p2, getAnswerMap<? super List<? extends findBeanDeserializer>, getShowPopup> p3, getAnswerMap<? super ResolvableDeserializer, getShowPopup> p4) {
        this.MediaBrowserCompatItemReceiver = p0;
        this.AudioAttributesImplApi21Parcelizer = p2;
        this.read = p3;
        this.AudioAttributesCompatParcelizer = p4;
        this.RemoteActionCompatParcelizer = p1 != null ? p1.getRemoteActionCompatParcelizer() : null;
        this.MediaBrowserCompatCustomActionResultReceiver = p1 != null ? p1.getIconCompatParcelizer() : null;
        this.AudioAttributesImplBaseParcelizer = p1 != null ? p1.AudioAttributesImplApi26Parcelizer() : null;
    }

    @Override // kotlin.nullsUsing
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final endRearDisplayPresentationSession RemoteActionCompatParcelizer(EditorInfo p0) {
        setPageMarginDrawable.read$default(p0, this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(), this.MediaBrowserCompatItemReceiver.getAudioAttributesCompatParcelizer(), this.AudioAttributesImplApi21Parcelizer, null, 8, null);
        getWindowAreaDisplayMetrics.AudioAttributesCompatParcelizer(p0);
        hasValueTypeDeserializer hasvaluetypedeserializer = this.MediaBrowserCompatItemReceiver;
        boolean remoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer();
        endRearDisplayPresentationSession endreardisplaypresentationsession = new endRearDisplayPresentationSession(hasvaluetypedeserializer, new write(), remoteActionCompatParcelizer, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer);
        this.AudioAttributesImplApi26Parcelizer.add(new WeakReference<>(endreardisplaypresentationsession));
        return endreardisplaypresentationsession;
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ?\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\t\u0010\u0017"}, d2 = {"Lo/WindowAreaComponentApi3Requirements$write;", "Lo/ViewPager2;", "", "Lo/findBeanDeserializer;", "p0", "", "RemoteActionCompatParcelizer", "(Ljava/util/List;)V", "Lo/ResolvableDeserializer;", "AudioAttributesCompatParcelizer", "(I)V", "Landroid/view/KeyEvent;", "IconCompatParcelizer", "(Landroid/view/KeyEvent;)V", "", "p1", "p2", "p3", "p4", "p5", "read", "(ZZZZZZ)V", "Lo/endRearDisplayPresentationSession;", "(Lo/endRearDisplayPresentationSession;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements ViewPager2 {
        write() {
        }

        @Override // kotlin.ViewPager2
        public final void RemoteActionCompatParcelizer(List<? extends findBeanDeserializer> p0) {
            WindowAreaComponentApi3Requirements.this.read.invoke(p0);
        }

        @Override // kotlin.ViewPager2
        public final void AudioAttributesCompatParcelizer(int p0) {
            WindowAreaComponentApi3Requirements.this.AudioAttributesCompatParcelizer.invoke(ResolvableDeserializer.read(p0));
        }

        @Override // kotlin.ViewPager2
        public final void IconCompatParcelizer(KeyEvent p0) {
            WindowAreaComponentApi3Requirements.this.RemoteActionCompatParcelizer().sendKeyEvent(p0);
        }

        @Override // kotlin.ViewPager2
        public final void read(boolean p0, boolean p1, boolean p2, boolean p3, boolean p4, boolean p5) {
            WindowAreaComponentApi3Requirements.this.MediaMetadataCompat.write(p0, p1, p2, p3, p4, p5);
        }

        @Override // kotlin.ViewPager2
        public final void AudioAttributesCompatParcelizer(endRearDisplayPresentationSession p0) {
            int size = WindowAreaComponentApi3Requirements.this.AudioAttributesImplApi26Parcelizer.size();
            for (int i = 0; i < size; i++) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((WeakReference) WindowAreaComponentApi3Requirements.this.AudioAttributesImplApi26Parcelizer.get(i)).get(), p0)) {
                    WindowAreaComponentApi3Requirements.this.AudioAttributesImplApi26Parcelizer.remove(i);
                    return;
                }
            }
        }
    }

    public final void AudioAttributesCompatParcelizer(hasValueTypeDeserializer p0, hasValueTypeDeserializer p1) {
        boolean z = (findProperty.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver.getAudioAttributesCompatParcelizer(), p1.getAudioAttributesCompatParcelizer()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver.getIconCompatParcelizer(), p1.getIconCompatParcelizer())) ? false : true;
        this.MediaBrowserCompatItemReceiver = p1;
        int size = this.AudioAttributesImplApi26Parcelizer.size();
        for (int i = 0; i < size; i++) {
            endRearDisplayPresentationSession endreardisplaypresentationsession = this.AudioAttributesImplApi26Parcelizer.get(i).get();
            if (endreardisplaypresentationsession != null) {
                endreardisplaypresentationsession.RemoteActionCompatParcelizer(p1);
            }
        }
        this.MediaMetadataCompat.read();
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, p1)) {
            if (z) {
                ViewPagerSavedState viewPagerSavedState = this.IconCompatParcelizer;
                int iMediaBrowserCompatCustomActionResultReceiver = findProperty.MediaBrowserCompatCustomActionResultReceiver(p1.getAudioAttributesCompatParcelizer());
                int iAudioAttributesImplApi26Parcelizer = findProperty.AudioAttributesImplApi26Parcelizer(p1.getAudioAttributesCompatParcelizer());
                findProperty iconCompatParcelizer = this.MediaBrowserCompatItemReceiver.getIconCompatParcelizer();
                int iMediaBrowserCompatCustomActionResultReceiver2 = iconCompatParcelizer != null ? findProperty.MediaBrowserCompatCustomActionResultReceiver(iconCompatParcelizer.getIconCompatParcelizer()) : -1;
                findProperty iconCompatParcelizer2 = this.MediaBrowserCompatItemReceiver.getIconCompatParcelizer();
                viewPagerSavedState.read(iMediaBrowserCompatCustomActionResultReceiver, iAudioAttributesImplApi26Parcelizer, iMediaBrowserCompatCustomActionResultReceiver2, iconCompatParcelizer2 != null ? findProperty.AudioAttributesImplApi26Parcelizer(iconCompatParcelizer2.getIconCompatParcelizer()) : -1);
                return;
            }
            return;
        }
        if (p0 != null && (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0.AudioAttributesCompatParcelizer(), (Object) p1.AudioAttributesCompatParcelizer()) || (findProperty.IconCompatParcelizer(p0.getAudioAttributesCompatParcelizer(), p1.getAudioAttributesCompatParcelizer()) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0.getIconCompatParcelizer(), p1.getIconCompatParcelizer())))) {
            read();
            return;
        }
        int size2 = this.AudioAttributesImplApi26Parcelizer.size();
        for (int i2 = 0; i2 < size2; i2++) {
            endRearDisplayPresentationSession endreardisplaypresentationsession2 = this.AudioAttributesImplApi26Parcelizer.get(i2).get();
            if (endreardisplaypresentationsession2 != null) {
                endreardisplaypresentationsession2.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, this.IconCompatParcelizer);
            }
        }
    }

    public final void RemoteActionCompatParcelizer(WritableTypeIdInclusion p0) {
        Rect rect;
        this.RatingCompat = new Rect(getOnline.RemoteActionCompatParcelizer(p0.getAudioAttributesCompatParcelizer()), getOnline.RemoteActionCompatParcelizer(p0.getRemoteActionCompatParcelizer()), getOnline.RemoteActionCompatParcelizer(p0.getWrite()), getOnline.RemoteActionCompatParcelizer(p0.getIconCompatParcelizer()));
        if (!this.AudioAttributesImplApi26Parcelizer.isEmpty() || (rect = this.RatingCompat) == null) {
            return;
        }
        this.write.requestRectangleOnScreen(new Rect(rect));
    }

    public final void RemoteActionCompatParcelizer(hasValueTypeDeserializer p0, SettableBeanProperty p1, deserializeFromNumber p2, WritableTypeIdInclusion p3, WritableTypeIdInclusion p4) {
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(p0, p1, p2, p3, p4);
    }

    private final void read() {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
    }
}
