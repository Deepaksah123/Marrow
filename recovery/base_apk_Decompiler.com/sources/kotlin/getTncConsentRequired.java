package kotlin;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class getTncConsentRequired {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class IconCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<Throwable, getShowPopup> {
        public final void AudioAttributesCompatParcelizer(Throwable th) {
            ((getDefaultCourseEdition) this.AudioAttributesImplApi26Parcelizer).write(th);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Throwable th) {
            AudioAttributesCompatParcelizer(th);
            return getShowPopup.INSTANCE;
        }

        IconCompatParcelizer(Object obj) {
            super(1, obj, getDefaultCourseEdition.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }
    }

    public static final setYearOfPassout AudioAttributesCompatParcelizer(setPassingYear setpassingyear, boolean z, getDefaultCourseEdition getdefaultcourseedition) {
        return setpassingyear instanceof getTncConsentDate ? ((getTncConsentDate) setpassingyear).RemoteActionCompatParcelizer(z, getdefaultcourseedition) : setpassingyear.AudioAttributesCompatParcelizer(getdefaultcourseedition.IconCompatParcelizer(), z, new IconCompatParcelizer(getdefaultcourseedition));
    }

    public static final isMockTest read(setPassingYear setpassingyear) {
        return new LoggedUser(setpassingyear);
    }

    public static final setYearOfPassout write(setPassingYear setpassingyear, setYearOfPassout setyearofpassout) {
        return getUserConfig.write(setpassingyear, new Country(setyearofpassout));
    }

    public static final Object IconCompatParcelizer(setPassingYear setpassingyear, SampleVideos<? super getShowPopup> sampleVideos) {
        setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
        Object objA_ = setpassingyear.a_(sampleVideos);
        return objA_ == getYear.IconCompatParcelizer() ? objA_ : getShowPopup.INSTANCE;
    }

    public static final boolean read(CurrentQuery currentQuery) {
        setPassingYear setpassingyear = (setPassingYear) currentQuery.get(setPassingYear.b_);
        if (setpassingyear != null) {
            return setpassingyear.read();
        }
        return true;
    }

    public static final void AudioAttributesCompatParcelizer(CurrentQuery currentQuery, CancellationException cancellationException) {
        setPassingYear setpassingyear = (setPassingYear) currentQuery.get(setPassingYear.b_);
        if (setpassingyear != null) {
            setpassingyear.RemoteActionCompatParcelizer(cancellationException);
        }
    }

    public static final void RemoteActionCompatParcelizer(setPassingYear setpassingyear) {
        if (!setpassingyear.read()) {
            throw setpassingyear.MediaBrowserCompatItemReceiver();
        }
    }

    public static final void write(CurrentQuery currentQuery) {
        setPassingYear setpassingyear = (setPassingYear) currentQuery.get(setPassingYear.b_);
        if (setpassingyear != null) {
            getUserConfig.read(setpassingyear);
        }
    }

    public static final void IconCompatParcelizer(setPassingYear setpassingyear, String str, Throwable th) {
        setpassingyear.RemoteActionCompatParcelizer(getJSONArray.AudioAttributesCompatParcelizer(str, th));
    }

    public static final void RemoteActionCompatParcelizer(CurrentQuery currentQuery, CancellationException cancellationException) {
        getTopRankers<setPassingYear> gettoprankersBk_;
        setPassingYear setpassingyear = (setPassingYear) currentQuery.get(setPassingYear.b_);
        if (setpassingyear == null || (gettoprankersBk_ = setpassingyear.bk_()) == null) {
            return;
        }
        Iterator<setPassingYear> itWrite = gettoprankersBk_.write();
        while (itWrite.hasNext()) {
            itWrite.next().RemoteActionCompatParcelizer(cancellationException);
        }
    }

    public static final setPassingYear IconCompatParcelizer(CurrentQuery currentQuery) {
        setPassingYear setpassingyear = (setPassingYear) currentQuery.get(setPassingYear.b_);
        if (setpassingyear != null) {
            return setpassingyear;
        }
        throw new IllegalStateException("Current context doesn't contain Job in it: ".concat(String.valueOf(currentQuery)).toString());
    }
}
