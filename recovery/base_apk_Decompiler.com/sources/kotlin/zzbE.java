package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.ThemeKt;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow2.ui.schema.detail.SchemaDetailViewModel;
import java.util.Locale;
import kotlin.ActivityTransitionSupportedActivityTransition;
import kotlin.Metadata;
import kotlin._init_lambda4;
import kotlin.withFieldVisibility;
import kotlin.zzlj;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/zzbE;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zzbE extends zzky {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o.zzbE$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/zzbE$IconCompatParcelizer;", "", "<init>", "()V", "Lo/zzlh;", "p0", "Lo/zzbE;", "RemoteActionCompatParcelizer", "(Lo/zzlh;)Lo/zzbE;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static zzbE RemoteActionCompatParcelizer(zzlh p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            zzbE zzbe = new zzbE();
            zzbe.setArguments(p0.IconCompatParcelizer());
            return zzbe;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return setBitrateKbps.AudioAttributesCompatParcelizer(this, multiplyFft.IconCompatParcelizer(716939863, true, new MagicModuleSubmissionRequestBody() { // from class: o.zzla
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return zzbE.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(SchemaDetailViewModel schemaDetailViewModel, ActivityResult activityResult) {
        toMagicModuleMetaRepoModel.write(activityResult, "");
        schemaDetailViewModel.read(zzlj.AudioAttributesImplApi21Parcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(final zzli zzliVar, final boolean z, final SchemaDetailViewModel schemaDetailViewModel, final zzbE zzbe, final r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 r8lambdakubbm7ckfqtc9qcgukc86fguu4, final Context context, final zzll zzllVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1081328425, i, -1, "com.marrow2.ui.schema.detail.SchemaDetailFragment.onCreateView.<anonymous>.<anonymous> (SchemaDetailFragment.kt:65)");
            }
            final JsonManagedReference jsonManagedReference = JsonIncludeInclude.read(null, null, _handleunrecognizedcharacterescape, 0, 3);
            _handleOddName _handleoddname = onInflate.read(isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null));
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            JsonIncludeInclude.IconCompatParcelizer(onInflate.IconCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleoddname, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getAudioAttributesImplBaseParcelizer(), null, 2, null)), jsonManagedReference, multiplyFft.AudioAttributesCompatParcelizer(-953753998, true, new MagicModuleSubmissionRequestBody() { // from class: o.zzbN
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzbE.write(zzliVar, z, schemaDetailViewModel, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), null, null, null, 0, false, null, false, null, BitmapDescriptorFactory.HUE_RED, 0L, 0L, 0L, 0L, 0L, multiplyFft.AudioAttributesCompatParcelizer(-1341530535, true, new getModuleData() { // from class: o.zzbP
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return zzbE.read(zzliVar, z, schemaDetailViewModel, zzbe, r8lambdakubbm7ckfqtc9qcgukc86fguu4, context, zzllVar, jsonManagedReference, (getReturnTransition) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 12582912, 131064);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(zzli zzliVar, boolean z, final SchemaDetailViewModel schemaDetailViewModel, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-953753998, i, -1, "com.marrow2.ui.schema.detail.SchemaDetailFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (SchemaDetailFragment.kt:74)");
            }
            String audioAttributesImplApi21Parcelizer = zzliVar.getAudioAttributesImplApi21Parcelizer();
            boolean z2 = zzliVar.getWrite() != zzlk.RemoteActionCompatParcelizer;
            boolean audioAttributesCompatParcelizer = zzliVar.getAudioAttributesCompatParcelizer();
            boolean audioAttributesImplBaseParcelizer = zzliVar.getAudioAttributesImplBaseParcelizer();
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(schemaDetailViewModel);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.zzbJ
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzbE.AudioAttributesImplBaseParcelizer(schemaDetailViewModel);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            zzmm.write(null, audioAttributesImplApi21Parcelizer, z2, audioAttributesCompatParcelizer, z, audioAttributesImplBaseParcelizer, (getCreatedOnDateMs) objOnPause, _handleunrecognizedcharacterescape, 0, 1);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(SchemaDetailViewModel schemaDetailViewModel) {
        schemaDetailViewModel.read(zzlj.RemoteActionCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(final zzli zzliVar, boolean z, final SchemaDetailViewModel schemaDetailViewModel, final zzbE zzbe, final r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 r8lambdakubbm7ckfqtc9qcgukc86fguu4, final Context context, zzll zzllVar, JsonManagedReference jsonManagedReference, getReturnTransition getreturntransition, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2;
        toMagicModuleMetaRepoModel.write(getreturntransition, "");
        if ((i & 6) == 0) {
            i2 = i | (_handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getreturntransition) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 19) != 18, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1341530535, i2, -1, "com.marrow2.ui.schema.detail.SchemaDetailFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (SchemaDetailFragment.kt:83)");
            }
            _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(getParentFragment.read(_handleOddName.INSTANCE, getreturntransition), BitmapDescriptorFactory.HUE_RED, 1, null);
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(schemaDetailViewModel);
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(zzbe);
            boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(zzliVar);
            boolean zIconCompatParcelizer4 = _handleunrecognizedcharacterescape.IconCompatParcelizer(r8lambdakubbm7ckfqtc9qcgukc86fguu4);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zIconCompatParcelizer | zIconCompatParcelizer2 | zIconCompatParcelizer3 | zIconCompatParcelizer4) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new MagicModuleSubmissionRequestBody() { // from class: o.zzbH
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return zzbE.AudioAttributesCompatParcelizer(schemaDetailViewModel, zzbe, zzliVar, r8lambdakubbm7ckfqtc9qcgukc86fguu4, (String) obj, (String) obj2);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody = (MagicModuleSubmissionRequestBody) objOnPause;
            boolean zIconCompatParcelizer5 = _handleunrecognizedcharacterescape.IconCompatParcelizer(context);
            boolean zIconCompatParcelizer6 = _handleunrecognizedcharacterescape.IconCompatParcelizer(r8lambdakubbm7ckfqtc9qcgukc86fguu4);
            Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
            if ((zIconCompatParcelizer5 | zIconCompatParcelizer6) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getCreatedOnDateMs() { // from class: o.zzbL
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzbE.IconCompatParcelizer(context, r8lambdakubbm7ckfqtc9qcgukc86fguu4);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
            }
            getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objOnPause2;
            boolean zIconCompatParcelizer7 = _handleunrecognizedcharacterescape.IconCompatParcelizer(schemaDetailViewModel);
            Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer7 || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new MagicModuleSubmissionRequestBody() { // from class: o.zzbG
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return zzbE.write(schemaDetailViewModel, (onDisplayInfoChanged) obj, (String) obj2);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
            }
            MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2 = (MagicModuleSubmissionRequestBody) objOnPause3;
            boolean zIconCompatParcelizer8 = _handleunrecognizedcharacterescape.IconCompatParcelizer(schemaDetailViewModel);
            Object objOnPause4 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer8 || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause4 = new getAnswerMap() { // from class: o.zzbK
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return zzbE.read(schemaDetailViewModel, (zzlk) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause4);
            }
            getAnswerMap getanswermap = (getAnswerMap) objOnPause4;
            boolean zIconCompatParcelizer9 = _handleunrecognizedcharacterescape.IconCompatParcelizer(schemaDetailViewModel);
            Object objOnPause5 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer9 || objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause5 = new getCreatedOnDateMs() { // from class: o.zzbF
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzbE.MediaBrowserCompatItemReceiver(schemaDetailViewModel);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause5);
            }
            getCreatedOnDateMs getcreatedondatems2 = (getCreatedOnDateMs) objOnPause5;
            boolean zIconCompatParcelizer10 = _handleunrecognizedcharacterescape.IconCompatParcelizer(schemaDetailViewModel);
            Object objOnPause6 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer10 || objOnPause6 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause6 = new getCreatedOnDateMs() { // from class: o.zzbI
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzbE.AudioAttributesImplApi26Parcelizer(schemaDetailViewModel);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause6);
            }
            zzmh.read(_handleoddnameIconCompatParcelizer$default, zzliVar, z, magicModuleSubmissionRequestBody, getcreatedondatems, magicModuleSubmissionRequestBody2, getanswermap, getcreatedondatems2, (getCreatedOnDateMs) objOnPause6, _handleunrecognizedcharacterescape, 0, 0);
            boolean zIconCompatParcelizer11 = _handleunrecognizedcharacterescape.IconCompatParcelizer(schemaDetailViewModel);
            Object objOnPause7 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer11 || objOnPause7 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause7 = new getCreatedOnDateMs() { // from class: o.zzbA
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzbE.AudioAttributesImplApi21Parcelizer(schemaDetailViewModel);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause7);
            }
            getCreatedOnDateMs getcreatedondatems3 = (getCreatedOnDateMs) objOnPause7;
            boolean zIconCompatParcelizer12 = _handleunrecognizedcharacterescape.IconCompatParcelizer(schemaDetailViewModel);
            Object objOnPause8 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer12 || objOnPause8 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause8 = new getCreatedOnDateMs() { // from class: o.zzbB
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzbE.MediaBrowserCompatCustomActionResultReceiver(schemaDetailViewModel);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause8);
            }
            zzlr.write(zzllVar, jsonManagedReference, getcreatedondatems3, (getCreatedOnDateMs) objOnPause8, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(SchemaDetailViewModel schemaDetailViewModel, zzbE zzbe, zzli zzliVar, r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 r8lambdakubbm7ckfqtc9qcgukc86fguu4, String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        schemaDetailViewModel.read(zzlj.AudioAttributesImplBaseParcelizer.INSTANCE);
        ActivityTransitionSupportedActivityTransition.Companion companion = ActivityTransitionSupportedActivityTransition.INSTANCE;
        Context contextRequireContext = zzbe.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        r8lambdakubbm7ckfqtc9qcgukc86fguu4.read(ActivityTransitionSupportedActivityTransition.Companion.RemoteActionCompatParcelizer(contextRequireContext, new setDurationMillis(str2, zzliVar.getIconCompatParcelizer(), zzliVar.getAudioAttributesImplApi21Parcelizer(), str)));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(Context context, r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 r8lambdakubbm7ckfqtc9qcgukc86fguu4) {
        PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
        String lowerCase = "SCHEMA_ACCESSED".toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        r8lambdakubbm7ckfqtc9qcgukc86fguu4.read(PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(context, "schemadetail", lowerCase));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(SchemaDetailViewModel schemaDetailViewModel, onDisplayInfoChanged ondisplayinfochanged, String str) {
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        toMagicModuleMetaRepoModel.write(str, "");
        schemaDetailViewModel.read(new zzlj.IconCompatParcelizer(str, ondisplayinfochanged));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(SchemaDetailViewModel schemaDetailViewModel) {
        schemaDetailViewModel.read(zzlj.AudioAttributesCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(SchemaDetailViewModel schemaDetailViewModel, zzlk zzlkVar) {
        toMagicModuleMetaRepoModel.write(zzlkVar, "");
        schemaDetailViewModel.read(new zzlj.write(zzlkVar));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(SchemaDetailViewModel schemaDetailViewModel) {
        schemaDetailViewModel.read(zzlj.RemoteActionCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(SchemaDetailViewModel schemaDetailViewModel) {
        schemaDetailViewModel.read(zzlj.read.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(SchemaDetailViewModel schemaDetailViewModel) {
        schemaDetailViewModel.read(zzlj.MediaBrowserCompatItemReceiver.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(final zzbE zzbe, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        withFieldVisibility.write defaultViewModelCreationExtras;
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(716939863, i, -1, "com.marrow2.ui.schema.detail.SchemaDetailFragment.onCreateView.<anonymous> (SchemaDetailFragment.kt:50)");
            }
            JDK14Util jDK14Util = JDK14Util.INSTANCE;
            TypeResolutionContext typeResolutionContextIconCompatParcelizer = JDK14Util.IconCompatParcelizer(_handleunrecognizedcharacterescape, 6);
            if (typeResolutionContextIconCompatParcelizer == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (typeResolutionContextIconCompatParcelizer instanceof anyExplicitsWithoutIgnoral) {
                defaultViewModelCreationExtras = ((anyExplicitsWithoutIgnoral) typeResolutionContextIconCompatParcelizer).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = withFieldVisibility.write.INSTANCE;
            }
            final SchemaDetailViewModel schemaDetailViewModel = (SchemaDetailViewModel) JDK14UtilRawTypeName.IconCompatParcelizer(toMagicModuleMetaDataUcModel.write(SchemaDetailViewModel.class), typeResolutionContextIconCompatParcelizer, null, defaultViewModelCreationExtras, _handleunrecognizedcharacterescape, 0);
            final zzli zzliVar = (zzli) isSetterVisible.AudioAttributesCompatParcelizer(schemaDetailViewModel.read(), _handleunrecognizedcharacterescape, 0).getRemoteActionCompatParcelizer();
            final boolean zBooleanValue = ((Boolean) isSetterVisible.AudioAttributesCompatParcelizer(schemaDetailViewModel.IconCompatParcelizer(), _handleunrecognizedcharacterescape, 0).getRemoteActionCompatParcelizer()).booleanValue();
            final zzll zzllVar = (zzll) isSetterVisible.AudioAttributesCompatParcelizer(schemaDetailViewModel.AudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescape, 0).getRemoteActionCompatParcelizer();
            final Context context = (Context) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
            _init_lambda4.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = new _init_lambda4.AudioAttributesImplApi26Parcelizer();
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(schemaDetailViewModel);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.zzbD
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return zzbE.read(schemaDetailViewModel, (ActivityResult) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            final r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 r8lambdakubbm7ckfqtc9qcgukc86fguu4 = setSessionImpl.read(audioAttributesImplApi26Parcelizer, (getAnswerMap) objOnPause, _handleunrecognizedcharacterescape);
            ThemeKt.read((AppTheme) null, false, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) multiplyFft.AudioAttributesCompatParcelizer(-1081328425, true, new MagicModuleSubmissionRequestBody() { // from class: o.zzbO
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzbE.AudioAttributesCompatParcelizer(zzliVar, zBooleanValue, schemaDetailViewModel, zzbe, r8lambdakubbm7ckfqtc9qcgukc86fguu4, context, zzllVar, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 3);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }
}
