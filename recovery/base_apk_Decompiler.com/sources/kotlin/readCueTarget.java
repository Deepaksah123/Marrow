package kotlin;

import com.marrow.data.api.models.Failed;
import com.marrow.data.api.models.MarrowError;
import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.Success;
import com.marrow.data.models.user.Country;
import java.util.Comparator;
import kotlin.parseStyleDeclaration;

/* JADX INFO: loaded from: classes3.dex */
public final class readCueTarget extends isRtspStartLine<parseStyleDeclaration.IconCompatParcelizer> implements parseStyleDeclaration.RemoteActionCompatParcelizer {
    private final parseOptionalIntAttr read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @setSdkPayload
    public readCueTarget(parseStyleDeclaration.IconCompatParcelizer iconCompatParcelizer, parseLongAttr parselongattr, endsWithLivePostrollPlaceHolder endswithlivepostrollplaceholder, getIds getids, getIds getids2, parseOptionalIntAttr parseoptionalintattr) {
        super(parselongattr, endswithlivepostrollplaceholder, getids, getids2, iconCompatParcelizer);
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(parselongattr, "");
        toMagicModuleMetaRepoModel.write(endswithlivepostrollplaceholder, "");
        toMagicModuleMetaRepoModel.write(getids, "");
        toMagicModuleMetaRepoModel.write(getids2, "");
        toMagicModuleMetaRepoModel.write(parseoptionalintattr, "");
        this.read = parseoptionalintattr;
    }

    @Override // o.parseStyleDeclaration.RemoteActionCompatParcelizer
    public final void read() {
        ((parseStyleDeclaration.IconCompatParcelizer) this.RemoteActionCompatParcelizer).aj_();
        MediaMetadataCompat();
    }

    private final void MediaMetadataCompat() {
        accessgetEmptyStatecp<MarrowResponse<Country[]>> accessgetemptystatecp = this.read.read();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecp, "");
        read(accessgetemptystatecp, new getAnswerMap() { // from class: o.peekCharAtPosition
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return readCueTarget.IconCompatParcelizer(this.RemoteActionCompatParcelizer, (MarrowResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(readCueTarget readcuetarget, MarrowResponse marrowResponse) {
        ((parseStyleDeclaration.IconCompatParcelizer) readcuetarget.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer();
        if (marrowResponse instanceof Success) {
            Object data = ((Success) marrowResponse).getData();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(data, "");
            ((parseStyleDeclaration.IconCompatParcelizer) readcuetarget.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer((Country[]) getOrderDetails.RemoteActionCompatParcelizer((Object[]) data, (Comparator) new write()).toArray(new Country[0]));
        } else if (marrowResponse instanceof Failed) {
            ((parseStyleDeclaration.IconCompatParcelizer) readcuetarget.RemoteActionCompatParcelizer).write(((Failed) marrowResponse).getError());
            ((parseStyleDeclaration.IconCompatParcelizer) readcuetarget.RemoteActionCompatParcelizer).AudioAttributesImplBaseParcelizer();
        } else {
            if (!(marrowResponse instanceof MarrowError)) {
                throw new RenewEligibleCreator();
            }
            readcuetarget.RemoteActionCompatParcelizer(((MarrowError) marrowResponse).getThrowable(), "load_country_error");
            ((parseStyleDeclaration.IconCompatParcelizer) readcuetarget.RemoteActionCompatParcelizer).AudioAttributesImplBaseParcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    public static final class write<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read(((Country) t).getTitle(), ((Country) t2).getTitle());
        }
    }
}
