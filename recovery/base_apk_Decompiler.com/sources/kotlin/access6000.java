package kotlin;

import java.util.List;
import java.util.Map;
import kotlin.access6000;

/* JADX INFO: loaded from: classes2.dex */
public interface access6000 {
    void AudioAttributesCompatParcelizer(List<? extends Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>> list, getAnswerMap<? super Map<String, Boolean>, getShowPopup> getanswermap, getAnswerMap<? super Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> getanswermap2, getAnswerMap<? super Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> getanswermap3);

    public static final class read {
        /* JADX INFO: Access modifiers changed from: private */
        public static getShowPopup AudioAttributesCompatParcelizer(Map map) {
            toMagicModuleMetaRepoModel.write(map, "");
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static getShowPopup AudioAttributesImplBaseParcelizer(Pair pair) {
            toMagicModuleMetaRepoModel.write(pair, "");
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static getShowPopup IconCompatParcelizer(Pair pair) {
            toMagicModuleMetaRepoModel.write(pair, "");
            return getShowPopup.INSTANCE;
        }

        public static void write(access6000 access6000Var, List<? extends Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>> list) {
            toMagicModuleMetaRepoModel.write(list, "");
            access6000Var.AudioAttributesCompatParcelizer(list, new getAnswerMap() { // from class: o.access5900
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return access6000.read.AudioAttributesCompatParcelizer((Map) obj);
                }
            }, new getAnswerMap() { // from class: o.setDurationUs
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return access6000.read.IconCompatParcelizer((Pair) obj);
                }
            }, new getAnswerMap() { // from class: o.setElapsedRealtimeEpochOffsetMs
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return access6000.read.AudioAttributesImplBaseParcelizer((Pair) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static getShowPopup MediaBrowserCompatCustomActionResultReceiver(Pair pair) {
            toMagicModuleMetaRepoModel.write(pair, "");
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static getShowPopup MediaBrowserCompatItemReceiver(Pair pair) {
            toMagicModuleMetaRepoModel.write(pair, "");
            return getShowPopup.INSTANCE;
        }

        public static void RemoteActionCompatParcelizer(access6000 access6000Var, List<? extends Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>> list, getAnswerMap<? super Map<String, Boolean>, getShowPopup> getanswermap) {
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(getanswermap, "");
            access6000Var.AudioAttributesCompatParcelizer(list, getanswermap, new getAnswerMap() { // from class: o.setDefaultPositionUs
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return access6000.read.MediaBrowserCompatCustomActionResultReceiver((Pair) obj);
                }
            }, new getAnswerMap() { // from class: o.access6200
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return access6000.read.MediaBrowserCompatItemReceiver((Pair) obj);
                }
            });
        }
    }
}
