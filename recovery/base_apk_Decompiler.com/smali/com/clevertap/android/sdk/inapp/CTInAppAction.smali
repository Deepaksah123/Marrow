###### Class com.clevertap.android.sdk.inapp.CTInAppAction (com.clevertap.android.sdk.inapp.CTInAppAction)
.class public final Lcom/clevertap/android/sdk/inapp/CTInAppAction;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/clevertap/android/sdk/inapp/CTInAppAction$IconCompatParcelizer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B\u0013\u0008\u0002\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u0011\u0008\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0008J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#H\u0016J\u0008\u0010$\u001a\u00020#H\u0016J\u0010\u0010%\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0013\u0010&\u001a\u00020\u001c2\u0008\u0010\'\u001a\u0004\u0018\u00010(H\u0096\u0002J\u0008\u0010)\u001a\u00020#H\u0016R\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\n@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\t\u001a\u0004\u0018\u00010\u000e@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R`\u0010\u0014\u001a\"\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u00122&\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u0012@BX\u0086\u000e\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\u0008\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0008\u0010\t\u001a\u0004\u0018\u00010\u0018@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u001c8G@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006+"
    }
    d2 = {
        "Lcom/clevertap/android/sdk/inapp/CTInAppAction;",
        "Landroid/os/Parcelable;",
        "parcel",
        "Landroid/os/Parcel;",
        "<init>",
        "(Landroid/os/Parcel;)V",
        "json",
        "Lorg/json/JSONObject;",
        "(Lorg/json/JSONObject;)V",
        "value",
        "Lcom/clevertap/android/sdk/inapp/InAppActionType;",
        "type",
        "getType",
        "()Lcom/clevertap/android/sdk/inapp/InAppActionType;",
        "",
        "actionUrl",
        "getActionUrl",
        "()Ljava/lang/String;",
        "Lkotlin/collections/HashMap;",
        "Ljava/util/HashMap;",
        "keyValues",
        "getKeyValues",
        "()Ljava/util/HashMap;",
        "Ljava/util/HashMap;",
        "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;",
        "customTemplateInAppData",
        "getCustomTemplateInAppData",
        "()Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;",
        "",
        "shouldFallbackToSettings",
        "()Z",
        "writeToParcel",
        "",
        "dest",
        "flags",
        "",
        "describeContents",
        "setFieldsFromJson",
        "equals",
        "other",
        "",
        "hashCode",
        "CREATOR",
        "clevertap-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Lcom/clevertap/android/sdk/inapp/CTInAppAction$IconCompatParcelizer;


# instance fields
.field private AudioAttributesCompatParcelizer:Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

.field private IconCompatParcelizer:Ljava/lang/String;

.field private RemoteActionCompatParcelizer:Lo/lambdaupdateStateAndInformListeners38;

.field private read:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private write:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 101
    new-instance v0, Lcom/clevertap/android/sdk/inapp/CTInAppAction$IconCompatParcelizer;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/clevertap/android/sdk/inapp/CTInAppAction$IconCompatParcelizer;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->CREATOR:Lcom/clevertap/android/sdk/inapp/CTInAppAction$IconCompatParcelizer;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .registers 5

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    if-eqz p1, :cond_13

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_13

    sget-object v2, Lo/lambdaupdateStateAndInformListeners38;->read:Lo/lambdaupdateStateAndInformListeners38$read;

    invoke-static {v1}, Lo/lambdaupdateStateAndInformListeners38$read;->write(Ljava/lang/String;)Lo/lambdaupdateStateAndInformListeners38;

    move-result-object v1

    goto :goto_14

    :cond_13
    move-object v1, v0

    :goto_14
    iput-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->RemoteActionCompatParcelizer:Lo/lambdaupdateStateAndInformListeners38;

    if-eqz p1, :cond_1d

    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1e

    :cond_1d
    move-object v1, v0

    :goto_1e
    iput-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->IconCompatParcelizer:Ljava/lang/String;

    if-eqz p1, :cond_27

    .line 35
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;

    move-result-object v1

    goto :goto_28

    :cond_27
    move-object v1, v0

    :goto_28
    instance-of v2, v1, Ljava/util/HashMap;

    if-nez v2, :cond_2d

    move-object v1, v0

    :cond_2d
    iput-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->read:Ljava/util/HashMap;

    if-eqz p1, :cond_3d

    .line 36
    const-class v0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    :cond_3d
    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->AudioAttributesCompatParcelizer:Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_4a

    .line 37
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    if-nez p1, :cond_4a

    move v1, v0

    :cond_4a
    xor-int/lit8 p1, v1, 0x1

    iput-boolean p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->write:Z

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Parcel;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 3

    .line 102
    invoke-direct {p0, p1}, Lcom/clevertap/android/sdk/inapp/CTInAppAction;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method private constructor <init>(Lorg/json/JSONObject;)V
    .registers 3

    const/4 v0, 0x0

    .line 40
    invoke-direct {p0, v0}, Lcom/clevertap/android/sdk/inapp/CTInAppAction;-><init>(Landroid/os/Parcel;)V

    .line 41
    invoke-direct {p0, p1}, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->write(Lorg/json/JSONObject;)V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/json/JSONObject;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 3

    .line 103
    invoke-direct {p0, p1}, Lcom/clevertap/android/sdk/inapp/CTInAppAction;-><init>(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static final AudioAttributesCompatParcelizer(Lorg/json/JSONObject;)Lcom/clevertap/android/sdk/inapp/CTInAppAction;
    .registers 1
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    .line 104
    invoke-static {p0}, Lcom/clevertap/android/sdk/inapp/CTInAppAction$IconCompatParcelizer;->IconCompatParcelizer(Lorg/json/JSONObject;)Lcom/clevertap/android/sdk/inapp/CTInAppAction;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic read(Lcom/clevertap/android/sdk/inapp/CTInAppAction;Ljava/lang/String;)V
    .registers 2

    .line 14
    iput-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->IconCompatParcelizer:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic read(Lcom/clevertap/android/sdk/inapp/CTInAppAction;Lo/lambdaupdateStateAndInformListeners38;)V
    .registers 2

    .line 14
    iput-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->RemoteActionCompatParcelizer:Lo/lambdaupdateStateAndInformListeners38;

    return-void
.end method

.method private final write(Lorg/json/JSONObject;)V
    .registers 7

    .line 57
    const-string v0, "type"

    invoke-static {p1, v0}, Lo/onSeekStarted;->write(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_f

    sget-object v2, Lo/lambdaupdateStateAndInformListeners38;->read:Lo/lambdaupdateStateAndInformListeners38$read;

    invoke-static {v1}, Lo/lambdaupdateStateAndInformListeners38$read;->write(Ljava/lang/String;)Lo/lambdaupdateStateAndInformListeners38;

    move-result-object v1

    goto :goto_10

    :cond_f
    const/4 v1, 0x0

    :goto_10
    iput-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->RemoteActionCompatParcelizer:Lo/lambdaupdateStateAndInformListeners38;

    .line 58
    const-string v1, "android"

    invoke-static {p1, v1}, Lo/onSeekStarted;->write(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->IconCompatParcelizer:Ljava/lang/String;

    .line 59
    sget-object v1, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->CREATOR:Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData$CREATOR;

    invoke-static {p1}, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData$CREATOR;->IconCompatParcelizer(Lorg/json/JSONObject;)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    move-result-object v1

    iput-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->AudioAttributesCompatParcelizer:Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    .line 60
    const-string v1, "fbSettings"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->write:Z

    .line 62
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const-string v2, "kv"

    invoke-static {v2, v0, v1}, Lo/TestGroupLSModel;->read(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_7a

    .line 63
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7a

    .line 65
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 66
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->read:Ljava/util/HashMap;

    if-nez v0, :cond_4a

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :cond_4a
    if-eqz p1, :cond_7a

    .line 69
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_55
    :goto_55
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_78

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 70
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 71
    invoke-static {v3}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    move-object v4, v3

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_55

    .line 72
    move-object v4, v0

    check-cast v4, Ljava/util/Map;

    invoke-interface {v4, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_55

    .line 75
    :cond_78
    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->read:Ljava/util/HashMap;

    :cond_7a
    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Ljava/lang/String;
    .registers 1

    .line 19
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->IconCompatParcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public final IconCompatParcelizer()Ljava/util/HashMap;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 22
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->read:Ljava/util/HashMap;

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer()Lo/lambdaupdateStateAndInformListeners38;
    .registers 1

    .line 16
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->RemoteActionCompatParcelizer:Lo/lambdaupdateStateAndInformListeners38;

    return-object p0
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    .line 82
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_10

    :cond_f
    const/4 v2, 0x0

    :goto_10
    invoke-static {v1, v2}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_18

    return v2

    .line 84
    :cond_18
    const-string v1, ""

    invoke-static {p1, v1}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/clevertap/android/sdk/inapp/CTInAppAction;

    .line 86
    iget-boolean v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->write:Z

    iget-boolean v3, p1, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->write:Z

    if-eq v1, v3, :cond_26

    return v2

    .line 87
    :cond_26
    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->RemoteActionCompatParcelizer:Lo/lambdaupdateStateAndInformListeners38;

    iget-object v3, p1, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->RemoteActionCompatParcelizer:Lo/lambdaupdateStateAndInformListeners38;

    if-eq v1, v3, :cond_2d

    return v2

    .line 88
    :cond_2d
    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->IconCompatParcelizer:Ljava/lang/String;

    iget-object v3, p1, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->IconCompatParcelizer:Ljava/lang/String;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_38

    return v2

    .line 89
    :cond_38
    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->read:Ljava/util/HashMap;

    iget-object v3, p1, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->read:Ljava/util/HashMap;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_43

    return v2

    .line 90
    :cond_43
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->AudioAttributesCompatParcelizer:Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    iget-object p1, p1, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->AudioAttributesCompatParcelizer:Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    invoke-static {p0, p1}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4e

    return v2

    :cond_4e
    return v0
.end method

.method public final hashCode()I
    .registers 6

    .line 96
    iget-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->write:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    .line 97
    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->RemoteActionCompatParcelizer:Lo/lambdaupdateStateAndInformListeners38;

    const/4 v2, 0x0

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_11

    :cond_10
    move v1, v2

    .line 98
    :goto_11
    iget-object v3, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->IconCompatParcelizer:Ljava/lang/String;

    if-eqz v3, :cond_1a

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_1b

    :cond_1a
    move v3, v2

    .line 99
    :goto_1b
    iget-object v4, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->read:Ljava/util/HashMap;

    if-eqz v4, :cond_24

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto :goto_25

    :cond_24
    move v4, v2

    .line 100
    :goto_25
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->AudioAttributesCompatParcelizer:Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    if-eqz p0, :cond_2d

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_2d
    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    return v0
.end method

.method public final read()Z
    .registers 1

    .line 28
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->write:Z

    return p0
.end method

.method public final write()Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;
    .registers 1

    .line 25
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->AudioAttributesCompatParcelizer:Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 4

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->RemoteActionCompatParcelizer:Lo/lambdaupdateStateAndInformListeners38;

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_f

    :cond_e
    const/4 v0, 0x0

    :goto_f
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 46
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 47
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->read:Ljava/util/HashMap;

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 48
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->AudioAttributesCompatParcelizer:Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 49
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->write:Z

    int-to-byte p0, p0

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeByte(B)V

    return-void
.end method

###### Class com.clevertap.android.sdk.inapp.CTInAppAction.Companion (com.clevertap.android.sdk.inapp.CTInAppAction$IconCompatParcelizer)
.class public final Lcom/clevertap/android/sdk/inapp/CTInAppAction$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/clevertap/android/sdk/inapp/CTInAppAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "IconCompatParcelizer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/clevertap/android/sdk/inapp/CTInAppAction;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n2\u0006\u0010\u0006\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0006\u001a\u0004\u0018\u00010\rH\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000fH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013"
    }
    d2 = {
        "Lcom/clevertap/android/sdk/inapp/CTInAppAction$IconCompatParcelizer;",
        "Landroid/os/Parcelable$Creator;",
        "Lcom/clevertap/android/sdk/inapp/CTInAppAction;",
        "<init>",
        "()V",
        "Landroid/os/Parcel;",
        "p0",
        "AudioAttributesCompatParcelizer",
        "(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/inapp/CTInAppAction;",
        "",
        "",
        "IconCompatParcelizer",
        "(I)[Lcom/clevertap/android/sdk/inapp/CTInAppAction;",
        "Lorg/json/JSONObject;",
        "(Lorg/json/JSONObject;)Lcom/clevertap/android/sdk/inapp/CTInAppAction;",
        "",
        "read",
        "(Ljava/lang/String;)Lcom/clevertap/android/sdk/inapp/CTInAppAction;",
        "RemoteActionCompatParcelizer",
        "()Lcom/clevertap/android/sdk/inapp/CTInAppAction;"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 135
    invoke-direct {p0}, Lcom/clevertap/android/sdk/inapp/CTInAppAction$IconCompatParcelizer;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/inapp/CTInAppAction;
    .registers 3

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    new-instance v0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/clevertap/android/sdk/inapp/CTInAppAction;-><init>(Landroid/os/Parcel;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-object v0
.end method

.method public static IconCompatParcelizer(Lorg/json/JSONObject;)Lcom/clevertap/android/sdk/inapp/CTInAppAction;
    .registers 3
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_4

    return-object v0

    .line 120
    :cond_4
    new-instance v1, Lcom/clevertap/android/sdk/inapp/CTInAppAction;

    invoke-direct {v1, p0, v0}, Lcom/clevertap/android/sdk/inapp/CTInAppAction;-><init>(Lorg/json/JSONObject;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-object v1
.end method

.method private static IconCompatParcelizer(I)[Lcom/clevertap/android/sdk/inapp/CTInAppAction;
    .registers 1

    .line 112
    new-array p0, p0, [Lcom/clevertap/android/sdk/inapp/CTInAppAction;

    return-object p0
.end method

.method public static RemoteActionCompatParcelizer()Lcom/clevertap/android/sdk/inapp/CTInAppAction;
    .registers 2
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    .line 133
    new-instance v0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/clevertap/android/sdk/inapp/CTInAppAction;-><init>(Landroid/os/Parcel;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    .line 134
    sget-object v1, Lo/lambdaupdateStateAndInformListeners38;->IconCompatParcelizer:Lo/lambdaupdateStateAndInformListeners38;

    invoke-static {v0, v1}, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->read(Lcom/clevertap/android/sdk/inapp/CTInAppAction;Lo/lambdaupdateStateAndInformListeners38;)V

    return-object v0
.end method

.method public static read(Ljava/lang/String;)Lcom/clevertap/android/sdk/inapp/CTInAppAction;
    .registers 3
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    new-instance v0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/clevertap/android/sdk/inapp/CTInAppAction;-><init>(Landroid/os/Parcel;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    .line 126
    sget-object v1, Lo/lambdaupdateStateAndInformListeners38;->AudioAttributesCompatParcelizer:Lo/lambdaupdateStateAndInformListeners38;

    invoke-static {v0, v1}, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->read(Lcom/clevertap/android/sdk/inapp/CTInAppAction;Lo/lambdaupdateStateAndInformListeners38;)V

    .line 127
    invoke-static {v0, p0}, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->read(Lcom/clevertap/android/sdk/inapp/CTInAppAction;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 105
    invoke-static {p1}, Lcom/clevertap/android/sdk/inapp/CTInAppAction$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/inapp/CTInAppAction;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 105
    invoke-static {p1}, Lcom/clevertap/android/sdk/inapp/CTInAppAction$IconCompatParcelizer;->IconCompatParcelizer(I)[Lcom/clevertap/android/sdk/inapp/CTInAppAction;

    move-result-object p0

    return-object p0
.end method
