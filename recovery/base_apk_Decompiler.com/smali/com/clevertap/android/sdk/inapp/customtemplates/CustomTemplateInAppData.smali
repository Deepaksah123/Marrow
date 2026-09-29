###### Class com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData (com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData)
.class public final Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData$CREATOR;,
        Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData$AudioAttributesCompatParcelizer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0000\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u0013\u0008\u0002\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u0011\u0008\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0007J\u0011\u0010\u0008\u001a\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\n2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000fH\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u0008\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\u0007J\u000f\u0010\u0019\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u001bH\u0096\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u001f\u0010\u0018J\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008 \u0010\u0007R(\u0010\u0019\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u000c8\u0007@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010!\u001a\u0004\u0008 \u0010\"R\"\u0010\r\u001a\u00020\u001c8\u0001@\u0001X\u0081\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010#\u001a\u0004\u0008\u0012\u0010$\"\u0004\u0008\r\u0010%R\u0018\u0010\u0008\u001a\u0004\u0018\u00010\u000c8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0018\u0010 \u001a\u0004\u0018\u00010\u000c8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010!R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010&"
    }
    d2 = {
        "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;",
        "Landroid/os/Parcelable;",
        "Landroid/os/Parcel;",
        "p0",
        "<init>",
        "(Landroid/os/Parcel;)V",
        "Lorg/json/JSONObject;",
        "(Lorg/json/JSONObject;)V",
        "write",
        "()Lorg/json/JSONObject;",
        "Lo/handleRelease;",
        "",
        "",
        "IconCompatParcelizer",
        "(Lo/handleRelease;)Ljava/util/List;",
        "",
        "p1",
        "",
        "read",
        "(Lo/handleRelease;Ljava/util/List;)V",
        "",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "describeContents",
        "()I",
        "RemoteActionCompatParcelizer",
        "()Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;",
        "",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "AudioAttributesCompatParcelizer",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
        "Z",
        "()Z",
        "()V",
        "Lorg/json/JSONObject;",
        "CREATOR"
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
.field public static final CREATOR:Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData$CREATOR;


# instance fields
.field private AudioAttributesCompatParcelizer:Ljava/lang/String;

.field private IconCompatParcelizer:Ljava/lang/String;

.field private RemoteActionCompatParcelizer:Z

.field private read:Lorg/json/JSONObject;

.field private write:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 145
    new-instance v0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData$CREATOR;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData$CREATOR;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->CREATOR:Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData$CREATOR;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .registers 6

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    if-eqz p1, :cond_b

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    goto :goto_c

    :cond_b
    move-object v1, v0

    :goto_c
    iput-object v1, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->write:Ljava/lang/String;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_19

    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v3

    if-nez v3, :cond_19

    move v2, v1

    :cond_19
    xor-int/2addr v1, v2

    iput-boolean v1, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->RemoteActionCompatParcelizer:Z

    if-eqz p1, :cond_23

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    goto :goto_24

    :cond_23
    move-object v1, v0

    :goto_24
    iput-object v1, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    if-eqz p1, :cond_2d

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    goto :goto_2e

    :cond_2d
    move-object v1, v0

    :goto_2e
    iput-object v1, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->IconCompatParcelizer:Ljava/lang/String;

    if-eqz p1, :cond_36

    .line 37
    invoke-static {p1}, Lo/onSeekStarted;->write(Landroid/os/Parcel;)Lorg/json/JSONObject;

    move-result-object v0

    :cond_36
    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->read:Lorg/json/JSONObject;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Parcel;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 3

    .line 146
    invoke-direct {p0, p1}, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method private constructor <init>(Lorg/json/JSONObject;)V
    .registers 3

    const/4 v0, 0x0

    .line 40
    invoke-direct {p0, v0}, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;-><init>(Landroid/os/Parcel;)V

    .line 41
    invoke-direct {p0, p1}, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->AudioAttributesCompatParcelizer(Lorg/json/JSONObject;)V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/json/JSONObject;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 3

    .line 147
    invoke-direct {p0, p1}, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;-><init>(Lorg/json/JSONObject;)V

    return-void
.end method

.method private final AudioAttributesCompatParcelizer(Lorg/json/JSONObject;)V
    .registers 3

    .line 140
    const-string v0, "templateName"

    invoke-static {p1, v0}, Lo/onSeekStarted;->write(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->write:Ljava/lang/String;

    .line 141
    const-string v0, "isAction"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->RemoteActionCompatParcelizer:Z

    .line 142
    const-string v0, "templateId"

    invoke-static {p1, v0}, Lo/onSeekStarted;->write(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 143
    const-string v0, "templateDescription"

    invoke-static {p1, v0}, Lo/onSeekStarted;->write(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->IconCompatParcelizer:Ljava/lang/String;

    .line 144
    const-string v0, "vars"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    iput-object p1, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->read:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Ljava/lang/String;
    .registers 1

    .line 19
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->write:Ljava/lang/String;

    return-object p0
.end method

.method public final IconCompatParcelizer(Lo/handleRelease;)Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/handleRelease;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    .line 50
    invoke-virtual {p0, p1, v0}, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->read(Lo/handleRelease;Ljava/util/List;)V

    return-object v0
.end method

.method public final IconCompatParcelizer()V
    .registers 2

    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->RemoteActionCompatParcelizer:Z

    return-void
.end method

.method public final RemoteActionCompatParcelizer()Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;
    .registers 3

    .line 101
    new-instance v0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;-><init>(Landroid/os/Parcel;)V

    .line 102
    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->write:Ljava/lang/String;

    iput-object v1, v0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->write:Ljava/lang/String;

    .line 103
    iget-boolean v1, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->RemoteActionCompatParcelizer:Z

    iput-boolean v1, v0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->RemoteActionCompatParcelizer:Z

    .line 104
    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    iput-object v1, v0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 105
    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->IconCompatParcelizer:Ljava/lang/String;

    iput-object v1, v0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->IconCompatParcelizer:Ljava/lang/String;

    .line 106
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->read:Lorg/json/JSONObject;

    if-eqz p0, :cond_24

    .line 107
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 108
    invoke-static {v1, p0}, Lo/PlayerPlaybackSuppressionReason;->IconCompatParcelizer(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 109
    iput-object v1, v0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->read:Lorg/json/JSONObject;

    :cond_24
    return-object v0
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .registers 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    .line 116
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz p1, :cond_10

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    goto :goto_11

    :cond_10
    move-object v3, v2

    :goto_11
    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-nez v1, :cond_19

    return v3

    .line 118
    :cond_19
    const-string v1, ""

    invoke-static {p1, v1}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    .line 120
    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->write:Ljava/lang/String;

    iget-object v4, p1, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->write:Ljava/lang/String;

    invoke-static {v1, v4}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    return v3

    .line 121
    :cond_2b
    iget-boolean v1, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->RemoteActionCompatParcelizer:Z

    iget-boolean v4, p1, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->RemoteActionCompatParcelizer:Z

    if-eq v1, v4, :cond_32

    return v3

    .line 122
    :cond_32
    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    iget-object v4, p1, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-static {v1, v4}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3d

    return v3

    .line 123
    :cond_3d
    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->IconCompatParcelizer:Ljava/lang/String;

    iget-object v4, p1, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->IconCompatParcelizer:Ljava/lang/String;

    invoke-static {v1, v4}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_48

    return v3

    .line 124
    :cond_48
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->read:Lorg/json/JSONObject;

    if-eqz p0, :cond_51

    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_52

    :cond_51
    move-object p0, v2

    :goto_52
    iget-object p1, p1, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->read:Lorg/json/JSONObject;

    if-eqz p1, :cond_5a

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_5a
    invoke-static {p0, v2}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_61

    return v3

    :cond_61
    return v0
.end method

.method public final hashCode()I
    .registers 6

    .line 130
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->write:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_b

    :cond_a
    move v0, v1

    .line 131
    :goto_b
    iget-boolean v2, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->RemoteActionCompatParcelizer:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    .line 132
    iget-object v3, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    if-eqz v3, :cond_1a

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_1b

    :cond_1a
    move v3, v1

    .line 133
    :goto_1b
    iget-object v4, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->IconCompatParcelizer:Ljava/lang/String;

    if-eqz v4, :cond_24

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto :goto_25

    :cond_24
    move v4, v1

    .line 134
    :goto_25
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->read:Lorg/json/JSONObject;

    if-eqz p0, :cond_33

    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_33

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_33
    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    return v0
.end method

.method public final read(Lo/handleRelease;Ljava/util/List;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/handleRelease;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->write:Ljava/lang/String;

    if-eqz v0, :cond_5e

    .line 56
    invoke-virtual {p1, v0}, Lo/handleRelease;->read(Ljava/lang/String;)Lo/updateStateAndInformListeners;

    move-result-object v0

    if-eqz v0, :cond_5e

    .line 57
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->read:Lorg/json/JSONObject;

    if-eqz p0, :cond_5e

    .line 59
    invoke-virtual {v0}, Lo/updateStateAndInformListeners;->read()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1e
    :goto_1e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/getPlaceholderState;

    .line 60
    invoke-virtual {v1}, Lo/getPlaceholderState;->read()Lo/handleIncreaseDeviceVolume;

    move-result-object v2

    sget-object v3, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_50

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1e

    .line 68
    invoke-virtual {v1}, Lo/getPlaceholderState;->AudioAttributesCompatParcelizer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_1e

    .line 69
    invoke-static {v1}, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData$CREATOR;->IconCompatParcelizer(Lorg/json/JSONObject;)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    move-result-object v1

    if-eqz v1, :cond_1e

    invoke-virtual {v1, p1, p2}, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->read(Lo/handleRelease;Ljava/util/List;)V

    goto :goto_1e

    .line 62
    :cond_50
    invoke-virtual {v1}, Lo/getPlaceholderState;->AudioAttributesCompatParcelizer()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lo/onSeekStarted;->write(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1e

    .line 63
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1e

    :cond_5e
    return-void
.end method

.method public final read()Z
    .registers 1

    .line 26
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->RemoteActionCompatParcelizer:Z

    return p0
.end method

.method public final write()Lorg/json/JSONObject;
    .registers 1

    .line 45
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->read:Lorg/json/JSONObject;

    if-eqz p0, :cond_9

    invoke-static {p0}, Lo/PlayerPlaybackSuppressionReason;->AudioAttributesCompatParcelizer(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0

    :cond_9
    const/4 p0, 0x0

    return-object p0
.end method

.method public final write(Lorg/json/JSONObject;)V
    .registers 4

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    const-string v0, "templateName"

    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->write:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 94
    const-string v0, "isAction"

    iget-boolean v1, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->RemoteActionCompatParcelizer:Z

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 95
    const-string v0, "templateId"

    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 96
    const-string v0, "templateDescription"

    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 97
    const-string v0, "vars"

    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->read:Lorg/json/JSONObject;

    invoke-virtual {p1, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-void
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    const-string p2, ""

    invoke-static {p1, p2}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    iget-object p2, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->write:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 82
    iget-boolean p2, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->RemoteActionCompatParcelizer:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 83
    iget-object p2, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 84
    iget-object p2, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 85
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->read:Lorg/json/JSONObject;

    invoke-static {p1, p0}, Lo/onSeekStarted;->IconCompatParcelizer(Landroid/os/Parcel;Lorg/json/JSONObject;)V

    return-void
.end method

###### Class com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData.AudioAttributesCompatParcelizer (com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData$AudioAttributesCompatParcelizer)
.class public final synthetic Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1011
    name = "AudioAttributesCompatParcelizer"
.end annotation


# static fields
.field public static final synthetic AudioAttributesCompatParcelizer:[I


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 1
    invoke-static {}, Lo/handleIncreaseDeviceVolume;->values()[Lo/handleIncreaseDeviceVolume;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_7
    sget-object v1, Lo/handleIncreaseDeviceVolume;->read:Lo/handleIncreaseDeviceVolume;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_10
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_10} :catch_10

    :catch_10
    :try_start_10
    sget-object v1, Lo/handleIncreaseDeviceVolume;->write:Lo/handleIncreaseDeviceVolume;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_19
    .catch Ljava/lang/NoSuchFieldError; {:try_start_10 .. :try_end_19} :catch_19

    :catch_19
    sput-object v0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:[I

    return-void
.end method

###### Class com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData.Companion (com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData$CREATOR)
.class public final Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData$CREATOR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CREATOR"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n2\u0006\u0010\u0006\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0006\u001a\u0004\u0018\u00010\rH\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u000e"
    }
    d2 = {
        "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData$CREATOR;",
        "Landroid/os/Parcelable$Creator;",
        "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;",
        "<init>",
        "()V",
        "Landroid/os/Parcel;",
        "p0",
        "IconCompatParcelizer",
        "(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;",
        "",
        "",
        "RemoteActionCompatParcelizer",
        "(I)[Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;",
        "Lorg/json/JSONObject;",
        "(Lorg/json/JSONObject;)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;"
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

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 171
    invoke-direct {p0}, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData$CREATOR;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;
    .registers 3

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    new-instance v0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;-><init>(Landroid/os/Parcel;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-object v0
.end method

.method public static IconCompatParcelizer(Lorg/json/JSONObject;)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;
    .registers 4
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_4

    return-object v0

    .line 168
    :cond_4
    sget-object v1, Lo/lambdaupdateStateAndInformListeners41;->AudioAttributesCompatParcelizer:Lo/lambdaupdateStateAndInformListeners41$AudioAttributesCompatParcelizer;

    const-string v1, "type"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/lambdaupdateStateAndInformListeners41$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(Ljava/lang/String;)Lo/lambdaupdateStateAndInformListeners41;

    move-result-object v1

    .line 169
    sget-object v2, Lo/lambdaupdateStateAndInformListeners41;->AudioAttributesImplApi21Parcelizer:Lo/lambdaupdateStateAndInformListeners41;

    if-ne v2, v1, :cond_1a

    .line 170
    new-instance v1, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    invoke-direct {v1, p0, v0}, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;-><init>(Lorg/json/JSONObject;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-object v1

    :cond_1a
    return-object v0
.end method

.method private static RemoteActionCompatParcelizer(I)[Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;
    .registers 1

    .line 160
    new-array p0, p0, [Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 147
    invoke-static {p1}, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData$CREATOR;->IconCompatParcelizer(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 147
    invoke-static {p1}, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData$CREATOR;->RemoteActionCompatParcelizer(I)[Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    move-result-object p0

    return-object p0
.end method
