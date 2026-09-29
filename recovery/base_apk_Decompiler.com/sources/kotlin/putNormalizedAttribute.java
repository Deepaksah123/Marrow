package kotlin;

import android.net.Uri;
import com.marrow.R;
import com.marrow.data.api.models.Failed;
import com.marrow.data.api.models.MarrowError;
import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.Success;
import com.marrow.data.api.models.response.user.ProResponse;
import com.marrow.data.models.common.ApplicationData;
import com.marrow.data.models.user.LoggedUser;
import com.marrow.data.models.user.PhoneNumber;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.getCurrentEventTimeUs;
import kotlin.getSampleFormats;

/* JADX INFO: loaded from: classes3.dex */
public final class putNormalizedAttribute extends getCurrentEventTimeUs<buildTrackEncryptionBoxes> implements parseRequiredInt {
    private final getNextChunkIndex AudioAttributesImplApi21Parcelizer;
    private final ChunkHolder AudioAttributesImplApi26Parcelizer;
    private final getStreamPositionUsForContent AudioAttributesImplBaseParcelizer;
    private final getSampleFormats MediaBrowserCompatItemReceiver;
    private final ApplicationData read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @setSdkPayload
    public putNormalizedAttribute(parseLongAttr parselongattr, endsWithLivePostrollPlaceHolder endswithlivepostrollplaceholder, getIds getids, getIds getids2, buildTrackEncryptionBoxes buildtrackencryptionboxes, ChunkHolder chunkHolder, getNextChunkIndex getnextchunkindex, ApplicationData applicationData, getStreamPositionUsForContent getstreampositionusforcontent, getSampleFormats getsampleformats) {
        super(parselongattr, endswithlivepostrollplaceholder, getids, getids2, buildtrackencryptionboxes);
        toMagicModuleMetaRepoModel.write(parselongattr, "");
        toMagicModuleMetaRepoModel.write(endswithlivepostrollplaceholder, "");
        toMagicModuleMetaRepoModel.write(getids, "");
        toMagicModuleMetaRepoModel.write(getids2, "");
        toMagicModuleMetaRepoModel.write(buildtrackencryptionboxes, "");
        toMagicModuleMetaRepoModel.write(chunkHolder, "");
        toMagicModuleMetaRepoModel.write(getnextchunkindex, "");
        toMagicModuleMetaRepoModel.write(applicationData, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(getsampleformats, "");
        this.AudioAttributesImplApi26Parcelizer = chunkHolder;
        this.AudioAttributesImplApi21Parcelizer = getnextchunkindex;
        this.read = applicationData;
        this.AudioAttributesImplBaseParcelizer = getstreampositionusforcontent;
        this.MediaBrowserCompatItemReceiver = getsampleformats;
    }

    @Override // kotlin.parseRequiredInt
    public final void read() {
        if (this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver()) {
            String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver() ? R.string.f_send_email_title_pro : R.string.f_send_email_title_free);
            String strWrite = write(R.string.f_get_callback, this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().getInfo().getPhoneNumber().asSingleEntity());
            String strIconCompatParcelizer = IconCompatParcelizer();
            StringBuilder sb = new StringBuilder();
            sb.append(strWrite);
            sb.append("\n\n");
            sb.append(strIconCompatParcelizer);
            String string = sb.toString();
            buildTrackEncryptionBoxes buildtrackencryptionboxes = (buildTrackEncryptionBoxes) this.MediaBrowserCompatCustomActionResultReceiver;
            toMagicModuleMetaRepoModel.write((Object) strRemoteActionCompatParcelizer);
            buildtrackencryptionboxes.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, string);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.AudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver("key_last_callback");
        getSampleFormats getsampleformats = this.MediaBrowserCompatItemReceiver;
        getSampleFormats.Companion companion = getSampleFormats.INSTANCE;
        if (jCurrentTimeMillis >= parseEac3SupplementalProperties.read(getsampleformats.read(getSampleFormats.Companion.write()))) {
            ((buildTrackEncryptionBoxes) this.MediaBrowserCompatCustomActionResultReceiver).onPlayFromUri();
        } else {
            ((buildTrackEncryptionBoxes) this.MediaBrowserCompatCustomActionResultReceiver).onPrepare();
        }
    }

    private final String IconCompatParcelizer() {
        String strWrite = write(R.string.f_get_callback_email_signature, ((buildTrackEncryptionBoxes) this.MediaBrowserCompatCustomActionResultReceiver).onPlay(), this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().getInfo().getPhoneNumber().asSingleEntity(), this.AudioAttributesImplApi26Parcelizer.write().toString(), ((buildTrackEncryptionBoxes) this.MediaBrowserCompatCustomActionResultReceiver).onCustomAction(), ((buildTrackEncryptionBoxes) this.MediaBrowserCompatCustomActionResultReceiver).onFastForward(), ((buildTrackEncryptionBoxes) this.MediaBrowserCompatCustomActionResultReceiver).onMediaButtonEvent(), this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().getEmail());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
        return strWrite;
    }

    @Override // kotlin.parseRequiredInt
    public final void IconCompatParcelizer(PhoneNumber phoneNumber, String str) {
        toMagicModuleMetaRepoModel.write(phoneNumber, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.read.getLoggedUser().getInfo().setPhoneNumber(phoneNumber);
        ((buildTrackEncryptionBoxes) this.MediaBrowserCompatCustomActionResultReceiver).aj_();
        accessgetEmptyStatecp<MarrowResponse<ProResponse>> accessgetemptystatecp = this.AudioAttributesImplApi21Parcelizer.read(str, phoneNumber, "int_web");
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.SsManifestParserMissingFieldException
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return putNormalizedAttribute.RemoteActionCompatParcelizer(this.IconCompatParcelizer, (MarrowResponse) obj);
            }
        };
        write((accessgetEmptyStatecp) accessgetemptystatecp.RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.parseStartTag
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return putNormalizedAttribute.read(getanswermap, obj);
            }
        }), new getCurrentEventTimeUs.IconCompatParcelizer() { // from class: o.SsManifestParserQualityLevelParser
            @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
            public final void write(Object obj) {
                putNormalizedAttribute.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, (MarrowResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse read(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (MarrowResponse) getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse RemoteActionCompatParcelizer(putNormalizedAttribute putnormalizedattribute, MarrowResponse marrowResponse) {
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        putnormalizedattribute.AudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver(System.currentTimeMillis());
        return marrowResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(putNormalizedAttribute putnormalizedattribute, MarrowResponse marrowResponse) {
        if (marrowResponse instanceof Success) {
            ((buildTrackEncryptionBoxes) putnormalizedattribute.MediaBrowserCompatCustomActionResultReceiver).RemoteActionCompatParcelizer();
            ((buildTrackEncryptionBoxes) putnormalizedattribute.MediaBrowserCompatCustomActionResultReceiver).AudioAttributesCompatParcelizer(putnormalizedattribute.RemoteActionCompatParcelizer(R.string.thanks_message_on_subscription));
        } else if (marrowResponse instanceof Failed) {
            ((buildTrackEncryptionBoxes) putnormalizedattribute.MediaBrowserCompatCustomActionResultReceiver).RemoteActionCompatParcelizer();
            ((buildTrackEncryptionBoxes) putnormalizedattribute.MediaBrowserCompatCustomActionResultReceiver).write(((Failed) marrowResponse).getError());
        } else {
            if (!(marrowResponse instanceof MarrowError)) {
                throw new RenewEligibleCreator();
            }
            putnormalizedattribute.AudioAttributesCompatParcelizer(((MarrowError) marrowResponse).getThrowable(), "callback");
        }
    }

    @Override // kotlin.parseRequiredInt
    public final void AudioAttributesCompatParcelizer(Uri uri) {
        List listRemoteActionCompatParcelizer;
        List listRemoteActionCompatParcelizer2;
        List listRemoteActionCompatParcelizer3;
        List listRemoteActionCompatParcelizer4;
        List listRemoteActionCompatParcelizer5;
        toMagicModuleMetaRepoModel.write(uri, "");
        if (parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) uri.toString())) {
            return;
        }
        String string = uri.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        List<String> list = new newYearNameItem("\\?").read(string);
        if (!list.isEmpty()) {
            ListIterator<String> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.write((Iterable) list, listIterator.nextIndex() + 1);
                    break;
                }
            }
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        } else {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        String str = ((String[]) listRemoteActionCompatParcelizer.toArray(new String[0]))[1];
        String string2 = uri.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        List<String> list2 = new newYearNameItem("\\?").read(string2);
        if (!list2.isEmpty()) {
            ListIterator<String> listIterator2 = list2.listIterator(list2.size());
            while (listIterator2.hasPrevious()) {
                if (listIterator2.previous().length() != 0) {
                    listRemoteActionCompatParcelizer2 = IntermediateLoginResponseBody.write((Iterable) list2, listIterator2.nextIndex() + 1);
                    break;
                }
            }
            listRemoteActionCompatParcelizer2 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        } else {
            listRemoteActionCompatParcelizer2 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        String str2 = ((String[]) listRemoteActionCompatParcelizer2.toArray(new String[0]))[0];
        List<String> list3 = new newYearNameItem("&").read(str);
        if (!list3.isEmpty()) {
            ListIterator<String> listIterator3 = list3.listIterator(list3.size());
            while (listIterator3.hasPrevious()) {
                if (listIterator3.previous().length() != 0) {
                    listRemoteActionCompatParcelizer3 = IntermediateLoginResponseBody.write((Iterable) list3, listIterator3.nextIndex() + 1);
                    break;
                }
            }
            listRemoteActionCompatParcelizer3 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        } else {
            listRemoteActionCompatParcelizer3 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        String[] strArr = (String[]) listRemoteActionCompatParcelizer3.toArray(new String[0]);
        HashMap map = new HashMap();
        for (String str3 : strArr) {
            List<String> list4 = new newYearNameItem("=").read(str3);
            if (!list4.isEmpty()) {
                ListIterator<String> listIterator4 = list4.listIterator(list4.size());
                while (listIterator4.hasPrevious()) {
                    if (listIterator4.previous().length() != 0) {
                        listRemoteActionCompatParcelizer5 = IntermediateLoginResponseBody.write((Iterable) list4, listIterator4.nextIndex() + 1);
                        break;
                    }
                }
                listRemoteActionCompatParcelizer5 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            } else {
                listRemoteActionCompatParcelizer5 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            String[] strArr2 = (String[]) listRemoteActionCompatParcelizer5.toArray(new String[0]);
            map.put(strArr2[0], strArr2[1]);
        }
        String strDecode = Uri.decode((String) map.get("subject"));
        String strDecode2 = Uri.decode((String) map.get("body"));
        List<String> list5 = new newYearNameItem(":").read(str2);
        if (!list5.isEmpty()) {
            ListIterator<String> listIterator5 = list5.listIterator(list5.size());
            while (listIterator5.hasPrevious()) {
                if (listIterator5.previous().length() != 0) {
                    listRemoteActionCompatParcelizer4 = IntermediateLoginResponseBody.write((Iterable) list5, listIterator5.nextIndex() + 1);
                    break;
                }
            }
            listRemoteActionCompatParcelizer4 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        } else {
            listRemoteActionCompatParcelizer4 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        String str4 = ((String[]) listRemoteActionCompatParcelizer4.toArray(new String[0]))[1];
        LoggedUser loggedUser = this.read.getLoggedUser();
        String strWrite = this.AudioAttributesImplApi26Parcelizer.write();
        StringBuilder sb = new StringBuilder("Email ID: ");
        sb.append(loggedUser.getEmail());
        sb.append("\nSubscription: ");
        sb.append(strWrite);
        sb.append("\n\n\n");
        if (strDecode2 == null) {
            strDecode2 = "";
        }
        sb.append(strDecode2);
        buildTrackEncryptionBoxes buildtrackencryptionboxes = (buildTrackEncryptionBoxes) this.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.write((Object) strDecode);
        String string3 = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        buildtrackencryptionboxes.write(str4, strDecode, string3);
    }
}
