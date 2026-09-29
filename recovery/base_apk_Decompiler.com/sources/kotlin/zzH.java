package kotlin;

import android.content.Context;
import android.text.SpannableString;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.C;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow2.ui.recent_updates.RecentUpdateDetailViewModel;
import java.util.List;
import java.util.Locale;
import kotlin.CeaDecoderExternalSyntheticLambda0;
import kotlin.LastLocationRequestBuilder;
import kotlin.WindowInsetsCompatImpl30;
import kotlin._handleOddName;
import kotlin._skipWSOrEnd;
import kotlin.serializeIterableToIntentExtra;
import kotlin.withFieldVisibility;
import kotlin.zzgz;
import kotlin.zzhc;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class zzH {

    public static final class IconCompatParcelizer implements getAnswerMap {
        public static final IconCompatParcelizer write = new IconCompatParcelizer();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void IconCompatParcelizer(_handleOddName _handleoddname, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        final _handleOddName _handleoddname2;
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        withFieldVisibility.write defaultViewModelCreationExtras;
        final Context context;
        final _handleOddName _handleoddname3;
        SampleVideos sampleVideos;
        final RecentUpdateDetailViewModel recentUpdateDetailViewModel;
        RecentUpdateDetailViewModel recentUpdateDetailViewModel2;
        _handleOddName _handleoddname4;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1306632615);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            _handleoddname2 = _handleoddname;
        } else if ((i & 6) == 0) {
            _handleoddname2 = _handleoddname;
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname2) ? 4 : 2) | i;
        } else {
            _handleoddname2 = _handleoddname;
            i3 = i;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 3) != 2, i3 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            _handleOddName _handleoddname5 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1306632615, i3, -1, "com.marrow2.ui.recent_updates.fragments.RecentUpdateDetailComposeLayout (RecentUpdateDetailComposeLayout.kt:79)");
            }
            JDK14Util jDK14Util = JDK14Util.INSTANCE;
            TypeResolutionContext typeResolutionContextIconCompatParcelizer = JDK14Util.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 6);
            if (typeResolutionContextIconCompatParcelizer == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (typeResolutionContextIconCompatParcelizer instanceof anyExplicitsWithoutIgnoral) {
                defaultViewModelCreationExtras = ((anyExplicitsWithoutIgnoral) typeResolutionContextIconCompatParcelizer).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = withFieldVisibility.write.INSTANCE;
            }
            RecentUpdateDetailViewModel recentUpdateDetailViewModel3 = (RecentUpdateDetailViewModel) JDK14UtilRawTypeName.IconCompatParcelizer(toMagicModuleMetaDataUcModel.write(RecentUpdateDetailViewModel.class), typeResolutionContextIconCompatParcelizer, null, defaultViewModelCreationExtras, _handleunrecognizedcharacterescapeWrite, 0);
            final setTranslationY settranslationyWrite = setVerticalAlign.write(0, _handleunrecognizedcharacterescapeWrite, 0, 1);
            Context context2 = (Context) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
            MediaSessionCompatQueueItem mediaSessionCompatQueueItem = MediaSessionCompatQueueItem.INSTANCE;
            int i5 = MediaSessionCompatQueueItem.AudioAttributesCompatParcelizer;
            onSetShuffleMode onsetshufflemodeRemoteActionCompatParcelizer = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite);
            final onSetRating onBackPressedDispatcher = onsetshufflemodeRemoteActionCompatParcelizer != null ? onsetshufflemodeRemoteActionCompatParcelizer.getIconCompatParcelizer() : null;
            _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(_handleoddname5, BitmapDescriptorFactory.HUE_RED, 1, null);
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _handleOddName _handleoddname6 = onInflate.read(getFrameEndSchedulerui.IconCompatParcelizer$default(onInflate.IconCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleoddnameIconCompatParcelizer$default, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getAudioAttributesImplBaseParcelizer(), null, 2, null)), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).read(), null, 2, null));
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname6);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            _handleOddName _handleoddnameIconCompatParcelizer$default2 = isAdded.IconCompatParcelizer$default(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleOddName.INSTANCE, enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).read(), null, 2, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameIconCompatParcelizer$default2);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer2 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer2);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape5 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape5, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape5, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            final DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            long jOnSkipToNext = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getAudioAttributesImplBaseParcelizer();
            long jMediaBrowserCompatMediaItem = enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatMediaItem();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            zzfy zzfyVar = zzfy.AudioAttributesCompatParcelizer;
            _handleOddName _handleoddname7 = _handleoddname5;
            pushChargedEvent.write(zzfy.AudioAttributesCompatParcelizer(), _handleoddnameRemoteActionCompatParcelizer$default, multiplyFft.AudioAttributesCompatParcelizer(-1822614065, true, new MagicModuleSubmissionRequestBody() { // from class: o.zzgs
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzH.AudioAttributesCompatParcelizer(onBackPressedDispatcher, drawerLayoutSavedState, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), null, jOnSkipToNext, jMediaBrowserCompatMediaItem, fIconCompatParcelizer, _handleunrecognizedcharacterescapeWrite, 1573302, 8);
            final DataSourceBitmapLoaderExternalSyntheticLambda0 dataSourceBitmapLoaderExternalSyntheticLambda0 = (DataSourceBitmapLoaderExternalSyntheticLambda0) isSetterVisible.AudioAttributesCompatParcelizer(recentUpdateDetailViewModel3.IconCompatParcelizer(), _handleunrecognizedcharacterescapeWrite, 0).getRemoteActionCompatParcelizer();
            if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1748138471);
                sampleVideos = null;
                context = context2;
                _handleoddname3 = _handleoddname7;
                DrawerLayout.IconCompatParcelizer(isAdded.IconCompatParcelizer$default(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleOddName.INSTANCE, enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).read(), null, 2, null), BitmapDescriptorFactory.HUE_RED, 1, null), _skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false, multiplyFft.AudioAttributesCompatParcelizer(1456848291, true, new getModuleData() { // from class: o.zzgp
                    @Override // kotlin.getModuleData
                    public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                        return zzH.IconCompatParcelizer(settranslationyWrite, _handleoddname3, dataSourceBitmapLoaderExternalSyntheticLambda0, context, (setDrawerShadow) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                    }
                }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, 3120, 4);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                context = context2;
                _handleoddname3 = _handleoddname7;
                sampleVideos = null;
                if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setStreamingFormat) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1753103245);
                    splitRtspMessageBody.RemoteActionCompatParcelizer((String) null, _handleunrecognizedcharacterescapeWrite, 0, 1);
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                } else {
                    if (!(dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setTopBitrateKbps)) {
                        _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-497801834);
                        _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                        throw new RenewEligibleCreator();
                    }
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1753211838);
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                    setTopBitrateKbps settopbitratekbps = (setTopBitrateKbps) dataSourceBitmapLoaderExternalSyntheticLambda0;
                    if (settopbitratekbps.getRemoteActionCompatParcelizer() == 502) {
                        Toast.makeText(context, "Please check you internet", 0).show();
                    } else {
                        Toast.makeText(context, settopbitratekbps.getWrite(), 0).show();
                    }
                }
            }
            zzgz zzgzVar = (zzgz) isSetterVisible.AudioAttributesCompatParcelizer(recentUpdateDetailViewModel3.read(), _handleunrecognizedcharacterescapeWrite, 0).getRemoteActionCompatParcelizer();
            if (zzgzVar instanceof zzgz.RemoteActionCompatParcelizer) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1753794731);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                _handleoddname4 = _handleoddname3;
                _handleunrecognizedcharacterescape3 = _handleunrecognizedcharacterescapeWrite;
                recentUpdateDetailViewModel2 = recentUpdateDetailViewModel3;
            } else {
                if (zzgzVar instanceof zzgz.read) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1753874835);
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(context);
                    boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(zzgzVar);
                    recentUpdateDetailViewModel = recentUpdateDetailViewModel3;
                    boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(recentUpdateDetailViewModel);
                    write writeVarOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                    if ((zIconCompatParcelizer | zAudioAttributesCompatParcelizer | zIconCompatParcelizer2) || writeVarOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        writeVarOnPause = new write(context, zzgzVar, recentUpdateDetailViewModel, sampleVideos);
                        _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(writeVarOnPause);
                    }
                    StreamReadException.IconCompatParcelizer(getshowpopup, (MagicModuleSubmissionRequestBody) writeVarOnPause, _handleunrecognizedcharacterescapeWrite, 6);
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                } else {
                    recentUpdateDetailViewModel = recentUpdateDetailViewModel3;
                    if (zzgzVar instanceof zzgz.AudioAttributesCompatParcelizer) {
                        _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1754192585);
                        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                        boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(context);
                        boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(zzgzVar);
                        boolean zIconCompatParcelizer4 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(recentUpdateDetailViewModel);
                        read readVarOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                        if ((zIconCompatParcelizer3 | zAudioAttributesCompatParcelizer2 | zIconCompatParcelizer4) || readVarOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                            readVarOnPause = new read(context, zzgzVar, recentUpdateDetailViewModel, sampleVideos);
                            _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(readVarOnPause);
                        }
                        StreamReadException.IconCompatParcelizer(getshowpopup2, (MagicModuleSubmissionRequestBody) readVarOnPause, _handleunrecognizedcharacterescapeWrite, 6);
                        _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                    } else if (zzgzVar instanceof zzgz.IconCompatParcelizer) {
                        _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1754487085);
                        getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
                        boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(zzgzVar);
                        boolean zIconCompatParcelizer5 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(context);
                        boolean zIconCompatParcelizer6 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(recentUpdateDetailViewModel);
                        RemoteActionCompatParcelizer remoteActionCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                        if ((zAudioAttributesCompatParcelizer3 | zIconCompatParcelizer5 | zIconCompatParcelizer6) || remoteActionCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                            remoteActionCompatParcelizerOnPause = new RemoteActionCompatParcelizer(zzgzVar, context, recentUpdateDetailViewModel, sampleVideos);
                            _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(remoteActionCompatParcelizerOnPause);
                        }
                        StreamReadException.IconCompatParcelizer(getshowpopup3, (MagicModuleSubmissionRequestBody) remoteActionCompatParcelizerOnPause, _handleunrecognizedcharacterescapeWrite, 6);
                        _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                    } else {
                        if (!(zzgzVar instanceof zzgz.write)) {
                            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-497618318);
                            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                            throw new RenewEligibleCreator();
                        }
                        _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1754839090);
                        String strRemoteActionCompatParcelizer = singleArgCreatorDefaultsToProperties.RemoteActionCompatParcelizer(R.string.text_pro_placeholder_dialog_msg, new Object[]{"QBank module"}, _handleunrecognizedcharacterescapeWrite, 6);
                        String str = singleArgCreatorDefaultsToProperties.read(R.string.view_plans, _handleunrecognizedcharacterescapeWrite, 6);
                        String str2 = singleArgCreatorDefaultsToProperties.read(R.string.go_back, _handleunrecognizedcharacterescapeWrite, 6);
                        boolean zIconCompatParcelizer7 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(context);
                        Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                        if (zIconCompatParcelizer7 || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                            objOnPause = new getCreatedOnDateMs() { // from class: o.zzgi
                                @Override // kotlin.getCreatedOnDateMs
                                public final Object invoke() {
                                    return zzH.read(context);
                                }
                            };
                            _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
                        }
                        getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objOnPause;
                        boolean zIconCompatParcelizer8 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(recentUpdateDetailViewModel);
                        Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
                        if (zIconCompatParcelizer8 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                            objOnPause2 = new getCreatedOnDateMs() { // from class: o.zzgh
                                @Override // kotlin.getCreatedOnDateMs
                                public final Object invoke() {
                                    return zzH.RemoteActionCompatParcelizer(recentUpdateDetailViewModel);
                                }
                            };
                            _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
                        }
                        getCreatedOnDateMs getcreatedondatems2 = (getCreatedOnDateMs) objOnPause2;
                        boolean zIconCompatParcelizer9 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(recentUpdateDetailViewModel);
                        Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
                        if (zIconCompatParcelizer9 || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                            objOnPause3 = new getCreatedOnDateMs() { // from class: o.zzgg
                                @Override // kotlin.getCreatedOnDateMs
                                public final Object invoke() {
                                    return zzH.read(recentUpdateDetailViewModel);
                                }
                            };
                            _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
                        }
                        recentUpdateDetailViewModel2 = recentUpdateDetailViewModel;
                        _handleoddname4 = _handleoddname3;
                        _handleunrecognizedcharacterescape3 = _handleunrecognizedcharacterescapeWrite;
                        ProxyApiProxyResult.IconCompatParcelizer(null, null, strRemoteActionCompatParcelizer, null, null, 0L, false, str, str2, true, getcreatedondatems, getcreatedondatems2, (getCreatedOnDateMs) objOnPause3, false, _handleunrecognizedcharacterescape3, C.ENCODING_PCM_32BIT, 3072, 123);
                        _handleunrecognizedcharacterescape3.MediaBrowserCompatCustomActionResultReceiver();
                    }
                }
                _handleoddname4 = _handleoddname3;
                recentUpdateDetailViewModel2 = recentUpdateDetailViewModel;
                _handleunrecognizedcharacterescape3 = _handleunrecognizedcharacterescapeWrite;
            }
            _handleunrecognizedcharacterescape3.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescape3;
            boolean zBooleanValue = ((Boolean) isSetterVisible.AudioAttributesCompatParcelizer(recentUpdateDetailViewModel2.AudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescape2, 0).getRemoteActionCompatParcelizer()).booleanValue();
            if (zBooleanValue) {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(1735236343);
                splitRtspMessageBody.RemoteActionCompatParcelizer((String) null, _handleunrecognizedcharacterescape2, 0, 1);
                _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                if (zBooleanValue) {
                    _handleunrecognizedcharacterescape2.IconCompatParcelizer(1735233215);
                    _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
                    throw new RenewEligibleCreator();
                }
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(-2042203263);
                _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            }
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname2 = _handleoddname4;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzgf
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzH.AudioAttributesCompatParcelizer(_handleoddname2, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(onSetRating onsetrating) {
        if (onsetrating != null) {
            onsetrating.RemoteActionCompatParcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(final onSetRating onsetrating, DrawerLayoutLayoutParams drawerLayoutLayoutParams, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1822614065, i, -1, "com.marrow2.ui.recent_updates.fragments.RecentUpdateDetailComposeLayout.<anonymous>.<anonymous>.<anonymous> (RecentUpdateDetailComposeLayout.kt:107)");
            }
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(onsetrating);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.zzgn
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzH.AudioAttributesCompatParcelizer(onsetrating);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleOddName _handleoddnameIconCompatParcelizer = getParentFragment.IconCompatParcelizer(drawerLayoutLayoutParams.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.AudioAttributesImplBaseParcelizer()), assignParameter.IconCompatParcelizer(16.0f));
            zzfy zzfyVar = zzfy.AudioAttributesCompatParcelizer;
            JacksonInjectValue.IconCompatParcelizer((getCreatedOnDateMs) objOnPause, _handleoddnameIconCompatParcelizer, false, null, zzfy.read(), _handleunrecognizedcharacterescape, CpioConstants.C_ISBLK, 12);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final getShowPopup IconCompatParcelizer(setTranslationY settranslationy, _handleOddName _handleoddname, DataSourceBitmapLoaderExternalSyntheticLambda0 dataSourceBitmapLoaderExternalSyntheticLambda0, Context context, setDrawerShadow setdrawershadow, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        String strAudioAttributesCompatParcelizer;
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        int i3;
        toMagicModuleMetaRepoModel.write(setdrawershadow, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1456848291, i, -1, "com.marrow2.ui.recent_updates.fragments.RecentUpdateDetailComposeLayout.<anonymous>.<anonymous>.<anonymous> (RecentUpdateDetailComposeLayout.kt:133)");
            }
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer = VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.AudioAttributesCompatParcelizer(setVerticalAlign.IconCompatParcelizer(_handleOddName.INSTANCE, settranslationy, false, null, false, 14, null), null, assignParameter.IconCompatParcelizer(16.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameAudioAttributesCompatParcelizer);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            isInLayout.RemoteActionCompatParcelizer(getParentFragment.AudioAttributesCompatParcelizer$default(_handleoddname, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(28.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), _handleunrecognizedcharacterescape, 0);
            _skipWSOrEnd.read readVarMediaBrowserCompatCustomActionResultReceiver = _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver();
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), readVarMediaBrowserCompatCustomActionResultReceiver, _handleunrecognizedcharacterescape, 48);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, companion);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer2 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer2);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            decodeBitmap decodebitmap = (decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0;
            String strWrite = parseEac3SupplementalProperties.write(((zzhj) decodebitmap.RemoteActionCompatParcelizer()).read(), "MMMM dd yyyy");
            deserializeWithObjectId deserializewithobjectidAudioAttributesImplBaseParcelizer = TypeKt.AudioAttributesImplBaseParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer));
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(strWrite, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromUri(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidAudioAttributesImplBaseParcelizer, _handleunrecognizedcharacterescape, 0, 0, 65530);
            deserializeWithObjectId deserializewithobjectidAudioAttributesImplBaseParcelizer2 = TypeKt.AudioAttributesImplBaseParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer));
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer("|", getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(4.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).get_init_lambda3(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidAudioAttributesImplBaseParcelizer2, _handleunrecognizedcharacterescape, 54, 0, 65528);
            zzhe zzheVarMediaBrowserCompatItemReceiver = ((zzhj) decodebitmap.RemoteActionCompatParcelizer()).MediaBrowserCompatItemReceiver();
            if (zzheVarMediaBrowserCompatItemReceiver == null || (strAudioAttributesCompatParcelizer = zzheVarMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer()) == null) {
                strAudioAttributesCompatParcelizer = "";
            }
            deserializeWithObjectId deserializewithobjectidAudioAttributesImplBaseParcelizer3 = TypeKt.AudioAttributesImplBaseParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer));
            MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(strAudioAttributesCompatParcelizer, getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(4.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRating(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidAudioAttributesImplBaseParcelizer3, _handleunrecognizedcharacterescape, 48, 0, 65528);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            String strMediaBrowserCompatCustomActionResultReceiver = ((zzhj) decodebitmap.RemoteActionCompatParcelizer()).MediaBrowserCompatCustomActionResultReceiver();
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(8.0f), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(12.0f), 5, null);
            deserializeWithObjectId deserializewithobjectidMediaBrowserCompatCustomActionResultReceiver = enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).getMediaBrowserCompatCustomActionResultReceiver();
            MarrowTheme marrowTheme4 = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(strMediaBrowserCompatCustomActionResultReceiver, _handleoddnameAudioAttributesCompatParcelizer$default, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidMediaBrowserCompatCustomActionResultReceiver, _handleunrecognizedcharacterescape, 48, 0, 65528);
            VideoSizeExternalSyntheticLambda0.RemoteActionCompatParcelizer(((zzhj) decodebitmap.RemoteActionCompatParcelizer()).write(), (_handleOddName) null, (getCreatedOnDateMs<getShowPopup>) null, _handleunrecognizedcharacterescape, 0, 6);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(10.0f)), _handleunrecognizedcharacterescape, 6);
            String strRemoteActionCompatParcelizer = ((zzhj) decodebitmap.RemoteActionCompatParcelizer()).IconCompatParcelizer().RemoteActionCompatParcelizer();
            if (strRemoteActionCompatParcelizer == null || strRemoteActionCompatParcelizer.length() == 0) {
                i2 = 0;
                _handleunrecognizedcharacterescape.IconCompatParcelizer(434602665);
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(443072981);
                _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
                i2 = 0;
                withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer(), false);
                int iHashCode3 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler3 = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer3 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameRemoteActionCompatParcelizer$default);
                getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer3 = getDependencies.INSTANCE.IconCompatParcelizer();
                if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                    _getBigDecimal.write();
                }
                _handleunrecognizedcharacterescape.onPrepareFromMediaId();
                if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                    _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer3);
                } else {
                    _handleunrecognizedcharacterescape.onPlayFromUri();
                }
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape5 = NumberOutput.read(_handleunrecognizedcharacterescape);
                NumberOutput.write(_handleunrecognizedcharacterescape5, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape5, _getchardescHandleMediaPlayPauseIfPendingOnHandler3, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape5, Integer.valueOf(iHashCode3), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape5, getDependencies.INSTANCE.write());
                NumberOutput.write(_handleunrecognizedcharacterescape5, _handleoddnameRemoteActionCompatParcelizer3, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
                _handleOddName.Companion companion2 = _handleOddName.INSTANCE;
                boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(context);
                boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(dataSourceBitmapLoaderExternalSyntheticLambda0);
                Object objOnPause = _handleunrecognizedcharacterescape.onPause();
                if ((zIconCompatParcelizer | zIconCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause = new zzgk(context, dataSourceBitmapLoaderExternalSyntheticLambda0);
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
                }
                CmcdHeadersFactoryCmcdSessionBuilder.write(getLocalSavedStateRegistryOwner.RemoteActionCompatParcelizer$default(companion2, false, null, null, null, (getCreatedOnDateMs) objOnPause, 15, null), ((zzhj) decodebitmap.RemoteActionCompatParcelizer()).IconCompatParcelizer().RemoteActionCompatParcelizer(), getContentType.INSTANCE.RemoteActionCompatParcelizer(), true, 0, 0, _handleunrecognizedcharacterescape, 3456, 48);
                _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
                isInLayout.RemoteActionCompatParcelizer(getParentFragment.AudioAttributesCompatParcelizer$default(_handleoddname, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(24.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), _handleunrecognizedcharacterescape, 0);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescape.IconCompatParcelizer(291426624);
            write(((zzhj) decodebitmap.RemoteActionCompatParcelizer()).AudioAttributesImplApi21Parcelizer(), _handleunrecognizedcharacterescape, i2);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            isInLayout.RemoteActionCompatParcelizer(getParentFragment.AudioAttributesCompatParcelizer$default(_handleoddname, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(12.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), _handleunrecognizedcharacterescape, i2);
            String strAudioAttributesCompatParcelizer2 = ((zzhj) decodebitmap.RemoteActionCompatParcelizer()).AudioAttributesCompatParcelizer();
            if (strAudioAttributesCompatParcelizer2 == null || strAudioAttributesCompatParcelizer2.length() == 0) {
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescape;
                i3 = 6;
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(434602665);
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(444515411);
                _handleOddName.Companion companion3 = _handleOddName.INSTANCE;
                withTypeHandler withtypehandlerIconCompatParcelizer2 = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatMediaItem(), _handleunrecognizedcharacterescape, i2);
                int iHashCode4 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, i2));
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler4 = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer4 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, companion3);
                getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer4 = getDependencies.INSTANCE.IconCompatParcelizer();
                if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                    _getBigDecimal.write();
                }
                _handleunrecognizedcharacterescape.onPrepareFromMediaId();
                if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                    _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer4);
                } else {
                    _handleunrecognizedcharacterescape.onPlayFromUri();
                }
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape6 = NumberOutput.read(_handleunrecognizedcharacterescape);
                NumberOutput.write(_handleunrecognizedcharacterescape6, withtypehandlerIconCompatParcelizer2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape6, _getchardescHandleMediaPlayPauseIfPendingOnHandler4, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape6, Integer.valueOf(iHashCode4), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape6, getDependencies.INSTANCE.write());
                NumberOutput.write(_handleunrecognizedcharacterescape6, _handleoddnameRemoteActionCompatParcelizer4, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                getView getview2 = getView.INSTANCE;
                _copyCurrentStringValue.IconCompatParcelizer("Ref: ", null, enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.AudioAttributesImplBaseParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape, 6, 0, 65530);
                String strAudioAttributesCompatParcelizer3 = ((zzhj) decodebitmap.RemoteActionCompatParcelizer()).AudioAttributesCompatParcelizer();
                deserializeWithObjectId deserializewithobjectidAudioAttributesImplBaseParcelizer4 = TypeKt.AudioAttributesImplBaseParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer));
                MarrowTheme marrowTheme5 = MarrowTheme.INSTANCE;
                _copyCurrentStringValue.IconCompatParcelizer(strAudioAttributesCompatParcelizer3, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRating(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidAudioAttributesImplBaseParcelizer4, _handleunrecognizedcharacterescape, 0, 0, 65530);
                _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescape;
                i3 = 6;
                isInLayout.RemoteActionCompatParcelizer(getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(35.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), _handleunrecognizedcharacterescape2, 6);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            write((zzhj) decodebitmap.RemoteActionCompatParcelizer(), _handleunrecognizedcharacterescape2, 0);
            isInLayout.RemoteActionCompatParcelizer(getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(50.0f), 7, null), _handleunrecognizedcharacterescape2, i3);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    public static final class AudioAttributesImplApi26Parcelizer implements getAnswerMap<Integer, Object> {
        private /* synthetic */ List AudioAttributesCompatParcelizer;
        private /* synthetic */ getAnswerMap read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Object invoke(Integer num) {
            return IconCompatParcelizer(num.intValue());
        }

        private Object IconCompatParcelizer(int i) {
            return this.read.invoke(this.AudioAttributesCompatParcelizer.get(i));
        }

        public AudioAttributesImplApi26Parcelizer(getAnswerMap getanswermap, List list) {
            this.read = getanswermap;
            this.AudioAttributesCompatParcelizer = list;
        }
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver implements getMagicModuleStat<performDestroy, Integer, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        private /* synthetic */ List write;

        @Override // kotlin.getMagicModuleStat
        public final /* synthetic */ getShowPopup write(performDestroy performdestroy, Integer num, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num2) {
            IconCompatParcelizer(performdestroy, num.intValue(), _handleunrecognizedcharacterescape, num2.intValue());
            return getShowPopup.INSTANCE;
        }

        private void IconCompatParcelizer(performDestroy performdestroy, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
            int i3;
            if ((i2 & 6) == 0) {
                i3 = (_handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(performdestroy) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i) ? 32 : 16;
            }
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i3 & 147) != 146, i3 & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
                return;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            nextIndex nextindex = (nextIndex) this.write.get(i);
            _handleunrecognizedcharacterescape.IconCompatParcelizer(1062531201);
            if (nextindex.IconCompatParcelizer() == null) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(1045191288);
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(1062556186);
                zzH.IconCompatParcelizer(nextindex.IconCompatParcelizer(), nextindex.write(), _handleunrecognizedcharacterescape, 0);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }

        public MediaBrowserCompatCustomActionResultReceiver(List list) {
            this.write = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final getShowPopup RemoteActionCompatParcelizer(Context context, DataSourceBitmapLoaderExternalSyntheticLambda0 dataSourceBitmapLoaderExternalSyntheticLambda0) {
        CeaDecoderExternalSyntheticLambda0.Companion audioAttributesCompatParcelizer = CeaDecoderExternalSyntheticLambda0.INSTANCE;
        context.startActivity(CeaDecoderExternalSyntheticLambda0.Companion.RemoteActionCompatParcelizer(context, ((zzhj) ((decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0).RemoteActionCompatParcelizer()).IconCompatParcelizer().RemoteActionCompatParcelizer()));
        return getShowPopup.INSTANCE;
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ RecentUpdateDetailViewModel AudioAttributesCompatParcelizer;
        private /* synthetic */ Context IconCompatParcelizer;
        private /* synthetic */ zzgz RemoteActionCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            Toast.makeText(this.IconCompatParcelizer, ((zzgz.read) this.RemoteActionCompatParcelizer).IconCompatParcelizer(), 0).show();
            this.AudioAttributesCompatParcelizer.read(zzhc.write.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(Context context, zzgz zzgzVar, RecentUpdateDetailViewModel recentUpdateDetailViewModel, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = context;
            this.RemoteActionCompatParcelizer = zzgzVar;
            this.AudioAttributesCompatParcelizer = recentUpdateDetailViewModel;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ zzgz IconCompatParcelizer;
        private /* synthetic */ Context RemoteActionCompatParcelizer;
        private /* synthetic */ RecentUpdateDetailViewModel read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            zzH.write(this.RemoteActionCompatParcelizer, ((zzgz.AudioAttributesCompatParcelizer) this.IconCompatParcelizer).read());
            this.read.read(zzhc.write.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(Context context, zzgz zzgzVar, RecentUpdateDetailViewModel recentUpdateDetailViewModel, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = context;
            this.IconCompatParcelizer = zzgzVar;
            this.read = recentUpdateDetailViewModel;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Context AudioAttributesCompatParcelizer;
        private /* synthetic */ zzgz IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ RecentUpdateDetailViewModel write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            zzH.read(((zzgz.IconCompatParcelizer) this.IconCompatParcelizer).RemoteActionCompatParcelizer(), this.AudioAttributesCompatParcelizer);
            this.write.read(zzhc.write.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(zzgz zzgzVar, Context context, RecentUpdateDetailViewModel recentUpdateDetailViewModel, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = zzgzVar;
            this.AudioAttributesCompatParcelizer = context;
            this.write = recentUpdateDetailViewModel;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(Context context) {
        PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
        String lowerCase = "PRO_MCQ_ACCESSED".toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        _isNaN.startActivity(context, PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(context, "Pro Subscription Dialog", lowerCase), null);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(RecentUpdateDetailViewModel recentUpdateDetailViewModel) {
        recentUpdateDetailViewModel.read(zzhc.write.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(RecentUpdateDetailViewModel recentUpdateDetailViewModel) {
        recentUpdateDetailViewModel.read(zzhc.write.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void read(String str, Context context) {
        LastLocationRequestBuilder.Companion readVar = LastLocationRequestBuilder.INSTANCE;
        context.startActivity(LastLocationRequestBuilder.Companion.write(context, new isFastestIntervalExplicitlySet(str, null, 2, 0 == true ? 1 : 0)));
    }

    private static void write(final zzhj zzhjVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        withFieldVisibility.write defaultViewModelCreationExtras;
        toMagicModuleMetaRepoModel.write(zzhjVar, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-725261856);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(zzhjVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-725261856, i2, -1, "com.marrow2.ui.recent_updates.fragments.ShareView (RecentUpdateDetailComposeLayout.kt:298)");
            }
            final Context context = (Context) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
            JDK14Util jDK14Util = JDK14Util.INSTANCE;
            TypeResolutionContext typeResolutionContextIconCompatParcelizer = JDK14Util.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 6);
            if (typeResolutionContextIconCompatParcelizer == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (typeResolutionContextIconCompatParcelizer instanceof anyExplicitsWithoutIgnoral) {
                defaultViewModelCreationExtras = ((anyExplicitsWithoutIgnoral) typeResolutionContextIconCompatParcelizer).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = withFieldVisibility.write.INSTANCE;
            }
            final RecentUpdateDetailViewModel recentUpdateDetailViewModel = (RecentUpdateDetailViewModel) JDK14UtilRawTypeName.IconCompatParcelizer(toMagicModuleMetaDataUcModel.write(RecentUpdateDetailViewModel.class), typeResolutionContextIconCompatParcelizer, null, defaultViewModelCreationExtras, _handleunrecognizedcharacterescapeWrite, 0);
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameRemoteActionCompatParcelizer$default);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            _skipWSOrEnd.read readVarMediaBrowserCompatCustomActionResultReceiver = _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver();
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(context);
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(zzhjVar);
            boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(recentUpdateDetailViewModel);
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((zIconCompatParcelizer | zIconCompatParcelizer2 | zIconCompatParcelizer3) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.zzI
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzH.IconCompatParcelizer(context, zzhjVar, recentUpdateDetailViewModel);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default2 = getLocalSavedStateRegistryOwner.RemoteActionCompatParcelizer$default(companion, false, null, null, null, (getCreatedOnDateMs) objOnPause, 15, null);
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), readVarMediaBrowserCompatCustomActionResultReceiver, _handleunrecognizedcharacterescapeWrite, 48);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameRemoteActionCompatParcelizer$default2);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer2 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer2);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            ViewFactoryHolder.write(getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.ic_share_dark, _handleunrecognizedcharacterescapeWrite, 6), "image description", null, null, getContentType.INSTANCE.AudioAttributesImplApi21Parcelizer(), BitmapDescriptorFactory.HUE_RED, null, _handleunrecognizedcharacterescapeWrite, isAnnotationBundle.read | 24624, 108);
            isInLayout.RemoteActionCompatParcelizer(getParentFragment.write$default(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(3.0f), BitmapDescriptorFactory.HUE_RED, 2, null), _handleunrecognizedcharacterescapeWrite, 6);
            deserializeWithObjectId deserializewithobjectidMediaBrowserCompatItemReceiver = TypeKt.MediaBrowserCompatItemReceiver(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer));
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _copyCurrentStringValue.IconCompatParcelizer("Share", null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRating(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidMediaBrowserCompatItemReceiver, _handleunrecognizedcharacterescape2, 6, 0, 65530);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzgm
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzH.AudioAttributesCompatParcelizer(zzhjVar, i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(Context context, zzhj zzhjVar, RecentUpdateDetailViewModel recentUpdateDetailViewModel) {
        if (getTrackName.write(context)) {
            String str = read(context, zzhjVar);
            String strRemoteActionCompatParcelizer = zzhjVar.RemoteActionCompatParcelizer();
            zzhjVar.MediaBrowserCompatCustomActionResultReceiver();
            dispatchTouchEvent.RemoteActionCompatParcelizer(context, strRemoteActionCompatParcelizer, CourseConfigKeyConstantsKt.KEY_RECENT_UPDATES, null, new AudioAttributesCompatParcelizer(context, str));
            recentUpdateDetailViewModel.read(new zzhc.RemoteActionCompatParcelizer(zzhjVar.RemoteActionCompatParcelizer()));
        } else {
            Toast.makeText(context, R.string.app_error_no_internet, 0).show();
        }
        return getShowPopup.INSTANCE;
    }

    public static final class AudioAttributesCompatParcelizer extends HlsPlaylist<String> {
        private /* synthetic */ Context IconCompatParcelizer;
        private /* synthetic */ String read;

        AudioAttributesCompatParcelizer(Context context, String str) {
            this.IconCompatParcelizer = context;
            this.read = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.HlsPlaylist
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public void IconCompatParcelizer(String str) {
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                return;
            }
            Context context = this.IconCompatParcelizer;
            String str3 = this.read;
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(" ");
            sb.append(str);
            scheduleUpdate.write(context, "Marrow - Recent Update", sb.toString());
        }
    }

    private static final String read(Context context, zzhj zzhjVar) {
        SpannableString spannableString = new SpannableString(configureFromObjectSettings.IconCompatParcelizer(zzhjVar.write(), 0));
        StringBuilder sb = new StringBuilder(zzhjVar.MediaBrowserCompatCustomActionResultReceiver());
        sb.append("\n\n");
        String string = spannableString.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        sb.append(TestGroupLSModel.RemoteActionCompatParcelizer(string, 100));
        sb.append("...\n\n");
        sb.append(context.getString(R.string.recent_update_share_msg));
        String string2 = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        return string2;
    }

    private static void write(final List<nextIndex> list, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        toMagicModuleMetaRepoModel.write(list, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1798627300);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1798627300, i2, -1, "com.marrow2.ui.recent_updates.fragments.TagsRecyclerView (RecentUpdateDetailComposeLayout.kt:370)");
            }
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list);
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.zzgb
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return zzH.RemoteActionCompatParcelizer(list, (setReenterTransition) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            performContextItemSelected.AudioAttributesCompatParcelizer(_handleoddnameRemoteActionCompatParcelizer$default, null, null, false, null, null, null, false, null, (getAnswerMap) objOnPause, _handleunrecognizedcharacterescapeWrite, 6, 510);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzge
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzH.RemoteActionCompatParcelizer(list, i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    public static final void IconCompatParcelizer(final String str, final int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2) {
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        withFieldVisibility.write defaultViewModelCreationExtras;
        toMagicModuleMetaRepoModel.write(str, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-651447358);
        if ((i2 & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 32 : 16;
        }
        int i4 = i3;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i4 & 19) != 18, i4 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-651447358, i4, -1, "com.marrow2.ui.recent_updates.fragments.TagItem (RecentUpdateDetailComposeLayout.kt:385)");
            }
            JDK14Util jDK14Util = JDK14Util.INSTANCE;
            TypeResolutionContext typeResolutionContextIconCompatParcelizer = JDK14Util.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 6);
            if (typeResolutionContextIconCompatParcelizer == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (typeResolutionContextIconCompatParcelizer instanceof anyExplicitsWithoutIgnoral) {
                defaultViewModelCreationExtras = ((anyExplicitsWithoutIgnoral) typeResolutionContextIconCompatParcelizer).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = withFieldVisibility.write.INSTANCE;
            }
            final RecentUpdateDetailViewModel recentUpdateDetailViewModel = (RecentUpdateDetailViewModel) JDK14UtilRawTypeName.IconCompatParcelizer(toMagicModuleMetaDataUcModel.write(RecentUpdateDetailViewModel.class), typeResolutionContextIconCompatParcelizer, null, defaultViewModelCreationExtras, _handleunrecognizedcharacterescapeWrite, 0);
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(5.0f), BitmapDescriptorFactory.HUE_RED, 11, null);
            boolean z = (i4 & 112) == 32;
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(recentUpdateDetailViewModel);
            boolean z2 = (i4 & 14) == 4;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((zIconCompatParcelizer | z | z2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.zzgl
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzH.write(i, recentUpdateDetailViewModel, str);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = getLocalSavedStateRegistryOwner.RemoteActionCompatParcelizer$default(_handleoddnameAudioAttributesCompatParcelizer$default, false, null, null, null, (getCreatedOnDateMs) objOnPause, 15, null);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameRemoteActionCompatParcelizer$default);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            WindowInsetsCompatImpl30.write writeVar = WindowInsetsCompatImpl30.INSTANCE.read(assignParameter.IconCompatParcelizer(6.0f), _skipWSOrEnd.INSTANCE.RatingCompat());
            _skipWSOrEnd.read readVarMediaBrowserCompatCustomActionResultReceiver = _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver();
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(1.0f);
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer = getParentFragment.AudioAttributesCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer(setConfiguration.write(companion, fIconCompatParcelizer, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(), setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(4.0f))), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver(), setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(4.0f))), assignParameter.IconCompatParcelizer(12.0f), assignParameter.IconCompatParcelizer(6.0f), assignParameter.IconCompatParcelizer(12.0f), assignParameter.IconCompatParcelizer(6.0f));
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(writeVar, readVarMediaBrowserCompatCustomActionResultReceiver, _handleunrecognizedcharacterescapeWrite, 54);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameAudioAttributesCompatParcelizer);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer2 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer2);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            StringBuilder sb = i == 2 ? new StringBuilder("Pearl ID: ") : new StringBuilder("MCQ ID: ");
            sb.append(str);
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _copyCurrentStringValue.IconCompatParcelizer(sb.toString(), null, enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.RemoteActionCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape2, 0, 0, 65530);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzgj
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzH.write(str, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(int i, RecentUpdateDetailViewModel recentUpdateDetailViewModel, String str) {
        if (i == 2) {
            recentUpdateDetailViewModel.read(new zzhc.read(str));
        } else {
            recentUpdateDetailViewModel.read(new zzhc.IconCompatParcelizer(str));
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void write(Context context, String str) {
        serializeIterableToIntentExtra.Companion readVar = serializeIterableToIntentExtra.INSTANCE;
        context.startActivity(serializeIterableToIntentExtra.Companion.AudioAttributesCompatParcelizer(context, new ConnectionTracker(str, null, 2, 0 == true ? 1 : 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(List list, setReenterTransition setreentertransition) {
        toMagicModuleMetaRepoModel.write(setreentertransition, "");
        setreentertransition.RemoteActionCompatParcelizer(list.size(), null, new AudioAttributesImplApi26Parcelizer(IconCompatParcelizer.write, list), multiplyFft.IconCompatParcelizer(802480018, true, new MediaBrowserCompatCustomActionResultReceiver(list)));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_handleOddName _handleoddname, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer(_handleoddname, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(zzhj zzhjVar, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(zzhjVar, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer(str, i, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(List list, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write((List<nextIndex>) list, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
