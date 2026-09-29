package kotlin;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow.R;
import com.marrow.data.api.models.response.plan.Coupon;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.plan.Plan;
import com.marrow.data.models.plan.PlanGroup;
import com.marrow.kt.base.BaseDaggerFragment;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResolvableApiException;
import kotlin.getLineAnchor;
import kotlin.getSwitchOrder;
import kotlin.isNewSubtitleDataAvailable;
import kotlin.parseStreamFragmentStartTag;
import kotlin.shouldEscapeCharacter;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b.\b\u0007\u0018\u0000 v2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001vB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\u0012\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\u0012\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001f\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010 \u001a\u00020\u000fH\u0014J\u0018\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J<\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010#2\b\u0010+\u001a\u0004\u0018\u00010#2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u00190-j\b\u0012\u0004\u0012\u00020\u0019`.H\u0016J\"\u0010/\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u00100\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%H\u0016J\u0018\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u0019H\u0016J\b\u00104\u001a\u00020\u0011H\u0002J\u0010\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u0019H\u0016J\u0010\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u0019H\u0016J\b\u00109\u001a\u00020\u0011H\u0016J\b\u0010:\u001a\u00020\u0011H\u0016J\b\u0010;\u001a\u00020\u0011H\u0016J\b\u0010<\u001a\u00020\u0011H\u0016JF\u0010=\u001a\u00020\u00112\b\u0010>\u001a\u0004\u0018\u00010\u00192\b\u0010?\u001a\u0004\u0018\u00010\u00192\b\u0010@\u001a\u0004\u0018\u00010\u00192\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020B2\u0006\u00100\u001a\u00020\u00192\u0006\u0010D\u001a\u00020\u0019H\u0016J\u0018\u0010E\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\u00192\u0006\u0010G\u001a\u00020\u0019H\u0016JN\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u00132\b\u0010>\u001a\u0004\u0018\u00010\u00192\u0006\u0010A\u001a\u00020B2\u0006\u00100\u001a\u00020\u00192\u0006\u0010D\u001a\u00020\u00192\b\u0010K\u001a\u0004\u0018\u00010\u00192\b\u0010@\u001a\u0004\u0018\u00010\u00192\u0006\u0010C\u001a\u00020BH\u0002J\b\u0010L\u001a\u00020\u0011H\u0016J\b\u0010M\u001a\u00020\u0011H\u0016J\u0012\u0010N\u001a\u00020\u00112\b\u0010O\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010P\u001a\u00020\u00112\b\u00102\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010Q\u001a\u00020\u0011H\u0016J\b\u0010R\u001a\u00020\u0011H\u0016J\b\u0010S\u001a\u00020\u0011H\u0016J\u0010\u0010T\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\u000fH\u0016J\u0010\u0010V\u001a\u00020\u00112\u0006\u0010W\u001a\u00020\u000fH\u0016J\b\u0010X\u001a\u00020\u0011H\u0016J\b\u0010Y\u001a\u00020\u0011H\u0016J\b\u0010Z\u001a\u00020\u0011H\u0016J\u0018\u0010[\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\u0010\u0010\\\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\u000fH\u0016J\u0010\u0010]\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\u000fH\u0016J\b\u0010^\u001a\u00020\u0011H\u0016J\b\u0010_\u001a\u00020\u0011H\u0002J\b\u0010`\u001a\u00020\u0011H\u0002J(\u0010a\u001a\u00020\u00112\u0006\u0010(\u001a\u00020)2\u0006\u0010K\u001a\u00020B2\u0006\u00106\u001a\u00020B2\u0006\u0010b\u001a\u00020\u000fH\u0016J@\u0010c\u001a\u00020\u00112\u0006\u0010d\u001a\u00020\u00192\u0006\u0010e\u001a\u00020B2\u0006\u0010f\u001a\u00020B2\u0006\u0010g\u001a\u00020B2\u0006\u0010h\u001a\u00020B2\u0006\u0010i\u001a\u00020\u00192\u0006\u0010j\u001a\u00020\u0019H\u0016J\u0010\u0010k\u001a\u00020\u00112\u0006\u0010l\u001a\u00020\u0019H\u0016J\b\u0010m\u001a\u00020\u0011H\u0016J\u0010\u0010n\u001a\u00020\u00112\u0006\u0010o\u001a\u00020%H\u0016J \u0010p\u001a\u00020\u00112\u0006\u0010q\u001a\u00020\u00192\u0006\u0010r\u001a\u00020\u00192\u0006\u0010s\u001a\u00020\u0019H\u0016J \u0010t\u001a\u00020\u00112\u0006\u0010q\u001a\u00020\u00192\u0006\u0010r\u001a\u00020\u00192\u0006\u0010s\u001a\u00020\u0019H\u0016J\b\u0010u\u001a\u00020\u0011H\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006w"}, d2 = {"Lcom/marrow/kt/ui/fragment/plan/plan_detail/PlanDetailFragmentV2;", "Lcom/marrow/kt/base/BaseDaggerFragment;", "Lcom/marrow/kt/ui/fragment/plan/plan_detail/PlanDetailContractV2$Presenter;", "Lcom/marrow/kt/ui/fragment/plan/plan_detail/PlanDetailContractV2$View;", "Lcom/marrow/kt/ui/fragment/plan/plan_detail/PlanDetailContractV2$Broadcaster;", "Lcom/marrow/ui/dialogs/ApplyNewCouponDialog$CouponApplyListener;", "<init>", "()V", "binding", "Lcom/marrow/databinding/FragmentPlanDetailBinding;", "getBinding", "()Lcom/marrow/databinding/FragmentPlanDetailBinding;", "binding$delegate", "Lcom/marrow/kt/base/view_binding/ViewBindingProperty;", "notesPriceHeight", "", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setTabletPadding", "setPlanDetailFinalPrice", "rupeeString", "", "showReferralCouponContainer", "showNormalCouponContainer", "hideNormalCouponContainer", "setReferralCoupon", "couponCode", "setNormalCoupon", "getLayout", "onValidCouponApplied", "coupon", "Lcom/marrow/data/api/models/response/plan/Coupon;", "isReferalCoupon", "", "planSelectBroadcast", "Landroid/content/Intent;", "plan", "Lcom/marrow/data/models/plan/Plan;", "availableCoupon", "rfCoupon", CourseConfigKeyConstantsKt.KEY_NOTES, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "showApplyCouponDialog", "planId", "openInfoDialog", "description", "planTitle", "showDialog", "setFinalOrderPrice", "finalPrice", "setPlanDetailDuration", "text", "showSummary", "hideSummary", "showReferralCouponText", "hideReferralCouponContainer", "addPlansInDropDown", "planPeriod", "normalDiscount", "refDiscount", "planAmt", "", "discountedPrice", "currentSelectedPlanId", "addFallbackTextInDropDown", "appliedCouponCode", "fallbackCouponCode", "inflatePlanInRadioGroup", "Landroidx/cardview/widget/CardView;", "childView", "discount", "showRenewBanner", "hideRenewBanner", "setPlanTitle", "groupSubttile", "addDescriptionView", "hideReferralCouponText", "hideNormalCouponText", "showNormalCouponText", "deselectDefaultPlan", "prevSelectedPlanIndex", "selectPlan", "currentSelectedPlanIndex", "hideViewMoreDuration", "showViewMoreDuration", "clearRadioGroups", "showCouponNotApplicableText", "hideDefaultCouponNotApplicableText", "hideFallBackCouponNotApplicableText", "showPlanKycDisclaimer", "showNotesPriceInformation", "hideNotesPriceInformation", "populatePaymentSummary", "couponType", "populateNotesExtra", "notesEditionLabel", "notesPrice", "shipping", "cgst", "sgst", "cgstLabel", "sgstLabel", "showNotesAddonCard", "title", "hideNotesAddonCardAndPrice", "updateNotesInclusionStatus", "areNotesIncluded", "showVpnDialog", "descriptionWarning", "descriptionWarningLinkTxt", "descriptionWarningLinkUrl", "showDescriptionWarning", "openTermsAndConditions", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getPositionAnchor extends getLineType<getLineAnchor.AudioAttributesCompatParcelizer> implements getLineAnchor.write, getLineAnchor.read, getSwitchOrder.IconCompatParcelizer {
    private int AudioAttributesImplBaseParcelizer;
    private final setSessionInfo write = SessionDescription.IconCompatParcelizer(this, new IconCompatParcelizer(), SessionDescriptionParser.RemoteActionCompatParcelizer());
    private static /* synthetic */ isResolutionNotSupported<Object>[] IconCompatParcelizer = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(getPositionAnchor.class, "binding", "getBinding()Lcom/marrow/databinding/FragmentPlanDetailBinding;", 0))};
    public static final write AudioAttributesCompatParcelizer = new write(null);
    private static String RemoteActionCompatParcelizer = "";

    @Override // com.marrow.kt.base.BaseDaggerFragment, kotlin.hasSelectionOverride
    public final int write() {
        return R.layout.fragment_plan_detail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final HlsManifest MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return (HlsManifest) this.write.read(this, IconCompatParcelizer[0]);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/getPositionAnchor$write;", "", "<init>", "()V", "Lcom/marrow/data/models/plan/PlanGroup;", "p0", "Lcom/marrow/data/api/models/response/plan/Coupon;", "p1", "p2", "", "p3", "", "p4", "Lo/getPositionAnchor;", "read", "(Lcom/marrow/data/models/plan/PlanGroup;Lcom/marrow/data/api/models/response/plan/Coupon;Lcom/marrow/data/api/models/response/plan/Coupon;ZLjava/lang/String;)Lo/getPositionAnchor;", "RemoteActionCompatParcelizer", "Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write {
        private write() {
        }

        @getMagicModuleMeta
        public static getPositionAnchor read(PlanGroup p0, Coupon p1, Coupon p2, boolean p3, String p4) {
            String title;
            Plan defaultPlan;
            getPositionAnchor getpositionanchor = new getPositionAnchor();
            Bundle bundle = new Bundle();
            if (p0 != null) {
                bundle.putString("plan_group", p0.toJSON().toString());
            }
            if (p1 != null) {
                bundle.putString("coupon", p1.toJSON().toString());
            }
            if (p2 != null) {
                bundle.putString("referral_coupon", p2.toJSON().toString());
            }
            bundle.putBoolean("is_plan_expanded", p3);
            bundle.putString("plan_id", p4);
            if (p0 == null || (defaultPlan = p0.getDefaultPlan(p1)) == null || (title = defaultPlan.getTitle()) == null) {
                title = "";
            }
            getPositionAnchor.RemoteActionCompatParcelizer = title;
            getpositionanchor.setArguments(bundle);
            return getpositionanchor;
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.hasSelectionOverride, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        toMagicModuleMetaRepoModel.write(view, "");
        super.onViewCreated(view, savedInstanceState);
        onPlay();
        TextView textView = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        CardView cardView = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
        BaseDaggerFragment.RemoteActionCompatParcelizer(new View[]{textView, cardView}, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.getTextSize
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getPositionAnchor.AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
        TextView textView2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().RatingCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        CardView cardView2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView2, "");
        BaseDaggerFragment.RemoteActionCompatParcelizer(new View[]{textView2, cardView2}, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.getVerticalType
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getPositionAnchor.AudioAttributesImplBaseParcelizer(this.read);
            }
        });
        d_(RemoteActionCompatParcelizer);
        CustomButton customButton = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customButton, "");
        AudioAttributesCompatParcelizer(customButton, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.getWindowColor
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getPositionAnchor.MediaBrowserCompatItemReceiver(this.write);
            }
        });
        CustomTextView customTextView = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onRemoveQueueItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        AudioAttributesCompatParcelizer(customTextView, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.setBitmap
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getPositionAnchor.RatingCompat(this.read);
            }
        });
        ImageView imageView = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaBrowserCompatItemReceiver.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        bytesRead.AudioAttributesCompatParcelizer(imageView, 1, (getAnswerMap<? super View, getShowPopup>) new getAnswerMap() { // from class: o.isWindowColorSet
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getPositionAnchor.RemoteActionCompatParcelizer(this.write, (View) obj);
            }
        });
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onRewind.setOnClickListener(new View.OnClickListener() { // from class: o.setLineAnchor
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                getPositionAnchor.MediaBrowserCompatSearchResultReceiver(this.read);
            }
        });
        this.AudioAttributesImplBaseParcelizer = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().read.getHeight();
        ((getLineAnchor.AudioAttributesCompatParcelizer) getMPresenter()).RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(getPositionAnchor getpositionanchor) {
        ((getLineAnchor.AudioAttributesCompatParcelizer) getpositionanchor.getMPresenter()).AudioAttributesCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(getPositionAnchor getpositionanchor) {
        ((getLineAnchor.AudioAttributesCompatParcelizer) getpositionanchor.getMPresenter()).read();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(getPositionAnchor getpositionanchor) {
        ((getLineAnchor.AudioAttributesCompatParcelizer) getpositionanchor.getMPresenter()).IconCompatParcelizer(getpositionanchor);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RatingCompat(getPositionAnchor getpositionanchor) {
        ((getLineAnchor.AudioAttributesCompatParcelizer) getpositionanchor.getMPresenter()).write();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getPositionAnchor getpositionanchor, View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        ((getLineAnchor.AudioAttributesCompatParcelizer) getpositionanchor.getMPresenter()).IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatSearchResultReceiver(final getPositionAnchor getpositionanchor) {
        getpositionanchor.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaBrowserCompatSearchResultReceiver.post(new Runnable() { // from class: o.getTextAlignment
            @Override // java.lang.Runnable
            public final void run() {
                getPositionAnchor.MediaDescriptionCompat(this.AudioAttributesCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaDescriptionCompat(getPositionAnchor getpositionanchor) {
        getpositionanchor.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaBrowserCompatSearchResultReceiver.fullScroll(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
    }

    private final void onPlay() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            ConstraintLayout constraintLayout = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
            PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer(contextRequireContext, constraintLayout);
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            ConstraintLayout constraintLayout2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout2, "");
            PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer(contextRequireContext2, constraintLayout2);
            Context contextRequireContext3 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
            TextView textView = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onPlayFromMediaId;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer(contextRequireContext3, textView);
            Context contextRequireContext4 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext4, "");
            LinearLayout linearLayoutIconCompatParcelizer = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaBrowserCompatItemReceiver.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
            PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer(contextRequireContext4, linearLayoutIconCompatParcelizer);
        }
    }

    @Override // o.getLineAnchor.write
    public final void MediaBrowserCompatCustomActionResultReceiver(String str) {
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onPause.setText(str);
    }

    @Override // o.getLineAnchor.write
    public final void onCommand() {
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaMetadataCompat.setVisibility(0);
    }

    @Override // o.getLineAnchor.write
    public final void MediaMetadataCompat() {
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().AudioAttributesImplBaseParcelizer.setVisibility(0);
    }

    @Override // o.getLineAnchor.write
    public final void IconCompatParcelizer() {
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().AudioAttributesImplBaseParcelizer.setVisibility(8);
    }

    @Override // o.getLineAnchor.write
    public final void MediaBrowserCompatItemReceiver(String str) {
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onPlayFromSearch.setText(str);
    }

    @Override // o.getLineAnchor.write
    public final void write(String str) {
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onCommand.setText(str);
    }

    @Override // o.getSwitchOrder.IconCompatParcelizer
    public final void read(Coupon coupon, boolean z) {
        toMagicModuleMetaRepoModel.write(coupon, "");
        RadioGroup radioGroup = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(radioGroup, "");
        CustomTextView customTextView = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(radioGroup, customTextView);
        ((getLineAnchor.AudioAttributesCompatParcelizer) getMPresenter()).IconCompatParcelizer(coupon, z);
    }

    @Override // o.getLineAnchor.read
    public final Intent IconCompatParcelizer(Plan plan, Coupon coupon, Coupon coupon2, ArrayList<String> arrayList) {
        toMagicModuleMetaRepoModel.write(plan, "");
        toMagicModuleMetaRepoModel.write(arrayList, "");
        isNewSubtitleDataAvailable.RemoteActionCompatParcelizer remoteActionCompatParcelizer = isNewSubtitleDataAvailable.read;
        return isNewSubtitleDataAvailable.RemoteActionCompatParcelizer.read(plan, coupon, coupon2, arrayList);
    }

    public static final class IconCompatParcelizer implements getAnswerMap<getPositionAnchor, HlsManifest> {
        /* JADX WARN: Type inference failed for: r0v1, types: [o.HlsManifest, o.getApplicationLabel] */
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ HlsManifest invoke(getPositionAnchor getpositionanchor) {
            return RemoteActionCompatParcelizer(getpositionanchor);
        }

        private static HlsManifest RemoteActionCompatParcelizer(getPositionAnchor getpositionanchor) {
            toMagicModuleMetaRepoModel.write(getpositionanchor, "");
            return HlsManifest.IconCompatParcelizer(getpositionanchor.requireView());
        }
    }

    @Override // o.getLineAnchor.write
    public final void RemoteActionCompatParcelizer(String str, String str2, boolean z) {
        toMagicModuleMetaRepoModel.write(str2, "");
        RemoteActionCompatParcelizer();
        getSwitchOrder.Companion companion = getSwitchOrder.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        this.read = getSwitchOrder.Companion.AudioAttributesCompatParcelizer(contextRequireContext, str, str2, z);
        Dialog dialog = this.read;
        toMagicModuleMetaRepoModel.read(dialog, "");
        ((getSwitchOrder) dialog).read(this);
        onFastForward();
    }

    private final void onFastForward() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        setBitrateKbps.read(childFragmentManager, "vpn_dialog", true);
        this.read.show();
    }

    @Override // o.getLineAnchor.write
    public final void RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onPause.setText(str);
    }

    @Override // o.getLineAnchor.write
    public final void AudioAttributesImplBaseParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onPrepare.setText(str);
    }

    @Override // o.getLineAnchor.write
    public final void handleMediaPlayPauseIfPendingOnHandler() {
        TextView textView = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(textView);
    }

    @Override // o.getLineAnchor.write
    public final void AudioAttributesImplBaseParcelizer() {
        CardView cardView = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(cardView);
    }

    @Override // o.getLineAnchor.write
    public final void RemoteActionCompatParcelizer(String str, String str2, String str3, double d, double d2, String str4, String str5) {
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        View viewInflate = getLayoutInflater().inflate(R.layout.view_type_plan_duration, (ViewGroup) MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().AudioAttributesImplApi26Parcelizer, false);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate, "");
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().AudioAttributesImplApi26Parcelizer.addView(RemoteActionCompatParcelizer(viewInflate, str, d, str4, str5, str2, str3, d2));
    }

    @Override // o.getLineAnchor.write
    public final void write(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        View viewInflate = getLayoutInflater().inflate(R.layout.view_type_plan_fallback_text, (ViewGroup) MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().AudioAttributesImplApi26Parcelizer, false);
        String string = getString(R.string.coupon_not_applicable_long, str, str2);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String str3 = string;
        SpannableString spannableString = new SpannableString(str3);
        int i = TestGroupLSModel.read((CharSequence) str3, str, 0, false, 6);
        int length = str.length();
        int i2 = TestGroupLSModel.read((CharSequence) str3, str2, 0, false, 6);
        int length2 = str2.length();
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        String string2 = getString(R.string.font_roboto_bold);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        dispatchTouchEvent.read(spannableString, contextRequireContext, string2, i, length + i);
        Context contextRequireContext2 = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
        String string3 = getString(R.string.font_roboto_bold);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        dispatchTouchEvent.read(spannableString, contextRequireContext2, string3, i2, length2 + i2);
        ((CustomTextView) viewInflate.findViewById(R.id.ctvCouponWarning)).setText(spannableString);
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().AudioAttributesImplApi26Parcelizer.addView(viewInflate);
    }

    private final CardView RemoteActionCompatParcelizer(View view, String str, double d, final String str2, String str3, String str4, String str5, double d2) {
        boolean z = d2 == d;
        toMagicModuleMetaRepoModel.read(view, "");
        CardView cardView = (CardView) view;
        RadioButton radioButton = (RadioButton) cardView.findViewById(R.id.rdMonths);
        radioButton.setChecked(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str2, (Object) str3));
        radioButton.setText(str);
        toMagicModuleMetaRepoModel.write(radioButton);
        BaseDaggerFragment.RemoteActionCompatParcelizer(new View[]{cardView, radioButton}, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.getTextSizeType
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getPositionAnchor.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, str2);
            }
        });
        if (str4 != null) {
            CustomTextView customTextView = (CustomTextView) cardView.findViewById(R.id.tvNormalEntitlements);
            customTextView.setText(str4);
            toMagicModuleMetaRepoModel.write(customTextView);
            PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(customTextView);
        }
        if (str5 != null) {
            CustomTextView customTextView2 = (CustomTextView) cardView.findViewById(R.id.tvRefEntitlements);
            customTextView2.setText(str5);
            toMagicModuleMetaRepoModel.write(customTextView2);
            PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(customTextView2);
        }
        CustomTextView customTextView3 = (CustomTextView) cardView.findViewById(R.id.plan_amount_view);
        CustomTextView customTextView4 = (CustomTextView) cardView.findViewById(R.id.tvActualStrikethroughPrice);
        if (!z) {
            toMagicModuleMetaRepoModel.write(customTextView4);
            toMagicModuleMetaRepoModel.write(customTextView3);
            PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(customTextView4, customTextView3);
            customTextView4.setText(parseDolbyChannelConfiguration.read(d));
            PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer((TextView) customTextView4);
            customTextView3.setText(parseDolbyChannelConfiguration.read(d2));
            return cardView;
        }
        customTextView3.setText(parseDolbyChannelConfiguration.read(d));
        toMagicModuleMetaRepoModel.write(customTextView3);
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(customTextView3);
        toMagicModuleMetaRepoModel.write(customTextView4);
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(customTextView4);
        return cardView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getPositionAnchor getpositionanchor, String str) {
        ((getLineAnchor.AudioAttributesCompatParcelizer) getpositionanchor.getMPresenter()).read(str);
        return getShowPopup.INSTANCE;
    }

    @Override // o.getLineAnchor.write
    public final void onCustomAction() {
        ConstraintLayout constraintLayout = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        PlayerControlViewExternalSyntheticLambda1.write(constraintLayout);
    }

    @Override // o.getLineAnchor.write
    public final void AudioAttributesImplApi26Parcelizer() {
        ConstraintLayout constraintLayout = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(constraintLayout);
    }

    @Override // o.getLineAnchor.write
    public final void AudioAttributesImplApi21Parcelizer(String str) {
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onPrepareFromSearch.setText(str);
    }

    @Override // o.getLineAnchor.write
    public final void IconCompatParcelizer(String str) {
        View viewInflate = getLayoutInflater().inflate(R.layout.view_type_plan_desc_tick, (ViewGroup) MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaBrowserCompatCustomActionResultReceiver, false);
        toMagicModuleMetaRepoModel.read(viewInflate, "");
        CustomTextView customTextView = (CustomTextView) viewInflate;
        customTextView.setText(str);
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaBrowserCompatCustomActionResultReceiver.addView(customTextView);
    }

    @Override // o.getLineAnchor.write
    public final void MediaBrowserCompatItemReceiver() {
        TextView textView = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(textView);
    }

    @Override // o.getLineAnchor.write
    public final void AudioAttributesCompatParcelizer() {
        TextView textView = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().RatingCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(textView);
    }

    @Override // o.getLineAnchor.write
    public final void MediaBrowserCompatSearchResultReceiver() {
        TextView textView = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().RatingCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(textView);
    }

    @Override // o.getLineAnchor.write
    public final void write(int i) {
        ((RadioButton) MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().AudioAttributesImplApi26Parcelizer.getChildAt(i).findViewById(R.id.rdMonths)).setChecked(false);
    }

    @Override // o.getLineAnchor.write
    public final void AudioAttributesCompatParcelizer(int i) {
        ((RadioButton) MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().AudioAttributesImplApi26Parcelizer.getChildAt(i).findViewById(R.id.rdMonths)).setChecked(true);
    }

    @Override // o.getLineAnchor.write
    public final void RatingCompat() {
        CustomTextView customTextView = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onRemoveQueueItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(customTextView);
    }

    @Override // o.getLineAnchor.write
    public final void onAddQueueItem() {
        CustomTextView customTextView = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onRemoveQueueItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(customTextView);
    }

    @Override // o.getLineAnchor.write
    public final void read() {
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().AudioAttributesImplApi26Parcelizer.removeAllViews();
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().AudioAttributesImplApi21Parcelizer.removeAllViews();
    }

    @Override // o.getLineAnchor.write
    public final void RemoteActionCompatParcelizer(int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        TextView textView = (TextView) MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().AudioAttributesImplApi26Parcelizer.getChildAt(i).findViewById(R.id.tvCouponNotApplicable);
        SpannableString spannableString = new SpannableString(getString(R.string.coupon_not_applicable, str));
        SpannableString spannableString2 = spannableString;
        int i2 = TestGroupLSModel.read((CharSequence) spannableString2, str, 0, false, 6);
        int length = str.length();
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        String string = getString(R.string.font_roboto_bold);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        dispatchTouchEvent.read(spannableString, contextRequireContext, string, i2, length + i2);
        textView.setText(spannableString2);
        toMagicModuleMetaRepoModel.write(textView);
        PlayerControlViewExternalSyntheticLambda1.write((View) textView);
    }

    @Override // o.getLineAnchor.write
    public final void MediaDescriptionCompat() {
        TextView textView = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onPlayFromMediaId;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        PlayerControlViewExternalSyntheticLambda1.write((View) textView);
        String strF_ = f_(R.string.text_block_terms);
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(strF_);
        String str = strRemoteActionCompatParcelizer;
        SpannableString spannableString = new SpannableString(str);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.write((Object) strRemoteActionCompatParcelizer);
        toMagicModuleMetaRepoModel.write((Object) strF_);
        int i = TestGroupLSModel.read((CharSequence) str, strF_, 0, false, 6);
        spannableString.setSpan(remoteActionCompatParcelizer, i, strF_.length() + i, 18);
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        dispatchTouchEvent.write(spannableString, contextRequireContext, R.color.text_blue, i, strF_.length() + i);
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onPlayFromMediaId.setText(spannableString);
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onPlayFromMediaId.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static final class RemoteActionCompatParcelizer extends ClickableSpan {
        RemoteActionCompatParcelizer() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            getPositionAnchor.this.onMediaButtonEvent();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            toMagicModuleMetaRepoModel.write(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    private final void onPrepare() {
        ConstraintLayout constraintLayout = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        onDraw.AudioAttributesCompatParcelizer(constraintLayout, this.AudioAttributesImplBaseParcelizer, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.lambdanew1comgoogleandroidexoplayer2uiDefaultTimeBar
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return onDraw.RemoteActionCompatParcelizer();
            }
        });
    }

    private final void onPlayFromMediaId() {
        ConstraintLayout constraintLayout = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        onDraw.IconCompatParcelizer(constraintLayout, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.onFocusChanged
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return onDraw.write();
            }
        });
    }

    @Override // o.getLineAnchor.write
    public final void write(Plan plan, double d, double d2) {
        toMagicModuleMetaRepoModel.write(plan, "");
        String string = getString(R.string.label_minus, parseDolbyChannelConfiguration.read(d));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onPlayFromUri.setText(plan.getTitle());
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().handleMediaPlayPauseIfPendingOnHandler.setText(string);
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onPrepareFromUri.setText(parseDolbyChannelConfiguration.read(plan.getPrice()));
        if (d <= 0.0d) {
            TextView textView = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            TextView textView2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().handleMediaPlayPauseIfPendingOnHandler;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(textView, textView2);
        } else {
            TextView textView3 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
            TextView textView4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().handleMediaPlayPauseIfPendingOnHandler;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView4, "");
            PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(textView3, textView4);
        }
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onMediaButtonEvent.setText(parseDolbyChannelConfiguration.read(d2));
    }

    @Override // o.getLineAnchor.write
    public final void AudioAttributesCompatParcelizer(String str, double d, double d2, double d3, double d4, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onFastForward.setText(str);
        TextView textView = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onPlay;
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        double d5 = d - ((double) ((int) d));
        currencyInstance.setMinimumFractionDigits((d5 == 0.0d ? 1 : 0) ^ 1);
        currencyInstance.setMaximumFractionDigits((d5 * 10.0d) % 1.0d == 0.0d ? 1 : 2);
        String str4 = currencyInstance.format(d);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
        textView.setText(str4);
        TextView textView2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onRemoveQueueItemAt;
        NumberFormat currencyInstance2 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        double d6 = d2 - ((double) ((int) d2));
        currencyInstance2.setMinimumFractionDigits((d6 == 0.0d ? 1 : 0) ^ 1);
        currencyInstance2.setMaximumFractionDigits((d6 * 10.0d) % 1.0d == 0.0d ? 1 : 2);
        String str5 = currencyInstance2.format(d2);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str5, "");
        textView2.setText(str5);
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onCustomAction.setText(str2);
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onSeekTo.setText(str3);
        TextView textView3 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onAddQueueItem;
        NumberFormat currencyInstance3 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        double d7 = d3 - ((double) ((int) d3));
        currencyInstance3.setMinimumFractionDigits((d7 == 0.0d ? 1 : 0) ^ 1);
        currencyInstance3.setMaximumFractionDigits((d7 * 10.0d) % 1.0d == 0.0d ? 1 : 2);
        String str6 = currencyInstance3.format(d3);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str6, "");
        textView3.setText(str6);
        TextView textView4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onPrepareFromMediaId;
        NumberFormat currencyInstance4 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        double d8 = d4 - ((double) ((int) d4));
        currencyInstance4.setMinimumFractionDigits((d8 == 0.0d ? 1 : 0) ^ 1);
        currencyInstance4.setMaximumFractionDigits((d8 * 10.0d) % 1.0d == 0.0d ? 1 : 2);
        String str7 = currencyInstance4.format(d4);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str7, "");
        textView4.setText(str7);
    }

    @Override // o.getLineAnchor.write
    public final void AudioAttributesImplApi26Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer.setText(str);
        LinearLayout linearLayoutIconCompatParcelizer = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaBrowserCompatItemReceiver.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        bytesRead.write(linearLayoutIconCompatParcelizer, 400L);
    }

    @Override // o.getLineAnchor.write
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        ConstraintLayout constraintLayout = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(constraintLayout);
        LinearLayout linearLayoutIconCompatParcelizer = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaBrowserCompatItemReceiver.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        bytesRead.read(linearLayoutIconCompatParcelizer, 400L);
    }

    @Override // o.getLineAnchor.write
    public final void write(boolean z) {
        if (z) {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaBrowserCompatItemReceiver.IconCompatParcelizer.setImageResource(R.drawable.ic_notes_added);
            onPrepare();
        } else {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaBrowserCompatItemReceiver.IconCompatParcelizer.setImageResource(R.drawable.ic_add_notes);
            onPlayFromMediaId();
        }
    }

    @Override // o.getLineAnchor.write
    public final void AudioAttributesCompatParcelizer(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        RemoteActionCompatParcelizer();
        parseStreamFragmentStartTag.Companion companion = parseStreamFragmentStartTag.INSTANCE;
        setBitrateKbps.IconCompatParcelizer(this, parseStreamFragmentStartTag.Companion.write(str, str2, str3), "vpn_dialog");
    }

    @Override // o.getLineAnchor.write
    public final void read(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        String string = sb.toString();
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(str3);
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(shouldEscapeCharacter.Companion.read(contextRequireContext, R.attr.onSurfaceBgLinks, new TypedValue(), true));
        int length = str.length() + 1;
        int length2 = string.length();
        TextView textView = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onSetPlaybackSpeed;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(audioAttributesCompatParcelizer, length, length2, 18);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, length2, 18);
        textView.setText(spannableStringBuilder);
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onSetPlaybackSpeed.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onSetPlaybackSpeed;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        PlayerControlViewExternalSyntheticLambda1.write((View) textView2);
    }

    public static final class AudioAttributesCompatParcelizer extends ClickableSpan {
        private /* synthetic */ String IconCompatParcelizer;

        AudioAttributesCompatParcelizer(String str) {
            this.IconCompatParcelizer = str;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            if (getPositionAnchor.this.isAdded()) {
                getPositionAnchor.this.b_(this.IconCompatParcelizer);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            toMagicModuleMetaRepoModel.write(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMediaButtonEvent() {
        ResolvableApiException.Companion companion = ResolvableApiException.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        String string = getString(R.string.clickable_text_terms_condition_landing_page);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        startActivity(ResolvableApiException.Companion.read(contextRequireContext, new canceledPendingResult("https://www.marrow.com/home/terms", string, null, 4, null)));
    }
}
