package kotlin;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import kotlin.getPlanType;

/* JADX INFO: loaded from: classes4.dex */
public final class isDoNotConsider {
    public static final isDoNotConsider write = new isDoNotConsider();

    private isDoNotConsider() {
    }

    public static boolean write(getPlanType getplantype, TaxPercentInfoCompanion taxPercentInfoCompanion, TaxPercentInfoCompanion taxPercentInfoCompanion2) {
        toMagicModuleMetaRepoModel.write(getplantype, "");
        toMagicModuleMetaRepoModel.write(taxPercentInfoCompanion, "");
        toMagicModuleMetaRepoModel.write(taxPercentInfoCompanion2, "");
        return read(getplantype, taxPercentInfoCompanion, taxPercentInfoCompanion2);
    }

    private static boolean read(getPlanType getplantype, TaxPercentInfoCompanion taxPercentInfoCompanion, TaxPercentInfoCompanion taxPercentInfoCompanion2) {
        getFilterText getfiltertextWrite = getplantype.write();
        boolean z = getPearlType.write;
        if (getfiltertextWrite.MediaBrowserCompatItemReceiver(taxPercentInfoCompanion2)) {
            return true;
        }
        TaxPercentInfoCompanion taxPercentInfoCompanion3 = taxPercentInfoCompanion;
        if (getfiltertextWrite.MediaBrowserCompatCustomActionResultReceiver((Preference) taxPercentInfoCompanion3) || getfiltertextWrite.MediaDescriptionCompat(taxPercentInfoCompanion3)) {
            return true;
        }
        if (((taxPercentInfoCompanion instanceof getCgstPercentInfo) && getfiltertextWrite.write((getCgstPercentInfo) taxPercentInfoCompanion)) || read(getplantype, taxPercentInfoCompanion, getPlanType.AudioAttributesCompatParcelizer.write.IconCompatParcelizer)) {
            return true;
        }
        if (getfiltertextWrite.MediaBrowserCompatCustomActionResultReceiver((Preference) taxPercentInfoCompanion2) || read(getplantype, taxPercentInfoCompanion2, getPlanType.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.read) || getfiltertextWrite.write(taxPercentInfoCompanion)) {
            return false;
        }
        return RemoteActionCompatParcelizer(getplantype, taxPercentInfoCompanion, getfiltertextWrite.MediaBrowserCompatMediaItem(taxPercentInfoCompanion2));
    }

    public static boolean read(getPlanType getplantype, TaxPercentInfoCompanion taxPercentInfoCompanion, getPlanType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(getplantype, "");
        toMagicModuleMetaRepoModel.write(taxPercentInfoCompanion, "");
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        getFilterText getfiltertextWrite = getplantype.write();
        if ((getfiltertextWrite.write(taxPercentInfoCompanion) && !getfiltertextWrite.MediaBrowserCompatItemReceiver(taxPercentInfoCompanion)) || getfiltertextWrite.MediaBrowserCompatCustomActionResultReceiver((Preference) taxPercentInfoCompanion)) {
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
                getPlanType.AudioAttributesCompatParcelizer.IconCompatParcelizer iconCompatParcelizer = getfiltertextWrite.MediaBrowserCompatItemReceiver(taxPercentInfoCompanionPop) ? getPlanType.AudioAttributesCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer : audioAttributesCompatParcelizer;
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(iconCompatParcelizer, getPlanType.AudioAttributesCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer)) {
                    iconCompatParcelizer = null;
                }
                if (iconCompatParcelizer != null) {
                    getFilterText getfiltertextWrite2 = getplantype.write();
                    Iterator<Preference> it = getfiltertextWrite2.onCommand(getfiltertextWrite2.MediaBrowserCompatMediaItem(taxPercentInfoCompanionPop)).iterator();
                    while (it.hasNext()) {
                        TaxPercentInfoCompanion taxPercentInfoCompanionRemoteActionCompatParcelizer = iconCompatParcelizer.RemoteActionCompatParcelizer(getplantype, it.next());
                        if ((getfiltertextWrite.write(taxPercentInfoCompanionRemoteActionCompatParcelizer) && !getfiltertextWrite.MediaBrowserCompatItemReceiver(taxPercentInfoCompanionRemoteActionCompatParcelizer)) || getfiltertextWrite.MediaBrowserCompatCustomActionResultReceiver((Preference) taxPercentInfoCompanionRemoteActionCompatParcelizer)) {
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

    private static boolean RemoteActionCompatParcelizer(getPlanType getplantype, TaxPercentInfoCompanion taxPercentInfoCompanion, isPermanent ispermanent) {
        toMagicModuleMetaRepoModel.write(getplantype, "");
        toMagicModuleMetaRepoModel.write(taxPercentInfoCompanion, "");
        toMagicModuleMetaRepoModel.write(ispermanent, "");
        getFilterText getfiltertextWrite = getplantype.write();
        if (AudioAttributesCompatParcelizer(getplantype, taxPercentInfoCompanion, ispermanent)) {
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
                getPlanType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getfiltertextWrite.MediaBrowserCompatItemReceiver(taxPercentInfoCompanionPop) ? getPlanType.AudioAttributesCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer : getPlanType.AudioAttributesCompatParcelizer.write.IconCompatParcelizer;
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer, getPlanType.AudioAttributesCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer)) {
                    audioAttributesCompatParcelizer = null;
                }
                if (audioAttributesCompatParcelizer != null) {
                    getFilterText getfiltertextWrite2 = getplantype.write();
                    Iterator<Preference> it = getfiltertextWrite2.onCommand(getfiltertextWrite2.MediaBrowserCompatMediaItem(taxPercentInfoCompanionPop)).iterator();
                    while (it.hasNext()) {
                        TaxPercentInfoCompanion taxPercentInfoCompanionRemoteActionCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(getplantype, it.next());
                        if (AudioAttributesCompatParcelizer(getplantype, taxPercentInfoCompanionRemoteActionCompatParcelizer, ispermanent)) {
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

    private static boolean AudioAttributesCompatParcelizer(getPlanType getplantype, TaxPercentInfoCompanion taxPercentInfoCompanion, isPermanent ispermanent) {
        getFilterText getfiltertextWrite = getplantype.write();
        if (getfiltertextWrite.MediaMetadataCompat((Preference) taxPercentInfoCompanion)) {
            return true;
        }
        if (getfiltertextWrite.MediaBrowserCompatItemReceiver(taxPercentInfoCompanion)) {
            return false;
        }
        if (getplantype.AudioAttributesImplApi26Parcelizer() && getfiltertextWrite.AudioAttributesImplApi26Parcelizer(taxPercentInfoCompanion)) {
            return true;
        }
        return getfiltertextWrite.AudioAttributesCompatParcelizer(getfiltertextWrite.MediaBrowserCompatMediaItem(taxPercentInfoCompanion), ispermanent);
    }
}
