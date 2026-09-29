package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import in.juspay.hypersdk.ota.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.CourseConfigV2PlanScreenConfig;
import kotlin.getOption8AnsweredCount;
import kotlin.getTestHeaderTitle;
import kotlin.getZenArea;
import kotlin.setGuessed;

/* JADX INFO: loaded from: classes4.dex */
public final class isStarred extends setGuessed implements setFirstAnswer {
    private final RenewEligible IconCompatParcelizer;
    private final setServerAnswer MediaBrowserCompatItemReceiver;

    public final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[McqAnswerIndexModel.values().length];
            try {
                iArr[McqAnswerIndexModel.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[McqAnswerIndexModel.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IconCompatParcelizer = iArr;
            int[] iArr2 = new int[setRight.values().length];
            try {
                iArr2[setRight.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[setRight.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[setRight.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            RemoteActionCompatParcelizer = iArr2;
        }
    }

    public final setServerAnswer read() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public isStarred(setServerAnswer setserveranswer) {
        toMagicModuleMetaRepoModel.write(setserveranswer, "");
        this.MediaBrowserCompatItemReceiver = setserveranswer;
        setserveranswer.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
        this.IconCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new write());
    }

    static final class write extends MagicModuleUseCase implements getCreatedOnDateMs<isStarred> {

        /* JADX INFO: renamed from: o.isStarred$write$1, reason: invalid class name */
        static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<setFirstAnswer, getShowPopup> {
            public static final AnonymousClass1 read = new AnonymousClass1();

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getShowPopup invoke(setFirstAnswer setfirstanswer) {
                read(setfirstanswer);
                return getShowPopup.INSTANCE;
            }

            private static void read(setFirstAnswer setfirstanswer) {
                toMagicModuleMetaRepoModel.write(setfirstanswer, "");
                setfirstanswer.read(getKycMessage.RemoteActionCompatParcelizer(setfirstanswer.write(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new getNotesCount[]{getZenArea.RemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, getZenArea.RemoteActionCompatParcelizer.MediaDescriptionCompat})));
            }

            AnonymousClass1() {
                super(1);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public isStarred invoke() {
            setGuessed setguessedAudioAttributesCompatParcelizer = isStarred.this.AudioAttributesCompatParcelizer(AnonymousClass1.read);
            toMagicModuleMetaRepoModel.read(setguessedAudioAttributesCompatParcelizer, "");
            return (isStarred) setguessedAudioAttributesCompatParcelizer;
        }

        write() {
            super(0);
        }
    }

    private final isStarred AudioAttributesImplBaseParcelizer() {
        return (isStarred) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    private final String AudioAttributesCompatParcelizer(String str) {
        int i = IconCompatParcelizer.IconCompatParcelizer[onSkipToNext().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new RenewEligibleCreator();
            }
            if (!MediaBrowserCompatSearchResultReceiver()) {
                StringBuilder sb = new StringBuilder("<b>");
                sb.append(str);
                sb.append("</b>");
                return sb.toString();
            }
        }
        return str;
    }

    private final String RemoteActionCompatParcelizer(String str) {
        int i = IconCompatParcelizer.IconCompatParcelizer[onSkipToNext().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            throw new RenewEligibleCreator();
        }
        StringBuilder sb = new StringBuilder("<font color=red><b>");
        sb.append(str);
        sb.append("</b></font>");
        return sb.toString();
    }

    private final String read(String str) {
        return onSkipToNext().read(str);
    }

    private final String MediaBrowserCompatItemReceiver() {
        return read("<");
    }

    private final String MediaBrowserCompatCustomActionResultReceiver() {
        return read(">");
    }

    private final String AudioAttributesImplApi21Parcelizer() {
        int i = IconCompatParcelizer.IconCompatParcelizer[onSkipToNext().ordinal()];
        if (i == 1) {
            return read("->");
        }
        if (i == 2) {
            return "&rarr;";
        }
        throw new RenewEligibleCreator();
    }

    private String IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        int i = IconCompatParcelizer.IconCompatParcelizer[onSkipToNext().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            throw new RenewEligibleCreator();
        }
        StringBuilder sb = new StringBuilder("<i>");
        sb.append(str);
        sb.append("</i>");
        return sb.toString();
    }

    @Override // kotlin.setGuessed
    public final String read(getRelatedLessonId getrelatedlessonid, boolean z) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        String str = read(setSillyMistake.RemoteActionCompatParcelizer(getrelatedlessonid));
        if (!MediaBrowserCompatSearchResultReceiver() || onSkipToNext() != McqAnswerIndexModel.HTML || !z) {
            return str;
        }
        StringBuilder sb = new StringBuilder("<b>");
        sb.append(str);
        sb.append("</b>");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(getVariant getvariant, StringBuilder sb, boolean z) {
        getRelatedLessonId getrelatedlessonidAQ_ = getvariant.aQ_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_, "");
        sb.append(read(getrelatedlessonidAQ_, z));
    }

    private final void read(getVariant getvariant, StringBuilder sb) {
        if (onRewind()) {
            if (setSessionImpl()) {
                sb.append("companion object");
            }
            read(sb);
            getVariant getvariantOnPlayFromMediaId = getvariant.onPlayFromMediaId();
            if (getvariantOnPlayFromMediaId != null) {
                sb.append("of ");
                getRelatedLessonId getrelatedlessonidAQ_ = getvariantOnPlayFromMediaId.aQ_();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_, "");
                sb.append(read(getrelatedlessonidAQ_, false));
            }
        }
        if (PlaybackStateCompat() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getvariant.aQ_(), getVideoMetaEncrypt.read)) {
            if (!setSessionImpl()) {
                read(sb);
            }
            getRelatedLessonId getrelatedlessonidAQ_2 = getvariant.aQ_();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_2, "");
            sb.append(read(getrelatedlessonidAQ_2, true));
        }
    }

    @Override // kotlin.setGuessed
    public final String IconCompatParcelizer(getSlidesCount getslidescount) {
        toMagicModuleMetaRepoModel.write(getslidescount, "");
        List<getRelatedLessonId> listWrite = getslidescount.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listWrite, "");
        return read(listWrite);
    }

    private final String read(List<getRelatedLessonId> list) {
        return read(setSillyMistake.IconCompatParcelizer(list));
    }

    private String IconCompatParcelizer(getQuestionLimit getquestionlimit) {
        toMagicModuleMetaRepoModel.write(getquestionlimit, "");
        if (SubscriptionType.write(getquestionlimit)) {
            return getquestionlimit.MediaBrowserCompatSearchResultReceiver().toString();
        }
        return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().IconCompatParcelizer(getquestionlimit, this);
    }

    @Override // kotlin.setGuessed
    public final String read(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        StringBuilder sb = new StringBuilder();
        read(sb, onSkipToPrevious().invoke(getlink));
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    private final void read(StringBuilder sb, getLink getlink) {
        PlanAddOnsCompanion planAddOnsCompanionMediaBrowserCompatMediaItem = getlink.MediaBrowserCompatMediaItem();
        fromJsonArray2 fromjsonarray2 = planAddOnsCompanionMediaBrowserCompatMediaItem instanceof fromJsonArray2 ? (fromJsonArray2) planAddOnsCompanionMediaBrowserCompatMediaItem : null;
        if (fromjsonarray2 != null) {
            if (onSetShuffleMode()) {
                write(sb, fromjsonarray2.MediaBrowserCompatCustomActionResultReceiver());
                return;
            }
            write(sb, fromjsonarray2.AudioAttributesImplApi26Parcelizer());
            if (onSetCaptioningEnabled()) {
                AudioAttributesCompatParcelizer(sb, fromjsonarray2);
                return;
            }
            return;
        }
        write(sb, getlink);
    }

    private final void AudioAttributesCompatParcelizer(StringBuilder sb, fromJsonArray2 fromjsonarray2) {
        if (onSkipToNext() == McqAnswerIndexModel.HTML) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* = ");
        write(sb, fromjsonarray2.MediaBrowserCompatCustomActionResultReceiver());
        sb.append(" */");
        if (onSkipToNext() == McqAnswerIndexModel.HTML) {
            sb.append("</i></font>");
        }
    }

    private final void write(StringBuilder sb, getLink getlink) {
        if ((getlink instanceof PlanAddOns) && IconCompatParcelizer() && !((PlanAddOns) getlink).AudioAttributesImplApi26Parcelizer()) {
            sb.append("<Not computed yet>");
            return;
        }
        PlanAddOnsCompanion planAddOnsCompanionMediaBrowserCompatMediaItem = getlink.MediaBrowserCompatMediaItem();
        if (planAddOnsCompanionMediaBrowserCompatMediaItem instanceof getTopicId) {
            sb.append(((getTopicId) planAddOnsCompanionMediaBrowserCompatMediaItem).read(this, this));
        } else if (planAddOnsCompanionMediaBrowserCompatMediaItem instanceof getHref) {
            IconCompatParcelizer(sb, (getHref) planAddOnsCompanionMediaBrowserCompatMediaItem);
        }
    }

    private final void IconCompatParcelizer(StringBuilder sb, getHref gethref) {
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(gethref, setPlanAddOns.read)) {
            getHref gethref2 = gethref;
            if (!setPlanAddOns.read(gethref2)) {
                if (SubscriptionType.read(gethref2)) {
                    if (MediaSessionCompatToken()) {
                        getPlanAddOns getplanaddonsAudioAttributesImplApi21Parcelizer = gethref.AudioAttributesImplApi21Parcelizer();
                        toMagicModuleMetaRepoModel.read(getplanaddonsAudioAttributesImplApi21Parcelizer, "");
                        sb.append(RemoteActionCompatParcelizer(((isFreePlan) getplanaddonsAudioAttributesImplApi21Parcelizer).MediaBrowserCompatItemReceiver()));
                        return;
                    }
                    sb.append("???");
                    return;
                }
                if (Copy.write(gethref2)) {
                    AudioAttributesCompatParcelizer(sb, gethref2);
                    return;
                } else if (write(gethref2)) {
                    RemoteActionCompatParcelizer(sb, gethref2);
                    return;
                } else {
                    AudioAttributesCompatParcelizer(sb, gethref2);
                    return;
                }
            }
        }
        sb.append("???");
    }

    private static boolean write(getLink getlink) {
        if (!getTestItems.AudioAttributesImplApi21Parcelizer(getlink)) {
            return false;
        }
        List<setDefault> listBb_ = getlink.bb_();
        if ((listBb_ instanceof Collection) && listBb_.isEmpty()) {
            return true;
        }
        Iterator<T> it = listBb_.iterator();
        while (it.hasNext()) {
            if (((setDefault) it.next()).write()) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.setGuessed
    public final String read(String str, String str2, getTestTabItems gettesttabitems) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(gettesttabitems, "");
        if (setSillyMistake.read(str, str2)) {
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str2, "(")) {
                StringBuilder sb = new StringBuilder("(");
                sb.append(str);
                sb.append(")!");
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append('!');
            return sb2.toString();
        }
        setFirstAnswerIndex setfirstanswerindexMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceMediaDescriptionCompat = gettesttabitems.MediaDescriptionCompat();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2CustomModuleQuestionSourceMediaDescriptionCompat, "");
        isStarred isstarred = this;
        String strIconCompatParcelizer = setfirstanswerindexMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(courseConfigV2CustomModuleQuestionSourceMediaDescriptionCompat, isstarred);
        String strWrite = TestGroupLSModel.write(strIconCompatParcelizer, "Collection", strIconCompatParcelizer);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(strWrite);
        sb3.append("Mutable");
        String string = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(strWrite);
        sb4.append("(Mutable)");
        String strWrite2 = setSillyMistake.write(str, string, str2, strWrite, sb4.toString());
        if (strWrite2 != null) {
            return strWrite2;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(strWrite);
        sb5.append("MutableMap.MutableEntry");
        String string2 = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(strWrite);
        sb6.append("Map.Entry");
        String string3 = sb6.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(strWrite);
        sb7.append("(Mutable)Map.(Mutable)Entry");
        String strWrite3 = setSillyMistake.write(str, string2, str2, string3, sb7.toString());
        if (strWrite3 != null) {
            return strWrite3;
        }
        setFirstAnswerIndex setfirstanswerindexMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceIconCompatParcelizer = gettesttabitems.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2CustomModuleQuestionSourceIconCompatParcelizer, "");
        String strIconCompatParcelizer2 = setfirstanswerindexMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2.IconCompatParcelizer(courseConfigV2CustomModuleQuestionSourceIconCompatParcelizer, isstarred);
        String strWrite4 = TestGroupLSModel.write(strIconCompatParcelizer2, "Array", strIconCompatParcelizer2);
        StringBuilder sb8 = new StringBuilder();
        sb8.append(strWrite4);
        sb8.append(read("Array<"));
        String string4 = sb8.toString();
        StringBuilder sb9 = new StringBuilder();
        sb9.append(strWrite4);
        sb9.append(read("Array<out "));
        String string5 = sb9.toString();
        StringBuilder sb10 = new StringBuilder();
        sb10.append(strWrite4);
        sb10.append(read("Array<(out) "));
        String strWrite5 = setSillyMistake.write(str, string4, str2, string5, sb10.toString());
        if (strWrite5 != null) {
            return strWrite5;
        }
        StringBuilder sb11 = new StringBuilder("(");
        sb11.append(str);
        sb11.append("..");
        sb11.append(str2);
        sb11.append(')');
        return sb11.toString();
    }

    private String RemoteActionCompatParcelizer(List<? extends setDefault> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(MediaBrowserCompatItemReceiver());
        RemoteActionCompatParcelizer(sb, list);
        sb.append(MediaBrowserCompatCustomActionResultReceiver());
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    private final void AudioAttributesCompatParcelizer(StringBuilder sb, getLink getlink) {
        write(sb, getlink, (EnumC0173getDisplayname) null);
        setPearlNumber setpearlnumber = getlink instanceof setPearlNumber ? (setPearlNumber) getlink : null;
        getHref gethrefAudioAttributesImplApi26Parcelizer = setpearlnumber != null ? setpearlnumber.AudioAttributesImplApi26Parcelizer() : null;
        if (Copy.write(getlink)) {
            if (getSearchTimes.MediaBrowserCompatCustomActionResultReceiver(getlink) && onPlayFromUri()) {
                SubscriptionType subscriptionType = SubscriptionType.AudioAttributesCompatParcelizer;
                sb.append(RemoteActionCompatParcelizer(SubscriptionType.AudioAttributesCompatParcelizer(getlink)));
            } else {
                if ((getlink instanceof PlanSubscriptionItemKt) && !onPause()) {
                    sb.append(((PlanSubscriptionItemKt) getlink).AudioAttributesImplApi26Parcelizer());
                } else {
                    sb.append(getlink.AudioAttributesImplApi21Parcelizer().toString());
                }
                sb.append(RemoteActionCompatParcelizer(getlink.bb_()));
            }
        } else if (getlink instanceof Plan) {
            sb.append(((Plan) getlink).AudioAttributesImplApi26Parcelizer().toString());
        } else if (gethrefAudioAttributesImplApi26Parcelizer instanceof Plan) {
            sb.append(((Plan) gethrefAudioAttributesImplApi26Parcelizer).AudioAttributesImplApi26Parcelizer().toString());
        } else {
            IconCompatParcelizer(this, sb, getlink);
        }
        if (getlink.ba_()) {
            sb.append("?");
        }
        if (Meta.AudioAttributesCompatParcelizer(getlink)) {
            sb.append(" & Any");
        }
    }

    private static /* synthetic */ void IconCompatParcelizer(isStarred isstarred, StringBuilder sb, getLink getlink) {
        isstarred.read(sb, getlink, getlink.AudioAttributesImplApi21Parcelizer());
    }

    private final void read(StringBuilder sb, getLink getlink, getPlanAddOns getplanaddons) {
        getAccountSettings getaccountsettingsAudioAttributesCompatParcelizer = CourseResponseKeyConstantsKt.AudioAttributesCompatParcelizer(getlink);
        if (getaccountsettingsAudioAttributesCompatParcelizer == null) {
            sb.append(RemoteActionCompatParcelizer(getplanaddons));
            sb.append(RemoteActionCompatParcelizer(getlink.bb_()));
        } else {
            IconCompatParcelizer(sb, getaccountsettingsAudioAttributesCompatParcelizer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void IconCompatParcelizer(java.lang.StringBuilder r4, kotlin.getAccountSettings r5) {
        /*
            r3 = this;
            o.getAccountSettings r0 = r5.write()
            java.lang.String r1 = ""
            if (r0 == 0) goto L25
            r3.IconCompatParcelizer(r4, r0)
            r0 = 46
            r4.append(r0)
            o.getBadge r0 = r5.IconCompatParcelizer()
            o.getRelatedLessonId r0 = r0.aQ_()
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r0, r1)
            r2 = 0
            java.lang.String r0 = r3.read(r0, r2)
            r4.append(r0)
            if (r4 != 0) goto L37
        L25:
            o.getBadge r0 = r5.IconCompatParcelizer()
            o.getPlanAddOns r0 = r0.MediaBrowserCompatSearchResultReceiver()
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r0, r1)
            java.lang.String r0 = r3.RemoteActionCompatParcelizer(r0)
            r4.append(r0)
        L37:
            java.util.List r5 = r5.RemoteActionCompatParcelizer()
            java.lang.String r3 = r3.RemoteActionCompatParcelizer(r5)
            r4.append(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isStarred.IconCompatParcelizer(java.lang.StringBuilder, o.getAccountSettings):void");
    }

    private String RemoteActionCompatParcelizer(getPlanAddOns getplanaddons) {
        toMagicModuleMetaRepoModel.write(getplanaddons, "");
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getplanaddons.RemoteActionCompatParcelizer();
        if ((getquestionlimitRemoteActionCompatParcelizer instanceof getBadgeText) || (getquestionlimitRemoteActionCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource) || (getquestionlimitRemoteActionCompatParcelizer instanceof CourseConfigV2VideoProperties)) {
            return IconCompatParcelizer(getquestionlimitRemoteActionCompatParcelizer);
        }
        if (getquestionlimitRemoteActionCompatParcelizer == null) {
            if (getplanaddons instanceof getMainCopy) {
                return ((getMainCopy) getplanaddons).AudioAttributesCompatParcelizer(AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer);
            }
            return getplanaddons.toString();
        }
        StringBuilder sb = new StringBuilder("Unexpected classifier: ");
        sb.append(getquestionlimitRemoteActionCompatParcelizer.getClass());
        throw new IllegalStateException(sb.toString().toString());
    }

    static final class AudioAttributesImplBaseParcelizer extends MagicModuleUseCase implements getAnswerMap<getLink, Object> {
        public static final AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer = new AudioAttributesImplBaseParcelizer();

        private static Object write(getLink getlink) {
            toMagicModuleMetaRepoModel.write(getlink, "");
            return getlink instanceof Plan ? ((Plan) getlink).AudioAttributesImplApi26Parcelizer() : getlink;
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Object invoke(getLink getlink) {
            return write(getlink);
        }

        AudioAttributesImplBaseParcelizer() {
            super(1);
        }
    }

    @Override // kotlin.setGuessed
    public final String write(setDefault setdefault) {
        toMagicModuleMetaRepoModel.write(setdefault, "");
        StringBuilder sb = new StringBuilder();
        RemoteActionCompatParcelizer(sb, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(setdefault));
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    static final class read extends MagicModuleUseCase implements getAnswerMap<setDefault, CharSequence> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public CharSequence invoke(setDefault setdefault) {
            toMagicModuleMetaRepoModel.write(setdefault, "");
            if (setdefault.write()) {
                return "*";
            }
            isStarred isstarred = isStarred.this;
            getLink getlinkAudioAttributesCompatParcelizer = setdefault.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer, "");
            String string = isstarred.read(getlinkAudioAttributesCompatParcelizer);
            if (setdefault.read() != getTotalSubject.INVARIANT) {
                StringBuilder sb = new StringBuilder();
                sb.append(setdefault.read());
                sb.append(' ');
                sb.append(string);
                string = sb.toString();
            }
            return string;
        }

        read() {
            super(1);
        }
    }

    private final void RemoteActionCompatParcelizer(StringBuilder sb, List<? extends setDefault> list) {
        IntermediateLoginResponseBody.write(list, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new read());
    }

    private final void RemoteActionCompatParcelizer(StringBuilder sb, getLink getlink) {
        getRelatedLessonId getrelatedlessonid;
        int length = sb.length();
        AudioAttributesImplBaseParcelizer().write(sb, getlink, (EnumC0173getDisplayname) null);
        boolean z = sb.length() != length;
        getLink getlinkRemoteActionCompatParcelizer = getTestItems.RemoteActionCompatParcelizer(getlink);
        List<getLink> listIconCompatParcelizer = getTestItems.IconCompatParcelizer(getlink);
        if (!listIconCompatParcelizer.isEmpty()) {
            sb.append("context(");
            Iterator<getLink> it = listIconCompatParcelizer.subList(0, IntermediateLoginResponseBody.write((List) listIconCompatParcelizer)).iterator();
            while (it.hasNext()) {
                read(sb, it.next());
                sb.append(", ");
            }
            read(sb, (getLink) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) listIconCompatParcelizer));
            sb.append(") ");
        }
        boolean zAudioAttributesImplBaseParcelizer = getTestItems.AudioAttributesImplBaseParcelizer(getlink);
        boolean zBa_ = getlink.ba_();
        boolean z2 = zBa_ || (z && getlinkRemoteActionCompatParcelizer != null);
        if (z2) {
            if (zAudioAttributesImplBaseParcelizer) {
                sb.insert(length, '(');
            } else {
                if (z) {
                    StringBuilder sb2 = sb;
                    TestGroupLSModel.MediaBrowserCompatSearchResultReceiver(sb2);
                    if (sb.charAt(TestGroupLSModel.write(sb2) - 1) != ')') {
                        sb.insert(TestGroupLSModel.write(sb2), "()");
                    }
                }
                sb.append("(");
            }
        }
        AudioAttributesCompatParcelizer(sb, zAudioAttributesImplBaseParcelizer, "suspend");
        if (getlinkRemoteActionCompatParcelizer != null) {
            boolean z3 = (write(getlinkRemoteActionCompatParcelizer) && !getlinkRemoteActionCompatParcelizer.ba_()) || RemoteActionCompatParcelizer(getlinkRemoteActionCompatParcelizer) || (getlinkRemoteActionCompatParcelizer instanceof setPearlNumber);
            if (z3) {
                sb.append("(");
            }
            read(sb, getlinkRemoteActionCompatParcelizer);
            if (z3) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (getTestItems.MediaBrowserCompatItemReceiver(getlink) && getlink.bb_().size() <= 1) {
            sb.append("???");
        } else {
            int i = 0;
            for (setDefault setdefault : getTestItems.write(getlink)) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (onPrepareFromSearch()) {
                    getLink getlinkAudioAttributesCompatParcelizer = setdefault.AudioAttributesCompatParcelizer();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer, "");
                    getrelatedlessonid = getTestItems.read(getlinkAudioAttributesCompatParcelizer);
                } else {
                    getrelatedlessonid = null;
                }
                if (getrelatedlessonid != null) {
                    sb.append(read(getrelatedlessonid, false));
                    sb.append(": ");
                }
                sb.append(write(setdefault));
                i++;
            }
        }
        sb.append(") ");
        sb.append(AudioAttributesImplApi21Parcelizer());
        sb.append(" ");
        read(sb, getTestItems.AudioAttributesCompatParcelizer(getlink));
        if (z2) {
            sb.append(")");
        }
        if (zBa_) {
            sb.append("?");
        }
    }

    private static boolean RemoteActionCompatParcelizer(getLink getlink) {
        return getTestItems.AudioAttributesImplBaseParcelizer(getlink) || !getlink.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer();
    }

    private final void IconCompatParcelizer(StringBuilder sb, getVariant getvariant) {
        getVariant getvariantOnPlayFromMediaId;
        if ((getvariant instanceof getShouldShowEmptyPlanScreen) || (getvariant instanceof CourseConfigV2SearchItem) || (getvariantOnPlayFromMediaId = getvariant.onPlayFromMediaId()) == null || (getvariantOnPlayFromMediaId instanceof getTopSection)) {
            return;
        }
        sb.append(" ");
        sb.append(IconCompatParcelizer("defined in"));
        sb.append(" ");
        getSlidesCount getslidescountRemoteActionCompatParcelizer = getAnswerDescription.RemoteActionCompatParcelizer(getvariantOnPlayFromMediaId);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getslidescountRemoteActionCompatParcelizer, "");
        sb.append(getslidescountRemoteActionCompatParcelizer.IconCompatParcelizer() ? "root package" : IconCompatParcelizer(getslidescountRemoteActionCompatParcelizer));
        if (r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw() && (getvariantOnPlayFromMediaId instanceof getShouldShowEmptyPlanScreen) && (getvariant instanceof CourseConfigV2HomePageItems)) {
            ((CourseConfigV2HomePageItems) getvariant).RatingCompat().AudioAttributesCompatParcelizer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(StringBuilder sb, fromJSONArray fromjsonarray, EnumC0173getDisplayname enumC0173getDisplayname) {
        if (onPlayFromMediaId().contains(isSillyMistake.ANNOTATIONS)) {
            Set<getNotesCount> setWrite = fromjsonarray instanceof getLink ? write() : handleMediaPlayPauseIfPendingOnHandler();
            getAnswerMap<dummyEditor, Boolean> getanswermapMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
            for (dummyEditor dummyeditor : fromjsonarray.RemoteActionCompatParcelizer()) {
                if (!IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(setWrite, dummyeditor.write()) && !AudioAttributesCompatParcelizer(dummyeditor) && (getanswermapMediaBrowserCompatMediaItem == null || getanswermapMediaBrowserCompatMediaItem.invoke(dummyeditor).booleanValue())) {
                    sb.append(IconCompatParcelizer(dummyeditor, enumC0173getDisplayname));
                    if (onAddQueueItem()) {
                        sb.append('\n');
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sb, "");
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    private static boolean AudioAttributesCompatParcelizer(dummyEditor dummyeditor) {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dummyeditor.write(), getZenArea.RemoteActionCompatParcelizer.onSetShuffleMode);
    }

    @Override // kotlin.setGuessed
    public final String IconCompatParcelizer(dummyEditor dummyeditor, EnumC0173getDisplayname enumC0173getDisplayname) {
        toMagicModuleMetaRepoModel.write(dummyeditor, "");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (enumC0173getDisplayname != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(enumC0173getDisplayname.RemoteActionCompatParcelizer());
            sb2.append(':');
            sb.append(sb2.toString());
        }
        getLink getlinkRemoteActionCompatParcelizer = dummyeditor.RemoteActionCompatParcelizer();
        sb.append(read(getlinkRemoteActionCompatParcelizer));
        if (onFastForward()) {
            List<String> listWrite = write(dummyeditor);
            if (onPlay() || !listWrite.isEmpty()) {
                IntermediateLoginResponseBody.write(listWrite, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) != 0 ? "" : ")", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
            }
        }
        if (PlaybackStateCompat() && (Copy.write(getlinkRemoteActionCompatParcelizer) || (getlinkRemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer() instanceof CourseConfigV2PlanScreenConfig.IconCompatParcelizer))) {
            sb.append(" /* annotation class not found */");
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    private final List<String> write(dummyEditor dummyeditor) {
        CourseConfigV2EditionSwitch courseConfigV2EditionSwitchHandleMediaPlayPauseIfPendingOnHandler;
        List<getMeta> listAX_;
        Map<getRelatedLessonId, getMagicLine<?>> map = dummyeditor.read();
        ArrayList arrayListRemoteActionCompatParcelizer = null;
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceRemoteActionCompatParcelizer = onPrepareFromUri() ? setLocked.RemoteActionCompatParcelizer(dummyeditor) : null;
        if (courseConfigV2CustomModuleQuestionSourceRemoteActionCompatParcelizer != null && (courseConfigV2EditionSwitchHandleMediaPlayPauseIfPendingOnHandler = courseConfigV2CustomModuleQuestionSourceRemoteActionCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler()) != null && (listAX_ = courseConfigV2EditionSwitchHandleMediaPlayPauseIfPendingOnHandler.aX_()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listAX_) {
                if (((getMeta) obj).IconCompatParcelizer()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((getMeta) it.next()).aQ_());
            }
            arrayListRemoteActionCompatParcelizer = arrayList3;
        }
        if (arrayListRemoteActionCompatParcelizer == null) {
            arrayListRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayListRemoteActionCompatParcelizer) {
            getRelatedLessonId getrelatedlessonid = (getRelatedLessonId) obj2;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonid, "");
            if (!map.containsKey(getrelatedlessonid)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList<getRelatedLessonId> arrayList5 = arrayList4;
        ArrayList arrayList6 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList5, 10));
        for (getRelatedLessonId getrelatedlessonid2 : arrayList5) {
            StringBuilder sb = new StringBuilder();
            sb.append(getrelatedlessonid2.AudioAttributesCompatParcelizer());
            sb.append(" = ...");
            arrayList6.add(sb.toString());
        }
        ArrayList arrayList7 = arrayList6;
        Set<Map.Entry<getRelatedLessonId, getMagicLine<?>>> setEntrySet = map.entrySet();
        ArrayList arrayList8 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(setEntrySet, 10));
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            getRelatedLessonId getrelatedlessonid3 = (getRelatedLessonId) entry.getKey();
            getMagicLine<?> getmagicline = (getMagicLine) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getrelatedlessonid3.AudioAttributesCompatParcelizer());
            sb2.append(" = ");
            sb2.append(!arrayListRemoteActionCompatParcelizer.contains(getrelatedlessonid3) ? write(getmagicline) : "...");
            arrayList8.add(sb2.toString());
        }
        return IntermediateLoginResponseBody.onPause(IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) arrayList7, (Iterable) arrayList8));
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getMagicLine<?>, CharSequence> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public CharSequence invoke(getMagicLine<?> getmagicline) {
            toMagicModuleMetaRepoModel.write(getmagicline, "");
            return isStarred.this.write(getmagicline);
        }

        AudioAttributesCompatParcelizer() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String write(getMagicLine<?> getmagicline) {
        if (getmagicline instanceof getAnswerPointer) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(((getAnswerPointer) getmagicline).AudioAttributesCompatParcelizer(), ", ", "{", "}", 0, null, new AudioAttributesCompatParcelizer(), 24);
        }
        if (getmagicline instanceof getActiveLessonId) {
            return TestGroupLSModel.IconCompatParcelizer(IconCompatParcelizer(((getActiveLessonId) getmagicline).AudioAttributesCompatParcelizer(), (EnumC0173getDisplayname) null), (CharSequence) "@");
        }
        if (getmagicline instanceof getOption8AnsweredCount) {
            getOption8AnsweredCount.write writeVarAudioAttributesCompatParcelizer = ((getOption8AnsweredCount) getmagicline).AudioAttributesCompatParcelizer();
            if (writeVarAudioAttributesCompatParcelizer instanceof getOption8AnsweredCount.write.C0098write) {
                StringBuilder sb = new StringBuilder();
                sb.append(((getOption8AnsweredCount.write.C0098write) writeVarAudioAttributesCompatParcelizer).write());
                sb.append("::class");
                return sb.toString();
            }
            if (!(writeVarAudioAttributesCompatParcelizer instanceof getOption8AnsweredCount.write.read)) {
                throw new RenewEligibleCreator();
            }
            getOption8AnsweredCount.write.read readVar = (getOption8AnsweredCount.write.read) writeVarAudioAttributesCompatParcelizer;
            String strRemoteActionCompatParcelizer = readVar.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, "");
            int iAudioAttributesCompatParcelizer = readVar.AudioAttributesCompatParcelizer();
            for (int i = 0; i < iAudioAttributesCompatParcelizer; i++) {
                StringBuilder sb2 = new StringBuilder("kotlin.Array<");
                sb2.append(strRemoteActionCompatParcelizer);
                sb2.append('>');
                strRemoteActionCompatParcelizer = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(strRemoteActionCompatParcelizer);
            sb3.append("::class");
            return sb3.toString();
        }
        return getmagicline.toString();
    }

    private final boolean IconCompatParcelizer(CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, StringBuilder sb) {
        if (!onPlayFromMediaId().contains(isSillyMistake.VISIBILITY)) {
            return false;
        }
        if (onPrepareFromMediaId()) {
            courseConfigV2NavDrawerItemFreeExtension = courseConfigV2NavDrawerItemFreeExtension.IconCompatParcelizer();
        }
        if (!onSetPlaybackSpeed() && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(courseConfigV2NavDrawerItemFreeExtension, CourseConfigV2NavDrawerItemFaq.write)) {
            return false;
        }
        sb.append(AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemFreeExtension.RemoteActionCompatParcelizer()));
        sb.append(" ");
        return true;
    }

    private final void read(CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, StringBuilder sb, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems2) {
        if (onSetRating() || courseConfigV2NavDrawerItems != courseConfigV2NavDrawerItems2) {
            AudioAttributesCompatParcelizer(sb, onPlayFromMediaId().contains(isSillyMistake.MODALITY), SubjectIntroSkip.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItems.name()));
        }
    }

    private static CourseConfigV2NavDrawerItems RemoteActionCompatParcelizer(CourseConfigV2NavDrawerItemYourCourse courseConfigV2NavDrawerItemYourCourse) {
        if (courseConfigV2NavDrawerItemYourCourse instanceof CourseConfigV2CustomModuleQuestionSource) {
            return ((CourseConfigV2CustomModuleQuestionSource) courseConfigV2NavDrawerItemYourCourse).AudioAttributesImplBaseParcelizer() == getQuestionSource.INTERFACE ? CourseConfigV2NavDrawerItems.ABSTRACT : CourseConfigV2NavDrawerItems.FINAL;
        }
        getVariant getvariantAudioAttributesImplApi21Parcelizer = courseConfigV2NavDrawerItemYourCourse.onPlayFromMediaId();
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = getvariantAudioAttributesImplApi21Parcelizer instanceof CourseConfigV2CustomModuleQuestionSource ? (CourseConfigV2CustomModuleQuestionSource) getvariantAudioAttributesImplApi21Parcelizer : null;
        if (courseConfigV2CustomModuleQuestionSource != null && (courseConfigV2NavDrawerItemYourCourse instanceof getTestHeaderTitle)) {
            getTestHeaderTitle gettestheadertitle = (getTestHeaderTitle) courseConfigV2NavDrawerItemYourCourse;
            Collection<? extends getTestHeaderTitle> collectionAudioAttributesImplApi26Parcelizer = gettestheadertitle.AudioAttributesImplApi26Parcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionAudioAttributesImplApi26Parcelizer, "");
            if (!collectionAudioAttributesImplApi26Parcelizer.isEmpty() && courseConfigV2CustomModuleQuestionSource.MediaBrowserCompatMediaItem() != CourseConfigV2NavDrawerItems.FINAL) {
                return CourseConfigV2NavDrawerItems.OPEN;
            }
            if (courseConfigV2CustomModuleQuestionSource.AudioAttributesImplBaseParcelizer() != getQuestionSource.INTERFACE || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(gettestheadertitle.onCustomAction(), CourseConfigV2NavDrawerItemFaq.AudioAttributesImplBaseParcelizer)) {
                return CourseConfigV2NavDrawerItems.FINAL;
            }
            return gettestheadertitle.MediaBrowserCompatMediaItem() == CourseConfigV2NavDrawerItems.ABSTRACT ? CourseConfigV2NavDrawerItems.ABSTRACT : CourseConfigV2NavDrawerItems.OPEN;
        }
        return CourseConfigV2NavDrawerItems.FINAL;
    }

    private final void AudioAttributesCompatParcelizer(getTestHeaderTitle gettestheadertitle, StringBuilder sb) {
        if (getAnswerDescription.RatingCompat(gettestheadertitle) && gettestheadertitle.MediaBrowserCompatMediaItem() == CourseConfigV2NavDrawerItems.FINAL) {
            return;
        }
        if (onPlayFromSearch() == setSelectedAnswerIndex.RENDER_OVERRIDE && gettestheadertitle.MediaBrowserCompatMediaItem() == CourseConfigV2NavDrawerItems.OPEN && IconCompatParcelizer(gettestheadertitle)) {
            return;
        }
        CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItemsMediaBrowserCompatMediaItem = gettestheadertitle.MediaBrowserCompatMediaItem();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemsMediaBrowserCompatMediaItem, "");
        read(courseConfigV2NavDrawerItemsMediaBrowserCompatMediaItem, sb, RemoteActionCompatParcelizer((CourseConfigV2NavDrawerItemYourCourse) gettestheadertitle));
    }

    private final void RemoteActionCompatParcelizer(getTestHeaderTitle gettestheadertitle, StringBuilder sb) {
        if (onPlayFromMediaId().contains(isSillyMistake.OVERRIDE) && IconCompatParcelizer(gettestheadertitle) && onPlayFromSearch() != setSelectedAnswerIndex.RENDER_OPEN) {
            AudioAttributesCompatParcelizer(sb, true, "override");
            if (PlaybackStateCompat()) {
                sb.append("/*");
                sb.append(gettestheadertitle.AudioAttributesImplApi26Parcelizer().size());
                sb.append("*/ ");
            }
        }
    }

    private final void read(getTestHeaderTitle gettestheadertitle, StringBuilder sb) {
        if (onPlayFromMediaId().contains(isSillyMistake.MEMBER_KIND) && PlaybackStateCompat() && gettestheadertitle.handleMediaPlayPauseIfPendingOnHandler() != getTestHeaderTitle.RemoteActionCompatParcelizer.DECLARATION) {
            sb.append("/*");
            sb.append(SubjectIntroSkip.AudioAttributesCompatParcelizer(gettestheadertitle.handleMediaPlayPauseIfPendingOnHandler().name()));
            sb.append("*/ ");
        }
    }

    private final void AudioAttributesCompatParcelizer(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(AudioAttributesCompatParcelizer(str));
            sb.append(" ");
        }
    }

    private final void IconCompatParcelizer(CourseConfigV2NavDrawerItemYourCourse courseConfigV2NavDrawerItemYourCourse, StringBuilder sb) {
        AudioAttributesCompatParcelizer(sb, courseConfigV2NavDrawerItemYourCourse.onMediaButtonEvent(), "external");
        AudioAttributesCompatParcelizer(sb, onPlayFromMediaId().contains(isSillyMistake.EXPECT) && courseConfigV2NavDrawerItemYourCourse.onPause(), "expect");
        AudioAttributesCompatParcelizer(sb, onPlayFromMediaId().contains(isSillyMistake.ACTUAL) && courseConfigV2NavDrawerItemYourCourse.onCommand(), "actual");
    }

    private final void write(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, StringBuilder sb) {
        boolean z;
        boolean z2 = false;
        if (courseConfigV2NavDrawerItemRateUs.onPrepareFromUri()) {
            Collection<? extends CourseConfigV2NavDrawerItemRateUs> collectionAudioAttributesImplApi26Parcelizer = courseConfigV2NavDrawerItemRateUs.AudioAttributesImplApi26Parcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionAudioAttributesImplApi26Parcelizer, "");
            Collection<? extends CourseConfigV2NavDrawerItemRateUs> collection = collectionAudioAttributesImplApi26Parcelizer;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((CourseConfigV2NavDrawerItemRateUs) it.next()).onPrepareFromUri()) {
                        if (MediaMetadataCompat()) {
                            break;
                        }
                    }
                }
                z = false;
            }
            z = true;
        } else {
            z = false;
        }
        if (courseConfigV2NavDrawerItemRateUs.onPrepareFromSearch()) {
            Collection<? extends CourseConfigV2NavDrawerItemRateUs> collectionAudioAttributesImplApi26Parcelizer2 = courseConfigV2NavDrawerItemRateUs.AudioAttributesImplApi26Parcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionAudioAttributesImplApi26Parcelizer2, "");
            Collection<? extends CourseConfigV2NavDrawerItemRateUs> collection2 = collectionAudioAttributesImplApi26Parcelizer2;
            if (collection2.isEmpty()) {
                z2 = true;
            } else {
                Iterator<T> it2 = collection2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((CourseConfigV2NavDrawerItemRateUs) it2.next()).onPrepareFromSearch()) {
                        if (MediaMetadataCompat()) {
                            break;
                        }
                    }
                }
            }
        }
        AudioAttributesCompatParcelizer(sb, courseConfigV2NavDrawerItemRateUs.IconCompatParcelizer(), "tailrec");
        AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemRateUs, sb);
        AudioAttributesCompatParcelizer(sb, courseConfigV2NavDrawerItemRateUs.AudioAttributesCompatParcelizer(), "inline");
        AudioAttributesCompatParcelizer(sb, z2, "infix");
        AudioAttributesCompatParcelizer(sb, z, "operator");
    }

    private final void AudioAttributesCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, StringBuilder sb) {
        AudioAttributesCompatParcelizer(sb, courseConfigV2NavDrawerItemRateUs.onSeekTo(), "suspend");
    }

    @Override // kotlin.setGuessed
    public final String RemoteActionCompatParcelizer(getVariant getvariant) {
        toMagicModuleMetaRepoModel.write(getvariant, "");
        StringBuilder sb = new StringBuilder();
        getvariant.AudioAttributesCompatParcelizer(new RemoteActionCompatParcelizer(), sb);
        if (ParcelableVolumeInfo()) {
            IconCompatParcelizer(sb, getvariant);
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(getBadgeText getbadgetext, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(MediaBrowserCompatItemReceiver());
        }
        if (PlaybackStateCompat()) {
            sb.append("/*");
            sb.append(getbadgetext.write());
            sb.append("*/ ");
        }
        AudioAttributesCompatParcelizer(sb, getbadgetext.aZ_(), "reified");
        String strAudioAttributesCompatParcelizer = getbadgetext.MediaBrowserCompatMediaItem().AudioAttributesCompatParcelizer();
        boolean z2 = true;
        AudioAttributesCompatParcelizer(sb, strAudioAttributesCompatParcelizer.length() > 0, strAudioAttributesCompatParcelizer);
        write(sb, getbadgetext, (EnumC0173getDisplayname) null);
        AudioAttributesCompatParcelizer(getbadgetext, sb, z);
        int size = getbadgetext.MediaBrowserCompatCustomActionResultReceiver().size();
        if ((size > 1 && !z) || size == 1) {
            getLink next = getbadgetext.MediaBrowserCompatCustomActionResultReceiver().iterator().next();
            if (!getTestTabItems.MediaBrowserCompatItemReceiver(next)) {
                sb.append(" : ");
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(next, "");
                sb.append(read(next));
            }
        } else if (z) {
            for (getLink getlink : getbadgetext.MediaBrowserCompatCustomActionResultReceiver()) {
                if (!getTestTabItems.MediaBrowserCompatItemReceiver(getlink)) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlink, "");
                    sb.append(read(getlink));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(MediaBrowserCompatCustomActionResultReceiver());
        }
    }

    private final void IconCompatParcelizer(List<? extends getBadgeText> list, StringBuilder sb, boolean z) {
        if (r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() || list.isEmpty()) {
            return;
        }
        sb.append(MediaBrowserCompatItemReceiver());
        AudioAttributesCompatParcelizer(sb, list);
        sb.append(MediaBrowserCompatCustomActionResultReceiver());
        if (z) {
            sb.append(" ");
        }
    }

    private final void AudioAttributesCompatParcelizer(StringBuilder sb, List<? extends getBadgeText> list) {
        Iterator<? extends getBadgeText> it = list.iterator();
        while (it.hasNext()) {
            write(it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, StringBuilder sb) {
        if (!setSessionImpl()) {
            if (!onSkipToQueueItem()) {
                write(sb, courseConfigV2NavDrawerItemRateUs, (EnumC0173getDisplayname) null);
                List<CourseConfigV2TestTabItem> list = courseConfigV2NavDrawerItemRateUs.read();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(list, "");
                IconCompatParcelizer(list, sb);
                CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtensionOnCustomAction = courseConfigV2NavDrawerItemRateUs.onCustomAction();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemFreeExtensionOnCustomAction, "");
                IconCompatParcelizer(courseConfigV2NavDrawerItemFreeExtensionOnCustomAction, sb);
                CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs2 = courseConfigV2NavDrawerItemRateUs;
                AudioAttributesCompatParcelizer((getTestHeaderTitle) courseConfigV2NavDrawerItemRateUs2, sb);
                if (onCustomAction()) {
                    IconCompatParcelizer((CourseConfigV2NavDrawerItemYourCourse) courseConfigV2NavDrawerItemRateUs, sb);
                }
                RemoteActionCompatParcelizer((getTestHeaderTitle) courseConfigV2NavDrawerItemRateUs2, sb);
                if (onCustomAction()) {
                    write(courseConfigV2NavDrawerItemRateUs, sb);
                } else {
                    AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemRateUs, sb);
                }
                read((getTestHeaderTitle) courseConfigV2NavDrawerItemRateUs2, sb);
                if (PlaybackStateCompat()) {
                    if (courseConfigV2NavDrawerItemRateUs.onPlayFromUri()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (courseConfigV2NavDrawerItemRateUs.onPrepare()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(AudioAttributesCompatParcelizer("fun"));
            sb.append(" ");
            List<getBadgeText> listMediaDescriptionCompat = courseConfigV2NavDrawerItemRateUs.MediaDescriptionCompat();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaDescriptionCompat, "");
            IconCompatParcelizer((List<? extends getBadgeText>) listMediaDescriptionCompat, sb, true);
            AudioAttributesCompatParcelizer((getVideoPageNotesTitle) courseConfigV2NavDrawerItemRateUs, sb);
        }
        AudioAttributesCompatParcelizer((getVariant) courseConfigV2NavDrawerItemRateUs, sb, true);
        List<getMeta> listAX_ = courseConfigV2NavDrawerItemRateUs.aX_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_, "");
        RemoteActionCompatParcelizer(listAX_, courseConfigV2NavDrawerItemRateUs.MediaBrowserCompatSearchResultReceiver(), sb);
        RemoteActionCompatParcelizer((getVideoPageNotesTitle) courseConfigV2NavDrawerItemRateUs, sb);
        getLink getlinkAudioAttributesImplBaseParcelizer = courseConfigV2NavDrawerItemRateUs.AudioAttributesImplBaseParcelizer();
        if (!r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() && (MediaSessionCompatResultReceiverWrapper() || getlinkAudioAttributesImplBaseParcelizer == null || !getTestTabItems.MediaMetadataCompat(getlinkAudioAttributesImplBaseParcelizer))) {
            sb.append(": ");
            sb.append(getlinkAudioAttributesImplBaseParcelizer == null ? "[NULL]" : read(getlinkAudioAttributesImplBaseParcelizer));
        }
        List<getBadgeText> listMediaDescriptionCompat2 = courseConfigV2NavDrawerItemRateUs.MediaDescriptionCompat();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaDescriptionCompat2, "");
        RemoteActionCompatParcelizer(listMediaDescriptionCompat2, sb);
    }

    private final void RemoteActionCompatParcelizer(getVideoPageNotesTitle getvideopagenotestitle, StringBuilder sb) {
        CourseConfigV2TestTabItem courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver;
        if (!onRemoveQueueItem() || (courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver = getvideopagenotestitle.MediaBrowserCompatCustomActionResultReceiver()) == null) {
            return;
        }
        sb.append(" on ");
        getLink getlinkOnPrepareFromMediaId = courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver.onPrepareFromMediaId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId, "");
        sb.append(read(getlinkOnPrepareFromMediaId));
    }

    private final String AudioAttributesCompatParcelizer(getLink getlink) {
        String str = read(getlink);
        if ((!write(getlink) || setPlanAddOns.write(getlink)) && !(getlink instanceof setPearlNumber)) {
            return str;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    private final void IconCompatParcelizer(List<? extends CourseConfigV2TestTabItem> list, StringBuilder sb) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        int i = 0;
        for (CourseConfigV2TestTabItem courseConfigV2TestTabItem : list) {
            write(sb, courseConfigV2TestTabItem, EnumC0173getDisplayname.RECEIVER);
            getLink getlinkOnPrepareFromMediaId = courseConfigV2TestTabItem.onPrepareFromMediaId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId, "");
            sb.append(AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId));
            if (i == IntermediateLoginResponseBody.write((List) list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i++;
        }
    }

    private final void AudioAttributesCompatParcelizer(getVideoPageNotesTitle getvideopagenotestitle, StringBuilder sb) {
        CourseConfigV2TestTabItem courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver = getvideopagenotestitle.MediaBrowserCompatCustomActionResultReceiver();
        if (courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver != null) {
            write(sb, courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver, EnumC0173getDisplayname.RECEIVER);
            getLink getlinkOnPrepareFromMediaId = courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver.onPrepareFromMediaId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId, "");
            sb.append(AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId));
            sb.append(".");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void read(kotlin.CourseConfigV2GtAnalyticsCard r13, java.lang.StringBuilder r14) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isStarred.read(o.CourseConfigV2GtAnalyticsCard, java.lang.StringBuilder):void");
    }

    static final class AudioAttributesImplApi21Parcelizer extends MagicModuleUseCase implements getAnswerMap<getMeta, CharSequence> {
        public static final AudioAttributesImplApi21Parcelizer AudioAttributesCompatParcelizer = new AudioAttributesImplApi21Parcelizer();

        private static CharSequence AudioAttributesCompatParcelizer() {
            return "";
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ CharSequence invoke(getMeta getmeta) {
            return AudioAttributesCompatParcelizer();
        }

        AudioAttributesImplApi21Parcelizer() {
            super(1);
        }
    }

    private final void RemoteActionCompatParcelizer(List<? extends getBadgeText> list, StringBuilder sb) {
        if (r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (getBadgeText getbadgetext : list) {
            List<getLink> listMediaBrowserCompatCustomActionResultReceiver = getbadgetext.MediaBrowserCompatCustomActionResultReceiver();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaBrowserCompatCustomActionResultReceiver, "");
            for (getLink getlink : IntermediateLoginResponseBody.IconCompatParcelizer((Iterable) listMediaBrowserCompatCustomActionResultReceiver, 1)) {
                StringBuilder sb2 = new StringBuilder();
                getRelatedLessonId getrelatedlessonidAQ_ = getbadgetext.aQ_();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_, "");
                sb2.append(read(getrelatedlessonidAQ_, false));
                sb2.append(" : ");
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlink, "");
                sb2.append(read(getlink));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(AudioAttributesCompatParcelizer("where"));
        sb.append(" ");
        IntermediateLoginResponseBody.write(arrayList, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
    }

    private final void RemoteActionCompatParcelizer(Collection<? extends getMeta> collection, boolean z, StringBuilder sb) {
        boolean zMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(z);
        int size = collection.size();
        MediaSessionCompatQueueItem().write(sb);
        int i = 0;
        for (getMeta getmeta : collection) {
            MediaSessionCompatQueueItem().IconCompatParcelizer(getmeta, sb);
            IconCompatParcelizer(getmeta, zMediaBrowserCompatCustomActionResultReceiver, sb, false);
            MediaSessionCompatQueueItem().write(getmeta, i, size, sb);
            i++;
        }
        MediaSessionCompatQueueItem().RemoteActionCompatParcelizer(sb);
    }

    private final boolean MediaBrowserCompatCustomActionResultReceiver(boolean z) {
        int i = IconCompatParcelizer.RemoteActionCompatParcelizer[onPrepare().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return !z;
        }
        if (i == 3) {
            return false;
        }
        throw new RenewEligibleCreator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void IconCompatParcelizer(kotlin.getMeta r9, boolean r10, java.lang.StringBuilder r11, boolean r12) {
        /*
            r8 = this;
            if (r12 == 0) goto L10
            java.lang.String r0 = "value-parameter"
            java.lang.String r0 = r8.AudioAttributesCompatParcelizer(r0)
            r11.append(r0)
            java.lang.String r0 = " "
            r11.append(r0)
        L10:
            boolean r0 = r8.PlaybackStateCompat()
            if (r0 == 0) goto L27
            java.lang.String r0 = "/*"
            r11.append(r0)
            int r0 = r9.onCommand()
            r11.append(r0)
        */
        //  java.lang.String r0 = "*/ "
        /*
            r11.append(r0)
        L27:
            r0 = r9
            o.fromJSONArray r0 = (kotlin.fromJSONArray) r0
            RemoteActionCompatParcelizer(r8, r11, r0)
            boolean r0 = r9.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()
            java.lang.String r1 = "crossinline"
            r8.AudioAttributesCompatParcelizer(r11, r0, r1)
            boolean r0 = r9.onMediaButtonEvent()
            java.lang.String r1 = "noinline"
            r8.AudioAttributesCompatParcelizer(r11, r0, r1)
            boolean r0 = r8.onSetRepeatMode()
            if (r0 == 0) goto L5a
            o.getVideoPageNotesTitle r0 = r9.AudioAttributesImplApi21Parcelizer()
            boolean r1 = r0 instanceof kotlin.CourseConfigV2EditionSwitch
            if (r1 == 0) goto L50
            o.CourseConfigV2EditionSwitch r0 = (kotlin.CourseConfigV2EditionSwitch) r0
            goto L51
        L50:
            r0 = 0
        L51:
            if (r0 == 0) goto L5a
            boolean r0 = r0.onPlay()
            r1 = 1
            if (r0 == r1) goto L5b
        L5a:
            r1 = 0
        L5b:
            r7 = r1
            if (r7 == 0) goto L67
            boolean r0 = r8.RatingCompat()
            java.lang.String r1 = "actual"
            r8.AudioAttributesCompatParcelizer(r11, r0, r1)
        L67:
            r3 = r9
            o.Editor r3 = (kotlin.Editor) r3
            r2 = r8
            r4 = r10
            r5 = r11
            r6 = r12
            r2.RemoteActionCompatParcelizer(r3, r4, r5, r6, r7)
            o.getAnswerMap r10 = r8.onCommand()
            if (r10 == 0) goto La6
            boolean r10 = r8.IconCompatParcelizer()
            if (r10 == 0) goto L82
            boolean r10 = r9.IconCompatParcelizer()
            goto L86
        L82:
            boolean r10 = kotlin.setLocked.AudioAttributesCompatParcelizer(r9)
        L86:
            if (r10 == 0) goto La6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r12 = " = "
            r10.<init>(r12)
            o.getAnswerMap r8 = r8.onCommand()
            kotlin.toMagicModuleMetaRepoModel.write(r8)
            java.lang.Object r8 = r8.invoke(r9)
            java.lang.String r8 = (java.lang.String) r8
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r11.append(r8)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isStarred.IconCompatParcelizer(o.getMeta, boolean, java.lang.StringBuilder, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(Editor editor, StringBuilder sb, boolean z) {
        if (z || !(editor instanceof getMeta)) {
            sb.append(AudioAttributesCompatParcelizer(editor.onRewind() ? "var" : "val"));
            sb.append(" ");
        }
    }

    private final void RemoteActionCompatParcelizer(Editor editor, boolean z, StringBuilder sb, boolean z2, boolean z3) {
        getLink getlinkOnPrepareFromMediaId = editor.onPrepareFromMediaId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId, "");
        getMeta getmeta = editor instanceof getMeta ? (getMeta) editor : null;
        getLink getlinkHandleMediaPlayPauseIfPendingOnHandler = getmeta != null ? getmeta.handleMediaPlayPauseIfPendingOnHandler() : null;
        getLink getlink = getlinkHandleMediaPlayPauseIfPendingOnHandler == null ? getlinkOnPrepareFromMediaId : getlinkHandleMediaPlayPauseIfPendingOnHandler;
        AudioAttributesCompatParcelizer(sb, getlinkHandleMediaPlayPauseIfPendingOnHandler != null, "vararg");
        if (z3 || (z2 && !setSessionImpl())) {
            IconCompatParcelizer(editor, sb, z3);
        }
        if (z) {
            AudioAttributesCompatParcelizer(editor, sb, z2);
            sb.append(": ");
        }
        sb.append(read(getlink));
        read(editor, sb);
        if (!PlaybackStateCompat() || getlinkHandleMediaPlayPauseIfPendingOnHandler == null) {
            return;
        }
        sb.append(" /*");
        sb.append(read(getlinkOnPrepareFromMediaId));
        sb.append("*/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(CourseConfigV2SettingsItems courseConfigV2SettingsItems, StringBuilder sb) {
        if (!setSessionImpl()) {
            if (!onSkipToQueueItem()) {
                AudioAttributesCompatParcelizer(courseConfigV2SettingsItems, sb);
                List<CourseConfigV2TestTabItem> list = courseConfigV2SettingsItems.read();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(list, "");
                IconCompatParcelizer(list, sb);
                CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtensionOnCustomAction = courseConfigV2SettingsItems.onCustomAction();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemFreeExtensionOnCustomAction, "");
                IconCompatParcelizer(courseConfigV2NavDrawerItemFreeExtensionOnCustomAction, sb);
                boolean z = false;
                AudioAttributesCompatParcelizer(sb, onPlayFromMediaId().contains(isSillyMistake.CONST) && courseConfigV2SettingsItems.onPlayFromUri(), "const");
                IconCompatParcelizer(courseConfigV2SettingsItems, sb);
                CourseConfigV2SettingsItems courseConfigV2SettingsItems2 = courseConfigV2SettingsItems;
                AudioAttributesCompatParcelizer((getTestHeaderTitle) courseConfigV2SettingsItems2, sb);
                RemoteActionCompatParcelizer((getTestHeaderTitle) courseConfigV2SettingsItems2, sb);
                if (onPlayFromMediaId().contains(isSillyMistake.LATEINIT) && courseConfigV2SettingsItems.onPrepare()) {
                    z = true;
                }
                AudioAttributesCompatParcelizer(sb, z, "lateinit");
                read((getTestHeaderTitle) courseConfigV2SettingsItems2, sb);
            }
            IconCompatParcelizer((Editor) courseConfigV2SettingsItems, sb, false);
            List<getBadgeText> listMediaDescriptionCompat = courseConfigV2SettingsItems.MediaDescriptionCompat();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaDescriptionCompat, "");
            IconCompatParcelizer((List<? extends getBadgeText>) listMediaDescriptionCompat, sb, true);
            AudioAttributesCompatParcelizer((getVideoPageNotesTitle) courseConfigV2SettingsItems, sb);
        }
        AudioAttributesCompatParcelizer((getVariant) courseConfigV2SettingsItems, sb, true);
        sb.append(": ");
        getLink getlinkOnPrepareFromMediaId = courseConfigV2SettingsItems.onPrepareFromMediaId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId, "");
        sb.append(read(getlinkOnPrepareFromMediaId));
        RemoteActionCompatParcelizer((getVideoPageNotesTitle) courseConfigV2SettingsItems, sb);
        read((Editor) courseConfigV2SettingsItems, sb);
        List<getBadgeText> listMediaDescriptionCompat2 = courseConfigV2SettingsItems.MediaDescriptionCompat();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaDescriptionCompat2, "");
        RemoteActionCompatParcelizer(listMediaDescriptionCompat2, sb);
    }

    private final void AudioAttributesCompatParcelizer(CourseConfigV2SettingsItems courseConfigV2SettingsItems, StringBuilder sb) {
        if (onPlayFromMediaId().contains(isSillyMistake.ANNOTATIONS)) {
            write(sb, courseConfigV2SettingsItems, (EnumC0173getDisplayname) null);
            CourseConfigV2NavDrawerItemKnowMore courseConfigV2NavDrawerItemKnowMoreMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = courseConfigV2SettingsItems.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            if (courseConfigV2NavDrawerItemKnowMoreMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != null) {
                write(sb, courseConfigV2NavDrawerItemKnowMoreMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, EnumC0173getDisplayname.FIELD);
            }
            CourseConfigV2NavDrawerItemKnowMore courseConfigV2NavDrawerItemKnowMoreOnFastForward = courseConfigV2SettingsItems.onFastForward();
            if (courseConfigV2NavDrawerItemKnowMoreOnFastForward != null) {
                write(sb, courseConfigV2NavDrawerItemKnowMoreOnFastForward, EnumC0173getDisplayname.PROPERTY_DELEGATE_FIELD);
            }
            if (AudioAttributesImplApi26Parcelizer() == getRightAnswerIndex.NONE) {
                CourseConfigV2TestItem courseConfigV2TestItemOnPlayFromMediaId = courseConfigV2SettingsItems.onPlayFromMediaId();
                if (courseConfigV2TestItemOnPlayFromMediaId != null) {
                    write(sb, courseConfigV2TestItemOnPlayFromMediaId, EnumC0173getDisplayname.PROPERTY_GETTER);
                }
                getAppSettings getappsettingsOnPlayFromSearch = courseConfigV2SettingsItems.onPlayFromSearch();
                if (getappsettingsOnPlayFromSearch != null) {
                    write(sb, getappsettingsOnPlayFromSearch, EnumC0173getDisplayname.PROPERTY_SETTER);
                    List<getMeta> listAX_ = getappsettingsOnPlayFromSearch.aX_();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_, "");
                    getMeta getmeta = (getMeta) IntermediateLoginResponseBody.onCommand((List) listAX_);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getmeta, "");
                    write(sb, getmeta, EnumC0173getDisplayname.SETTER_PARAMETER);
                }
            }
        }
    }

    private final void read(Editor editor, StringBuilder sb) {
        getMagicLine<?> getmagiclineOnPrepareFromSearch;
        if (!onMediaButtonEvent() || (getmagiclineOnPrepareFromSearch = editor.onPrepareFromSearch()) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(read(write(getmagiclineOnPrepareFromSearch)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(CourseConfigV2VideoProperties courseConfigV2VideoProperties, StringBuilder sb) {
        write(sb, courseConfigV2VideoProperties, (EnumC0173getDisplayname) null);
        CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtensionOnCustomAction = courseConfigV2VideoProperties.onCustomAction();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemFreeExtensionOnCustomAction, "");
        IconCompatParcelizer(courseConfigV2NavDrawerItemFreeExtensionOnCustomAction, sb);
        IconCompatParcelizer(courseConfigV2VideoProperties, sb);
        sb.append(AudioAttributesCompatParcelizer("typealias"));
        sb.append(" ");
        AudioAttributesCompatParcelizer((getVariant) courseConfigV2VideoProperties, sb, true);
        List<getBadgeText> listMediaBrowserCompatItemReceiver = courseConfigV2VideoProperties.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaBrowserCompatItemReceiver, "");
        IconCompatParcelizer((List<? extends getBadgeText>) listMediaBrowserCompatItemReceiver, sb, false);
        write(courseConfigV2VideoProperties, sb);
        sb.append(" = ");
        sb.append(read(courseConfigV2VideoProperties.AudioAttributesImplBaseParcelizer()));
    }

    private final void write(getBadge getbadge, StringBuilder sb) {
        List<getBadgeText> listMediaBrowserCompatItemReceiver = getbadge.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaBrowserCompatItemReceiver, "");
        List<getBadgeText> listAudioAttributesCompatParcelizer = getbadge.MediaBrowserCompatSearchResultReceiver().AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer, "");
        if (PlaybackStateCompat() && getbadge.onPrepareFromSearch() && listAudioAttributesCompatParcelizer.size() > listMediaBrowserCompatItemReceiver.size()) {
            sb.append(" /*captured type parameters: ");
            AudioAttributesCompatParcelizer(sb, listAudioAttributesCompatParcelizer.subList(listMediaBrowserCompatItemReceiver.size(), listAudioAttributesCompatParcelizer.size()));
            sb.append("*/");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, StringBuilder sb) {
        CourseConfigV2EditionSwitch courseConfigV2EditionSwitchHandleMediaPlayPauseIfPendingOnHandler;
        boolean z = courseConfigV2CustomModuleQuestionSource.AudioAttributesImplBaseParcelizer() == getQuestionSource.ENUM_ENTRY;
        if (!setSessionImpl()) {
            write(sb, courseConfigV2CustomModuleQuestionSource, (EnumC0173getDisplayname) null);
            List<CourseConfigV2TestTabItem> listOnPrepare = courseConfigV2CustomModuleQuestionSource.onPrepare();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listOnPrepare, "");
            IconCompatParcelizer(listOnPrepare, sb);
            if (!z) {
                CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtensionOnCustomAction = courseConfigV2CustomModuleQuestionSource.onCustomAction();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemFreeExtensionOnCustomAction, "");
                IconCompatParcelizer(courseConfigV2NavDrawerItemFreeExtensionOnCustomAction, sb);
            }
            if ((courseConfigV2CustomModuleQuestionSource.AudioAttributesImplBaseParcelizer() != getQuestionSource.INTERFACE || courseConfigV2CustomModuleQuestionSource.MediaBrowserCompatMediaItem() != CourseConfigV2NavDrawerItems.ABSTRACT) && (!courseConfigV2CustomModuleQuestionSource.AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer() || courseConfigV2CustomModuleQuestionSource.MediaBrowserCompatMediaItem() != CourseConfigV2NavDrawerItems.FINAL)) {
                CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItemsMediaBrowserCompatMediaItem = courseConfigV2CustomModuleQuestionSource.MediaBrowserCompatMediaItem();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemsMediaBrowserCompatMediaItem, "");
                read(courseConfigV2NavDrawerItemsMediaBrowserCompatMediaItem, sb, RemoteActionCompatParcelizer((CourseConfigV2NavDrawerItemYourCourse) courseConfigV2CustomModuleQuestionSource));
            }
            IconCompatParcelizer(courseConfigV2CustomModuleQuestionSource, sb);
            AudioAttributesCompatParcelizer(sb, onPlayFromMediaId().contains(isSillyMistake.INNER) && courseConfigV2CustomModuleQuestionSource.onPrepareFromSearch(), "inner");
            AudioAttributesCompatParcelizer(sb, onPlayFromMediaId().contains(isSillyMistake.DATA) && courseConfigV2CustomModuleQuestionSource.onFastForward(), "data");
            AudioAttributesCompatParcelizer(sb, onPlayFromMediaId().contains(isSillyMistake.INLINE) && courseConfigV2CustomModuleQuestionSource.onPlay(), "inline");
            AudioAttributesCompatParcelizer(sb, onPlayFromMediaId().contains(isSillyMistake.VALUE) && courseConfigV2CustomModuleQuestionSource.onPlayFromUri(), AppMeasurementSdk.ConditionalUserProperty.VALUE);
            AudioAttributesCompatParcelizer(sb, onPlayFromMediaId().contains(isSillyMistake.FUN) && courseConfigV2CustomModuleQuestionSource.onPlayFromMediaId(), "fun");
            write(courseConfigV2CustomModuleQuestionSource, sb);
        }
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource2 = courseConfigV2CustomModuleQuestionSource;
        if (!getAnswerDescription.AudioAttributesImplApi21Parcelizer(courseConfigV2CustomModuleQuestionSource2)) {
            if (!setSessionImpl()) {
                read(sb);
            }
            AudioAttributesCompatParcelizer((getVariant) courseConfigV2CustomModuleQuestionSource2, sb, true);
        } else {
            read((getVariant) courseConfigV2CustomModuleQuestionSource2, sb);
        }
        if (z) {
            return;
        }
        List<getBadgeText> listMediaBrowserCompatItemReceiver = courseConfigV2CustomModuleQuestionSource.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaBrowserCompatItemReceiver, "");
        IconCompatParcelizer((List<? extends getBadgeText>) listMediaBrowserCompatItemReceiver, sb, false);
        write((getBadge) courseConfigV2CustomModuleQuestionSource, sb);
        if (!courseConfigV2CustomModuleQuestionSource.AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer() && MediaDescriptionCompat() && (courseConfigV2EditionSwitchHandleMediaPlayPauseIfPendingOnHandler = courseConfigV2CustomModuleQuestionSource.handleMediaPlayPauseIfPendingOnHandler()) != null) {
            sb.append(" ");
            write(sb, courseConfigV2EditionSwitchHandleMediaPlayPauseIfPendingOnHandler, (EnumC0173getDisplayname) null);
            CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtensionOnCustomAction2 = courseConfigV2EditionSwitchHandleMediaPlayPauseIfPendingOnHandler.onCustomAction();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemFreeExtensionOnCustomAction2, "");
            IconCompatParcelizer(courseConfigV2NavDrawerItemFreeExtensionOnCustomAction2, sb);
            sb.append(AudioAttributesCompatParcelizer("constructor"));
            List<getMeta> listAX_ = courseConfigV2EditionSwitchHandleMediaPlayPauseIfPendingOnHandler.aX_();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_, "");
            RemoteActionCompatParcelizer(listAX_, courseConfigV2EditionSwitchHandleMediaPlayPauseIfPendingOnHandler.MediaBrowserCompatSearchResultReceiver(), sb);
        }
        AudioAttributesCompatParcelizer(courseConfigV2CustomModuleQuestionSource, sb);
        RemoteActionCompatParcelizer(listMediaBrowserCompatItemReceiver, sb);
    }

    private final void AudioAttributesCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, StringBuilder sb) {
        if (ResultReceiver() || getTestTabItems.AudioAttributesImplApi26Parcelizer(courseConfigV2CustomModuleQuestionSource.aP_())) {
            return;
        }
        Collection<getLink> collectionAV_ = courseConfigV2CustomModuleQuestionSource.MediaBrowserCompatSearchResultReceiver().aV_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionAV_, "");
        if (collectionAV_.isEmpty()) {
            return;
        }
        if (collectionAV_.size() == 1 && getTestTabItems.write(collectionAV_.iterator().next())) {
            return;
        }
        read(sb);
        sb.append(": ");
        IntermediateLoginResponseBody.write(collectionAV_, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new AudioAttributesImplApi26Parcelizer());
    }

    static final class AudioAttributesImplApi26Parcelizer extends MagicModuleUseCase implements getAnswerMap<getLink, CharSequence> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public CharSequence invoke(getLink getlink) {
            isStarred isstarred = isStarred.this;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlink, "");
            return isstarred.read(getlink);
        }

        AudioAttributesImplApi26Parcelizer() {
            super(1);
        }
    }

    private final void write(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, StringBuilder sb) {
        sb.append(AudioAttributesCompatParcelizer(setGuessed.AudioAttributesCompatParcelizer.write(courseConfigV2CustomModuleQuestionSource)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(CourseConfigV2SearchItem courseConfigV2SearchItem, StringBuilder sb) {
        write(courseConfigV2SearchItem.read(), Constants.PACKAGE_DIR_NAME, sb);
        if (IconCompatParcelizer()) {
            sb.append(" in context of ");
            AudioAttributesCompatParcelizer((getVariant) courseConfigV2SearchItem.MediaBrowserCompatItemReceiver(), sb, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(getShouldShowEmptyPlanScreen getshouldshowemptyplanscreen, StringBuilder sb) {
        write(getshouldshowemptyplanscreen.IconCompatParcelizer(), "package-fragment", sb);
        if (IconCompatParcelizer()) {
            sb.append(" in ");
            AudioAttributesCompatParcelizer((getVariant) getshouldshowemptyplanscreen.AudioAttributesImplApi21Parcelizer(), sb, false);
        }
    }

    private final void write(getNotesCount getnotescount, String str, StringBuilder sb) {
        sb.append(AudioAttributesCompatParcelizer(str));
        getSlidesCount getslidescountAudioAttributesImplApi26Parcelizer = getnotescount.AudioAttributesImplApi26Parcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getslidescountAudioAttributesImplApi26Parcelizer, "");
        String strIconCompatParcelizer = IconCompatParcelizer(getslidescountAudioAttributesImplApi26Parcelizer);
        if (strIconCompatParcelizer.length() > 0) {
            sb.append(" ");
            sb.append(strIconCompatParcelizer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(getAllSettings getallsettings, StringBuilder sb) {
        IconCompatParcelizer((CourseConfigV2NavDrawerItemYourCourse) getallsettings, sb);
    }

    final class RemoteActionCompatParcelizer implements CourseConfigV2NavDrawerItemAddVideo<getShowPopup, StringBuilder> {

        public final /* synthetic */ class AudioAttributesCompatParcelizer {
            public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

            static {
                int[] iArr = new int[getRightAnswerIndex.values().length];
                try {
                    iArr[getRightAnswerIndex.PRETTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[getRightAnswerIndex.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[getRightAnswerIndex.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                AudioAttributesCompatParcelizer = iArr;
            }
        }

        public RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.CourseConfigV2NavDrawerItemAddVideo
        public final /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(CourseConfigV2TestTabItem courseConfigV2TestTabItem, StringBuilder sb) {
            RemoteActionCompatParcelizer(courseConfigV2TestTabItem, sb);
            return getShowPopup.INSTANCE;
        }

        @Override // kotlin.CourseConfigV2NavDrawerItemAddVideo
        public final /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(getTopSection gettopsection, StringBuilder sb) {
            IconCompatParcelizer(gettopsection, sb);
            return getShowPopup.INSTANCE;
        }

        @Override // kotlin.CourseConfigV2NavDrawerItemAddVideo
        public final /* synthetic */ getShowPopup IconCompatParcelizer(CourseConfigV2GtAnalyticsCard courseConfigV2GtAnalyticsCard, StringBuilder sb) {
            AudioAttributesCompatParcelizer(courseConfigV2GtAnalyticsCard, sb);
            return getShowPopup.INSTANCE;
        }

        @Override // kotlin.CourseConfigV2NavDrawerItemAddVideo
        public final /* synthetic */ getShowPopup IconCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, StringBuilder sb) {
            RemoteActionCompatParcelizer(courseConfigV2NavDrawerItemRateUs, sb);
            return getShowPopup.INSTANCE;
        }

        @Override // kotlin.CourseConfigV2NavDrawerItemAddVideo
        public final /* synthetic */ getShowPopup RemoteActionCompatParcelizer(CourseConfigV2SearchItem courseConfigV2SearchItem, StringBuilder sb) {
            IconCompatParcelizer(courseConfigV2SearchItem, sb);
            return getShowPopup.INSTANCE;
        }

        @Override // kotlin.CourseConfigV2NavDrawerItemAddVideo
        public final /* synthetic */ getShowPopup RemoteActionCompatParcelizer(CourseConfigV2VideoProperties courseConfigV2VideoProperties, StringBuilder sb) {
            write(courseConfigV2VideoProperties, sb);
            return getShowPopup.INSTANCE;
        }

        @Override // kotlin.CourseConfigV2NavDrawerItemAddVideo
        public final /* synthetic */ getShowPopup RemoteActionCompatParcelizer(getAppSettings getappsettings, StringBuilder sb) {
            read(getappsettings, sb);
            return getShowPopup.INSTANCE;
        }

        @Override // kotlin.CourseConfigV2NavDrawerItemAddVideo
        public final /* bridge */ /* synthetic */ getShowPopup RemoteActionCompatParcelizer(getShouldShowEmptyPlanScreen getshouldshowemptyplanscreen, StringBuilder sb) {
            RemoteActionCompatParcelizer2(getshouldshowemptyplanscreen, sb);
            return getShowPopup.INSTANCE;
        }

        @Override // kotlin.CourseConfigV2NavDrawerItemAddVideo
        public final /* synthetic */ getShowPopup read(CourseConfigV2SettingsItems courseConfigV2SettingsItems, StringBuilder sb) {
            IconCompatParcelizer(courseConfigV2SettingsItems, sb);
            return getShowPopup.INSTANCE;
        }

        @Override // kotlin.CourseConfigV2NavDrawerItemAddVideo
        public final /* synthetic */ getShowPopup read(getBadgeText getbadgetext, StringBuilder sb) {
            AudioAttributesCompatParcelizer(getbadgetext, sb);
            return getShowPopup.INSTANCE;
        }

        @Override // kotlin.CourseConfigV2NavDrawerItemAddVideo
        public final /* synthetic */ getShowPopup write(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, StringBuilder sb) {
            AudioAttributesCompatParcelizer(courseConfigV2CustomModuleQuestionSource, sb);
            return getShowPopup.INSTANCE;
        }

        @Override // kotlin.CourseConfigV2NavDrawerItemAddVideo
        public final /* synthetic */ getShowPopup write(CourseConfigV2TestItem courseConfigV2TestItem, StringBuilder sb) {
            RemoteActionCompatParcelizer(courseConfigV2TestItem, sb);
            return getShowPopup.INSTANCE;
        }

        @Override // kotlin.CourseConfigV2NavDrawerItemAddVideo
        public final /* synthetic */ getShowPopup write(getMeta getmeta, StringBuilder sb) {
            read(getmeta, sb);
            return getShowPopup.INSTANCE;
        }

        private void read(getMeta getmeta, StringBuilder sb) {
            toMagicModuleMetaRepoModel.write(getmeta, "");
            toMagicModuleMetaRepoModel.write(sb, "");
            isStarred.this.IconCompatParcelizer(getmeta, true, sb, true);
        }

        private void IconCompatParcelizer(CourseConfigV2SettingsItems courseConfigV2SettingsItems, StringBuilder sb) {
            toMagicModuleMetaRepoModel.write(courseConfigV2SettingsItems, "");
            toMagicModuleMetaRepoModel.write(sb, "");
            isStarred.this.RemoteActionCompatParcelizer(courseConfigV2SettingsItems, sb);
        }

        private void RemoteActionCompatParcelizer(CourseConfigV2TestItem courseConfigV2TestItem, StringBuilder sb) {
            toMagicModuleMetaRepoModel.write(courseConfigV2TestItem, "");
            toMagicModuleMetaRepoModel.write(sb, "");
            write(courseConfigV2TestItem, sb, "getter");
        }

        private void read(getAppSettings getappsettings, StringBuilder sb) {
            toMagicModuleMetaRepoModel.write(getappsettings, "");
            toMagicModuleMetaRepoModel.write(sb, "");
            write(getappsettings, sb, "setter");
        }

        private final void write(getAllSettings getallsettings, StringBuilder sb, String str) {
            int i = AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer[isStarred.this.AudioAttributesImplApi26Parcelizer().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                RemoteActionCompatParcelizer(getallsettings, sb);
                return;
            }
            isStarred.this.AudioAttributesCompatParcelizer(getallsettings, sb);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" for ");
            sb.append(sb2.toString());
            isStarred isstarred = isStarred.this;
            CourseConfigV2SettingsItems courseConfigV2SettingsItemsMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getallsettings.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2SettingsItemsMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, "");
            isstarred.RemoteActionCompatParcelizer(courseConfigV2SettingsItemsMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, sb);
        }

        private void RemoteActionCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, StringBuilder sb) {
            toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
            toMagicModuleMetaRepoModel.write(sb, "");
            isStarred.this.IconCompatParcelizer(courseConfigV2NavDrawerItemRateUs, sb);
        }

        private static void RemoteActionCompatParcelizer(CourseConfigV2TestTabItem courseConfigV2TestTabItem, StringBuilder sb) {
            toMagicModuleMetaRepoModel.write(courseConfigV2TestTabItem, "");
            toMagicModuleMetaRepoModel.write(sb, "");
            sb.append(courseConfigV2TestTabItem.aQ_());
        }

        private void AudioAttributesCompatParcelizer(CourseConfigV2GtAnalyticsCard courseConfigV2GtAnalyticsCard, StringBuilder sb) {
            toMagicModuleMetaRepoModel.write(courseConfigV2GtAnalyticsCard, "");
            toMagicModuleMetaRepoModel.write(sb, "");
            isStarred.this.read(courseConfigV2GtAnalyticsCard, sb);
        }

        private void AudioAttributesCompatParcelizer(getBadgeText getbadgetext, StringBuilder sb) {
            toMagicModuleMetaRepoModel.write(getbadgetext, "");
            toMagicModuleMetaRepoModel.write(sb, "");
            isStarred.this.write(getbadgetext, sb, true);
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: avoid collision after fix types in other method */
        private void RemoteActionCompatParcelizer2(getShouldShowEmptyPlanScreen getshouldshowemptyplanscreen, StringBuilder sb) {
            toMagicModuleMetaRepoModel.write(getshouldshowemptyplanscreen, "");
            toMagicModuleMetaRepoModel.write(sb, "");
            isStarred.this.write(getshouldshowemptyplanscreen, sb);
        }

        private void IconCompatParcelizer(CourseConfigV2SearchItem courseConfigV2SearchItem, StringBuilder sb) {
            toMagicModuleMetaRepoModel.write(courseConfigV2SearchItem, "");
            toMagicModuleMetaRepoModel.write(sb, "");
            isStarred.this.RemoteActionCompatParcelizer(courseConfigV2SearchItem, sb);
        }

        private void IconCompatParcelizer(getTopSection gettopsection, StringBuilder sb) {
            toMagicModuleMetaRepoModel.write(gettopsection, "");
            toMagicModuleMetaRepoModel.write(sb, "");
            isStarred.this.AudioAttributesCompatParcelizer((getVariant) gettopsection, sb, true);
        }

        private void AudioAttributesCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, StringBuilder sb) {
            toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
            toMagicModuleMetaRepoModel.write(sb, "");
            isStarred.this.read(courseConfigV2CustomModuleQuestionSource, sb);
        }

        private void write(CourseConfigV2VideoProperties courseConfigV2VideoProperties, StringBuilder sb) {
            toMagicModuleMetaRepoModel.write(courseConfigV2VideoProperties, "");
            toMagicModuleMetaRepoModel.write(sb, "");
            isStarred.this.read(courseConfigV2VideoProperties, sb);
        }
    }

    private static void read(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    private static boolean IconCompatParcelizer(getTestHeaderTitle gettestheadertitle) {
        return !gettestheadertitle.AudioAttributesImplApi26Parcelizer().isEmpty();
    }

    private boolean RatingCompat() {
        return this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer();
    }

    private boolean MediaMetadataCompat() {
        return this.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin.setFirstAnswer
    public final isFirstAnswerSkipped RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
    }

    private getAnswerMap<dummyEditor, Boolean> MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer();
    }

    private boolean MediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer();
    }

    private boolean MediaDescriptionCompat() {
        return this.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver();
    }

    private setFirstAnswerIndex MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaBrowserCompatItemReceiver.MediaBrowserCompatSearchResultReceiver();
    }

    @Override // kotlin.setFirstAnswer
    public final boolean IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
    }

    private getAnswerMap<getMeta, String> onCommand() {
        return this.MediaBrowserCompatItemReceiver.MediaMetadataCompat();
    }

    private boolean onAddQueueItem() {
        return this.MediaBrowserCompatItemReceiver.RatingCompat();
    }

    @Override // kotlin.setFirstAnswer
    public final boolean AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
    }

    private Set<getNotesCount> handleMediaPlayPauseIfPendingOnHandler() {
        return this.MediaBrowserCompatItemReceiver.MediaBrowserCompatMediaItem();
    }

    @Override // kotlin.setFirstAnswer
    public final Set<getNotesCount> write() {
        return this.MediaBrowserCompatItemReceiver.write();
    }

    private boolean onCustomAction() {
        return this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat();
    }

    private boolean onFastForward() {
        return this.MediaBrowserCompatItemReceiver.onAddQueueItem();
    }

    private boolean onPlay() {
        return this.MediaBrowserCompatItemReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    private boolean onMediaButtonEvent() {
        return this.MediaBrowserCompatItemReceiver.onCommand();
    }

    private boolean onPause() {
        return this.MediaBrowserCompatItemReceiver.handleMediaPlayPauseIfPendingOnHandler();
    }

    private Set<isSillyMistake> onPlayFromMediaId() {
        return this.MediaBrowserCompatItemReceiver.onCustomAction();
    }

    private boolean onPrepareFromMediaId() {
        return this.MediaBrowserCompatItemReceiver.onPlayFromMediaId();
    }

    private setSelectedAnswerIndex onPlayFromSearch() {
        return this.MediaBrowserCompatItemReceiver.onPause();
    }

    private setRight onPrepare() {
        return this.MediaBrowserCompatItemReceiver.onFastForward();
    }

    private boolean onPrepareFromSearch() {
        return this.MediaBrowserCompatItemReceiver.onPlay();
    }

    private boolean onPlayFromUri() {
        return this.MediaBrowserCompatItemReceiver.onMediaButtonEvent();
    }

    public final getRightAnswerIndex AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatItemReceiver.onPrepare();
    }

    private boolean onRemoveQueueItem() {
        return this.MediaBrowserCompatItemReceiver.onPlayFromUri();
    }

    private boolean onRewind() {
        return this.MediaBrowserCompatItemReceiver.onPrepareFromSearch();
    }

    private boolean onRemoveQueueItemAt() {
        return this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId();
    }

    private boolean onSeekTo() {
        return this.MediaBrowserCompatItemReceiver.onPlayFromSearch();
    }

    private boolean onPrepareFromUri() {
        return this.MediaBrowserCompatItemReceiver.onPrepareFromUri();
    }

    private boolean onSetRating() {
        return this.MediaBrowserCompatItemReceiver.onRemoveQueueItem();
    }

    private boolean onSetPlaybackSpeed() {
        return this.MediaBrowserCompatItemReceiver.onRewind();
    }

    private boolean onSetRepeatMode() {
        return this.MediaBrowserCompatItemReceiver.onRemoveQueueItemAt();
    }

    private boolean onSetShuffleMode() {
        return this.MediaBrowserCompatItemReceiver.onSeekTo();
    }

    private boolean onSetCaptioningEnabled() {
        return this.MediaBrowserCompatItemReceiver.onSetPlaybackSpeed();
    }

    private boolean onStop() {
        return this.MediaBrowserCompatItemReceiver.onSetCaptioningEnabled();
    }

    private boolean onSkipToQueueItem() {
        return this.MediaBrowserCompatItemReceiver.onSetRating();
    }

    private boolean setSessionImpl() {
        return this.MediaBrowserCompatItemReceiver.onSetShuffleMode();
    }

    private McqAnswerIndexModel onSkipToNext() {
        return this.MediaBrowserCompatItemReceiver.onSetRepeatMode();
    }

    private getAnswerMap<getLink, getLink> onSkipToPrevious() {
        return this.MediaBrowserCompatItemReceiver.onSkipToNext();
    }

    private boolean MediaSessionCompatToken() {
        return this.MediaBrowserCompatItemReceiver.onStop();
    }

    private boolean MediaSessionCompatResultReceiverWrapper() {
        return this.MediaBrowserCompatItemReceiver.onSkipToPrevious();
    }

    private setGuessed.MediaMetadataCompat MediaSessionCompatQueueItem() {
        return this.MediaBrowserCompatItemReceiver.onSkipToQueueItem();
    }

    private boolean PlaybackStateCompat() {
        return this.MediaBrowserCompatItemReceiver.setSessionImpl();
    }

    private boolean ParcelableVolumeInfo() {
        return this.MediaBrowserCompatItemReceiver.ParcelableVolumeInfo();
    }

    private boolean r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw() {
        return this.MediaBrowserCompatItemReceiver.PlaybackStateCompat();
    }

    private boolean r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() {
        return this.MediaBrowserCompatItemReceiver.MediaSessionCompatToken();
    }

    private boolean ResultReceiver() {
        return this.MediaBrowserCompatItemReceiver.MediaSessionCompatResultReceiverWrapper();
    }

    private boolean r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        return this.MediaBrowserCompatItemReceiver.MediaSessionCompatQueueItem();
    }

    @Override // kotlin.setFirstAnswer
    public final void read(isFirstAnswerSkipped isfirstanswerskipped) {
        toMagicModuleMetaRepoModel.write(isfirstanswerskipped, "");
        this.MediaBrowserCompatItemReceiver.read(isfirstanswerskipped);
    }

    @Override // kotlin.setFirstAnswer
    public final void AudioAttributesCompatParcelizer(setFirstAnswerIndex setfirstanswerindex) {
        toMagicModuleMetaRepoModel.write(setfirstanswerindex, "");
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(setfirstanswerindex);
    }

    @Override // kotlin.setFirstAnswer
    public final void IconCompatParcelizer(boolean z) {
        this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(z);
    }

    @Override // kotlin.setFirstAnswer
    public final void read(Set<getNotesCount> set) {
        toMagicModuleMetaRepoModel.write(set, "");
        this.MediaBrowserCompatItemReceiver.read(set);
    }

    @Override // kotlin.setFirstAnswer
    public final void RemoteActionCompatParcelizer(Set<? extends isSillyMistake> set) {
        toMagicModuleMetaRepoModel.write(set, "");
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(set);
    }

    @Override // kotlin.setFirstAnswer
    public final void IconCompatParcelizer(setRight setright) {
        toMagicModuleMetaRepoModel.write(setright, "");
        this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(setright);
    }

    @Override // kotlin.setFirstAnswer
    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(z);
    }

    @Override // kotlin.setFirstAnswer
    public final void RemoteActionCompatParcelizer(boolean z) {
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(z);
    }

    @Override // kotlin.setFirstAnswer
    public final void read(boolean z) {
        this.MediaBrowserCompatItemReceiver.read(z);
    }

    @Override // kotlin.setFirstAnswer
    public final void write(McqAnswerIndexModel mcqAnswerIndexModel) {
        toMagicModuleMetaRepoModel.write(mcqAnswerIndexModel, "");
        this.MediaBrowserCompatItemReceiver.write(mcqAnswerIndexModel);
    }

    @Override // kotlin.setFirstAnswer
    public final void write(boolean z) {
        this.MediaBrowserCompatItemReceiver.write(z);
    }

    @Override // kotlin.setFirstAnswer
    public final void AudioAttributesImplBaseParcelizer(boolean z) {
        this.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer(z);
    }

    @Override // kotlin.setFirstAnswer
    public final void AudioAttributesImplApi26Parcelizer(boolean z) {
        this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer(z);
    }

    @Override // kotlin.setFirstAnswer
    public final void AudioAttributesImplApi21Parcelizer(boolean z) {
        this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer(z);
    }
}
