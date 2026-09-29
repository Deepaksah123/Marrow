###### Class androidx.activity.result.IntentSenderRequest (androidx.activity.result.IntentSenderRequest)
.class public final Landroidx/activity/result/IntentSenderRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;,
        Landroidx/activity/result/IntentSenderRequest$IconCompatParcelizer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u000c\u0018\u0000 \u00192\u00020\u0001:\u0002\u0016\u0019B\u0011\u0008\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B1\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000cJ\u000f\u0010\r\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0007\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\t8\u0007X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0016\u0010\u000eR\u001a\u0010\u0019\u001a\u00020\t8\u0007X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00068\u0007X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001a\u001a\u0004\u0008\u0019\u0010\u001b"
    }
    d2 = {
        "Landroidx/activity/result/IntentSenderRequest;",
        "Landroid/os/Parcelable;",
        "Landroid/os/Parcel;",
        "p0",
        "<init>",
        "(Landroid/os/Parcel;)V",
        "Landroid/content/IntentSender;",
        "Landroid/content/Intent;",
        "p1",
        "",
        "p2",
        "p3",
        "(Landroid/content/IntentSender;Landroid/content/Intent;II)V",
        "describeContents",
        "()I",
        "",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "read",
        "Landroid/content/Intent;",
        "()Landroid/content/Intent;",
        "write",
        "RemoteActionCompatParcelizer",
        "I",
        "AudioAttributesCompatParcelizer",
        "IconCompatParcelizer",
        "Landroid/content/IntentSender;",
        "()Landroid/content/IntentSender;"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/activity/result/IntentSenderRequest;",
            ">;"
        }
    .end annotation
.end field

.field public static final IconCompatParcelizer:Landroidx/activity/result/IntentSenderRequest$IconCompatParcelizer;


# instance fields
.field private final AudioAttributesCompatParcelizer:Landroid/content/IntentSender;

.field private final RemoteActionCompatParcelizer:I

.field private final read:Landroid/content/Intent;

.field private final write:I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Landroidx/activity/result/IntentSenderRequest$IconCompatParcelizer;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/activity/result/IntentSenderRequest$IconCompatParcelizer;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Landroidx/activity/result/IntentSenderRequest;->IconCompatParcelizer:Landroidx/activity/result/IntentSenderRequest$IconCompatParcelizer;

    .line 166
    new-instance v0, Landroidx/activity/result/IntentSenderRequest$AudioAttributesCompatParcelizer;

    invoke-direct {v0}, Landroidx/activity/result/IntentSenderRequest$AudioAttributesCompatParcelizer;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Landroidx/activity/result/IntentSenderRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V
    .registers 6

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Landroidx/activity/result/IntentSenderRequest;->AudioAttributesCompatParcelizer:Landroid/content/IntentSender;

    .line 41
    iput-object p2, p0, Landroidx/activity/result/IntentSenderRequest;->read:Landroid/content/Intent;

    .line 45
    iput p3, p0, Landroidx/activity/result/IntentSenderRequest;->RemoteActionCompatParcelizer:I

    .line 49
    iput p4, p0, Landroidx/activity/result/IntentSenderRequest;->write:I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .registers 5

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    const-class v0, Landroid/content/IntentSender;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-static {v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    check-cast v0, Landroid/content/IntentSender;

    .line 55
    const-class v1, Landroid/content/Intent;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/content/Intent;

    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 57
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    .line 53
    invoke-direct {p0, v0, v1, v2, p1}, Landroidx/activity/result/IntentSenderRequest;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()I
    .registers 1

    .line 49
    iget p0, p0, Landroidx/activity/result/IntentSenderRequest;->write:I

    return p0
.end method

.method public final IconCompatParcelizer()Landroid/content/IntentSender;
    .registers 1

    .line 36
    iget-object p0, p0, Landroidx/activity/result/IntentSenderRequest;->AudioAttributesCompatParcelizer:Landroid/content/IntentSender;

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer()I
    .registers 1

    .line 45
    iget p0, p0, Landroidx/activity/result/IntentSenderRequest;->RemoteActionCompatParcelizer:I

    return p0
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final read()Landroid/content/Intent;
    .registers 1

    .line 41
    iget-object p0, p0, Landroidx/activity/result/IntentSenderRequest;->read:Landroid/content/Intent;

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 4

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    iget-object v0, p0, Landroidx/activity/result/IntentSenderRequest;->AudioAttributesCompatParcelizer:Landroid/content/IntentSender;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 66
    iget-object v0, p0, Landroidx/activity/result/IntentSenderRequest;->read:Landroid/content/Intent;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 67
    iget p2, p0, Landroidx/activity/result/IntentSenderRequest;->RemoteActionCompatParcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 68
    iget p0, p0, Landroidx/activity/result/IntentSenderRequest;->write:I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class androidx.activity.result.IntentSenderRequest.AudioAttributesCompatParcelizer (androidx.activity.result.IntentSenderRequest$AudioAttributesCompatParcelizer)
.class public final Landroidx/activity/result/IntentSenderRequest$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/result/IntentSenderRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/activity/result/IntentSenderRequest;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 166
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static write(Landroid/os/Parcel;)Landroidx/activity/result/IntentSenderRequest;
    .registers 2

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    new-instance v0, Landroidx/activity/result/IntentSenderRequest;

    invoke-direct {v0, p0}, Landroidx/activity/result/IntentSenderRequest;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method private static write(I)[Landroidx/activity/result/IntentSenderRequest;
    .registers 1

    .line 172
    new-array p0, p0, [Landroidx/activity/result/IntentSenderRequest;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 166
    invoke-static {p1}, Landroidx/activity/result/IntentSenderRequest$AudioAttributesCompatParcelizer;->write(Landroid/os/Parcel;)Landroidx/activity/result/IntentSenderRequest;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 166
    invoke-static {p1}, Landroidx/activity/result/IntentSenderRequest$AudioAttributesCompatParcelizer;->write(I)[Landroidx/activity/result/IntentSenderRequest;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.activity.result.IntentSenderRequest.Companion (androidx.activity.result.IntentSenderRequest$IconCompatParcelizer)
.class public final Landroidx/activity/result/IntentSenderRequest$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/result/IntentSenderRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "IconCompatParcelizer"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Landroidx/activity/result/IntentSenderRequest$IconCompatParcelizer;",
        "",
        "<init>",
        "()V",
        "Landroid/os/Parcelable$Creator;",
        "Landroidx/activity/result/IntentSenderRequest;",
        "CREATOR",
        "Landroid/os/Parcelable$Creator;"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 162
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 163
    invoke-direct {p0}, Landroidx/activity/result/IntentSenderRequest$IconCompatParcelizer;-><init>()V

    return-void
.end method

###### Class androidx.activity.result.IntentSenderRequest.RemoteActionCompatParcelizer (androidx.activity.result.IntentSenderRequest$RemoteActionCompatParcelizer)
.class public final Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/result/IntentSenderRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RemoteActionCompatParcelizer"
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:I

.field private RemoteActionCompatParcelizer:I

.field private final read:Landroid/content/IntentSender;

.field private write:Landroid/content/Intent;


# direct methods
.method public constructor <init>(Landroid/content/IntentSender;)V
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;->read:Landroid/content/IntentSender;

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(II)Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;
    .registers 3

    .line 147
    iput p1, p0, Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:I

    .line 148
    iput p2, p0, Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    return-object p0
.end method

.method public final IconCompatParcelizer(Landroid/content/Intent;)Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;
    .registers 2

    .line 132
    iput-object p1, p0, Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;->write:Landroid/content/Intent;

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer()Landroidx/activity/result/IntentSenderRequest;
    .registers 5

    .line 158
    new-instance v0, Landroidx/activity/result/IntentSenderRequest;

    iget-object v1, p0, Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;->read:Landroid/content/IntentSender;

    iget-object v2, p0, Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;->write:Landroid/content/Intent;

    iget v3, p0, Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    iget p0, p0, Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:I

    invoke-direct {v0, v1, v2, v3, p0}, Landroidx/activity/result/IntentSenderRequest;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    return-object v0
.end method
