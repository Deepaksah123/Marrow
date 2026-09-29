package kotlin;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.getPlanType;

/* JADX INFO: loaded from: classes4.dex */
public final class getPearlType {
    public static final getPearlType IconCompatParcelizer = new getPearlType();
    public static boolean write;

    public final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[getItemTitle.values().length];
            try {
                iArr[getItemTitle.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getItemTitle.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getItemTitle.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            write = iArr;
            int[] iArr2 = new int[getPlanType.IconCompatParcelizer.values().length];
            try {
                iArr2[getPlanType.IconCompatParcelizer.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[getPlanType.IconCompatParcelizer.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[getPlanType.IconCompatParcelizer.SKIP_LOWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            IconCompatParcelizer = iArr2;
        }
    }

    private getPearlType() {
    }

    public static /* synthetic */ boolean write(getPearlType getpearltype, getPlanType getplantype, Preference preference, Preference preference2) {
        return write(getplantype, preference, preference2, false);
    }

    private static boolean write(getPlanType getplantype, Preference preference, Preference preference2, boolean z) {
        toMagicModuleMetaRepoModel.write(getplantype, "");
        toMagicModuleMetaRepoModel.write(preference, "");
        toMagicModuleMetaRepoModel.write(preference2, "");
        if (preference == preference2) {
            return true;
        }
        if (getplantype.read(preference, preference2)) {
            return RemoteActionCompatParcelizer(getplantype, preference, preference2);
        }
        return false;
    }

    public static boolean AudioAttributesCompatParcelizer(getPlanType getplantype, Preference preference, Preference preference2) {
        toMagicModuleMetaRepoModel.write(getplantype, "");
        toMagicModuleMetaRepoModel.write(preference, "");
        toMagicModuleMetaRepoModel.write(preference2, "");
        getFilterText getfiltertextWrite = getplantype.write();
        if (preference == preference2) {
            return true;
        }
        getPearlType getpearltype = IconCompatParcelizer;
        if (IconCompatParcelizer(getfiltertextWrite, preference) && IconCompatParcelizer(getfiltertextWrite, preference2)) {
            Preference preferenceWrite = getplantype.write(getplantype.IconCompatParcelizer(preference));
            Preference preferenceWrite2 = getplantype.write(getplantype.IconCompatParcelizer(preference2));
            TaxPercentInfoCompanion taxPercentInfoCompanionOnAddQueueItem = getfiltertextWrite.onAddQueueItem(preferenceWrite);
            if (!getfiltertextWrite.AudioAttributesCompatParcelizer(getfiltertextWrite.onCustomAction(preferenceWrite), getfiltertextWrite.onCustomAction(preferenceWrite2))) {
                return false;
            }
            if (getfiltertextWrite.IconCompatParcelizer((Preference) taxPercentInfoCompanionOnAddQueueItem) == 0) {
                return getfiltertextWrite.MediaBrowserCompatItemReceiver(preferenceWrite) || getfiltertextWrite.MediaBrowserCompatItemReceiver(preferenceWrite2) || getfiltertextWrite.MediaBrowserCompatItemReceiver(taxPercentInfoCompanionOnAddQueueItem) == getfiltertextWrite.MediaBrowserCompatItemReceiver(getfiltertextWrite.onAddQueueItem(preferenceWrite2));
            }
        }
        return write(getpearltype, getplantype, preference, preference2) && write(getpearltype, getplantype, preference2, preference);
    }

    private static boolean RemoteActionCompatParcelizer(getPlanType getplantype, Preference preference, Preference preference2) {
        getFilterText getfiltertextWrite = getplantype.write();
        Preference preferenceWrite = getplantype.write(getplantype.IconCompatParcelizer(preference));
        Preference preferenceWrite2 = getplantype.write(getplantype.IconCompatParcelizer(preference2));
        Boolean boolIconCompatParcelizer = IconCompatParcelizer(getplantype, getfiltertextWrite.onAddQueueItem(preferenceWrite), getfiltertextWrite.handleMediaPlayPauseIfPendingOnHandler(preferenceWrite2));
        if (boolIconCompatParcelizer != null) {
            boolean zBooleanValue = boolIconCompatParcelizer.booleanValue();
            getPlanType.RemoteActionCompatParcelizer(preferenceWrite, preferenceWrite2);
            return zBooleanValue;
        }
        getPlanType.RemoteActionCompatParcelizer(preferenceWrite, preferenceWrite2);
        return RemoteActionCompatParcelizer(getplantype, getfiltertextWrite.onAddQueueItem(preferenceWrite), getfiltertextWrite.handleMediaPlayPauseIfPendingOnHandler(preferenceWrite2));
    }

    private static Boolean write(getPlanType getplantype, TaxPercentInfoCompanion taxPercentInfoCompanion, TaxPercentInfoCompanion taxPercentInfoCompanion2) {
        getFilterText getfiltertextWrite = getplantype.write();
        if (!getfiltertextWrite.read(taxPercentInfoCompanion) && !getfiltertextWrite.read(taxPercentInfoCompanion2)) {
            return null;
        }
        if (AudioAttributesCompatParcelizer(getfiltertextWrite, taxPercentInfoCompanion) && AudioAttributesCompatParcelizer(getfiltertextWrite, taxPercentInfoCompanion2)) {
            return Boolean.TRUE;
        }
        if (getfiltertextWrite.read(taxPercentInfoCompanion)) {
            if (AudioAttributesCompatParcelizer(getfiltertextWrite, getplantype, taxPercentInfoCompanion, taxPercentInfoCompanion2, false)) {
                return Boolean.TRUE;
            }
        } else if (getfiltertextWrite.read(taxPercentInfoCompanion2) && (read(getfiltertextWrite, taxPercentInfoCompanion) || AudioAttributesCompatParcelizer(getfiltertextWrite, getplantype, taxPercentInfoCompanion2, taxPercentInfoCompanion, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    private static final boolean AudioAttributesCompatParcelizer(getFilterText getfiltertext, getPlanType getplantype, TaxPercentInfoCompanion taxPercentInfoCompanion, TaxPercentInfoCompanion taxPercentInfoCompanion2, boolean z) {
        Collection<Preference> collectionRatingCompat = getfiltertext.RatingCompat(taxPercentInfoCompanion);
        if ((collectionRatingCompat instanceof Collection) && collectionRatingCompat.isEmpty()) {
            return false;
        }
        for (Preference preference : collectionRatingCompat) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getfiltertext.onCustomAction(preference), getfiltertext.MediaBrowserCompatMediaItem(taxPercentInfoCompanion2))) {
                return true;
            }
            if (z && write(IconCompatParcelizer, getplantype, taxPercentInfoCompanion2, preference)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean read(getFilterText getfiltertext, TaxPercentInfoCompanion taxPercentInfoCompanion) {
        isPermanent ispermanentMediaBrowserCompatMediaItem = getfiltertext.MediaBrowserCompatMediaItem(taxPercentInfoCompanion);
        if (!(ispermanentMediaBrowserCompatMediaItem instanceof newPair)) {
            return false;
        }
        Collection<Preference> collectionOnCommand = getfiltertext.onCommand(ispermanentMediaBrowserCompatMediaItem);
        if ((collectionOnCommand instanceof Collection) && collectionOnCommand.isEmpty()) {
            return false;
        }
        Iterator<T> it = collectionOnCommand.iterator();
        while (it.hasNext()) {
            TaxPercentInfoCompanion taxPercentInfoCompanion2 = getfiltertext.read((Preference) it.next());
            if (taxPercentInfoCompanion2 != null && getfiltertext.read(taxPercentInfoCompanion2)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean IconCompatParcelizer(getFilterText getfiltertext, TaxPercentInfoCompanion taxPercentInfoCompanion) {
        if (!(taxPercentInfoCompanion instanceof getCgstPercentInfo)) {
            return false;
        }
        setPermanent setpermanentWrite = getfiltertext.write(getfiltertext.IconCompatParcelizer((getCgstPercentInfo) taxPercentInfoCompanion));
        return !getfiltertext.write(setpermanentWrite) && getfiltertext.read(getfiltertext.handleMediaPlayPauseIfPendingOnHandler(getfiltertext.IconCompatParcelizer(setpermanentWrite)));
    }

    private static final boolean AudioAttributesCompatParcelizer(getFilterText getfiltertext, TaxPercentInfoCompanion taxPercentInfoCompanion) {
        return getfiltertext.read(taxPercentInfoCompanion) || IconCompatParcelizer(getfiltertext, taxPercentInfoCompanion);
    }

    private static boolean AudioAttributesCompatParcelizer(getPlanType getplantype, TaxPercentInfoCompanion taxPercentInfoCompanion) {
        getPlanType.AudioAttributesCompatParcelizer.write writeVar;
        getFilterText getfiltertextWrite = getplantype.write();
        isPermanent ispermanentMediaBrowserCompatMediaItem = getfiltertextWrite.MediaBrowserCompatMediaItem(taxPercentInfoCompanion);
        if (getfiltertextWrite.AudioAttributesImplBaseParcelizer(ispermanentMediaBrowserCompatMediaItem)) {
            return getfiltertextWrite.MediaBrowserCompatSearchResultReceiver(ispermanentMediaBrowserCompatMediaItem);
        }
        if (getfiltertextWrite.MediaBrowserCompatSearchResultReceiver(getfiltertextWrite.MediaBrowserCompatMediaItem(taxPercentInfoCompanion))) {
            return true;
        }
        getplantype.IconCompatParcelizer();
        ArrayDeque<TaxPercentInfoCompanion> arrayDequeRemoteActionCompatParcelizer = getplantype.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.write(arrayDequeRemoteActionCompatParcelizer);
        Set<TaxPercentInfoCompanion> set = getplantype.read();
        toMagicModuleMetaRepoModel.write(set);
        arrayDequeRemoteActionCompatParcelizer.push(taxPercentInfoCompanion);
        while (!arrayDequeRemoteActionCompatParcelizer.isEmpty()) {
            if (set.size() > 1000) {
                StringBuilder sb = new StringBuilder("Too many supertypes for type: ");
                sb.append(taxPercentInfoCompanion);
                sb.append(". Supertypes = ");
                sb.append(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(set, null, null, null, 0, null, null, 63));
                throw new IllegalStateException(sb.toString().toString());
            }
            TaxPercentInfoCompanion taxPercentInfoCompanionPop = arrayDequeRemoteActionCompatParcelizer.pop();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(taxPercentInfoCompanionPop, "");
            if (set.add(taxPercentInfoCompanionPop)) {
                if (getfiltertextWrite.write(taxPercentInfoCompanionPop)) {
                    writeVar = getPlanType.AudioAttributesCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer;
                } else {
                    writeVar = getPlanType.AudioAttributesCompatParcelizer.write.IconCompatParcelizer;
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeVar, getPlanType.AudioAttributesCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer)) {
                    writeVar = null;
                }
                if (writeVar != null) {
                    getFilterText getfiltertextWrite2 = getplantype.write();
                    Iterator<Preference> it = getfiltertextWrite2.onCommand(getfiltertextWrite2.MediaBrowserCompatMediaItem(taxPercentInfoCompanionPop)).iterator();
                    while (it.hasNext()) {
                        TaxPercentInfoCompanion taxPercentInfoCompanionRemoteActionCompatParcelizer = writeVar.RemoteActionCompatParcelizer(getplantype, it.next());
                        if (getfiltertextWrite.MediaBrowserCompatSearchResultReceiver(getfiltertextWrite.MediaBrowserCompatMediaItem(taxPercentInfoCompanionRemoteActionCompatParcelizer))) {
                            getplantype.AudioAttributesCompatParcelizer();
                            return true;
                        }
                        arrayDequeRemoteActionCompatParcelizer.add(taxPercentInfoCompanionRemoteActionCompatParcelizer);
                    }
                } else {
                    continue;
                }
            }
        }
        getplantype.AudioAttributesCompatParcelizer();
        return false;
    }

    private static boolean RemoteActionCompatParcelizer(getPlanType getplantype, TaxPercentInfoCompanion taxPercentInfoCompanion, TaxPercentInfoCompanion taxPercentInfoCompanion2) {
        Preference preferenceIconCompatParcelizer;
        getFilterText getfiltertextWrite = getplantype.write();
        isDoNotConsider isdonotconsider = isDoNotConsider.write;
        boolean z = false;
        if (!isDoNotConsider.write(getplantype, taxPercentInfoCompanion, taxPercentInfoCompanion2)) {
            return false;
        }
        TaxPercentInfoCompanion taxPercentInfoCompanion3 = taxPercentInfoCompanion;
        TaxPercentInfoCompanion taxPercentInfoCompanion4 = taxPercentInfoCompanion2;
        Boolean boolWrite = write(getplantype, getfiltertextWrite.onAddQueueItem(taxPercentInfoCompanion3), getfiltertextWrite.handleMediaPlayPauseIfPendingOnHandler(taxPercentInfoCompanion4));
        if (boolWrite != null) {
            boolean zBooleanValue = boolWrite.booleanValue();
            getPlanType.RemoteActionCompatParcelizer(taxPercentInfoCompanion3, taxPercentInfoCompanion4);
            return zBooleanValue;
        }
        isPermanent ispermanentMediaBrowserCompatMediaItem = getfiltertextWrite.MediaBrowserCompatMediaItem(taxPercentInfoCompanion2);
        boolean z2 = true;
        if ((getfiltertextWrite.AudioAttributesCompatParcelizer(getfiltertextWrite.MediaBrowserCompatMediaItem(taxPercentInfoCompanion), ispermanentMediaBrowserCompatMediaItem) && getfiltertextWrite.MediaBrowserCompatMediaItem(ispermanentMediaBrowserCompatMediaItem) == 0) || getfiltertextWrite.MediaBrowserCompatCustomActionResultReceiver(getfiltertextWrite.MediaBrowserCompatMediaItem(taxPercentInfoCompanion2))) {
            return true;
        }
        List<TaxPercentInfoCompanion> listWrite = write(getplantype, taxPercentInfoCompanion, ispermanentMediaBrowserCompatMediaItem);
        int i = 10;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listWrite, 10));
        for (TaxPercentInfoCompanion taxPercentInfoCompanion5 : listWrite) {
            TaxPercentInfoCompanion taxPercentInfoCompanion6 = getfiltertextWrite.read(getplantype.write(taxPercentInfoCompanion5));
            if (taxPercentInfoCompanion6 != null) {
                taxPercentInfoCompanion5 = taxPercentInfoCompanion6;
            }
            arrayList.add(taxPercentInfoCompanion5);
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        if (size == 0) {
            return AudioAttributesCompatParcelizer(getplantype, taxPercentInfoCompanion);
        }
        if (size == 1) {
            return read(getplantype, getfiltertextWrite.IconCompatParcelizer((TaxPercentInfoCompanion) IntermediateLoginResponseBody.RatingCompat((List) arrayList2)), taxPercentInfoCompanion2);
        }
        setExpiresOn setexpireson = new setExpiresOn(getfiltertextWrite.MediaBrowserCompatMediaItem(ispermanentMediaBrowserCompatMediaItem));
        int iMediaBrowserCompatMediaItem = getfiltertextWrite.MediaBrowserCompatMediaItem(ispermanentMediaBrowserCompatMediaItem);
        int i2 = 0;
        boolean z3 = false;
        while (i2 < iMediaBrowserCompatMediaItem) {
            z3 = (z3 || getfiltertextWrite.write(getfiltertextWrite.write(ispermanentMediaBrowserCompatMediaItem, i2)) != getItemTitle.OUT) ? z2 : z;
            if (!z3) {
                ArrayList<TaxPercentInfoCompanion> arrayList3 = arrayList2;
                ArrayList arrayList4 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList3, i));
                for (TaxPercentInfoCompanion taxPercentInfoCompanion7 : arrayList3) {
                    setPermanent setpermanentRemoteActionCompatParcelizer = getfiltertextWrite.RemoteActionCompatParcelizer(taxPercentInfoCompanion7, i2);
                    if (setpermanentRemoteActionCompatParcelizer != null) {
                        if (getfiltertextWrite.RemoteActionCompatParcelizer(setpermanentRemoteActionCompatParcelizer) != getItemTitle.INV) {
                            setpermanentRemoteActionCompatParcelizer = null;
                        }
                        if (setpermanentRemoteActionCompatParcelizer != null && (preferenceIconCompatParcelizer = getfiltertextWrite.IconCompatParcelizer(setpermanentRemoteActionCompatParcelizer)) != null) {
                            arrayList4.add(preferenceIconCompatParcelizer);
                        }
                    }
                    StringBuilder sb = new StringBuilder("Incorrect type: ");
                    sb.append(taxPercentInfoCompanion7);
                    sb.append(", subType: ");
                    sb.append(taxPercentInfoCompanion);
                    sb.append(", superType: ");
                    sb.append(taxPercentInfoCompanion2);
                    throw new IllegalStateException(sb.toString().toString());
                }
                setexpireson.add(getfiltertextWrite.RemoteActionCompatParcelizer(getfiltertextWrite.RemoteActionCompatParcelizer(arrayList4)));
            }
            i2++;
            z = false;
            z2 = true;
            i = 10;
        }
        if (z3 || !read(getplantype, setexpireson, taxPercentInfoCompanion2)) {
            return getPlanType.write(new AudioAttributesCompatParcelizer(arrayList2, getplantype, getfiltertextWrite, taxPercentInfoCompanion2));
        }
        return true;
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getPlanType.read, getShowPopup> {
        private /* synthetic */ TaxPercentInfoCompanion AudioAttributesCompatParcelizer;
        private /* synthetic */ getFilterText IconCompatParcelizer;
        private /* synthetic */ List<TaxPercentInfoCompanion> read;
        private /* synthetic */ getPlanType write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(getPlanType.read readVar) {
            AudioAttributesCompatParcelizer(readVar);
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: renamed from: o.getPearlType$AudioAttributesCompatParcelizer$4, reason: invalid class name */
        static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<Boolean> {
            private /* synthetic */ getFilterText AudioAttributesCompatParcelizer;
            private /* synthetic */ getPlanType IconCompatParcelizer;
            private /* synthetic */ TaxPercentInfoCompanion read;
            private /* synthetic */ TaxPercentInfoCompanion write;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Boolean invoke() {
                getPearlType getpearltype = getPearlType.IconCompatParcelizer;
                return Boolean.valueOf(getPearlType.read(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.write), this.read));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(getPlanType getplantype, getFilterText getfiltertext, TaxPercentInfoCompanion taxPercentInfoCompanion, TaxPercentInfoCompanion taxPercentInfoCompanion2) {
                super(0);
                this.IconCompatParcelizer = getplantype;
                this.AudioAttributesCompatParcelizer = getfiltertext;
                this.write = taxPercentInfoCompanion;
                this.read = taxPercentInfoCompanion2;
            }
        }

        private void AudioAttributesCompatParcelizer(getPlanType.read readVar) {
            toMagicModuleMetaRepoModel.write(readVar, "");
            Iterator<TaxPercentInfoCompanion> it = this.read.iterator();
            while (it.hasNext()) {
                readVar.read(new AnonymousClass4(this.write, this.IconCompatParcelizer, it.next(), this.AudioAttributesCompatParcelizer));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(List<? extends TaxPercentInfoCompanion> list, getPlanType getplantype, getFilterText getfiltertext, TaxPercentInfoCompanion taxPercentInfoCompanion) {
            super(1);
            this.read = list;
            this.write = getplantype;
            this.IconCompatParcelizer = getfiltertext;
            this.AudioAttributesCompatParcelizer = taxPercentInfoCompanion;
        }
    }

    private static boolean IconCompatParcelizer(getFilterText getfiltertext, Preference preference, Preference preference2, isPermanent ispermanent) {
        getValueBoolean getvaluebooleanAudioAttributesCompatParcelizer;
        TaxPercentInfoCompanion taxPercentInfoCompanion = getfiltertext.read(preference);
        if (taxPercentInfoCompanion instanceof getCgstPercentInfo) {
            getCgstPercentInfo getcgstpercentinfo = (getCgstPercentInfo) taxPercentInfoCompanion;
            if (getfiltertext.read(getcgstpercentinfo) || !getfiltertext.write(getfiltertext.write(getfiltertext.IconCompatParcelizer(getcgstpercentinfo))) || getfiltertext.AudioAttributesCompatParcelizer(getcgstpercentinfo) != isQbank.FOR_SUBTYPING) {
                return false;
            }
            isPermanent ispermanentOnCustomAction = getfiltertext.onCustomAction(preference2);
            toStringArray tostringarray = ispermanentOnCustomAction instanceof toStringArray ? (toStringArray) ispermanentOnCustomAction : null;
            if (tostringarray != null && (getvaluebooleanAudioAttributesCompatParcelizer = getfiltertext.AudioAttributesCompatParcelizer(tostringarray)) != null && getfiltertext.read(getvaluebooleanAudioAttributesCompatParcelizer, ispermanent)) {
                return true;
            }
        }
        return false;
    }

    public static boolean read(getPlanType getplantype, getValueInt getvalueint, TaxPercentInfoCompanion taxPercentInfoCompanion) {
        boolean zAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getplantype, "");
        toMagicModuleMetaRepoModel.write(getvalueint, "");
        toMagicModuleMetaRepoModel.write(taxPercentInfoCompanion, "");
        getFilterText getfiltertextWrite = getplantype.write();
        isPermanent ispermanentMediaBrowserCompatMediaItem = getfiltertextWrite.MediaBrowserCompatMediaItem(taxPercentInfoCompanion);
        int iIconCompatParcelizer = getfiltertextWrite.IconCompatParcelizer(getvalueint);
        int iMediaBrowserCompatMediaItem = getfiltertextWrite.MediaBrowserCompatMediaItem(ispermanentMediaBrowserCompatMediaItem);
        if (iIconCompatParcelizer == iMediaBrowserCompatMediaItem) {
            TaxPercentInfoCompanion taxPercentInfoCompanion2 = taxPercentInfoCompanion;
            if (iIconCompatParcelizer == getfiltertextWrite.IconCompatParcelizer((Preference) taxPercentInfoCompanion2)) {
                for (int i = 0; i < iMediaBrowserCompatMediaItem; i++) {
                    setPermanent setpermanentAudioAttributesCompatParcelizer = getfiltertextWrite.AudioAttributesCompatParcelizer(taxPercentInfoCompanion2, i);
                    if (!getfiltertextWrite.write(setpermanentAudioAttributesCompatParcelizer)) {
                        Preference preferenceIconCompatParcelizer = getfiltertextWrite.IconCompatParcelizer(setpermanentAudioAttributesCompatParcelizer);
                        setPermanent setpermanentRemoteActionCompatParcelizer = getfiltertextWrite.RemoteActionCompatParcelizer(getvalueint, i);
                        getfiltertextWrite.RemoteActionCompatParcelizer(setpermanentRemoteActionCompatParcelizer);
                        getItemTitle getitemtitle = getItemTitle.INV;
                        Preference preferenceIconCompatParcelizer2 = getfiltertextWrite.IconCompatParcelizer(setpermanentRemoteActionCompatParcelizer);
                        getPearlType getpearltype = IconCompatParcelizer;
                        getItemTitle getitemtitleRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getfiltertextWrite.write(getfiltertextWrite.write(ispermanentMediaBrowserCompatMediaItem, i)), getfiltertextWrite.RemoteActionCompatParcelizer(setpermanentAudioAttributesCompatParcelizer));
                        if (getitemtitleRemoteActionCompatParcelizer == null) {
                            return getplantype.MediaBrowserCompatCustomActionResultReceiver();
                        }
                        if (getitemtitleRemoteActionCompatParcelizer != getItemTitle.INV || (!IconCompatParcelizer(getfiltertextWrite, preferenceIconCompatParcelizer2, preferenceIconCompatParcelizer, ispermanentMediaBrowserCompatMediaItem) && !IconCompatParcelizer(getfiltertextWrite, preferenceIconCompatParcelizer, preferenceIconCompatParcelizer2, ispermanentMediaBrowserCompatMediaItem))) {
                            if (getplantype.IconCompatParcelizer <= 100) {
                                getplantype.IconCompatParcelizer++;
                                int i2 = RemoteActionCompatParcelizer.write[getitemtitleRemoteActionCompatParcelizer.ordinal()];
                                if (i2 == 1) {
                                    zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(getplantype, preferenceIconCompatParcelizer2, preferenceIconCompatParcelizer);
                                } else if (i2 == 2) {
                                    zAudioAttributesCompatParcelizer = write(getpearltype, getplantype, preferenceIconCompatParcelizer2, preferenceIconCompatParcelizer);
                                } else {
                                    if (i2 != 3) {
                                        throw new RenewEligibleCreator();
                                    }
                                    zAudioAttributesCompatParcelizer = write(getpearltype, getplantype, preferenceIconCompatParcelizer, preferenceIconCompatParcelizer2);
                                }
                                getplantype.IconCompatParcelizer--;
                                if (!zAudioAttributesCompatParcelizer) {
                                    return false;
                                }
                            } else {
                                throw new IllegalStateException("Arguments depth is too high. Some related argument: ".concat(String.valueOf(preferenceIconCompatParcelizer2)).toString());
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static boolean IconCompatParcelizer(getFilterText getfiltertext, Preference preference) {
        return (!getfiltertext.MediaBrowserCompatItemReceiver(getfiltertext.onCustomAction(preference)) || getfiltertext.AudioAttributesImplApi21Parcelizer(preference) || getfiltertext.MediaBrowserCompatCustomActionResultReceiver(preference) || getfiltertext.MediaDescriptionCompat(preference) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getfiltertext.MediaBrowserCompatMediaItem(getfiltertext.onAddQueueItem(preference)), getfiltertext.MediaBrowserCompatMediaItem(getfiltertext.handleMediaPlayPauseIfPendingOnHandler(preference)))) ? false : true;
    }

    private static getItemTitle RemoteActionCompatParcelizer(getItemTitle getitemtitle, getItemTitle getitemtitle2) {
        toMagicModuleMetaRepoModel.write(getitemtitle, "");
        toMagicModuleMetaRepoModel.write(getitemtitle2, "");
        if (getitemtitle == getItemTitle.INV) {
            return getitemtitle2;
        }
        if (getitemtitle2 == getItemTitle.INV || getitemtitle == getitemtitle2) {
            return getitemtitle;
        }
        return null;
    }

    private static boolean IconCompatParcelizer(getFilterText getfiltertext, TaxPercentInfoCompanion taxPercentInfoCompanion, TaxPercentInfoCompanion taxPercentInfoCompanion2) {
        TaxPercentInfoCompanion taxPercentInfoCompanion3;
        TaxPercentInfoCompanion taxPercentInfoCompanion4;
        getSgstPercentInfo getsgstpercentinfoRemoteActionCompatParcelizer = getfiltertext.RemoteActionCompatParcelizer(taxPercentInfoCompanion);
        if (getsgstpercentinfoRemoteActionCompatParcelizer == null || (taxPercentInfoCompanion3 = getfiltertext.read(getsgstpercentinfoRemoteActionCompatParcelizer)) == null) {
            taxPercentInfoCompanion3 = taxPercentInfoCompanion;
        }
        getSgstPercentInfo getsgstpercentinfoRemoteActionCompatParcelizer2 = getfiltertext.RemoteActionCompatParcelizer(taxPercentInfoCompanion2);
        if (getsgstpercentinfoRemoteActionCompatParcelizer2 == null || (taxPercentInfoCompanion4 = getfiltertext.read(getsgstpercentinfoRemoteActionCompatParcelizer2)) == null) {
            taxPercentInfoCompanion4 = taxPercentInfoCompanion2;
        }
        if (getfiltertext.MediaBrowserCompatMediaItem(taxPercentInfoCompanion3) != getfiltertext.MediaBrowserCompatMediaItem(taxPercentInfoCompanion4)) {
            return false;
        }
        if (getfiltertext.MediaBrowserCompatCustomActionResultReceiver((Preference) taxPercentInfoCompanion) || !getfiltertext.MediaBrowserCompatCustomActionResultReceiver((Preference) taxPercentInfoCompanion2)) {
            return !getfiltertext.MediaBrowserCompatItemReceiver(taxPercentInfoCompanion) || getfiltertext.MediaBrowserCompatItemReceiver(taxPercentInfoCompanion2);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Boolean IconCompatParcelizer(kotlin.getPlanType r10, kotlin.TaxPercentInfoCompanion r11, kotlin.TaxPercentInfoCompanion r12) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getPearlType.IconCompatParcelizer(o.getPlanType, o.TaxPercentInfoCompanion, o.TaxPercentInfoCompanion):java.lang.Boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        return r7.write(r7.onCustomAction(r8), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.getValueBoolean write(kotlin.getFilterText r7, kotlin.Preference r8, kotlin.Preference r9) {
        /*
            r6 = this;
            int r0 = r7.IconCompatParcelizer(r8)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L68
            o.setPermanent r4 = r7.AudioAttributesCompatParcelizer(r8, r2)
            boolean r5 = r7.write(r4)
            if (r5 != 0) goto L14
            r3 = r4
        L14:
            if (r3 == 0) goto L65
            o.Preference r3 = r7.IconCompatParcelizer(r3)
            if (r3 == 0) goto L65
            o.TaxPercentInfoCompanion r4 = r7.onAddQueueItem(r3)
            o.TaxPercentInfoCompanion r4 = r7.MediaBrowserCompatCustomActionResultReceiver(r4)
            o.Preference r4 = (kotlin.Preference) r4
            boolean r4 = r7.AudioAttributesImplApi26Parcelizer(r4)
            if (r4 == 0) goto L3e
            o.TaxPercentInfoCompanion r4 = r7.onAddQueueItem(r9)
            o.TaxPercentInfoCompanion r4 = r7.MediaBrowserCompatCustomActionResultReceiver(r4)
            o.Preference r4 = (kotlin.Preference) r4
            boolean r4 = r7.AudioAttributesImplApi26Parcelizer(r4)
            if (r4 == 0) goto L3e
            r4 = 1
            goto L3f
        L3e:
            r4 = r1
        L3f:
            boolean r5 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r3, r9)
            if (r5 != 0) goto L5c
            if (r4 == 0) goto L55
            o.isPermanent r4 = r7.onCustomAction(r3)
            o.isPermanent r5 = r7.onCustomAction(r9)
            boolean r4 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r4, r5)
            if (r4 != 0) goto L5c
        L55:
            o.getValueBoolean r3 = r6.write(r7, r3, r9)
            if (r3 == 0) goto L65
            return r3
        L5c:
            o.isPermanent r6 = r7.onCustomAction(r8)
            o.getValueBoolean r6 = r7.write(r6, r2)
            return r6
        L65:
            int r2 = r2 + 1
            goto L6
        L68:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getPearlType.write(o.getFilterText, o.Preference, o.Preference):o.getValueBoolean");
    }

    private static List<TaxPercentInfoCompanion> AudioAttributesCompatParcelizer(getPlanType getplantype, TaxPercentInfoCompanion taxPercentInfoCompanion, isPermanent ispermanent) {
        getPlanType.AudioAttributesCompatParcelizer.write writeVarMediaMetadataCompat;
        getFilterText getfiltertextWrite = getplantype.write();
        getfiltertextWrite.write(taxPercentInfoCompanion, ispermanent);
        if (!getfiltertextWrite.AudioAttributesImplBaseParcelizer(ispermanent) && getfiltertextWrite.write(taxPercentInfoCompanion)) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        if (getfiltertextWrite.AudioAttributesImplApi26Parcelizer(ispermanent)) {
            if (getfiltertextWrite.AudioAttributesCompatParcelizer(getfiltertextWrite.MediaBrowserCompatMediaItem(taxPercentInfoCompanion), ispermanent)) {
                TaxPercentInfoCompanion taxPercentInfoCompanionAudioAttributesCompatParcelizer = getfiltertextWrite.AudioAttributesCompatParcelizer(taxPercentInfoCompanion, isQbank.FOR_SUBTYPING);
                if (taxPercentInfoCompanionAudioAttributesCompatParcelizer != null) {
                    taxPercentInfoCompanion = taxPercentInfoCompanionAudioAttributesCompatParcelizer;
                }
                return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(taxPercentInfoCompanion);
            }
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        getMonthTimeStamp getmonthtimestamp = new getMonthTimeStamp();
        getplantype.IconCompatParcelizer();
        ArrayDeque<TaxPercentInfoCompanion> arrayDequeRemoteActionCompatParcelizer = getplantype.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.write(arrayDequeRemoteActionCompatParcelizer);
        Set<TaxPercentInfoCompanion> set = getplantype.read();
        toMagicModuleMetaRepoModel.write(set);
        arrayDequeRemoteActionCompatParcelizer.push(taxPercentInfoCompanion);
        while (!arrayDequeRemoteActionCompatParcelizer.isEmpty()) {
            if (set.size() > 1000) {
                StringBuilder sb = new StringBuilder("Too many supertypes for type: ");
                sb.append(taxPercentInfoCompanion);
                sb.append(". Supertypes = ");
                sb.append(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(set, null, null, null, 0, null, null, 63));
                throw new IllegalStateException(sb.toString().toString());
            }
            TaxPercentInfoCompanion taxPercentInfoCompanionPop = arrayDequeRemoteActionCompatParcelizer.pop();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(taxPercentInfoCompanionPop, "");
            if (set.add(taxPercentInfoCompanionPop)) {
                TaxPercentInfoCompanion taxPercentInfoCompanionAudioAttributesCompatParcelizer2 = getfiltertextWrite.AudioAttributesCompatParcelizer(taxPercentInfoCompanionPop, isQbank.FOR_SUBTYPING);
                if (taxPercentInfoCompanionAudioAttributesCompatParcelizer2 == null) {
                    taxPercentInfoCompanionAudioAttributesCompatParcelizer2 = taxPercentInfoCompanionPop;
                }
                if (getfiltertextWrite.AudioAttributesCompatParcelizer(getfiltertextWrite.MediaBrowserCompatMediaItem(taxPercentInfoCompanionAudioAttributesCompatParcelizer2), ispermanent)) {
                    getmonthtimestamp.add(taxPercentInfoCompanionAudioAttributesCompatParcelizer2);
                    writeVarMediaMetadataCompat = getPlanType.AudioAttributesCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer;
                } else if (getfiltertextWrite.IconCompatParcelizer((Preference) taxPercentInfoCompanionAudioAttributesCompatParcelizer2) == 0) {
                    writeVarMediaMetadataCompat = getPlanType.AudioAttributesCompatParcelizer.write.IconCompatParcelizer;
                } else {
                    writeVarMediaMetadataCompat = getplantype.write().MediaMetadataCompat(taxPercentInfoCompanionAudioAttributesCompatParcelizer2);
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeVarMediaMetadataCompat, getPlanType.AudioAttributesCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer)) {
                    writeVarMediaMetadataCompat = null;
                }
                if (writeVarMediaMetadataCompat != null) {
                    getFilterText getfiltertextWrite2 = getplantype.write();
                    Iterator<Preference> it = getfiltertextWrite2.onCommand(getfiltertextWrite2.MediaBrowserCompatMediaItem(taxPercentInfoCompanionPop)).iterator();
                    while (it.hasNext()) {
                        arrayDequeRemoteActionCompatParcelizer.add(writeVarMediaMetadataCompat.RemoteActionCompatParcelizer(getplantype, it.next()));
                    }
                }
            }
        }
        getplantype.AudioAttributesCompatParcelizer();
        return getmonthtimestamp;
    }

    private static List<TaxPercentInfoCompanion> RemoteActionCompatParcelizer(getPlanType getplantype, TaxPercentInfoCompanion taxPercentInfoCompanion, isPermanent ispermanent) {
        return RemoteActionCompatParcelizer(getplantype, AudioAttributesCompatParcelizer(getplantype, taxPercentInfoCompanion, ispermanent));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List<TaxPercentInfoCompanion> RemoteActionCompatParcelizer(getPlanType getplantype, List<? extends TaxPercentInfoCompanion> list) {
        int i;
        getFilterText getfiltertextWrite = getplantype.write();
        if (list.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                getValueInt getvalueintIconCompatParcelizer = getfiltertextWrite.IconCompatParcelizer((TaxPercentInfoCompanion) obj);
                int iIconCompatParcelizer = getfiltertextWrite.IconCompatParcelizer(getvalueintIconCompatParcelizer);
                while (true) {
                    if (i < iIconCompatParcelizer) {
                        i = getfiltertextWrite.write(getfiltertextWrite.IconCompatParcelizer(getfiltertextWrite.RemoteActionCompatParcelizer(getvalueintIconCompatParcelizer, i))) == null ? i + 1 : 0;
                    } else {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
            ArrayList arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                return arrayList2;
            }
        }
        return list;
    }

    private static List<TaxPercentInfoCompanion> write(getPlanType getplantype, TaxPercentInfoCompanion taxPercentInfoCompanion, isPermanent ispermanent) {
        getPlanType.AudioAttributesCompatParcelizer.write writeVar;
        toMagicModuleMetaRepoModel.write(getplantype, "");
        toMagicModuleMetaRepoModel.write(taxPercentInfoCompanion, "");
        toMagicModuleMetaRepoModel.write(ispermanent, "");
        getFilterText getfiltertextWrite = getplantype.write();
        if (getfiltertextWrite.write(taxPercentInfoCompanion)) {
            return RemoteActionCompatParcelizer(getplantype, taxPercentInfoCompanion, ispermanent);
        }
        if (!getfiltertextWrite.AudioAttributesImplBaseParcelizer(ispermanent) && !getfiltertextWrite.MediaDescriptionCompat(ispermanent)) {
            return AudioAttributesCompatParcelizer(getplantype, taxPercentInfoCompanion, ispermanent);
        }
        getMonthTimeStamp<TaxPercentInfoCompanion> getmonthtimestamp = new getMonthTimeStamp();
        getplantype.IconCompatParcelizer();
        ArrayDeque<TaxPercentInfoCompanion> arrayDequeRemoteActionCompatParcelizer = getplantype.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.write(arrayDequeRemoteActionCompatParcelizer);
        Set<TaxPercentInfoCompanion> set = getplantype.read();
        toMagicModuleMetaRepoModel.write(set);
        arrayDequeRemoteActionCompatParcelizer.push(taxPercentInfoCompanion);
        while (!arrayDequeRemoteActionCompatParcelizer.isEmpty()) {
            if (set.size() > 1000) {
                StringBuilder sb = new StringBuilder("Too many supertypes for type: ");
                sb.append(taxPercentInfoCompanion);
                sb.append(". Supertypes = ");
                sb.append(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(set, null, null, null, 0, null, null, 63));
                throw new IllegalStateException(sb.toString().toString());
            }
            TaxPercentInfoCompanion taxPercentInfoCompanionPop = arrayDequeRemoteActionCompatParcelizer.pop();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(taxPercentInfoCompanionPop, "");
            if (set.add(taxPercentInfoCompanionPop)) {
                if (getfiltertextWrite.write(taxPercentInfoCompanionPop)) {
                    getmonthtimestamp.add(taxPercentInfoCompanionPop);
                    writeVar = getPlanType.AudioAttributesCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer;
                } else {
                    writeVar = getPlanType.AudioAttributesCompatParcelizer.write.IconCompatParcelizer;
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeVar, getPlanType.AudioAttributesCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer)) {
                    writeVar = null;
                }
                if (writeVar != null) {
                    getFilterText getfiltertextWrite2 = getplantype.write();
                    Iterator<Preference> it = getfiltertextWrite2.onCommand(getfiltertextWrite2.MediaBrowserCompatMediaItem(taxPercentInfoCompanionPop)).iterator();
                    while (it.hasNext()) {
                        arrayDequeRemoteActionCompatParcelizer.add(writeVar.RemoteActionCompatParcelizer(getplantype, it.next()));
                    }
                }
            }
        }
        getplantype.AudioAttributesCompatParcelizer();
        ArrayList arrayList = new ArrayList();
        for (TaxPercentInfoCompanion taxPercentInfoCompanion2 : getmonthtimestamp) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(taxPercentInfoCompanion2, "");
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) RemoteActionCompatParcelizer(getplantype, taxPercentInfoCompanion2, ispermanent));
        }
        return arrayList;
    }

    public final boolean IconCompatParcelizer(getPlanType getplantype, Preference preference, Preference preference2) {
        toMagicModuleMetaRepoModel.write(getplantype, "");
        toMagicModuleMetaRepoModel.write(preference, "");
        toMagicModuleMetaRepoModel.write(preference2, "");
        return write(this, getplantype, preference, preference2);
    }
}
