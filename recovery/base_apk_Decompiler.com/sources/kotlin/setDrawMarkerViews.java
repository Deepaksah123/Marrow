package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class setDrawMarkerViews {
    public static final void write(setDrawHoleEnabled setdrawholeenabled) throws Exception {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        List listIconCompatParcelizer = IntermediateLoginResponseBody.IconCompatParcelizer();
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        try {
            setDrawEntryLabels setdrawentrylabels = setdrawentrylabelsIconCompatParcelizer;
            while (setdrawentrylabels.write()) {
                listIconCompatParcelizer.add(setdrawentrylabels.AudioAttributesCompatParcelizer(0));
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, null);
            for (String str : IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(listIconCompatParcelizer)) {
                if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, "room_fts_content_sync_")) {
                    setDrawCenterText.read(setdrawholeenabled, "DROP TRIGGER IF EXISTS ".concat(String.valueOf(str)));
                }
            }
        } finally {
        }
    }
}
