package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.CourseConfigV2VideoSubjectPageItem;

/* JADX INFO: loaded from: classes4.dex */
public final class getWrongCount extends AbstractC0174getFilename {
    private boolean AudioAttributesCompatParcelizer;
    private final List<getLink> IconCompatParcelizer;
    private final getAnswerMap<getLink, Void> write;

    public static getBadgeText IconCompatParcelizer(getVariant getvariant, getQuote getquote, getTotalSubject gettotalsubject, getRelatedLessonId getrelatedlessonid, int i, getMini getmini) {
        if (getvariant == null) {
            AudioAttributesCompatParcelizer(0);
        }
        if (getquote == null) {
            AudioAttributesCompatParcelizer(1);
        }
        if (gettotalsubject == null) {
            AudioAttributesCompatParcelizer(2);
        }
        if (getrelatedlessonid == null) {
            AudioAttributesCompatParcelizer(3);
        }
        if (getmini == null) {
            AudioAttributesCompatParcelizer(4);
        }
        getWrongCount getwrongcountIconCompatParcelizer = IconCompatParcelizer(getvariant, getquote, false, gettotalsubject, getrelatedlessonid, i, getIntroDurationSeconds.AudioAttributesCompatParcelizer, getmini);
        getwrongcountIconCompatParcelizer.AudioAttributesCompatParcelizer(setLocked.AudioAttributesCompatParcelizer(getvariant).RatingCompat());
        getwrongcountIconCompatParcelizer.onCommand();
        if (getwrongcountIconCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(5);
        }
        return getwrongcountIconCompatParcelizer;
    }

    public static getWrongCount IconCompatParcelizer(getVariant getvariant, getQuote getquote, boolean z, getTotalSubject gettotalsubject, getRelatedLessonId getrelatedlessonid, int i, getIntroDurationSeconds getintrodurationseconds, getMini getmini) {
        if (getvariant == null) {
            AudioAttributesCompatParcelizer(6);
        }
        if (getquote == null) {
            AudioAttributesCompatParcelizer(7);
        }
        if (gettotalsubject == null) {
            AudioAttributesCompatParcelizer(8);
        }
        if (getrelatedlessonid == null) {
            AudioAttributesCompatParcelizer(9);
        }
        if (getintrodurationseconds == null) {
            AudioAttributesCompatParcelizer(10);
        }
        if (getmini == null) {
            AudioAttributesCompatParcelizer(11);
        }
        return IconCompatParcelizer(getvariant, getquote, z, gettotalsubject, getrelatedlessonid, i, getintrodurationseconds, CourseConfigV2VideoSubjectPageItem.read.read, getmini);
    }

    private static getWrongCount IconCompatParcelizer(getVariant getvariant, getQuote getquote, boolean z, getTotalSubject gettotalsubject, getRelatedLessonId getrelatedlessonid, int i, getIntroDurationSeconds getintrodurationseconds, CourseConfigV2VideoSubjectPageItem courseConfigV2VideoSubjectPageItem, getMini getmini) {
        if (getvariant == null) {
            AudioAttributesCompatParcelizer(12);
        }
        if (getquote == null) {
            AudioAttributesCompatParcelizer(13);
        }
        if (gettotalsubject == null) {
            AudioAttributesCompatParcelizer(14);
        }
        if (getrelatedlessonid == null) {
            AudioAttributesCompatParcelizer(15);
        }
        if (getintrodurationseconds == null) {
            AudioAttributesCompatParcelizer(16);
        }
        if (courseConfigV2VideoSubjectPageItem == null) {
            AudioAttributesCompatParcelizer(17);
        }
        if (getmini == null) {
            AudioAttributesCompatParcelizer(18);
        }
        return new getWrongCount(getvariant, getquote, z, gettotalsubject, getrelatedlessonid, i, getintrodurationseconds, null, courseConfigV2VideoSubjectPageItem, getmini);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private getWrongCount(getVariant getvariant, getQuote getquote, boolean z, getTotalSubject gettotalsubject, getRelatedLessonId getrelatedlessonid, int i, getIntroDurationSeconds getintrodurationseconds, getAnswerMap<getLink, Void> getanswermap, CourseConfigV2VideoSubjectPageItem courseConfigV2VideoSubjectPageItem, getMini getmini) {
        super(getmini, getvariant, getquote, getrelatedlessonid, gettotalsubject, z, i, getintrodurationseconds, courseConfigV2VideoSubjectPageItem);
        if (getvariant == null) {
            AudioAttributesCompatParcelizer(19);
        }
        if (getquote == null) {
            AudioAttributesCompatParcelizer(20);
        }
        if (gettotalsubject == null) {
            AudioAttributesCompatParcelizer(21);
        }
        if (getrelatedlessonid == null) {
            AudioAttributesCompatParcelizer(22);
        }
        if (getintrodurationseconds == null) {
            AudioAttributesCompatParcelizer(23);
        }
        if (courseConfigV2VideoSubjectPageItem == null) {
            AudioAttributesCompatParcelizer(24);
        }
        if (getmini == null) {
            AudioAttributesCompatParcelizer(25);
        }
        this.IconCompatParcelizer = new ArrayList(1);
        this.AudioAttributesCompatParcelizer = false;
        this.write = null;
    }

    private void handleMediaPlayPauseIfPendingOnHandler() {
        if (this.AudioAttributesCompatParcelizer) {
            return;
        }
        StringBuilder sb = new StringBuilder("Type parameter descriptor is not initialized: ");
        sb.append(onMediaButtonEvent());
        throw new IllegalStateException(sb.toString());
    }

    private void onCustomAction() {
        if (this.AudioAttributesCompatParcelizer) {
            StringBuilder sb = new StringBuilder("Type parameter descriptor is already initialized: ");
            sb.append(onMediaButtonEvent());
            throw new IllegalStateException(sb.toString());
        }
    }

    private String onMediaButtonEvent() {
        StringBuilder sb = new StringBuilder();
        sb.append(aQ_());
        sb.append(" declared in ");
        sb.append(getAnswerDescription.RemoteActionCompatParcelizer(onPlayFromMediaId()));
        return sb.toString();
    }

    public final void onCommand() {
        onCustomAction();
        this.AudioAttributesCompatParcelizer = true;
    }

    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(26);
        }
        onCustomAction();
        IconCompatParcelizer(getlink);
    }

    private void IconCompatParcelizer(getLink getlink) {
        if (Copy.write(getlink)) {
            return;
        }
        this.IconCompatParcelizer.add(getlink);
    }

    @Override // kotlin.AbstractC0174getFilename
    protected final void RemoteActionCompatParcelizer(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(27);
        }
        getAnswerMap<getLink, Void> getanswermap = this.write;
        if (getanswermap == null) {
            return;
        }
        getanswermap.invoke(getlink);
    }

    @Override // kotlin.AbstractC0174getFilename
    protected final List<getLink> onAddQueueItem() {
        handleMediaPlayPauseIfPendingOnHandler();
        List<getLink> list = this.IconCompatParcelizer;
        if (list == null) {
            AudioAttributesCompatParcelizer(28);
        }
        return list;
    }

    private static /* synthetic */ void AudioAttributesCompatParcelizer(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }
}
