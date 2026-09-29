package kotlin;

import kotlin.fromCursor;

/* JADX INFO: loaded from: classes4.dex */
public final class getLastName {
    public static /* synthetic */ fromCursor read(int i, setAddressLine2 setaddressline2, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            setaddressline2 = setAddressLine2.read;
        }
        return IconCompatParcelizer(i, setaddressline2, null);
    }

    private static <E> fromCursor<E> IconCompatParcelizer(int i, setAddressLine2 setaddressline2, getAnswerMap<? super E, getShowPopup> getanswermap) {
        setFirstName setfirstname;
        setFirstName setfirstname2;
        if (i == -2) {
            if (setaddressline2 == setAddressLine2.read) {
                fromCursor.Companion readVar = fromCursor.INSTANCE;
                setfirstname = new setAddressLine3<>(fromCursor.Companion.write(), null);
            } else {
                setfirstname = new setFirstName(1, setaddressline2, null);
            }
            return setfirstname;
        }
        if (i == -1) {
            if (setaddressline2 != setAddressLine2.read) {
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            return new setFirstName(1, setAddressLine2.AudioAttributesCompatParcelizer, null);
        }
        if (i != 0) {
            if (i == Integer.MAX_VALUE) {
                return new setAddressLine3(Integer.MAX_VALUE, null);
            }
            return setaddressline2 == setAddressLine2.read ? new setAddressLine3<>(i, null) : new setFirstName(i, setaddressline2, null);
        }
        if (setaddressline2 == setAddressLine2.read) {
            setfirstname2 = new setAddressLine3<>(0, null);
        } else {
            setfirstname2 = new setFirstName(1, setaddressline2, null);
        }
        return setfirstname2;
    }
}
