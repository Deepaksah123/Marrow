package kotlin;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class updateAudioFocus implements setAudioAttributes {
    private final Map<CProjection, lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener> read = new LinkedHashMap();

    @Override // kotlin.setAudioAttributes
    public final lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener IconCompatParcelizer(CProjection cProjection) {
        toMagicModuleMetaRepoModel.write(cProjection, "");
        Map<CProjection, lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener> map = this.read;
        lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener = map.get(cProjection);
        if (lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener == null) {
            lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener = new lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener(cProjection);
            map.put(cProjection, lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener);
        }
        return lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener;
    }

    @Override // kotlin.setAudioAttributes
    public final lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener RemoteActionCompatParcelizer(CProjection cProjection) {
        toMagicModuleMetaRepoModel.write(cProjection, "");
        return this.read.remove(cProjection);
    }

    @Override // kotlin.setAudioAttributes
    public final List<lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener> write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        Map<CProjection, lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener> map = this.read;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<CProjection, lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener> entry : map.entrySet()) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) entry.getKey().AudioAttributesCompatParcelizer(), (Object) str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            this.read.remove((CProjection) it.next());
        }
        return IntermediateLoginResponseBody.onPlay(linkedHashMap2.values());
    }

    @Override // kotlin.setAudioAttributes
    public final boolean read(CProjection cProjection) {
        toMagicModuleMetaRepoModel.write(cProjection, "");
        return this.read.containsKey(cProjection);
    }
}
