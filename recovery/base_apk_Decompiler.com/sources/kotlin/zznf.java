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
import com.marrow2.ui.schema.incomplete.SchemaIncompleteViewModel;
import kotlin.Metadata;
import kotlin._init_lambda4;
import kotlin.setTokenBinding;
import kotlin.withFieldVisibility;
import kotlin.zzlb;
import kotlin.zznu;
import kotlin.zznv;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/zznf;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zznf extends zzne {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o.zznf$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/zznf$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "p1", "Lo/zznf;", "read", "(Ljava/lang/String;Ljava/lang/String;)Lo/zznf;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static zznf read(String p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            zznf zznfVar = new zznf();
            Bundle bundle = new Bundle();
            bundle.putString("schema_id", p0);
            bundle.putString("schema_title", p1);
            zznfVar.setArguments(bundle);
            return zznfVar;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return setBitrateKbps.AudioAttributesCompatParcelizer(this, multiplyFft.IconCompatParcelizer(-880754422, true, new MagicModuleSubmissionRequestBody() { // from class: o.zznl
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return zznf.IconCompatParcelizer(this.read, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(SchemaIncompleteViewModel schemaIncompleteViewModel, ActivityResult activityResult) {
        toMagicModuleMetaRepoModel.write(activityResult, "");
        schemaIncompleteViewModel.IconCompatParcelizer(zznv.AudioAttributesCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ zznu AudioAttributesCompatParcelizer;
        private /* synthetic */ Context IconCompatParcelizer;
        private /* synthetic */ zznf RemoteActionCompatParcelizer;
        private int read;
        private /* synthetic */ boolean write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            if (!this.write) {
                if (this.AudioAttributesCompatParcelizer.write().isEmpty()) {
                    maybeGetTypeVariable activity = this.RemoteActionCompatParcelizer.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                } else if (this.AudioAttributesCompatParcelizer.getWrite()) {
                    maybeGetTypeVariable activity2 = this.RemoteActionCompatParcelizer.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                    Context context = this.IconCompatParcelizer;
                    zzlb.Companion companion = zzlb.INSTANCE;
                    context.startActivity(zzlb.Companion.write(this.IconCompatParcelizer, new zzlh(this.AudioAttributesCompatParcelizer.getRead(), this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer(), this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer())));
                }
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(boolean z, zznu zznuVar, zznf zznfVar, Context context, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.write = z;
            this.AudioAttributesCompatParcelizer = zznuVar;
            this.RemoteActionCompatParcelizer = zznfVar;
            this.IconCompatParcelizer = context;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.write, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(final zznu zznuVar, final boolean z, zznf zznfVar, final Context context, final r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 r8lambdakubbm7ckfqtc9qcgukc86fguu4, final zznt zzntVar, final SchemaIncompleteViewModel schemaIncompleteViewModel, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1145201782, i, -1, "com.marrow2.ui.schema.incomplete.SchemaIncompleteFragment.onCreateView.<anonymous>.<anonymous> (SchemaIncompleteFragment.kt:67)");
            }
            boolean write = zznuVar.getWrite();
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(z);
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(zznuVar);
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(zznfVar);
            boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(context);
            read readVarOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer | zIconCompatParcelizer | zIconCompatParcelizer2 | zIconCompatParcelizer3) || readVarOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                readVarOnPause = new read(z, zznuVar, zznfVar, context, null);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(readVarOnPause);
            }
            StreamReadException.IconCompatParcelizer(Boolean.valueOf(write), (MagicModuleSubmissionRequestBody) readVarOnPause, _handleunrecognizedcharacterescape, 0);
            final JsonManagedReference jsonManagedReference = JsonIncludeInclude.read(null, null, _handleunrecognizedcharacterescape, 0, 3);
            _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            JsonIncludeInclude.IconCompatParcelizer(onInflate.read(getFrameEndSchedulerui.IconCompatParcelizer$default(onInflate.IconCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleoddnameIconCompatParcelizer$default, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getAudioAttributesImplBaseParcelizer(), null, 2, null)), enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).read(), null, 2, null)), jsonManagedReference, multiplyFft.AudioAttributesCompatParcelizer(-54285147, true, new MagicModuleSubmissionRequestBody() { // from class: o.zznn
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zznf.read(zznuVar, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), null, null, null, 0, false, null, false, null, BitmapDescriptorFactory.HUE_RED, 0L, 0L, 0L, 0L, 0L, multiplyFft.AudioAttributesCompatParcelizer(1583024652, true, new getModuleData() { // from class: o.zznm
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return zznf.write(zznuVar, z, context, r8lambdakubbm7ckfqtc9qcgukc86fguu4, zzntVar, jsonManagedReference, schemaIncompleteViewModel, (getReturnTransition) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 12582912, 131064);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(zznu zznuVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-54285147, i, -1, "com.marrow2.ui.schema.incomplete.SchemaIncompleteFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (SchemaIncompleteFragment.kt:93)");
            }
            zzoq.AudioAttributesCompatParcelizer(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), zznuVar.getAudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescape, 6, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(zznu zznuVar, boolean z, final Context context, final r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 r8lambdakubbm7ckfqtc9qcgukc86fguu4, zznt zzntVar, JsonManagedReference jsonManagedReference, final SchemaIncompleteViewModel schemaIncompleteViewModel, getReturnTransition getreturntransition, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
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
                _validJsonValueList.AudioAttributesCompatParcelizer(1583024652, i2, -1, "com.marrow2.ui.schema.incomplete.SchemaIncompleteFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (SchemaIncompleteFragment.kt:100)");
            }
            _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(getParentFragment.read(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleOddName.INSTANCE, enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).read(), null, 2, null), getreturntransition), BitmapDescriptorFactory.HUE_RED, 1, null);
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(context);
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(r8lambdakubbm7ckfqtc9qcgukc86fguu4);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zIconCompatParcelizer | zIconCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.zznj
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return zznf.AudioAttributesCompatParcelizer(context, r8lambdakubbm7ckfqtc9qcgukc86fguu4, (zznu.IconCompatParcelizer) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            zzog.AudioAttributesCompatParcelizer(_handleoddnameIconCompatParcelizer$default, zznuVar, z, (getAnswerMap) objOnPause, _handleunrecognizedcharacterescape, 0, 0);
            boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(schemaIncompleteViewModel);
            Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer3 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getCreatedOnDateMs() { // from class: o.zzno
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zznf.write(schemaIncompleteViewModel);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
            }
            getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objOnPause2;
            boolean zIconCompatParcelizer4 = _handleunrecognizedcharacterescape.IconCompatParcelizer(schemaIncompleteViewModel);
            Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer4 || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getCreatedOnDateMs() { // from class: o.zznk
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zznf.RemoteActionCompatParcelizer(schemaIncompleteViewModel);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
            }
            zzol.write(zzntVar, jsonManagedReference, getcreatedondatems, (getCreatedOnDateMs) objOnPause3, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(Context context, r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 r8lambdakubbm7ckfqtc9qcgukc86fguu4, zznu.IconCompatParcelizer iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        setTokenBinding.Companion companion = setTokenBinding.INSTANCE;
        r8lambdakubbm7ckfqtc9qcgukc86fguu4.read(setTokenBinding.Companion.IconCompatParcelizer(context, iconCompatParcelizer.AudioAttributesCompatParcelizer(), 10, null));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(SchemaIncompleteViewModel schemaIncompleteViewModel) {
        schemaIncompleteViewModel.IconCompatParcelizer(zznv.write.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(SchemaIncompleteViewModel schemaIncompleteViewModel) {
        schemaIncompleteViewModel.IconCompatParcelizer(zznv.AudioAttributesCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(final zznf zznfVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        withFieldVisibility.write defaultViewModelCreationExtras;
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-880754422, i, -1, "com.marrow2.ui.schema.incomplete.SchemaIncompleteFragment.onCreateView.<anonymous> (SchemaIncompleteFragment.kt:53)");
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
            final SchemaIncompleteViewModel schemaIncompleteViewModel = (SchemaIncompleteViewModel) JDK14UtilRawTypeName.IconCompatParcelizer(toMagicModuleMetaDataUcModel.write(SchemaIncompleteViewModel.class), typeResolutionContextIconCompatParcelizer, null, defaultViewModelCreationExtras, _handleunrecognizedcharacterescape, 0);
            final zznu zznuVar = (zznu) isSetterVisible.AudioAttributesCompatParcelizer(schemaIncompleteViewModel.IconCompatParcelizer(), _handleunrecognizedcharacterescape, 0).getRemoteActionCompatParcelizer();
            final boolean zBooleanValue = ((Boolean) isSetterVisible.AudioAttributesCompatParcelizer(schemaIncompleteViewModel.AudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescape, 0).getRemoteActionCompatParcelizer()).booleanValue();
            final zznt zzntVar = (zznt) isSetterVisible.AudioAttributesCompatParcelizer(schemaIncompleteViewModel.read(), _handleunrecognizedcharacterescape, 0).getRemoteActionCompatParcelizer();
            final Context context = (Context) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
            _init_lambda4.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = new _init_lambda4.AudioAttributesImplApi26Parcelizer();
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(schemaIncompleteViewModel);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.zzng
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return zznf.write(schemaIncompleteViewModel, (ActivityResult) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            final r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 r8lambdakubbm7ckfqtc9qcgukc86fguu4 = setSessionImpl.read(audioAttributesImplApi26Parcelizer, (getAnswerMap) objOnPause, _handleunrecognizedcharacterescape);
            ThemeKt.read((AppTheme) null, false, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) multiplyFft.AudioAttributesCompatParcelizer(-1145201782, true, new MagicModuleSubmissionRequestBody() { // from class: o.zzni
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zznf.RemoteActionCompatParcelizer(zznuVar, zBooleanValue, zznfVar, context, r8lambdakubbm7ckfqtc9qcgukc86fguu4, zzntVar, schemaIncompleteViewModel, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 3);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }
}
