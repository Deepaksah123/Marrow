package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/namingStrategyInstance;", "Lo/valueInstantiators;", "RemoteActionCompatParcelizer", "(Lo/namingStrategyInstance;)Lo/valueInstantiators;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class resolverIdGeneratorInstance {
    public static final C0216valueInstantiators RemoteActionCompatParcelizer(namingStrategyInstance namingstrategyinstance) {
        C0216valueInstantiators c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp = namingstrategyinstance.accessgetReportFullyDrawnExecutorp();
        if (c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp != null && c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp.getRead() && !c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp.getAudioAttributesImplApi21Parcelizer()) {
            c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp = c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp.AudioAttributesCompatParcelizer();
            setDropDownBackgroundResource setdropdownbackgroundresource = new setDropDownBackgroundResource(namingstrategyinstance.onPrepareFromSearch().size());
            setdropdownbackgroundresource.AudioAttributesCompatParcelizer((List) namingstrategyinstance.onPrepareFromSearch());
            while (setdropdownbackgroundresource.AudioAttributesImplBaseParcelizer()) {
                namingStrategyInstance namingstrategyinstance2 = (namingStrategyInstance) setdropdownbackgroundresource.AudioAttributesCompatParcelizer(setdropdownbackgroundresource.RemoteActionCompatParcelizer - 1);
                C0216valueInstantiators c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp2 = namingstrategyinstance2.accessgetReportFullyDrawnExecutorp();
                if (c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp2 != null && !c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp2.getRead()) {
                    c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp.read(c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp2);
                    if (!c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp2.getAudioAttributesImplApi21Parcelizer()) {
                        setdropdownbackgroundresource.AudioAttributesCompatParcelizer((List) namingstrategyinstance2.onPrepareFromSearch());
                    }
                }
            }
        }
        return c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp;
    }
}
