package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getSubscriptionDetails extends isVideoPlanCtype {
    public static final read read = new read(0);

    public abstract setDefault write(getPlanAddOns getplanaddons);

    @Override // kotlin.isVideoPlanCtype
    public final setDefault IconCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        return write(getlink.AudioAttributesImplApi21Parcelizer());
    }

    @getMagicModuleMeta
    public static final isVideoPlanCtype RemoteActionCompatParcelizer(getPlanAddOns getplanaddons, List<? extends setDefault> list) {
        return read.read(getplanaddons, list);
    }

    public static final class read {
        private read() {
        }

        public static /* synthetic */ getSubscriptionDetails RemoteActionCompatParcelizer(Map map) {
            return AudioAttributesCompatParcelizer(map, false);
        }

        public static final class IconCompatParcelizer extends getSubscriptionDetails {
            private /* synthetic */ boolean AudioAttributesCompatParcelizer;
            private /* synthetic */ Map<getPlanAddOns, setDefault> IconCompatParcelizer;

            /* JADX WARN: Multi-variable type inference failed */
            IconCompatParcelizer(Map<getPlanAddOns, ? extends setDefault> map, boolean z) {
                this.IconCompatParcelizer = map;
                this.AudioAttributesCompatParcelizer = z;
            }

            @Override // kotlin.getSubscriptionDetails
            public final setDefault write(getPlanAddOns getplanaddons) {
                toMagicModuleMetaRepoModel.write(getplanaddons, "");
                return this.IconCompatParcelizer.get(getplanaddons);
            }

            @Override // kotlin.isVideoPlanCtype
            public final boolean read() {
                return this.IconCompatParcelizer.isEmpty();
            }

            @Override // kotlin.isVideoPlanCtype
            public final boolean AudioAttributesCompatParcelizer() {
                return this.AudioAttributesCompatParcelizer;
            }
        }

        @getMagicModuleMeta
        private static getSubscriptionDetails AudioAttributesCompatParcelizer(Map<getPlanAddOns, ? extends setDefault> map, boolean z) {
            toMagicModuleMetaRepoModel.write(map, "");
            return new IconCompatParcelizer(map, false);
        }

        @getMagicModuleMeta
        public final isVideoPlanCtype AudioAttributesCompatParcelizer(getLink getlink) {
            toMagicModuleMetaRepoModel.write(getlink, "");
            return read(getlink.AudioAttributesImplApi21Parcelizer(), getlink.bb_());
        }

        @getMagicModuleMeta
        public final isVideoPlanCtype read(getPlanAddOns getplanaddons, List<? extends setDefault> list) {
            toMagicModuleMetaRepoModel.write(getplanaddons, "");
            toMagicModuleMetaRepoModel.write(list, "");
            List<getBadgeText> listAudioAttributesCompatParcelizer = getplanaddons.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer, "");
            getBadgeText getbadgetext = (getBadgeText) IntermediateLoginResponseBody.MediaMetadataCompat((List) listAudioAttributesCompatParcelizer);
            if (getbadgetext != null && getbadgetext.MediaDescriptionCompat()) {
                List<getBadgeText> listAudioAttributesCompatParcelizer2 = getplanaddons.AudioAttributesCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer2, "");
                List<getBadgeText> list2 = listAudioAttributesCompatParcelizer2;
                ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((getBadgeText) it.next()).MediaBrowserCompatSearchResultReceiver());
                }
                return RemoteActionCompatParcelizer(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.AudioAttributesImplApi26Parcelizer(arrayList, list)));
            }
            return new setKeySubjectIds(listAudioAttributesCompatParcelizer, list);
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        @getMagicModuleMeta
        public final getSubscriptionDetails write(Map<getPlanAddOns, ? extends setDefault> map) {
            toMagicModuleMetaRepoModel.write(map, "");
            return RemoteActionCompatParcelizer(map);
        }
    }

    @getMagicModuleMeta
    public static final getSubscriptionDetails write(Map<getPlanAddOns, ? extends setDefault> map) {
        return read.write(map);
    }
}
