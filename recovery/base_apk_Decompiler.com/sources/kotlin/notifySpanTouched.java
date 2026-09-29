package kotlin;

import android.app.Application;
import com.marrow.data.models.user.State;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public final class notifySpanTouched implements parseUid {
    private final Application AudioAttributesCompatParcelizer;

    @setSdkPayload
    public notifySpanTouched(Application application) {
        toMagicModuleMetaRepoModel.write(application, "");
        this.AudioAttributesCompatParcelizer = application;
    }

    @Override // kotlin.parseUid
    public final Object RemoteActionCompatParcelizer() {
        JSONArray jSONArray = new JSONArray(parseLastSegmentNumberSupplementalProperty.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer));
        int length = jSONArray.length();
        State[] stateArr = new State[length];
        for (int i = 0; i < length; i++) {
            State state = new State();
            stateArr[i] = state;
            toMagicModuleMetaRepoModel.write(state);
            state.fromJSON(jSONArray.optJSONObject(i));
        }
        List listOnCommand = getOrderDetails.onCommand(stateArr);
        toMagicModuleMetaRepoModel.read(listOnCommand, "");
        return listOnCommand;
    }
}
