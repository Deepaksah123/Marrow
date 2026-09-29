package kotlin;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.isDbFlushIgnored;
import kotlin.isResolutionNotSupported;

/* JADX INFO: loaded from: classes4.dex */
public final class promptApiBlockDrivenAction {
    public static final boolean RemoteActionCompatParcelizer(isKycAuditIncomplete<?> iskycauditincomplete) {
        Constructor constructorIconCompatParcelizer;
        getDefaultBottomTab<?> getdefaultbottomtabAudioAttributesImplApi21Parcelizer;
        Method methodWrite;
        Method methodWrite2;
        Method methodRemoteActionCompatParcelizer;
        Method methodRemoteActionCompatParcelizer2;
        Method methodAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(iskycauditincomplete, "");
        if (iskycauditincomplete instanceof isDbFlushIgnored) {
            isResolutionNotSupported isresolutionnotsupported = (isResolutionNotSupported) iskycauditincomplete;
            Field field = requireLoggedUser.read((isResolutionNotSupported<?>) isresolutionnotsupported);
            return (field == null || field.isAccessible()) && ((methodRemoteActionCompatParcelizer2 = requireLoggedUser.RemoteActionCompatParcelizer((isResolutionNotSupported<?>) isresolutionnotsupported)) == null || methodRemoteActionCompatParcelizer2.isAccessible()) && ((methodAudioAttributesCompatParcelizer = requireLoggedUser.AudioAttributesCompatParcelizer((isDbFlushIgnored) iskycauditincomplete)) == null || methodAudioAttributesCompatParcelizer.isAccessible());
        }
        if (iskycauditincomplete instanceof isResolutionNotSupported) {
            isResolutionNotSupported isresolutionnotsupported2 = (isResolutionNotSupported) iskycauditincomplete;
            Field field2 = requireLoggedUser.read((isResolutionNotSupported<?>) isresolutionnotsupported2);
            return (field2 == null || field2.isAccessible()) && ((methodRemoteActionCompatParcelizer = requireLoggedUser.RemoteActionCompatParcelizer((isResolutionNotSupported<?>) isresolutionnotsupported2)) == null || methodRemoteActionCompatParcelizer.isAccessible());
        }
        if (iskycauditincomplete instanceof isResolutionNotSupported.IconCompatParcelizer) {
            Field field3 = requireLoggedUser.read((isResolutionNotSupported<?>) ((isResolutionNotSupported.IconCompatParcelizer) iskycauditincomplete).RemoteActionCompatParcelizer());
            return (field3 == null || field3.isAccessible()) && ((methodWrite2 = requireLoggedUser.write((getErrorMessageId<?>) iskycauditincomplete)) == null || methodWrite2.isAccessible());
        }
        if (iskycauditincomplete instanceof isDbFlushIgnored.IconCompatParcelizer) {
            Field field4 = requireLoggedUser.read((isResolutionNotSupported<?>) ((isDbFlushIgnored.IconCompatParcelizer) iskycauditincomplete).RemoteActionCompatParcelizer());
            return (field4 == null || field4.isAccessible()) && ((methodWrite = requireLoggedUser.write((getErrorMessageId<?>) iskycauditincomplete)) == null || methodWrite.isAccessible());
        }
        if (iskycauditincomplete instanceof getErrorMessageId) {
            getErrorMessageId geterrormessageid = (getErrorMessageId) iskycauditincomplete;
            Method methodWrite3 = requireLoggedUser.write((getErrorMessageId<?>) geterrormessageid);
            if (methodWrite3 == null || methodWrite3.isAccessible()) {
                CourseConfigSerializerWhenMappings<?> courseConfigSerializerWhenMappingsIconCompatParcelizer = getCourseStrings.IconCompatParcelizer(iskycauditincomplete);
                Member memberWrite = (courseConfigSerializerWhenMappingsIconCompatParcelizer == null || (getdefaultbottomtabAudioAttributesImplApi21Parcelizer = courseConfigSerializerWhenMappingsIconCompatParcelizer.AudioAttributesImplApi21Parcelizer()) == null) ? null : getdefaultbottomtabAudioAttributesImplApi21Parcelizer.write();
                AccessibleObject accessibleObject = memberWrite instanceof AccessibleObject ? (AccessibleObject) memberWrite : null;
                if ((accessibleObject == null || accessibleObject.isAccessible()) && ((constructorIconCompatParcelizer = requireLoggedUser.IconCompatParcelizer(geterrormessageid)) == null || constructorIconCompatParcelizer.isAccessible())) {
                    return true;
                }
            }
            return false;
        }
        StringBuilder sb = new StringBuilder("Unknown callable: ");
        sb.append(iskycauditincomplete);
        sb.append(" (");
        sb.append(iskycauditincomplete.getClass());
        sb.append(')');
        throw new UnsupportedOperationException(sb.toString());
    }

    public static final void read(isKycAuditIncomplete<?> iskycauditincomplete) {
        getDefaultBottomTab<?> getdefaultbottomtabAudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.write(iskycauditincomplete, "");
        if (iskycauditincomplete instanceof isDbFlushIgnored) {
            isResolutionNotSupported isresolutionnotsupported = (isResolutionNotSupported) iskycauditincomplete;
            Field field = requireLoggedUser.read((isResolutionNotSupported<?>) isresolutionnotsupported);
            if (field != null) {
                field.setAccessible(true);
            }
            Method methodRemoteActionCompatParcelizer = requireLoggedUser.RemoteActionCompatParcelizer((isResolutionNotSupported<?>) isresolutionnotsupported);
            if (methodRemoteActionCompatParcelizer != null) {
                methodRemoteActionCompatParcelizer.setAccessible(true);
            }
            Method methodAudioAttributesCompatParcelizer = requireLoggedUser.AudioAttributesCompatParcelizer((isDbFlushIgnored) iskycauditincomplete);
            if (methodAudioAttributesCompatParcelizer != null) {
                methodAudioAttributesCompatParcelizer.setAccessible(true);
                return;
            }
            return;
        }
        if (iskycauditincomplete instanceof isResolutionNotSupported) {
            isResolutionNotSupported isresolutionnotsupported2 = (isResolutionNotSupported) iskycauditincomplete;
            Field field2 = requireLoggedUser.read((isResolutionNotSupported<?>) isresolutionnotsupported2);
            if (field2 != null) {
                field2.setAccessible(true);
            }
            Method methodRemoteActionCompatParcelizer2 = requireLoggedUser.RemoteActionCompatParcelizer((isResolutionNotSupported<?>) isresolutionnotsupported2);
            if (methodRemoteActionCompatParcelizer2 != null) {
                methodRemoteActionCompatParcelizer2.setAccessible(true);
                return;
            }
            return;
        }
        if (iskycauditincomplete instanceof isResolutionNotSupported.IconCompatParcelizer) {
            Field field3 = requireLoggedUser.read((isResolutionNotSupported<?>) ((isResolutionNotSupported.IconCompatParcelizer) iskycauditincomplete).RemoteActionCompatParcelizer());
            if (field3 != null) {
                field3.setAccessible(true);
            }
            Method methodWrite = requireLoggedUser.write((getErrorMessageId<?>) iskycauditincomplete);
            if (methodWrite != null) {
                methodWrite.setAccessible(true);
                return;
            }
            return;
        }
        if (iskycauditincomplete instanceof isDbFlushIgnored.IconCompatParcelizer) {
            Field field4 = requireLoggedUser.read((isResolutionNotSupported<?>) ((isDbFlushIgnored.IconCompatParcelizer) iskycauditincomplete).RemoteActionCompatParcelizer());
            if (field4 != null) {
                field4.setAccessible(true);
            }
            Method methodWrite2 = requireLoggedUser.write((getErrorMessageId<?>) iskycauditincomplete);
            if (methodWrite2 != null) {
                methodWrite2.setAccessible(true);
                return;
            }
            return;
        }
        if (iskycauditincomplete instanceof getErrorMessageId) {
            getErrorMessageId geterrormessageid = (getErrorMessageId) iskycauditincomplete;
            Method methodWrite3 = requireLoggedUser.write((getErrorMessageId<?>) geterrormessageid);
            if (methodWrite3 != null) {
                methodWrite3.setAccessible(true);
            }
            CourseConfigSerializerWhenMappings<?> courseConfigSerializerWhenMappingsIconCompatParcelizer = getCourseStrings.IconCompatParcelizer(iskycauditincomplete);
            Member memberWrite = (courseConfigSerializerWhenMappingsIconCompatParcelizer == null || (getdefaultbottomtabAudioAttributesImplApi21Parcelizer = courseConfigSerializerWhenMappingsIconCompatParcelizer.AudioAttributesImplApi21Parcelizer()) == null) ? null : getdefaultbottomtabAudioAttributesImplApi21Parcelizer.write();
            AccessibleObject accessibleObject = memberWrite instanceof AccessibleObject ? (AccessibleObject) memberWrite : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(true);
            }
            Constructor constructorIconCompatParcelizer = requireLoggedUser.IconCompatParcelizer(geterrormessageid);
            if (constructorIconCompatParcelizer == null) {
                return;
            }
            constructorIconCompatParcelizer.setAccessible(true);
            return;
        }
        StringBuilder sb = new StringBuilder("Unknown callable: ");
        sb.append(iskycauditincomplete);
        sb.append(" (");
        sb.append(iskycauditincomplete.getClass());
        sb.append(')');
        throw new UnsupportedOperationException(sb.toString());
    }
}
