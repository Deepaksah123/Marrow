package kotlin;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class HomeMainModel implements getVideoModels {
    private final int AudioAttributesCompatParcelizer;
    private final SchemaQbankItem<setStartTimeStamp, RecentUpdatesModel> IconCompatParcelizer;
    private final getFeaturedCards RemoteActionCompatParcelizer;
    private final getVariant read;
    private final Map<setStartTimeStamp, Integer> write;

    public HomeMainModel(getFeaturedCards getfeaturedcards, getVariant getvariant, setResultAvailable setresultavailable, int i) {
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        toMagicModuleMetaRepoModel.write(getvariant, "");
        toMagicModuleMetaRepoModel.write(setresultavailable, "");
        this.RemoteActionCompatParcelizer = getfeaturedcards;
        this.read = getvariant;
        this.AudioAttributesCompatParcelizer = i;
        this.write = SubjectGroupTypeConstant.write(setresultavailable.onCommand());
        this.IconCompatParcelizer = getfeaturedcards.read().IconCompatParcelizer(new AudioAttributesCompatParcelizer());
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<setStartTimeStamp, RecentUpdatesModel> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public RecentUpdatesModel invoke(setStartTimeStamp setstarttimestamp) {
            toMagicModuleMetaRepoModel.write(setstarttimestamp, "");
            Integer num = (Integer) HomeMainModel.this.write.get(setstarttimestamp);
            if (num == null) {
                return null;
            }
            HomeMainModel homeMainModel = HomeMainModel.this;
            int iIntValue = num.intValue();
            return new RecentUpdatesModel(FilterParams.AudioAttributesCompatParcelizer(FilterParams.IconCompatParcelizer(homeMainModel.RemoteActionCompatParcelizer, homeMainModel), homeMainModel.read.RemoteActionCompatParcelizer()), setstarttimestamp, homeMainModel.AudioAttributesCompatParcelizer + iIntValue, homeMainModel.read);
        }

        AudioAttributesCompatParcelizer() {
            super(1);
        }
    }

    @Override // kotlin.getVideoModels
    public final getBadgeText write(setStartTimeStamp setstarttimestamp) {
        toMagicModuleMetaRepoModel.write(setstarttimestamp, "");
        RecentUpdatesModel recentUpdatesModelInvoke = this.IconCompatParcelizer.invoke(setstarttimestamp);
        return recentUpdatesModelInvoke != null ? recentUpdatesModelInvoke : this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver().write(setstarttimestamp);
    }
}
