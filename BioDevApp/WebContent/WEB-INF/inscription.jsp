<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>Inscription</title>
		
	</head>
	<body>
		<form method="post" action="inscription">
			<fieldset>
				<legend>Inscription</legend>
				<p>Vous pouvez vous inscrire via ce formulaire.</p>
				<label for="codeutilisateur">code d'identification national <span class="requis">*</span>
				</label>
				<input type="nom" id="nom" name="nom" value="" size="20" maxlength="60" />
				<span >${form.erreurs['nom']}</span>
				<br />
				<label for="pseudo">Pseudo <span class="requis">*</span>
				</label>
				<input type="pseudo" id="pseudo" name="pseudo" value="" size="20" maxlength="60" />
				<span class="erreur">${form.erreurs['pseudo']}</span>
				<br />
				<label for="email">Email <span class="requis">*</span>
				</label>
				<input type="email" id="email" name="email" value="" size="20" maxlength="60" />
				<span class="erreur">${form.erreurs['email']}</span>
				<br />
				<label for="motdepasse">Mot de passe <span class="requis">*</span></label>
				<input type="password" id="motdepasse" name="motdepasse" value="" size="20" maxlength="20" />
				<span class="erreur">${form.erreurs['motdepasse']}</span>
				<br />

				<input type="submit" value="Inscription" class="sansLabel" />
				<br />
			</fieldset>
		</form>
	</body>
</html>