package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class RtpPayloadReader {
    /* JADX WARN: Removed duplicated region for block: B:100:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0303  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void IconCompatParcelizer(final java.lang.String r31, boolean r32, final kotlin.getAnswerMap<? super java.lang.String, kotlin.getShowPopup> r33, kotlin._handleUnrecognizedCharacterEscape r34, final int r35, final int r36) {
        /*
            Method dump skipped, instruction units count: 803
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.RtpPayloadReader.IconCompatParcelizer(java.lang.String, boolean, o.getAnswerMap, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    private static final String AudioAttributesCompatParcelizer(InputAccessor<String> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(onSetRating onsetrating) {
        if (onsetrating != null) {
            onsetrating.RemoteActionCompatParcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(boolean z, getAnswerMap getanswermap, InputAccessor inputAccessor, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        read((InputAccessor<String>) inputAccessor, str);
        if (z) {
            getanswermap.invoke(str);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getAnswerMap getanswermap, InputAccessor inputAccessor) {
        getanswermap.invoke(AudioAttributesCompatParcelizer(inputAccessor));
        return getShowPopup.INSTANCE;
    }

    private static final void read(InputAccessor<String> inputAccessor, String str) {
        inputAccessor.write(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str, boolean z, getAnswerMap getanswermap, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer(str, z, getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
