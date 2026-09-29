package kotlin;

import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u0010\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0015\u001a\u00020\u0014*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00122\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u0018\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u001e\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u001d2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010 \u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001c2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b \u0010!J9\u0010#\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\"2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\"2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b%\u0010&J7\u0010(\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020'2\u0006\u0010\b\u001a\u00020\u001d2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b(\u0010)J%\u0010*\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020'2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b*\u0010+JA\u0010-\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020,2\u0006\u0010\b\u001a\u00020\u001d2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b-\u0010.J9\u00100\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020/2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b0\u00101JA\u00103\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0006\u001a\u0002022\u0006\u0010\b\u001a\u00020\u001d2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b3\u00104J3\u00106\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\b\u001a\u0002052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b6\u00107J5\u00109\u001a\u00020\r2\u0006\u0010\u0006\u001a\u0002082\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b9\u0010:J;\u00109\u001a\u00020\r2\u0006\u0010\u0006\u001a\u0002082\u0006\u0010\b\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u00142\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b9\u0010;J+\u0010<\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b<\u0010=J\u0013\u0010?\u001a\u00020>*\u00020\u000fH\u0002¢\u0006\u0004\b?\u0010@"}, d2 = {"Lo/setOffscreenPageLimit;", "", "<init>", "()V", "Lo/setImageDisplayMode;", "Landroid/view/inputmethod/HandwritingGesture;", "p0", "Lo/Typed3EpoxyController;", "p1", "Lo/CoercionConfig;", "p2", "Lkotlin/Function1;", "Lo/findBeanDeserializer;", "", "p3", "", "bV_", "(Lo/setImageDisplayMode;Landroid/view/inputmethod/HandwritingGesture;Lo/Typed3EpoxyController;Lo/CoercionConfig;Lo/getAnswerMap;)I", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "", "bW_", "(Lo/setImageDisplayMode;Landroid/view/inputmethod/PreviewableHandwritingGesture;Lo/Typed3EpoxyController;Landroid/os/CancellationSignal;)Z", "Landroid/view/inputmethod/SelectGesture;", "bP_", "(Lo/setImageDisplayMode;Landroid/view/inputmethod/SelectGesture;Lo/Typed3EpoxyController;Lo/getAnswerMap;)I", "bT_", "(Lo/setImageDisplayMode;Landroid/view/inputmethod/SelectGesture;Lo/Typed3EpoxyController;)V", "Landroid/view/inputmethod/DeleteGesture;", "Lo/AbstractDeserializer;", "bK_", "(Lo/setImageDisplayMode;Landroid/view/inputmethod/DeleteGesture;Lo/AbstractDeserializer;Lo/getAnswerMap;)I", "bR_", "(Lo/setImageDisplayMode;Landroid/view/inputmethod/DeleteGesture;Lo/Typed3EpoxyController;)V", "Landroid/view/inputmethod/SelectRangeGesture;", "bQ_", "(Lo/setImageDisplayMode;Landroid/view/inputmethod/SelectRangeGesture;Lo/Typed3EpoxyController;Lo/getAnswerMap;)I", "bU_", "(Lo/setImageDisplayMode;Landroid/view/inputmethod/SelectRangeGesture;Lo/Typed3EpoxyController;)V", "Landroid/view/inputmethod/DeleteRangeGesture;", "bL_", "(Lo/setImageDisplayMode;Landroid/view/inputmethod/DeleteRangeGesture;Lo/AbstractDeserializer;Lo/getAnswerMap;)I", "bS_", "(Lo/setImageDisplayMode;Landroid/view/inputmethod/DeleteRangeGesture;Lo/Typed3EpoxyController;)V", "Landroid/view/inputmethod/JoinOrSplitGesture;", "bN_", "(Lo/setImageDisplayMode;Landroid/view/inputmethod/JoinOrSplitGesture;Lo/AbstractDeserializer;Lo/CoercionConfig;Lo/getAnswerMap;)I", "Landroid/view/inputmethod/InsertGesture;", "bM_", "(Lo/setImageDisplayMode;Landroid/view/inputmethod/InsertGesture;Lo/CoercionConfig;Lo/getAnswerMap;)I", "Landroid/view/inputmethod/RemoveSpaceGesture;", "bO_", "(Lo/setImageDisplayMode;Landroid/view/inputmethod/RemoveSpaceGesture;Lo/AbstractDeserializer;Lo/CoercionConfig;Lo/getAnswerMap;)I", "", "AudioAttributesCompatParcelizer", "(ILjava/lang/String;Lo/getAnswerMap;)V", "Lo/findProperty;", "RemoteActionCompatParcelizer", "(JLo/Typed3EpoxyController;Lo/getAnswerMap;)V", "(JLo/AbstractDeserializer;ZLo/getAnswerMap;)V", "bJ_", "(Landroid/view/inputmethod/HandwritingGesture;Lo/getAnswerMap;)I", "Lo/_handleTypedObjectId;", "read", "(I)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setOffscreenPageLimit {
    public static final setOffscreenPageLimit INSTANCE = new setOffscreenPageLimit();

    private setOffscreenPageLimit() {
    }

    public final int bV_(setImageDisplayMode setimagedisplaymode, HandwritingGesture handwritingGesture, Typed3EpoxyController typed3EpoxyController, CoercionConfig coercionConfig, getAnswerMap<? super findBeanDeserializer, getShowPopup> getanswermap) {
        deserializeFromNumber audioAttributesCompatParcelizer;
        deserializeFromBoolean iconCompatParcelizer;
        AbstractDeserializer mediaDescriptionCompat = setimagedisplaymode.getMediaDescriptionCompat();
        if (mediaDescriptionCompat == null) {
            return 3;
        }
        hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer = setimagedisplaymode.AudioAttributesImplApi26Parcelizer();
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(mediaDescriptionCompat, (hasstableidsAudioAttributesImplApi26Parcelizer == null || (audioAttributesCompatParcelizer = hasstableidsAudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer()) == null || (iconCompatParcelizer = audioAttributesCompatParcelizer.getIconCompatParcelizer()) == null) ? null : iconCompatParcelizer.getWrite())) {
            return 3;
        }
        if (handwritingGesture instanceof SelectGesture) {
            return bP_(setimagedisplaymode, (SelectGesture) handwritingGesture, typed3EpoxyController, getanswermap);
        }
        if (handwritingGesture instanceof DeleteGesture) {
            return bK_(setimagedisplaymode, (DeleteGesture) handwritingGesture, mediaDescriptionCompat, getanswermap);
        }
        if (handwritingGesture instanceof SelectRangeGesture) {
            return bQ_(setimagedisplaymode, (SelectRangeGesture) handwritingGesture, typed3EpoxyController, getanswermap);
        }
        if (handwritingGesture instanceof DeleteRangeGesture) {
            return bL_(setimagedisplaymode, (DeleteRangeGesture) handwritingGesture, mediaDescriptionCompat, getanswermap);
        }
        if (handwritingGesture instanceof JoinOrSplitGesture) {
            return bN_(setimagedisplaymode, (JoinOrSplitGesture) handwritingGesture, mediaDescriptionCompat, coercionConfig, getanswermap);
        }
        if (handwritingGesture instanceof InsertGesture) {
            return bM_(setimagedisplaymode, (InsertGesture) handwritingGesture, coercionConfig, getanswermap);
        }
        if (handwritingGesture instanceof RemoveSpaceGesture) {
            return bO_(setimagedisplaymode, (RemoveSpaceGesture) handwritingGesture, mediaDescriptionCompat, coercionConfig, getanswermap);
        }
        return 2;
    }

    public final boolean bW_(setImageDisplayMode setimagedisplaymode, PreviewableHandwritingGesture previewableHandwritingGesture, final Typed3EpoxyController typed3EpoxyController, CancellationSignal cancellationSignal) {
        deserializeFromNumber audioAttributesCompatParcelizer;
        deserializeFromBoolean iconCompatParcelizer;
        AbstractDeserializer mediaDescriptionCompat = setimagedisplaymode.getMediaDescriptionCompat();
        if (mediaDescriptionCompat == null) {
            return false;
        }
        hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer = setimagedisplaymode.AudioAttributesImplApi26Parcelizer();
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(mediaDescriptionCompat, (hasstableidsAudioAttributesImplApi26Parcelizer == null || (audioAttributesCompatParcelizer = hasstableidsAudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer()) == null || (iconCompatParcelizer = audioAttributesCompatParcelizer.getIconCompatParcelizer()) == null) ? null : iconCompatParcelizer.getWrite())) {
            return false;
        }
        if (previewableHandwritingGesture instanceof SelectGesture) {
            bT_(setimagedisplaymode, (SelectGesture) previewableHandwritingGesture, typed3EpoxyController);
        } else if (previewableHandwritingGesture instanceof DeleteGesture) {
            bR_(setimagedisplaymode, (DeleteGesture) previewableHandwritingGesture, typed3EpoxyController);
        } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
            bU_(setimagedisplaymode, (SelectRangeGesture) previewableHandwritingGesture, typed3EpoxyController);
        } else {
            if (!(previewableHandwritingGesture instanceof DeleteRangeGesture)) {
                return false;
            }
            bS_(setimagedisplaymode, (DeleteRangeGesture) previewableHandwritingGesture, typed3EpoxyController);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: o.setPageMargin
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                setOffscreenPageLimit.read(typed3EpoxyController);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(Typed3EpoxyController typed3EpoxyController) {
        if (typed3EpoxyController != null) {
            typed3EpoxyController.AudioAttributesImplApi26Parcelizer();
        }
    }

    private final int bP_(setImageDisplayMode setimagedisplaymode, SelectGesture selectGesture, Typed3EpoxyController typed3EpoxyController, getAnswerMap<? super findBeanDeserializer, getShowPopup> getanswermap) {
        long jWrite = setOnPageChangeListener.write(setimagedisplaymode, VersionUtil.AudioAttributesCompatParcelizer(selectGesture.getSelectionArea()), read(selectGesture.getGranularity()), _resolveInnerClassValuedProperty.INSTANCE.write());
        if (findProperty.write(jWrite)) {
            return INSTANCE.bJ_(selectGesture, getanswermap);
        }
        RemoteActionCompatParcelizer(jWrite, typed3EpoxyController, getanswermap);
        return 1;
    }

    private final void bT_(setImageDisplayMode setimagedisplaymode, SelectGesture selectGesture, Typed3EpoxyController typed3EpoxyController) {
        if (typed3EpoxyController != null) {
            typed3EpoxyController.RemoteActionCompatParcelizer(setOnPageChangeListener.write(setimagedisplaymode, VersionUtil.AudioAttributesCompatParcelizer(selectGesture.getSelectionArea()), read(selectGesture.getGranularity()), _resolveInnerClassValuedProperty.INSTANCE.write()));
        }
    }

    private final int bK_(setImageDisplayMode setimagedisplaymode, DeleteGesture deleteGesture, AbstractDeserializer abstractDeserializer, getAnswerMap<? super findBeanDeserializer, getShowPopup> getanswermap) {
        int i = read(deleteGesture.getGranularity());
        long jWrite = setOnPageChangeListener.write(setimagedisplaymode, VersionUtil.AudioAttributesCompatParcelizer(deleteGesture.getDeletionArea()), i, _resolveInnerClassValuedProperty.INSTANCE.write());
        if (findProperty.write(jWrite)) {
            return INSTANCE.bJ_(deleteGesture, getanswermap);
        }
        RemoteActionCompatParcelizer(jWrite, abstractDeserializer, _handleTypedObjectId.RemoteActionCompatParcelizer(i, _handleTypedObjectId.INSTANCE.write()), getanswermap);
        return 1;
    }

    private final void bR_(setImageDisplayMode setimagedisplaymode, DeleteGesture deleteGesture, Typed3EpoxyController typed3EpoxyController) {
        if (typed3EpoxyController != null) {
            typed3EpoxyController.read(setOnPageChangeListener.write(setimagedisplaymode, VersionUtil.AudioAttributesCompatParcelizer(deleteGesture.getDeletionArea()), read(deleteGesture.getGranularity()), _resolveInnerClassValuedProperty.INSTANCE.write()));
        }
    }

    private final int bQ_(setImageDisplayMode setimagedisplaymode, SelectRangeGesture selectRangeGesture, Typed3EpoxyController typed3EpoxyController, getAnswerMap<? super findBeanDeserializer, getShowPopup> getanswermap) {
        long jIconCompatParcelizer = setOnPageChangeListener.IconCompatParcelizer(setimagedisplaymode, VersionUtil.AudioAttributesCompatParcelizer(selectRangeGesture.getSelectionStartArea()), VersionUtil.AudioAttributesCompatParcelizer(selectRangeGesture.getSelectionEndArea()), read(selectRangeGesture.getGranularity()), _resolveInnerClassValuedProperty.INSTANCE.write());
        if (findProperty.write(jIconCompatParcelizer)) {
            return INSTANCE.bJ_(selectRangeGesture, getanswermap);
        }
        RemoteActionCompatParcelizer(jIconCompatParcelizer, typed3EpoxyController, getanswermap);
        return 1;
    }

    private final void bU_(setImageDisplayMode setimagedisplaymode, SelectRangeGesture selectRangeGesture, Typed3EpoxyController typed3EpoxyController) {
        if (typed3EpoxyController != null) {
            typed3EpoxyController.RemoteActionCompatParcelizer(setOnPageChangeListener.IconCompatParcelizer(setimagedisplaymode, VersionUtil.AudioAttributesCompatParcelizer(selectRangeGesture.getSelectionStartArea()), VersionUtil.AudioAttributesCompatParcelizer(selectRangeGesture.getSelectionEndArea()), read(selectRangeGesture.getGranularity()), _resolveInnerClassValuedProperty.INSTANCE.write()));
        }
    }

    private final int bL_(setImageDisplayMode setimagedisplaymode, DeleteRangeGesture deleteRangeGesture, AbstractDeserializer abstractDeserializer, getAnswerMap<? super findBeanDeserializer, getShowPopup> getanswermap) {
        int i = read(deleteRangeGesture.getGranularity());
        long jIconCompatParcelizer = setOnPageChangeListener.IconCompatParcelizer(setimagedisplaymode, VersionUtil.AudioAttributesCompatParcelizer(deleteRangeGesture.getDeletionStartArea()), VersionUtil.AudioAttributesCompatParcelizer(deleteRangeGesture.getDeletionEndArea()), i, _resolveInnerClassValuedProperty.INSTANCE.write());
        if (findProperty.write(jIconCompatParcelizer)) {
            return INSTANCE.bJ_(deleteRangeGesture, getanswermap);
        }
        RemoteActionCompatParcelizer(jIconCompatParcelizer, abstractDeserializer, _handleTypedObjectId.RemoteActionCompatParcelizer(i, _handleTypedObjectId.INSTANCE.write()), getanswermap);
        return 1;
    }

    private final void bS_(setImageDisplayMode setimagedisplaymode, DeleteRangeGesture deleteRangeGesture, Typed3EpoxyController typed3EpoxyController) {
        if (typed3EpoxyController != null) {
            typed3EpoxyController.read(setOnPageChangeListener.IconCompatParcelizer(setimagedisplaymode, VersionUtil.AudioAttributesCompatParcelizer(deleteRangeGesture.getDeletionStartArea()), VersionUtil.AudioAttributesCompatParcelizer(deleteRangeGesture.getDeletionEndArea()), read(deleteRangeGesture.getGranularity()), _resolveInnerClassValuedProperty.INSTANCE.write()));
        }
    }

    private final int bN_(setImageDisplayMode setimagedisplaymode, JoinOrSplitGesture joinOrSplitGesture, AbstractDeserializer abstractDeserializer, CoercionConfig coercionConfig, getAnswerMap<? super findBeanDeserializer, getShowPopup> getanswermap) {
        hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer;
        deserializeFromNumber audioAttributesCompatParcelizer;
        if (coercionConfig != null) {
            int iAudioAttributesCompatParcelizer = setOnPageChangeListener.AudioAttributesCompatParcelizer(setimagedisplaymode, setOnPageChangeListener.read(joinOrSplitGesture.getJoinOrSplitPoint()), coercionConfig);
            if (iAudioAttributesCompatParcelizer != -1 && ((hasstableidsAudioAttributesImplApi26Parcelizer = setimagedisplaymode.AudioAttributesImplApi26Parcelizer()) == null || (audioAttributesCompatParcelizer = hasstableidsAudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer()) == null || !setOnPageChangeListener.read(audioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer))) {
                long jAudioAttributesCompatParcelizer = setOnPageChangeListener.AudioAttributesCompatParcelizer(abstractDeserializer, iAudioAttributesCompatParcelizer);
                if (findProperty.write(jAudioAttributesCompatParcelizer)) {
                    AudioAttributesCompatParcelizer(findProperty.AudioAttributesImplBaseParcelizer(jAudioAttributesCompatParcelizer), " ", getanswermap);
                } else {
                    RemoteActionCompatParcelizer(jAudioAttributesCompatParcelizer, abstractDeserializer, false, getanswermap);
                }
                return 1;
            }
            return bJ_(joinOrSplitGesture, getanswermap);
        }
        return bJ_(joinOrSplitGesture, getanswermap);
    }

    private final int bM_(setImageDisplayMode setimagedisplaymode, InsertGesture insertGesture, CoercionConfig coercionConfig, getAnswerMap<? super findBeanDeserializer, getShowPopup> getanswermap) {
        hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer;
        deserializeFromNumber audioAttributesCompatParcelizer;
        if (coercionConfig != null) {
            int iAudioAttributesCompatParcelizer = setOnPageChangeListener.AudioAttributesCompatParcelizer(setimagedisplaymode, setOnPageChangeListener.read(insertGesture.getInsertionPoint()), coercionConfig);
            if (iAudioAttributesCompatParcelizer == -1 || ((hasstableidsAudioAttributesImplApi26Parcelizer = setimagedisplaymode.AudioAttributesImplApi26Parcelizer()) != null && (audioAttributesCompatParcelizer = hasstableidsAudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer()) != null && setOnPageChangeListener.read(audioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer))) {
                return bJ_(insertGesture, getanswermap);
            }
            AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, insertGesture.getTextToInsert(), getanswermap);
            return 1;
        }
        return bJ_(insertGesture, getanswermap);
    }

    private final int bO_(setImageDisplayMode setimagedisplaymode, RemoveSpaceGesture removeSpaceGesture, AbstractDeserializer abstractDeserializer, CoercionConfig coercionConfig, getAnswerMap<? super findBeanDeserializer, getShowPopup> getanswermap) {
        hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer = setimagedisplaymode.AudioAttributesImplApi26Parcelizer();
        long jAudioAttributesCompatParcelizer = setOnPageChangeListener.AudioAttributesCompatParcelizer(hasstableidsAudioAttributesImplApi26Parcelizer != null ? hasstableidsAudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer() : null, setOnPageChangeListener.read(removeSpaceGesture.getStartPoint()), setOnPageChangeListener.read(removeSpaceGesture.getEndPoint()), setimagedisplaymode.MediaBrowserCompatCustomActionResultReceiver(), coercionConfig);
        if (findProperty.write(jAudioAttributesCompatParcelizer)) {
            return INSTANCE.bJ_(removeSpaceGesture, getanswermap);
        }
        final MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer();
        iconCompatParcelizer.AudioAttributesCompatParcelizer = -1;
        final MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer2 = new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer();
        iconCompatParcelizer2.AudioAttributesCompatParcelizer = -1;
        String strRemoteActionCompatParcelizer = new newYearNameItem("\\s+").RemoteActionCompatParcelizer(getValueInstantiator.IconCompatParcelizer(abstractDeserializer, jAudioAttributesCompatParcelizer), new getAnswerMap() { // from class: o.setPageTransformer
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setOffscreenPageLimit.IconCompatParcelizer(iconCompatParcelizer, iconCompatParcelizer2, (newPrevYearTestContainer) obj);
            }
        });
        if (iconCompatParcelizer.AudioAttributesCompatParcelizer == -1 || iconCompatParcelizer2.AudioAttributesCompatParcelizer == -1) {
            return bJ_(removeSpaceGesture, getanswermap);
        }
        int iAudioAttributesImplBaseParcelizer = findProperty.AudioAttributesImplBaseParcelizer(jAudioAttributesCompatParcelizer);
        int i = iconCompatParcelizer.AudioAttributesCompatParcelizer;
        int iAudioAttributesImplBaseParcelizer2 = findProperty.AudioAttributesImplBaseParcelizer(jAudioAttributesCompatParcelizer);
        int i2 = iconCompatParcelizer2.AudioAttributesCompatParcelizer;
        String strSubstring = strRemoteActionCompatParcelizer.substring(iconCompatParcelizer.AudioAttributesCompatParcelizer, strRemoteActionCompatParcelizer.length() - (findProperty.RemoteActionCompatParcelizer(jAudioAttributesCompatParcelizer) - iconCompatParcelizer2.AudioAttributesCompatParcelizer));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        getanswermap.invoke(setOnPageChangeListener.read(new hasViews(iAudioAttributesImplBaseParcelizer + i, iAudioAttributesImplBaseParcelizer2 + i2), new Deserializers(strSubstring, 1)));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence IconCompatParcelizer(MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer, MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer2, newPrevYearTestContainer newprevyeartestcontainer) {
        if (iconCompatParcelizer.AudioAttributesCompatParcelizer == -1) {
            iconCompatParcelizer.AudioAttributesCompatParcelizer = newprevyeartestcontainer.read().getRead();
        }
        iconCompatParcelizer2.AudioAttributesCompatParcelizer = newprevyeartestcontainer.read().getAudioAttributesCompatParcelizer() + 1;
        return "";
    }

    private final void AudioAttributesCompatParcelizer(int p0, String p1, getAnswerMap<? super findBeanDeserializer, getShowPopup> p2) {
        p2.invoke(setOnPageChangeListener.read(new hasViews(p0, p0), new Deserializers(p1, 1)));
    }

    private final void RemoteActionCompatParcelizer(long p0, Typed3EpoxyController p1, getAnswerMap<? super findBeanDeserializer, getShowPopup> p2) {
        p2.invoke(new hasViews(findProperty.AudioAttributesImplBaseParcelizer(p0), findProperty.read(p0)));
        if (p1 != null) {
            p1.AudioAttributesCompatParcelizer(true);
        }
    }

    private final void RemoteActionCompatParcelizer(long p0, AbstractDeserializer p1, boolean p2, getAnswerMap<? super findBeanDeserializer, getShowPopup> p3) {
        if (p2) {
            p0 = setOnPageChangeListener.AudioAttributesCompatParcelizer(p0, p1);
        }
        p3.invoke(setOnPageChangeListener.read(new hasViews(findProperty.read(p0), findProperty.read(p0)), new findArrayDeserializer(findProperty.RemoteActionCompatParcelizer(p0), 0)));
    }

    private final int bJ_(HandwritingGesture p0, getAnswerMap<? super findBeanDeserializer, getShowPopup> p1) {
        String fallbackText = p0.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        p1.invoke(new Deserializers(fallbackText, 1));
        return 5;
    }

    private final int read(int i) {
        if (i == 1) {
            return _handleTypedObjectId.INSTANCE.write();
        }
        if (i == 2) {
            return _handleTypedObjectId.INSTANCE.IconCompatParcelizer();
        }
        return _handleTypedObjectId.INSTANCE.IconCompatParcelizer();
    }
}
