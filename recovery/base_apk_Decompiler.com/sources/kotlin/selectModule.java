package kotlin;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.transition.AutoTransition;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.material.textfield.TextInputLayout;
import com.marrow.R;
import com.marrow.data.api.models.response.payment.PaymentStatusResponseKt;
import com.marrow.data.api.models.response.plan.Coupon;
import com.marrow.data.models.plan.Plan;
import com.marrow.data.models.plan.PlanAddOns;
import com.marrow.data.models.plan.Subscription;
import com.marrow2.ui.plan.post_purchase.PaymentDone2ViewModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Attachment;
import kotlin.Fido2PrivilegedApiClient;
import kotlin.Metadata;
import kotlin.ResolvableApiException;
import kotlin.VisibilityChecker;
import kotlin._init_lambda4;
import kotlin.efmt;
import kotlin.selectModule;
import kotlin.setSmallestDisplacement;
import kotlin.withFieldVisibility;
import kotlin.zadb;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0004J!\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0004J%\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0014\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020!2\u0006\u0010\b\u001a\u00020\"H\u0002¢\u0006\u0004\b\u001f\u0010#J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010$J\u000f\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010%\u001a\u00020\u000eH\u0002¢\u0006\u0004\b%\u0010\u0004J-\u0010&\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u00172\b\u0010\n\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020(H\u0002¢\u0006\u0004\b\u001f\u0010)J\u000f\u0010*\u001a\u00020\u000eH\u0002¢\u0006\u0004\b*\u0010\u0004J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020!H\u0002¢\u0006\u0004\b\u001d\u0010+R\u001b\u0010\u001d\u001a\u00020,8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010-\u001a\u0004\b\u001d\u0010.R\u0018\u0010&\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u00100R\u0014\u0010\u0014\u001a\u00020/8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001e\u0010\u001f\u001a\f\u0012\b\u0012\u0006*\u00020404038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00105"}, d2 = {"Lo/selectModule;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroyView", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "read", "AudioAttributesImplBaseParcelizer", "", "", "", "(Ljava/util/List;Z)V", "onClick", "(Landroid/view/View;)V", "Lo/getAlgoValue;", "AudioAttributesCompatParcelizer", "(Lo/getAlgoValue;)V", "write", "(ZZ)V", "Lo/setSourceChunk;", "Lo/GmsLogger;", "(Lo/setSourceChunk;Lo/GmsLogger;)V", "(Z)V", "AudioAttributesImplApi26Parcelizer", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "(J)V", "MediaBrowserCompatItemReceiver", "(Lo/setSourceChunk;)V", "Lcom/marrow2/ui/plan/post_purchase/PaymentDone2ViewModel;", "Lo/RenewEligible;", "()Lcom/marrow2/ui/plan/post_purchase/PaymentDone2ViewModel;", "Lo/HlsChunkSourceHlsChunkHolder;", "Lo/HlsChunkSourceHlsChunkHolder;", "RemoteActionCompatParcelizer", "()Lo/HlsChunkSourceHlsChunkHolder;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Landroid/content/Intent;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class selectModule extends DynamiteModuleVersionPolicy implements View.OnClickListener {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final RenewEligible AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private HlsChunkSourceHlsChunkHolder IconCompatParcelizer;

    public selectModule() {
        selectModule selectmodule = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass4(new AnonymousClass3(selectmodule)));
        this.AudioAttributesCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(PaymentDone2ViewModel.class), new AnonymousClass2(renewEligibleWrite), new AnonymousClass5(renewEligibleWrite), new AnonymousClass1(selectmodule, renewEligibleWrite));
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.DynamiteModuleVersionPolicyIVersions
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                selectModule.read(this.AudioAttributesCompatParcelizer, (ActivityResult) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult, "");
        this.write = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.selectModule$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013JJ\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/marrow2/ui/plan/post_purchase/PaymentDone2Fragment$Companion;", "", "<init>", "()V", "BUNDLE_KEY_PLAN", "", "BUNDLE_KEY_COUPON", "BUNDLE_KEY_PAYMENT_ID", "BUNDLE_KEY_EXPIRY_DATE", "BUNDLE_KEY_IS_PLAN_B_UPGRADE", "BUNDLE_KEY_IS_ADD_ON_AVAILABLE", "KEY_PAYMENT_GATEWAY", "KEY_SUBSCRIPTIONS", "newInstanceForPlanBUpgrade", "Lcom/marrow2/ui/plan/post_purchase/PaymentDone2Fragment;", "paymentId", "subscriptionList", "Ljava/util/ArrayList;", "Lcom/marrow/data/models/plan/Subscription;", "Lkotlin/collections/ArrayList;", "newInstance", "planJson", "coupon", "addOns", "paymentGateway", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static selectModule read(String str, ArrayList<Subscription> arrayList) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(arrayList, "");
            selectModule selectmodule = new selectModule();
            Bundle bundle = new Bundle();
            bundle.putString("payment_id", str);
            bundle.putBoolean("is_plan_b_upgrade", true);
            bundle.putSerializable(PaymentStatusResponseKt.KEY_SUBSCRIPTION, arrayList);
            selectmodule.setArguments(bundle);
            return selectmodule;
        }

        public static selectModule read(String str, String str2, String str3, String str4, int i, ArrayList<Subscription> arrayList) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(arrayList, "");
            selectModule selectmodule = new selectModule();
            Bundle bundle = new Bundle();
            bundle.putString("plan", str2);
            if (str3 != null) {
                bundle.putString("coupon", str3);
            }
            bundle.putString("payment_id", str);
            String str5 = str4;
            if (str5 != null && str5.length() != 0) {
                bundle.putString("add_ons", str4);
            }
            bundle.putInt("payment_gateway", i);
            bundle.putSerializable(PaymentStatusResponseKt.KEY_SUBSCRIPTION, arrayList);
            selectmodule.setArguments(bundle);
            return selectmodule;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final class AudioAttributesImplApi21Parcelizer implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public AudioAttributesImplApi21Parcelizer() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            selectModule.this.AudioAttributesCompatParcelizer().IconCompatParcelizer(new efmt.MediaBrowserCompatCustomActionResultReceiver(TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) String.valueOf(editable)).toString()));
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public AudioAttributesImplApi26Parcelizer() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            selectModule.this.AudioAttributesCompatParcelizer().IconCompatParcelizer(new efmt.AudioAttributesImplApi26Parcelizer(TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) String.valueOf(editable)).toString()));
        }
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public MediaBrowserCompatCustomActionResultReceiver() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            selectModule.this.AudioAttributesCompatParcelizer().IconCompatParcelizer(new efmt.IconCompatParcelizer(TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) String.valueOf(editable)).toString()));
        }
    }

    public static final class MediaBrowserCompatMediaItem implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public MediaBrowserCompatMediaItem() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            selectModule.this.AudioAttributesCompatParcelizer().IconCompatParcelizer(new efmt.AudioAttributesImplBaseParcelizer(TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) String.valueOf(editable)).toString()));
        }
    }

    public static final class MediaBrowserCompatSearchResultReceiver implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public MediaBrowserCompatSearchResultReceiver() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            selectModule.this.AudioAttributesCompatParcelizer().IconCompatParcelizer(new efmt.write(TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) String.valueOf(editable)).toString()));
        }
    }

    public static final class MediaDescriptionCompat implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public MediaDescriptionCompat() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            selectModule.this.AudioAttributesCompatParcelizer().IconCompatParcelizer(new efmt.AudioAttributesCompatParcelizer(TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) String.valueOf(editable)).toString()));
        }
    }

    public static final class MediaMetadataCompat implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public MediaMetadataCompat() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            selectModule.this.AudioAttributesCompatParcelizer().IconCompatParcelizer(new efmt.read(TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) String.valueOf(editable)).toString()));
        }
    }

    public static final class RatingCompat implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public RatingCompat() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            selectModule.this.AudioAttributesCompatParcelizer().IconCompatParcelizer(new efmt.RemoteActionCompatParcelizer(TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) String.valueOf(editable)).toString()));
        }
    }

    /* JADX INFO: renamed from: o.selectModule$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "IconCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$write;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    /* JADX INFO: renamed from: o.selectModule$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "RemoteActionCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$IconCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$IconCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.selectModule$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "read", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$read).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentDone2ViewModel AudioAttributesCompatParcelizer() {
        return (PaymentDone2ViewModel) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: o.selectModule$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "write", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HlsChunkSourceHlsChunkHolder RemoteActionCompatParcelizer() {
        HlsChunkSourceHlsChunkHolder hlsChunkSourceHlsChunkHolder = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(hlsChunkSourceHlsChunkHolder);
        return hlsChunkSourceHlsChunkHolder;
    }

    /* JADX INFO: renamed from: o.selectModule$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "write", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$write.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$write = fragment;
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(selectModule selectmodule, ActivityResult activityResult) {
        toMagicModuleMetaRepoModel.write(activityResult, "");
        if (activityResult.getRemoteActionCompatParcelizer() == -1) {
            selectmodule.AudioAttributesCompatParcelizer().write(Fido2PrivilegedApiClient.AudioAttributesCompatParcelizer.INSTANCE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.IconCompatParcelizer = HlsChunkSourceHlsChunkHolder.IconCompatParcelizer(p0, p1);
        FrameLayout frameLayoutWrite = RemoteActionCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayoutWrite, "");
        return frameLayoutWrite;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.IconCompatParcelizer = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        onSetRating iconCompatParcelizer = requireActivity().getIconCompatParcelizer();
        hasGetter viewLifecycleOwner = getViewLifecycleOwner();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewLifecycleOwner, "");
        iconCompatParcelizer.AudioAttributesCompatParcelizer(viewLifecycleOwner, new AudioAttributesCompatParcelizer());
        read();
        AudioAttributesImplBaseParcelizer();
        selectModule selectmodule = this;
        RemoteActionCompatParcelizer().IconCompatParcelizer.onPlayFromMediaId.setOnClickListener(selectmodule);
        RemoteActionCompatParcelizer().IconCompatParcelizer.MediaBrowserCompatMediaItem.setOnClickListener(selectmodule);
        RemoteActionCompatParcelizer().IconCompatParcelizer.onPlay.setOnClickListener(selectmodule);
        RemoteActionCompatParcelizer().IconCompatParcelizer.IconCompatParcelizer.setOnClickListener(selectmodule);
        RemoteActionCompatParcelizer().read.setOnClickListener(selectmodule);
        AudioAttributesImplApi26Parcelizer();
        MediaBrowserCompatCustomActionResultReceiver();
        AudioAttributesImplApi21Parcelizer();
        setSourceChunk setsourcechunk = RemoteActionCompatParcelizer().IconCompatParcelizer.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setsourcechunk, "");
        AudioAttributesCompatParcelizer(setsourcechunk);
    }

    public static final class AudioAttributesCompatParcelizer extends onRemoveQueueItemAt {
        AudioAttributesCompatParcelizer() {
            super(true);
        }

        @Override // kotlin.onRemoveQueueItemAt
        public final void handleOnBackPressed() {
            selectModule.this.AudioAttributesCompatParcelizer().write(Fido2PrivilegedApiClient.IconCompatParcelizer.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        RemoteActionCompatParcelizer().IconCompatParcelizer.AudioAttributesImplBaseParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.Fido
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                selectModule.AudioAttributesImplBaseParcelizer(this.read);
            }
        });
        RemoteActionCompatParcelizer().IconCompatParcelizer.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.ModuleDescriptor
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                selectModule.MediaBrowserCompatMediaItem(this.RemoteActionCompatParcelizer);
            }
        });
        RemoteActionCompatParcelizer().IconCompatParcelizer.onFastForward.write.setOnClickListener(new View.OnClickListener() { // from class: o.DynamiteModuleVersionPolicySelectionResult
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                selectModule.MediaDescriptionCompat(this.write);
            }
        });
        RemoteActionCompatParcelizer().IconCompatParcelizer.onFastForward.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.getFido2ApiClient
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                selectModule.RatingCompat(this.read);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplBaseParcelizer(selectModule selectmodule) {
        selectmodule.AudioAttributesCompatParcelizer().write(Fido2PrivilegedApiClient.AudioAttributesImplBaseParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatMediaItem(selectModule selectmodule) {
        setBitrateKbps.AudioAttributesCompatParcelizer(selectmodule);
        selectmodule.AudioAttributesCompatParcelizer().IconCompatParcelizer(efmt.MediaBrowserCompatItemReceiver.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaDescriptionCompat(selectModule selectmodule) {
        selectmodule.AudioAttributesCompatParcelizer().write(Fido2PrivilegedApiClient.RemoteActionCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RatingCompat(selectModule selectmodule) {
        selectmodule.AudioAttributesCompatParcelizer().write(Fido2PrivilegedApiClient.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatus = selectModule.this.AudioAttributesCompatParcelizer().read();
                final selectModule selectmodule = selectModule.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.selectModule.RemoteActionCompatParcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object IconCompatParcelizer(boolean z) {
                        if (z) {
                            selectmodule.RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer.write();
                            LottieAnimationView lottieAnimationView = selectmodule.RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer;
                            final selectModule selectmodule2 = selectmodule;
                            lottieAnimationView.IconCompatParcelizer(new Animator.AnimatorListener() { // from class: o.selectModule.RemoteActionCompatParcelizer.1.2

                                /* JADX INFO: renamed from: o.selectModule$RemoteActionCompatParcelizer$1$2$write */
                                static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                                    private long IconCompatParcelizer;
                                    private int RemoteActionCompatParcelizer;
                                    private /* synthetic */ selectModule read;

                                    @Override // kotlin.getMonthName
                                    public final Object invokeSuspend(Object obj) {
                                        Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                                        int i = this.RemoteActionCompatParcelizer;
                                        if (i == 0) {
                                            SdkPayloadData.IconCompatParcelizer(obj);
                                            this.read.write(800L);
                                            this.IconCompatParcelizer = 800L;
                                            this.RemoteActionCompatParcelizer = 1;
                                            if (setCountry.IconCompatParcelizer(800L, this) == objIconCompatParcelizer) {
                                                return objIconCompatParcelizer;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            SdkPayloadData.IconCompatParcelizer(obj);
                                        }
                                        this.read.AudioAttributesCompatParcelizer().write(Fido2PrivilegedApiClient.read.INSTANCE);
                                        return getShowPopup.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    write(selectModule selectmodule, SampleVideos<? super write> sampleVideos) {
                                        super(2, sampleVideos);
                                        this.read = selectmodule;
                                    }

                                    @Override // kotlin.getMonthName
                                    public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                                        return new write(this.read, sampleVideos);
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    @Override // kotlin.MagicModuleSubmissionRequestBody
                                    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                                    public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                                        return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                                    }
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    toMagicModuleMetaRepoModel.write(animator, "");
                                    C0201setMcqCount.IconCompatParcelizer(getInternalName.RemoteActionCompatParcelizer(selectmodule2), null, null, new write(selectmodule2, null), 3);
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationCancel(Animator animator) {
                                    toMagicModuleMetaRepoModel.write(animator, "");
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationRepeat(Animator animator) {
                                    toMagicModuleMetaRepoModel.write(animator, "");
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animator) {
                                    toMagicModuleMetaRepoModel.write(animator, "");
                                }
                            });
                        } else {
                            selectmodule.RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer.setFrame(Integer.MAX_VALUE);
                            selectmodule.MediaBrowserCompatItemReceiver();
                        }
                        ImageView imageView = selectmodule.RemoteActionCompatParcelizer().read;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
                        imageView.setVisibility(selectmodule.AudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver() ? 0 : 8);
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return selectModule.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        selectModule selectmodule = this;
        setBitrateKbps.read(selectmodule, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.read(selectmodule, new read(null));
        setBitrateKbps.read(selectmodule, new IconCompatParcelizer(null));
        setBitrateKbps.read(selectmodule, new MediaBrowserCompatItemReceiver(null));
        setBitrateKbps.read(selectmodule, new AudioAttributesImplBaseParcelizer(null));
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<getAlgoValue> setupdatedstatusMediaBrowserCompatCustomActionResultReceiver = selectModule.this.AudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver();
                final selectModule selectmodule = selectModule.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatCustomActionResultReceiver.write(new getValidationToken() { // from class: o.selectModule.read.5
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((getAlgoValue) obj2);
                    }

                    private Object IconCompatParcelizer(getAlgoValue getalgovalue) {
                        selectmodule.AudioAttributesCompatParcelizer(getalgovalue);
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return selectModule.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        /* JADX INFO: renamed from: o.selectModule$IconCompatParcelizer$3, reason: invalid class name */
        static final class AnonymousClass3<T> implements getValidationToken {
            public static int AudioAttributesCompatParcelizer;
            public static int write;
            private /* synthetic */ selectModule RemoteActionCompatParcelizer;

            @Override // kotlin.getValidationToken
            public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj, SampleVideos sampleVideos) {
                return IconCompatParcelizer(((Boolean) obj).booleanValue());
            }

            private Object IconCompatParcelizer(boolean z) {
                ConstraintLayout constraintLayout = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
                constraintLayout.setVisibility(z ? 0 : 8);
                return getShowPopup.INSTANCE;
            }

            AnonymousClass3(selectModule selectmodule) {
                this.RemoteActionCompatParcelizer = selectmodule;
            }

            public static int RemoteActionCompatParcelizer() {
                int i = write;
                int i2 = i % 9492885;
                write = i + 1;
                if (i2 != 0) {
                    return AudioAttributesCompatParcelizer;
                }
                int iMyPid = Process.myPid();
                AudioAttributesCompatParcelizer = iMyPid;
                return iMyPid;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (selectModule.this.AudioAttributesCompatParcelizer().IconCompatParcelizer().write(new AnonymousClass3(selectModule.this), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return selectModule.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusAudioAttributesImplApi21Parcelizer = selectModule.this.AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer();
                final selectModule selectmodule = selectModule.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplApi21Parcelizer.write(new getValidationToken() { // from class: o.selectModule.MediaBrowserCompatItemReceiver.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write(((Boolean) obj2).booleanValue());
                    }

                    private Object write(boolean z) {
                        if (z) {
                            selectmodule.RemoteActionCompatParcelizer().IconCompatParcelizer.MediaBrowserCompatMediaItem.setImageDrawable(_isNaN.getDrawable(selectmodule.requireContext(), R.drawable.ic_keyboard_arrow_up));
                            LinearLayout linearLayout = selectmodule.RemoteActionCompatParcelizer().IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                            PlayerControlViewExternalSyntheticLambda1.write(linearLayout);
                        } else {
                            selectmodule.RemoteActionCompatParcelizer().IconCompatParcelizer.MediaBrowserCompatMediaItem.setImageDrawable(_isNaN.getDrawable(selectmodule.requireContext(), R.drawable.ic_down_v_arrow_white));
                            LinearLayout linearLayout2 = selectmodule.RemoteActionCompatParcelizer().IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
                            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayout2);
                        }
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return selectModule.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: o.selectModule$AudioAttributesImplBaseParcelizer$5, reason: invalid class name */
        static final class AnonymousClass5<T> implements getValidationToken {
            private /* synthetic */ selectModule RemoteActionCompatParcelizer;

            @Override // kotlin.getValidationToken
            public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj, SampleVideos sampleVideos) {
                return IconCompatParcelizer((Attachment) obj);
            }

            private Object IconCompatParcelizer(Attachment attachment) {
                if (attachment instanceof Attachment.AudioAttributesImplBaseParcelizer) {
                    selectModule selectmodule = this.RemoteActionCompatParcelizer;
                    String strIconCompatParcelizer = ((Attachment.AudioAttributesImplBaseParcelizer) attachment).IconCompatParcelizer();
                    if (strIconCompatParcelizer == null) {
                        strIconCompatParcelizer = this.RemoteActionCompatParcelizer.getString(R.string.something_went_wrong);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strIconCompatParcelizer, "");
                    }
                    PlayerControlViewExternalSyntheticLambda1.write(selectmodule, strIconCompatParcelizer);
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(attachment, Attachment.MediaBrowserCompatItemReceiver.INSTANCE)) {
                    selectModule selectmodule2 = this.RemoteActionCompatParcelizer;
                    selectModule selectmodule3 = selectmodule2;
                    String string = selectmodule2.getString(R.string.please_fill_required_fields);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                    PlayerControlViewExternalSyntheticLambda1.write(selectmodule3, string);
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(attachment, Attachment.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
                    selectModule selectmodule4 = this.RemoteActionCompatParcelizer;
                    selectModule selectmodule5 = selectmodule4;
                    String string2 = selectmodule4.getString(R.string.app_error_no_internet);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                    PlayerControlViewExternalSyntheticLambda1.write(selectmodule5, string2);
                } else if (attachment instanceof Attachment.IconCompatParcelizer) {
                    Context contextRequireContext = this.RemoteActionCompatParcelizer.requireContext();
                    String string3 = this.RemoteActionCompatParcelizer.getString(R.string.support_email);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
                    Attachment.IconCompatParcelizer iconCompatParcelizer = (Attachment.IconCompatParcelizer) attachment;
                    String strWrite = iconCompatParcelizer.write();
                    if (strWrite == null) {
                        strWrite = "";
                    }
                    String strIconCompatParcelizer2 = iconCompatParcelizer.IconCompatParcelizer();
                    DataSink.RemoteActionCompatParcelizer(contextRequireContext, string3, strWrite, strIconCompatParcelizer2 != null ? strIconCompatParcelizer2 : "");
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(attachment, Attachment.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
                    selectModule selectmodule6 = this.RemoteActionCompatParcelizer;
                    selectModule selectmodule7 = selectmodule6;
                    String string4 = selectmodule6.getString(R.string.label_address_added_suc);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
                    PlayerControlViewExternalSyntheticLambda1.write(selectmodule7, string4);
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(attachment, Attachment.read.INSTANCE)) {
                    ScrollView scrollView = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer;
                    final selectModule selectmodule8 = this.RemoteActionCompatParcelizer;
                    scrollView.post(new Runnable() { // from class: o.Transport
                        @Override // java.lang.Runnable
                        public final void run() {
                            selectModule.AudioAttributesImplBaseParcelizer.AnonymousClass5.write(selectmodule8);
                        }
                    });
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(attachment, Attachment.AudioAttributesCompatParcelizer.INSTANCE)) {
                    this.RemoteActionCompatParcelizer.write();
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(attachment, Attachment.RemoteActionCompatParcelizer.INSTANCE)) {
                    selectModule selectmodule9 = this.RemoteActionCompatParcelizer;
                    zadb.Companion remoteActionCompatParcelizer_ = zadb.INSTANCE;
                    Context contextRequireContext2 = this.RemoteActionCompatParcelizer.requireContext();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
                    Intent intentWrite = zadb.Companion.write(contextRequireContext2);
                    intentWrite.addFlags(603979776);
                    selectmodule9.startActivity(intentWrite);
                } else {
                    if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(attachment, Attachment.write.INSTANCE)) {
                        throw new RenewEligibleCreator();
                    }
                    selectModule selectmodule10 = this.RemoteActionCompatParcelizer;
                    selectModule selectmodule11 = selectmodule10;
                    String string5 = selectmodule10.getString(R.string.notes_address_mandatory);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string5, "");
                    PlayerControlViewExternalSyntheticLambda1.write(selectmodule11, string5);
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void write(selectModule selectmodule) {
                selectmodule.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer.smoothScrollTo(0, 0);
            }

            AnonymousClass5(selectModule selectmodule) {
                this.RemoteActionCompatParcelizer = selectmodule;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (selectModule.this.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer().write(new AnonymousClass5(selectModule.this), this) == objIconCompatParcelizer) {
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

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return selectModule.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void read() {
        ImageView imageView = RemoteActionCompatParcelizer().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        getHttpMethodString.read((View) imageView, true, false, false, true, 0, 54);
        LinearLayout linearLayoutIconCompatParcelizer = RemoteActionCompatParcelizer().IconCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        getHttpMethodString.read((View) linearLayoutIconCompatParcelizer, false, true, true, true, 0, 49);
    }

    private final void AudioAttributesImplBaseParcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            LinearLayout linearLayout = RemoteActionCompatParcelizer().IconCompatParcelizer.AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, linearLayout);
            Button button = RemoteActionCompatParcelizer().IconCompatParcelizer.onPlayFromMediaId;
            ViewGroup.LayoutParams layoutParams = RemoteActionCompatParcelizer().IconCompatParcelizer.onPlayFromMediaId.getLayoutParams();
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            layoutParams.width = DataSourceBitmapLoaderExternalSyntheticLambda1.read(contextRequireContext2, 300);
            button.setLayoutParams(layoutParams);
        }
    }

    private final void read(List<String> p0, boolean p1) {
        if (p0.isEmpty()) {
            CardView cardView = RemoteActionCompatParcelizer().IconCompatParcelizer.read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(cardView);
            return;
        }
        CardView cardView2 = RemoteActionCompatParcelizer().IconCompatParcelizer.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView2, "");
        PlayerControlViewExternalSyntheticLambda1.write(cardView2);
        LinearLayout linearLayout = RemoteActionCompatParcelizer().IconCompatParcelizer.onCommand;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        PlayerControlViewExternalSyntheticLambda1.write(linearLayout);
        TextView textView = RemoteActionCompatParcelizer().IconCompatParcelizer.onMediaButtonEvent;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        PlayerControlViewExternalSyntheticLambda1.write((View) textView);
        RemoteActionCompatParcelizer().IconCompatParcelizer.onCommand.removeAllViews();
        int i = 0;
        for (Object obj : p0) {
            if (i < 0) {
                IntermediateLoginResponseBody.read();
            }
            View viewInflate = getLayoutInflater().inflate(R.layout.plan_desc_tick_view, (ViewGroup) RemoteActionCompatParcelizer().IconCompatParcelizer.onCommand, false);
            toMagicModuleMetaRepoModel.read(viewInflate, "");
            TextView textView2 = (TextView) viewInflate;
            textView2.setText((String) obj);
            if (i != p0.size() - 1) {
                TextView textView3 = textView2;
                Context contextRequireContext = requireContext();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                textView3.setPadding(textView3.getPaddingLeft(), textView3.getPaddingTop(), textView3.getPaddingRight(), DataSourceBitmapLoaderExternalSyntheticLambda1.read(contextRequireContext, 16));
            }
            RemoteActionCompatParcelizer().IconCompatParcelizer.onCommand.addView(textView2);
            i++;
        }
        Button button = RemoteActionCompatParcelizer().IconCompatParcelizer.onPlay;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
        button.setVisibility(p1 ? 0 : 8);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, RemoteActionCompatParcelizer().IconCompatParcelizer.onPlayFromMediaId)) {
            setSmallestDisplacement.Companion readVar = setSmallestDisplacement.INSTANCE;
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            this.write.read(setSmallestDisplacement.Companion.write(contextRequireContext, 2));
            RtspHeadersBuilder.IconCompatParcelizer().write("orderdetail_kycclick", VideoTimelineResponseBody.read(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, RemoteActionCompatParcelizer().IconCompatParcelizer.onPlay)) {
            AudioAttributesCompatParcelizer().write(Fido2PrivilegedApiClient.AudioAttributesImplApi21Parcelizer.INSTANCE);
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, RemoteActionCompatParcelizer().read)) {
            AudioAttributesCompatParcelizer().write(Fido2PrivilegedApiClient.write.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(getAlgoValue p0) {
        String[] descriptionList;
        RemoteActionCompatParcelizer().IconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler.setText(p0.getAudioAttributesImplBaseParcelizer());
        write(p0.getMediaBrowserCompatItemReceiver(), p0.MediaBrowserCompatItemReceiver());
        LinearLayout linearLayout = RemoteActionCompatParcelizer().IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        linearLayout.setVisibility(p0.AudioAttributesImplApi21Parcelizer() ? 0 : 8);
        ImageView imageView = RemoteActionCompatParcelizer().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        imageView.setVisibility(p0.MediaBrowserCompatCustomActionResultReceiver() ? 0 : 8);
        if (p0.getAudioAttributesCompatParcelizer()) {
            read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"A super-charged Qbank", "Videos by India’s top faculty", "A Largest PAN India Test Series"}), p0.AudioAttributesImplApi26Parcelizer());
            return;
        }
        CardView cardView = RemoteActionCompatParcelizer().IconCompatParcelizer.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
        cardView.setVisibility(p0.getRemoteActionCompatParcelizer() != null ? 0 : 8);
        Object obj = null;
        if (p0.getRemoteActionCompatParcelizer() != null) {
            setSourceChunk setsourcechunk = RemoteActionCompatParcelizer().IconCompatParcelizer.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setsourcechunk, "");
            write(setsourcechunk, p0.getRemoteActionCompatParcelizer());
            RemoteActionCompatParcelizer().IconCompatParcelizer.IconCompatParcelizer.setAlpha(p0.getRemoteActionCompatParcelizer().MediaDescriptionCompat() ? 1.0f : 0.5f);
        } else {
            Plan planRemoteActionCompatParcelizer = p0.getAudioAttributesImplApi26Parcelizer();
            List<String> listRemoteActionCompatParcelizer = (planRemoteActionCompatParcelizer == null || (descriptionList = planRemoteActionCompatParcelizer.getDescriptionList()) == null) ? null : getOrderDetails.read(descriptionList);
            if (listRemoteActionCompatParcelizer == null) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            read(listRemoteActionCompatParcelizer, p0.AudioAttributesImplApi26Parcelizer());
        }
        Plan planRemoteActionCompatParcelizer2 = p0.getAudioAttributesImplApi26Parcelizer();
        if (planRemoteActionCompatParcelizer2 != null) {
            Coupon couponWrite = p0.getIconCompatParcelizer();
            int extension = couponWrite != null ? couponWrite.getExtension(planRemoteActionCompatParcelizer2.getId()) : 0;
            String string = parseDolbyChannelConfiguration.read(planRemoteActionCompatParcelizer2.getSubscriptionPeriod());
            if (extension > 0) {
                String str = parseDolbyChannelConfiguration.read(extension);
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" + ");
                sb.append(str);
                string = sb.toString();
            }
            String str2 = parseDolbyChannelConfiguration.read(planRemoteActionCompatParcelizer2.getDiscountedPrice(p0.getIconCompatParcelizer()));
            TextView textView = RemoteActionCompatParcelizer().IconCompatParcelizer.onAddQueueItem;
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            String str3 = String.format(Locale.getDefault(), "%s / %s", Arrays.copyOf(new Object[]{str2, string}, 2));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
            textView.setText(str3);
            RemoteActionCompatParcelizer().IconCompatParcelizer.onCustomAction.setText(getString(R.string.f_text_plan_detail, planRemoteActionCompatParcelizer2.getTitle()));
            if (p0.getWrite().length() > 0) {
                ArrayList<PlanAddOns> planAddOns = planRemoteActionCompatParcelizer2.getPlanAddOns();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(planAddOns, "");
                Iterator<T> it = planAddOns.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((PlanAddOns) next).getId(), (Object) p0.getWrite())) {
                        obj = next;
                        break;
                    }
                }
                PlanAddOns planAddOns2 = (PlanAddOns) obj;
                if (planAddOns2 != null) {
                    RemoteActionCompatParcelizer().IconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setText(parseDolbyChannelConfiguration.read(planAddOns2.getPrice()));
                    TextView textView2 = RemoteActionCompatParcelizer().IconCompatParcelizer.RatingCompat;
                    String description = planAddOns2.getDescription();
                    if (description == null) {
                        description = "";
                    }
                    textView2.setText(getString(R.string.f_text_note_detail, description));
                    LinearLayout linearLayout2 = RemoteActionCompatParcelizer().IconCompatParcelizer.MediaBrowserCompatItemReceiver;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
                    linearLayout2.setVisibility(0);
                }
            }
        }
    }

    private final void write(boolean p0, boolean p1) {
        TextView textView = RemoteActionCompatParcelizer().IconCompatParcelizer.onPause;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        textView.setVisibility((!p0 || p1) ? 8 : 0);
        CardView cardView = RemoteActionCompatParcelizer().IconCompatParcelizer.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
        cardView.setVisibility((p0 && p1) ? 0 : 8);
        if (p0) {
            AudioAttributesCompatParcelizer(p1);
        }
    }

    private final void write(setSourceChunk p0, GmsLogger p1) {
        TextInputLayout textInputLayout = p0.MediaBrowserCompatMediaItem;
        Editable text = p0.AudioAttributesImplApi21Parcelizer.getText();
        String string = null;
        textInputLayout.setError((text == null || text.length() == 0 || p1.getMediaMetadataCompat()) ? null : getString(R.string.name_validation_error));
        textInputLayout.setErrorEnabled(textInputLayout.AudioAttributesImplBaseParcelizer() != null);
        TextInputLayout textInputLayout2 = p0.MediaMetadataCompat;
        Editable text2 = p0.MediaBrowserCompatCustomActionResultReceiver.getText();
        textInputLayout2.setError((text2 == null || text2.length() == 0 || p1.getMediaDescriptionCompat()) ? null : getString(R.string.phone_validation_error));
        textInputLayout2.setErrorEnabled(textInputLayout2.AudioAttributesImplBaseParcelizer() != null);
        TextInputLayout textInputLayout3 = p0.MediaBrowserCompatItemReceiver;
        Editable text3 = p0.IconCompatParcelizer.getText();
        textInputLayout3.setError((text3 == null || text3.length() == 0 || p1.getMediaBrowserCompatItemReceiver()) ? null : getString(R.string.phone_validation_error));
        textInputLayout3.setErrorEnabled(textInputLayout3.AudioAttributesImplBaseParcelizer() != null);
        TextInputLayout textInputLayout4 = p0.MediaBrowserCompatSearchResultReceiver;
        Editable text4 = p0.AudioAttributesImplBaseParcelizer.getText();
        textInputLayout4.setError((text4 == null || text4.length() == 0 || p1.getAudioAttributesImplBaseParcelizer()) ? null : getString(R.string.city_validation_error));
        textInputLayout4.setErrorEnabled(textInputLayout4.AudioAttributesImplBaseParcelizer() != null);
        TextInputLayout textInputLayout5 = p0.MediaDescriptionCompat;
        Editable text5 = p0.AudioAttributesImplApi26Parcelizer.getText();
        if (text5 != null && text5.length() != 0 && !p1.getMediaBrowserCompatMediaItem()) {
            string = getString(R.string.pincode_validation_error);
        }
        textInputLayout5.setError(string);
        textInputLayout5.setErrorEnabled(textInputLayout5.AudioAttributesImplBaseParcelizer() != null);
        if (p1.AudioAttributesImplBaseParcelizer().isEmpty()) {
            return;
        }
        p0.write.setAdapter(new ArrayAdapter(requireContext(), R.layout.layout_state_dropdown_item, p1.AudioAttributesImplBaseParcelizer()));
    }

    private final void AudioAttributesCompatParcelizer(boolean p0) {
        String string = getString(R.string.text_block_terms);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.text_kyc_disclaimer, string);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String str = string2;
        SpannableString spannableString = new SpannableString(str);
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        int i = TestGroupLSModel.read((CharSequence) str, string, 0, false, 6);
        spannableString.setSpan(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, i, string.length() + i, 18);
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        dispatchTouchEvent.write(spannableString, contextRequireContext, R.color.text_blue, i, string.length() + i);
        if (p0) {
            RemoteActionCompatParcelizer().IconCompatParcelizer.onPlayFromSearch.setText(spannableString);
            RemoteActionCompatParcelizer().IconCompatParcelizer.onPlayFromSearch.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            RemoteActionCompatParcelizer().IconCompatParcelizer.onPause.setText(spannableString);
            RemoteActionCompatParcelizer().IconCompatParcelizer.onPause.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public static final class MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver extends ClickableSpan {
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            selectModule.this.AudioAttributesCompatParcelizer().write(Fido2PrivilegedApiClient.AudioAttributesImplApi26Parcelizer.INSTANCE);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            toMagicModuleMetaRepoModel.write(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write() {
        ResolvableApiException.Companion iconCompatParcelizer = ResolvableApiException.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        String string = getString(R.string.clickable_text_terms_condition_landing_page);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        startActivity(ResolvableApiException.Companion.read(contextRequireContext, new canceledPendingResult("https://www.marrow.com/home/terms", string, null, 4, null)));
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        Bundle arguments = getArguments();
        String strWrite = null;
        Serializable serializable = arguments != null ? arguments.getSerializable(PaymentStatusResponseKt.KEY_SUBSCRIPTION) : null;
        ArrayList arrayList = serializable instanceof ArrayList ? (ArrayList) serializable : null;
        String strWrite2 = null;
        String strWrite3 = null;
        for (Subscription subscription : arrayList != null ? arrayList : IntermediateLoginResponseBody.RemoteActionCompatParcelizer()) {
            String contentType = subscription.getContentType();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) contentType, (Object) getTrackTypeString.read.getRemoteActionCompatParcelizer())) {
                strWrite3 = parseEac3SupplementalProperties.write(subscription.getExpiresOn(), "dd MMM yyyy");
            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) contentType, (Object) getTrackTypeString.IconCompatParcelizer.getRemoteActionCompatParcelizer())) {
                strWrite = parseEac3SupplementalProperties.write(subscription.getExpiresOn(), "dd MMM yyyy");
            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) contentType, (Object) getTrackTypeString.write.getRemoteActionCompatParcelizer())) {
                strWrite2 = parseEac3SupplementalProperties.write(subscription.getExpiresOn(), "dd MMM yyyy");
            }
        }
        IconCompatParcelizer(strWrite, strWrite2, strWrite3);
    }

    private final void IconCompatParcelizer(String p0, String p1, String p2) {
        String str = p0;
        if (str != null && str.length() != 0) {
            LinearLayout linearLayout = RemoteActionCompatParcelizer().IconCompatParcelizer.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            PlayerControlViewExternalSyntheticLambda1.write(linearLayout);
            RemoteActionCompatParcelizer().IconCompatParcelizer.onPrepareFromMediaId.setText(str);
        }
        String str2 = p1;
        if (str2 != null && str2.length() != 0) {
            LinearLayout linearLayout2 = RemoteActionCompatParcelizer().IconCompatParcelizer.MediaDescriptionCompat;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
            PlayerControlViewExternalSyntheticLambda1.write(linearLayout2);
            RemoteActionCompatParcelizer().IconCompatParcelizer.onPlayFromUri.setText(str2);
        }
        String str3 = p2;
        if (str3 == null || str3.length() == 0) {
            return;
        }
        LinearLayout linearLayout3 = RemoteActionCompatParcelizer().IconCompatParcelizer.MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout3, "");
        PlayerControlViewExternalSyntheticLambda1.write(linearLayout3);
        RemoteActionCompatParcelizer().IconCompatParcelizer.onPrepareFromSearch.setText(str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(long p0) {
        ReferenceTypeDeserializer referenceTypeDeserializer = new ReferenceTypeDeserializer();
        referenceTypeDeserializer.read(requireContext(), R.layout.fragment_payment_done_end);
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.RemoteActionCompatParcelizer(800L);
        reportWithProductId.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer().write, autoTransition);
        referenceTypeDeserializer.write(RemoteActionCompatParcelizer().write);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatItemReceiver() {
        ReferenceTypeDeserializer referenceTypeDeserializer = new ReferenceTypeDeserializer();
        referenceTypeDeserializer.read(requireContext(), R.layout.fragment_payment_done_end);
        referenceTypeDeserializer.write(RemoteActionCompatParcelizer().write);
    }

    private final void AudioAttributesCompatParcelizer(final setSourceChunk p0) {
        EditText editText = p0.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText, "");
        editText.addTextChangedListener(new AudioAttributesImplApi21Parcelizer());
        EditText editText2 = p0.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText2, "");
        editText2.addTextChangedListener(new AudioAttributesImplApi26Parcelizer());
        EditText editText3 = p0.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText3, "");
        editText3.addTextChangedListener(new MediaBrowserCompatCustomActionResultReceiver());
        EditText editText4 = p0.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText4, "");
        editText4.addTextChangedListener(new MediaMetadataCompat());
        EditText editText5 = p0.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText5, "");
        editText5.addTextChangedListener(new MediaDescriptionCompat());
        EditText editText6 = p0.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText6, "");
        editText6.addTextChangedListener(new RatingCompat());
        EditText editText7 = p0.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText7, "");
        editText7.addTextChangedListener(new MediaBrowserCompatSearchResultReceiver());
        EditText editText8 = p0.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText8, "");
        editText8.addTextChangedListener(new MediaBrowserCompatMediaItem());
        AutoCompleteTextView autoCompleteTextView = p0.write;
        autoCompleteTextView.setOnClickListener(new View.OnClickListener() { // from class: o.fromString
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                selectModule.IconCompatParcelizer(this.IconCompatParcelizer, p0);
            }
        });
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o.getU2fApiClient
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                selectModule.RemoteActionCompatParcelizer(this.IconCompatParcelizer, adapterView, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(selectModule selectmodule, setSourceChunk setsourcechunk) {
        setBitrateKbps.AudioAttributesCompatParcelizer(selectmodule);
        setsourcechunk.write.showDropDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(selectModule selectmodule, AdapterView adapterView, int i) {
        selectmodule.AudioAttributesCompatParcelizer().IconCompatParcelizer(new efmt.AudioAttributesImplApi21Parcelizer(adapterView.getItemAtPosition(i).toString()));
    }
}
