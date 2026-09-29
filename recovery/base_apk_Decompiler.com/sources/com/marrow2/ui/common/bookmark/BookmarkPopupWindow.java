package com.marrow2.ui.common.bookmark;

import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.marrow.R;
import com.marrow2.ui.common.bookmark.BookmarkPopupWindow;
import in.juspay.hypersdk.analytics.LogConstants;
import kotlin.Metadata;
import kotlin.RenewEligible;
import kotlin.StyledPlayerControlViewLayoutManagerExternalSyntheticLambda5;
import kotlin.getAnswerMap;
import kotlin.getCreatedOnDateMs;
import kotlin.getRenewExpiresOn;
import kotlin.getShowPopup;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001b\u001a\u00020\f8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u0014\u0010\u0012\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u0014\u0010\u0018\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010#\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!"}, d2 = {"Lcom/marrow2/ui/common/bookmark/BookmarkPopupWindow;", "Landroid/view/View$OnClickListener;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "p0", "Lkotlin/Function1;", "", "", "p1", "<init>", "(Landroid/content/Context;Lo/getAnswerMap;)V", "(Landroid/content/Context;)V", "Landroid/view/View;", "onClick", "(Landroid/view/View;)V", "Landroid/content/res/Configuration;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "read", "()V", "", "p2", "write", "(FF)V", "IconCompatParcelizer", "Lo/getAnswerMap;", "Landroid/widget/PopupWindow;", "RemoteActionCompatParcelizer", "Landroid/widget/PopupWindow;", "AudioAttributesCompatParcelizer", "Lo/RenewEligible;", "()Landroid/view/View;", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BookmarkPopupWindow extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final ImageView IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<Integer, getShowPopup> write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final PopupWindow AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final ImageView MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final ImageView read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BookmarkPopupWindow(final Context context, getAnswerMap<? super Integer, getShowPopup> getanswermap) {
        super(context);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.write = getanswermap;
        this.RemoteActionCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.lambdadisabled8comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return BookmarkPopupWindow.IconCompatParcelizer(context, this);
            }
        });
        final PopupWindow popupWindow = new PopupWindow(RemoteActionCompatParcelizer(), -2, -2, false);
        popupWindow.setWidth(-2);
        popupWindow.setHeight(-2);
        popupWindow.setTouchable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setAnimationStyle(R.style.PopupAnimation);
        popupWindow.setSoftInputMode(16);
        popupWindow.setTouchInterceptor(new View.OnTouchListener() { // from class: o.lambdarenderedFirstFrame6comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return BookmarkPopupWindow.RemoteActionCompatParcelizer(popupWindow, motionEvent);
            }
        });
        this.AudioAttributesCompatParcelizer = popupWindow;
        View viewFindViewById = findViewById(R.id.blueBookmark);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById, "");
        ImageView imageView = (ImageView) viewFindViewById;
        this.read = imageView;
        View viewFindViewById2 = findViewById(R.id.starBookmark);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById2, "");
        ImageView imageView2 = (ImageView) viewFindViewById2;
        this.IconCompatParcelizer = imageView2;
        View viewFindViewById3 = findViewById(R.id.quesBookmark);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById3, "");
        ImageView imageView3 = (ImageView) viewFindViewById3;
        this.MediaBrowserCompatItemReceiver = imageView3;
        BookmarkPopupWindow bookmarkPopupWindow = this;
        imageView.setOnClickListener(bookmarkPopupWindow);
        imageView2.setOnClickListener(bookmarkPopupWindow);
        imageView3.setOnClickListener(bookmarkPopupWindow);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BookmarkPopupWindow(Context context) {
        this(context, new getAnswerMap() { // from class: o.lambdaenabled0comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return BookmarkPopupWindow.IconCompatParcelizer();
            }
        });
        toMagicModuleMetaRepoModel.write(context, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer() {
        return getShowPopup.INSTANCE;
    }

    private final View RemoteActionCompatParcelizer() {
        Object objRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objRemoteActionCompatParcelizer, "");
        return (View) objRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View IconCompatParcelizer(Context context, BookmarkPopupWindow bookmarkPopupWindow) {
        return LayoutInflater.from(context).inflate(R.layout.layout_bookmark_popup_revamp, bookmarkPopupWindow);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int id = p0.getId();
        if (id == R.id.blueBookmark) {
            StyledPlayerControlViewLayoutManagerExternalSyntheticLambda5.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = StyledPlayerControlViewLayoutManagerExternalSyntheticLambda5.AudioAttributesCompatParcelizer.INSTANCE;
            StyledPlayerControlViewLayoutManagerExternalSyntheticLambda5.AudioAttributesCompatParcelizer.read(LogConstants.DEFAULT_CHANNEL);
            this.write.invoke(1);
        } else if (id == R.id.quesBookmark) {
            StyledPlayerControlViewLayoutManagerExternalSyntheticLambda5.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = StyledPlayerControlViewLayoutManagerExternalSyntheticLambda5.AudioAttributesCompatParcelizer.INSTANCE;
            StyledPlayerControlViewLayoutManagerExternalSyntheticLambda5.AudioAttributesCompatParcelizer.read("questionmark");
            this.write.invoke(3);
        } else if (id == R.id.starBookmark) {
            StyledPlayerControlViewLayoutManagerExternalSyntheticLambda5.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer3 = StyledPlayerControlViewLayoutManagerExternalSyntheticLambda5.AudioAttributesCompatParcelizer.INSTANCE;
            StyledPlayerControlViewLayoutManagerExternalSyntheticLambda5.AudioAttributesCompatParcelizer.read("star");
            this.write.invoke(2);
        }
        read();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration p0) {
        super.onConfigurationChanged(p0);
        read();
    }

    private final void read() {
        if (this.AudioAttributesCompatParcelizer.isShowing()) {
            this.AudioAttributesCompatParcelizer.dismiss();
        }
    }

    public final void write(float f, float f2) {
        read();
        this.AudioAttributesCompatParcelizer.showAtLocation(RemoteActionCompatParcelizer(), 8388659, (int) f, (int) f2);
    }

    public static final boolean RemoteActionCompatParcelizer(PopupWindow popupWindow, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 4) {
            return false;
        }
        popupWindow.dismiss();
        return false;
    }
}
